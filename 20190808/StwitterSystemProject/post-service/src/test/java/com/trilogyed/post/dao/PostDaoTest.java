package com.trilogyed.post.dao;

import com.trilogyed.post.model.Post;
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
public class PostDaoTest {

    @Autowired
    PostDao postDao;

    @Before
    public void setUp() throws Exception {

        List<Post> posts = postDao.getAllPosts();
        for (Post post: posts) {
            postDao.deletePost(post.getPostId());
        }
    }

    @Test
    public void createGetDeletePost() {

        Post post = new Post();
        post.setPostDate(LocalDate.of(2019, 8, 8));
        post.setPosterName("Poster Name");
        post.setPost("Post");

        post = postDao.createPost(post);

        Post post1 = postDao.getPost(post.getPostId());
        assertEquals(post1, post);

        postDao.deletePost(post.getPostId());

        post1 = postDao.getPost(post.getPostId());
        assertNull(post1);
    }

    @Test
    public void getAllPosts() {

        Post post = new Post();
        post.setPostDate(LocalDate.of(2019, 8, 8));
        post.setPosterName("Poster Name");
        post.setPost("Post");
        post = postDao.createPost(post);

        post = new Post();
        post.setPostDate(LocalDate.of(2019, 8, 7));
        post.setPosterName("Poster1 Name");
        post.setPost("Post1");
        post = postDao.createPost(post);

        List<Post> postList = postDao.getAllPosts();
        assertEquals(2, postList.size());
    }

    @Test
    public void getPostsByPoster() {


        Post post = new Post();
        post.setPostDate(LocalDate.of(2019, 8, 8));
        post.setPosterName("Poster Name");
        post.setPost("Post");
        post = postDao.createPost(post);

        Post post1 = new Post();
        post1.setPostDate(LocalDate.of(2019, 8, 8));
        post1.setPosterName("Poster Name");
        post1.setPost("Post1");
        post1 = postDao.createPost(post1);

        List<Post> postList = postDao.getPostsByPoster(post.getPosterName());
        assertEquals(2, postList.size());
    }

    @Test
    public void updatePost() {

        Post post = new Post();
        post.setPostDate(LocalDate.of(2019, 8, 8));
        post.setPosterName("Poster Name");
        post.setPost("Post");
        post = postDao.createPost(post);

        post.setPost("Updated Post");
        postDao.updatePost(post);

        Post post1 = postDao.getPost(post.getPostId());
        assertEquals(post1, post);
    }
}