package com.trilogyed.stwitter.view;

import com.trilogyed.stwitter.model.Comment;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

public class PostViewModel {

    private int postId;
    @NotNull(message = "Please supply a date for the post.")
    private LocalDate postDate;
    @NotEmpty(message = "Please supply a name for the poster.")
    private String posterName;
    @NotEmpty(message = "Please supply a post.")
    private String post;
    private List<CommentViewModel> comments;

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public LocalDate getPostDate() {
        return postDate;
    }

    public void setPostDate(LocalDate postDate) {
        this.postDate = postDate;
    }

    public String getPosterName() {
        return posterName;
    }

    public void setPosterName(String posterName) {
        this.posterName = posterName;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public List<CommentViewModel> getComments() {
        return comments;
    }

    public void setComments(List<CommentViewModel> comments) {
        this.comments = comments;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PostViewModel that = (PostViewModel) o;
        return getPostId() == that.getPostId() &&
                Objects.equals(getPostDate(), that.getPostDate()) &&
                Objects.equals(getPosterName(), that.getPosterName()) &&
                Objects.equals(getPost(), that.getPost()) &&
                Objects.equals(getComments(), that.getComments());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPostId(), getPostDate(), getPosterName(), getPost(), getComments());
    }

}
