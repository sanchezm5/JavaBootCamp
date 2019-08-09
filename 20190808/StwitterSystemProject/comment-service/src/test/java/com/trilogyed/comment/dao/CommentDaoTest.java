package com.trilogyed.comment.dao;

import com.trilogyed.comment.model.Comment;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.time.LocalDate;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class CommentDaoTest {

    @Autowired
    CommentDao commentDao;

    @Before
    public void setUp() throws Exception {

        List<Comment> comments = commentDao.getAllComments();
        for (Comment comment: comments) {
            commentDao.deleteComment(comment.getCommentId());
        }
    }

    @Test
    public void createGetDeleteComment() {

        Comment comment = new Comment();
        comment.setPostId(1);
        comment.setCreateDate(LocalDate.of(2019, 8, 6));
        comment.setCommenterName("Commenter Name");
        comment.setComment("Comment");

        comment = commentDao.createComment(comment);

        Comment comment1 = commentDao.getComment(comment.getCommentId());
        assertEquals(comment1, comment);

        commentDao.deleteComment(comment.getCommentId());

        comment1 = commentDao.getComment(comment.getCommentId());
        assertNull(comment1);
    }

    @Test
    public void getAllComments() {

        Comment comment = new Comment();
        comment.setPostId(1);
        comment.setCreateDate(LocalDate.of(2019, 8, 6));
        comment.setCommenterName("Commenter Name");
        comment.setComment("Comment");
        comment = commentDao.createComment(comment);

        comment = new Comment();
        comment.setPostId(2);
        comment.setCreateDate(LocalDate.of(2019, 8, 7));
        comment.setCommenterName("Commenter Name1");
        comment.setComment("Comment1");
        comment = commentDao.createComment(comment);

        List<Comment> commentList = commentDao.getAllComments();
        assertEquals(2, commentList.size());
    }

    @Test
    public void getCommentByPost() {

        Comment comment = new Comment();
        comment.setPostId(1);
        comment.setCreateDate(LocalDate.of(2019, 8, 6));
        comment.setCommenterName("Commenter Name");
        comment.setComment("Comment");
        comment = commentDao.createComment(comment);

        Comment comment1 = new Comment();
        comment1.setPostId(2);
        comment1.setCreateDate(LocalDate.of(2019, 8, 7));
        comment1.setCommenterName("Commenter Name1");
        comment1.setComment("Comment1");
        comment1 = commentDao.createComment(comment1);

        List<Comment> commentList = commentDao.getCommentByPost(comment.getPostId());
        assertEquals(1, commentList.size());
    }

    @Test
    public void updateComment() {

        Comment comment = new Comment();
        comment.setPostId(1);
        comment.setCreateDate(LocalDate.of(2019, 8, 6));
        comment.setCommenterName("Commenter Name");
        comment.setComment("Comment");
        comment = commentDao.createComment(comment);

        comment.setComment("Updated comment");
        commentDao.updateComment(comment);

        Comment comment1 = commentDao.getComment(comment.getCommentId());
        assertEquals(comment1, comment);
    }
}