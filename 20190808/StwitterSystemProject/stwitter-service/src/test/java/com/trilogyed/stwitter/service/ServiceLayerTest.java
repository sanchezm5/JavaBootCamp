package com.trilogyed.stwitter.service;

import com.trilogyed.stwitter.model.Comment;
import com.trilogyed.stwitter.model.Post;
import com.trilogyed.stwitter.util.feign.CommentClient;
import com.trilogyed.stwitter.util.feign.PostClient;
import com.trilogyed.stwitter.view.PostViewModel;
import org.junit.Before;
import org.junit.Test;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;

import javax.xml.ws.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;

@SpringBootTest
public class ServiceLayerTest {

    private PostClient postClient;
    private CommentClient commentClient;
    private RabbitTemplate rabbitTemplate;
    private ServiceLayer service;

    @Before
    public void setUp() throws Exception {

        setUpPostServiceMock();
        setUpCommentServiceMock();
        setUpRabbitTemplateMock();

        service = new ServiceLayer(postClient, commentClient, rabbitTemplate);
    }

    @Test
    public void saveAndFindPost() {
        PostViewModel postViewModel = new PostViewModel();
        postViewModel.setPostDate(LocalDate.of(2019, 8, 8));
        postViewModel.setPosterName("Poster Name 1");
        postViewModel.setPost("Post 1");

        postViewModel = service.savePost(postViewModel);

        Post post = new Post();
        post.setPostId(postViewModel.getPostId());
        post.setPostDate(postViewModel.getPostDate());
        post.setPosterName(postViewModel.getPosterName());
        post.setPost(postViewModel.getPost());

        PostViewModel fromService = service.findPost(postViewModel.getPostId());

        assertEquals(postViewModel, fromService);
    }

    @Test
    public void findPostByPoster() {

        PostViewModel postViewModel = new PostViewModel();
        postViewModel.setPostDate(LocalDate.of(2019, 8, 8));
        postViewModel.setPosterName("Poster Name 1");
        postViewModel.setPost("Post 1");

        postViewModel = service.savePost(postViewModel);

        Post post = new Post();
        post.setPostId(postViewModel.getPostId());
        post.setPostDate(postViewModel.getPostDate());
        post.setPosterName(postViewModel.getPosterName());
        post.setPost(postViewModel.getPost());

        List<PostViewModel> postViewModelList = service.findPostByPoster(post.getPosterName());

        assertEquals(1, postViewModelList.size());
    }

    public void setUpPostServiceMock() {
        postClient = mock(PostClient.class);

        Post post1 = new Post();
        post1.setPostId(1);
        post1.setPostDate(LocalDate.of(2019, 8, 8));
        post1.setPosterName("Poster Name 1");
        post1.setPost("Post 1");

        Post post2 = new Post();
        post2.setPostDate(LocalDate.of(2019, 8, 8));
        post2.setPosterName("Poster Name 1");
        post2.setPost("Post 1");

        List<Post> posts = new ArrayList<>();

        posts.add(post1);

        doReturn(post1).when(postClient).createPost(post2);
        doReturn(post1).when(postClient).findPost(1);
        doReturn(posts).when(postClient).findAllPosts();
        doReturn(posts).when(postClient).findPostsByPoster("Poster Name 1");
    }

    public void setUpCommentServiceMock() {
        commentClient = mock(CommentClient.class);

        List<Comment> comments = new ArrayList<>();

        Comment comment = new Comment();
        comment.setCommentId(1);
        comment.setPostId(1);
        comment.setCreateDate(LocalDate.of(2019, 8, 8));
        comment.setCommenterName("Commenter Name 1");
        comment.setComment("cool");

        comments.add(comment);

        Comment comment1 = new Comment();
        comment1.setPostId(1);
        comment1.setCreateDate(LocalDate.of(2019, 8, 8));
        comment1.setCommenterName("Commenter Name 1");
        comment1.setComment("cool");

        doReturn(comments).when(commentClient).findCommentByPost(1);
        doReturn(comments).when(commentClient).findAllComments();
        doReturn(comment).when(commentClient).findComment(1);
    }

    public void setUpRabbitTemplateMock() {
        rabbitTemplate = mock(RabbitTemplate.class);
    }

}