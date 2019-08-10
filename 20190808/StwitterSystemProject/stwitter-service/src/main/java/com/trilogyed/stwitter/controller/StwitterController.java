package com.trilogyed.stwitter.controller;

import com.trilogyed.stwitter.service.ServiceLayer;
import com.trilogyed.stwitter.view.CommentViewModel;
import com.trilogyed.stwitter.view.PostViewModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RefreshScope
@CacheConfig(cacheNames = {"posts"})
public class StwitterController {

    @Autowired
    ServiceLayer service;

    public StwitterController(ServiceLayer service) {
        this.service = service;
    }

    @CachePut(key = "#result.getPostId()")
    @RequestMapping(value ="/posts", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public PostViewModel createPost(@RequestBody @Valid PostViewModel postViewModel) {
        System.out.println("CREATING POST");
        return service.savePost(postViewModel);
    }

    @Cacheable
    @RequestMapping(value ="/posts/{id}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public PostViewModel findPost(@PathVariable("id") int id) {
        PostViewModel postViewModel = service.findPost(id);
        if (postViewModel == null) {
            throw new IllegalArgumentException("Post could not be retrieved for ID: " + id);
        }
        System.out.println("GETTING POST BY ID = " + id);
        return postViewModel;
    }

    @RequestMapping(value = "/posts/user/{poster_name}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public List<PostViewModel> findPostsByPoster(@PathVariable("poster_name") String posterName) {

        List<PostViewModel> postsViewModelList = service.findPostByPoster(posterName);
        if (postsViewModelList.size() == 0) {
            return null;
        }
        return postsViewModelList;
    }

    @CacheEvict(key = "#commentViewModel.getPostId()")
    @RequestMapping(value = "/comments", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.OK)
    public PostViewModel createComment(@RequestBody @Valid CommentViewModel commentViewModel, Integer postId) {
        System.out.println("CREATING COMMENT FOR POST BY ID " + commentViewModel.getPostId() + " WITH COMMENT = " + commentViewModel.getComment());
        return service.saveComment(commentViewModel, commentViewModel.getPostId());
    }
}
