package com.trilogyed.commentqueueconsumer.util.feign;

import com.trilogyed.commentqueueconsumer.util.messages.Comment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(name = "comment-service")
public interface CommentClient {

    @RequestMapping(value = "/comments", method = RequestMethod.POST)
    public Comment createComment(@RequestBody Comment comment);

    @RequestMapping(value = "/comments", method = RequestMethod.GET)
    public List<Comment> findAllComments();

    @RequestMapping(value = "/comments/{id}", method = RequestMethod.GET)
    public Comment findComment(@PathVariable("id") int id);

    @RequestMapping(value = "/comments/post/{postId}", method = RequestMethod.GET)
    public List<Comment> findCommentByPost(@PathVariable("postId") int postId);

    @RequestMapping(value = "/comments/{id}", method = RequestMethod.PUT)
    public void updateComment(@PathVariable("id") int id, @RequestBody Comment comment);

    @RequestMapping(value = "/comments/{id}", method = RequestMethod.DELETE)
    public void deleteComment(@PathVariable("id") int id);


}