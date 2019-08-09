package com.trilogyed.post.controller;

import com.trilogyed.post.dao.PostDao;
import com.trilogyed.post.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
@RefreshScope
public class PostController {

    @Autowired
    PostDao postDao;

    @RequestMapping(value = "/posts", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public Post createPost(@RequestBody @Valid Post post) {
        return postDao.createPost(post);
    }

    @RequestMapping(value = "/posts", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public List<Post> findAllPosts() {
        return postDao.getAllPosts();
    }

    @RequestMapping(value = "/posts/{id}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public Post findPost(@PathVariable("id") int id) {
        Post post = postDao.getPost(id);
            if (post == null) {
                throw new IllegalArgumentException("Post could not be retrieved for id " + id);
            }
            return post;
    }

    @RequestMapping(value = "/posts/user/{poster_name}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public List<Post> findPostsByPoster(@PathVariable("poster_name") String posterName) {
        return postDao.getPostsByPoster(posterName);
    }


    @RequestMapping(value = "/posts/{id}", method = RequestMethod.PUT)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updatePost(@PathVariable("id") int id, @RequestBody Post post) {
        if (id != post.getPostId()) {
            throw new IllegalArgumentException("Post id does not match request body");
        }
        postDao.updatePost(post);
    }

    @RequestMapping(value = "/posts/{id}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletePost(@PathVariable("id") int id) {
        postDao.deletePost(id);
    }
}
