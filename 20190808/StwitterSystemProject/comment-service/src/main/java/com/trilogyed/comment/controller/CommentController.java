package com.trilogyed.comment.controller;

import com.trilogyed.comment.dao.CommentDao;
import com.trilogyed.comment.model.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RefreshScope
public class CommentController {

    @Autowired
    CommentDao commentDao;

    @RequestMapping(value = "/comments", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public Comment createComment(@RequestBody @Valid Comment comment) {
        return commentDao.createComment(comment);
    }

    @RequestMapping(value = "/comments", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public List<Comment> findAllComments() {
        return commentDao.getAllComments();
    }

    @RequestMapping(value = "/comments/{id}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public Comment findComment(@PathVariable("id") int id) {
        Comment comment = commentDao.getComment(id);
        if (comment == null) {
            throw new IllegalArgumentException("Comment could not be retrieved for id " + id);
        }
        return comment;
    }

    @RequestMapping(value = "/comments/post/{postId}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public List<Comment> findCommentByPost(@PathVariable("postId") int postId) {
        return commentDao.getCommentByPost(postId);
    }

    @RequestMapping(value = "/comments/{id}", method = RequestMethod.PUT)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateComment(@PathVariable("id") int id, @RequestBody Comment comment) {
        if (id != comment.getCommentId()) {
            throw new IllegalArgumentException("Comment id does not match request body");
        }
        commentDao.updateComment(comment);
    }

    @RequestMapping(value = "/comments/{id}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteComment(@PathVariable("id") int id) {
        commentDao.deleteComment(id);
    }
}
