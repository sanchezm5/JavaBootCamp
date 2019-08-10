package com.trilogyed.stwitter.service;

import com.trilogyed.stwitter.model.Comment;
import com.trilogyed.stwitter.model.Post;
import com.trilogyed.stwitter.util.feign.CommentClient;
import com.trilogyed.stwitter.util.feign.PostClient;
import com.trilogyed.stwitter.view.CommentViewModel;
import com.trilogyed.stwitter.view.PostViewModel;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Component
public class ServiceLayer {

    public static final String EXCHANGE = "comment-exchange";
    public static final String ROUTING_KEY = "comment.create.serviceLayer";

    private RabbitTemplate rabbitTemplate;
    private PostClient postClient;
    private CommentClient commentClient;

    public ServiceLayer() {

    }

    @Autowired
    public ServiceLayer(PostClient postClient, CommentClient commentClient, RabbitTemplate rabbitTemplate) {
        this.postClient = postClient;
        this.commentClient = commentClient;
        this.rabbitTemplate = rabbitTemplate;
    }

    @Transactional
    public PostViewModel savePost(PostViewModel postViewModel) {
        Post post = new Post();
        post.setPostDate(postViewModel.getPostDate());
        post.setPosterName(postViewModel.getPosterName());
        post.setPost(postViewModel.getPost());

        post = postClient.createPost(post);

        postViewModel = buildPostViewModel(post);
        return postViewModel;
    }

    @Transactional
    public PostViewModel saveComment(CommentViewModel commentViewModel, int postId) {

        Post post = postClient.findPost(postId);
        if (post == null) {
            throw new IllegalArgumentException("Post cannot be retrieved by ID: " + postId);
        }

        Comment comment = new Comment();
        comment.setPostId(commentViewModel.getPostId());
        comment.setCreateDate(commentViewModel.getCreateDate());
        comment.setCommenterName(commentViewModel.getCommenterName());
        comment.setComment(commentViewModel.getComment());

        System.out.println("Sending comments...");
        rabbitTemplate.convertAndSend(EXCHANGE, ROUTING_KEY, comment);
        System.out.println("Comment sent to queue for creation...");

        simulateSlowService();

        PostViewModel postViewModel = buildPostViewModel(post);
        return postViewModel;
    }

    public PostViewModel findPost(int postId) {

        Post post = postClient.findPost(postId);
        if (post == null) {
            throw new IllegalArgumentException("Post cannot be retrieved by ID: " + postId);
        }

        PostViewModel postViewModel = buildPostViewModel(post);
        return postViewModel;
    }

    public List<PostViewModel> findPostByPoster(String poster) {
        List<Post> posts = postClient.findPostsByPoster(poster);
        List<PostViewModel> postViewModelList = new ArrayList<>();

        for(Post post : posts) {
            postViewModelList.add(buildPostViewModel(post));
        }

        if (postViewModelList.size() == 0) {
            throw new IllegalArgumentException("Posts cannot be found for poster name: " + poster);
        }
        return postViewModelList;
    }

    // Helper Methods
    private PostViewModel buildPostViewModel(Post post) {
        PostViewModel postViewModel = new PostViewModel();
        postViewModel.setPostId(post.getPostId());
        postViewModel.setPostDate(post.getPostDate());
        postViewModel.setPosterName(post.getPosterName());
        postViewModel.setPost(post.getPost());

        List<Comment> comments = commentClient.findCommentByPost(postViewModel.getPostId());
        List<CommentViewModel> commentViewModelList = new ArrayList<>();

        for (Comment comment : comments) {
            commentViewModelList.add(buildCommentViewModel(comment));
        }
        postViewModel.setComments(commentViewModelList);

        return postViewModel;
    }

    private CommentViewModel buildCommentViewModel(Comment comment) {
        CommentViewModel commentViewModel = new CommentViewModel();
        commentViewModel.setCommentId(comment.getCommentId());
        commentViewModel.setPostId(comment.getPostId());
        commentViewModel.setCreateDate(comment.getCreateDate());
        commentViewModel.setCommenterName(comment.getCommenterName());
        commentViewModel.setComment(comment.getComment());

        return commentViewModel;
    }

    private void simulateSlowService() {
        try {
            long time = 1500L;
            Thread.sleep(time);
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        }
    }
}
