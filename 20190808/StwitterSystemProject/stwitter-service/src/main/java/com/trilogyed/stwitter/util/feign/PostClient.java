package com.trilogyed.stwitter.util.feign;

import com.trilogyed.stwitter.model.Post;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@FeignClient(name = "post-service")
public interface PostClient {

    @RequestMapping(value = "/posts", method = RequestMethod.POST)
    public Post createPost(@RequestBody @Valid Post post);

    @RequestMapping(value = "/posts", method = RequestMethod.GET)
    public List<Post> findAllPosts();

    @RequestMapping(value = "/posts/{id}", method = RequestMethod.GET)
    public Post findPost(@PathVariable("id") int id);

    @RequestMapping(value = "/posts/user/{poster_name}", method = RequestMethod.GET)
    public List<Post> findPostsByPoster(@PathVariable("poster_name") String posterName);

    @RequestMapping(value = "/posts/{id}", method = RequestMethod.PUT)
    public void updatePost(@PathVariable("id") int id, @RequestBody Post post);

    @RequestMapping(value = "/posts/{id}", method = RequestMethod.DELETE)
    public void deletePost(@PathVariable("id") int id);
}
