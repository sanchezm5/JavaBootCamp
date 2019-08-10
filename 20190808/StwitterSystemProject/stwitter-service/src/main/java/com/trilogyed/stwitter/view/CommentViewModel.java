package com.trilogyed.stwitter.view;

import com.trilogyed.stwitter.model.Comment;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.Objects;

public class CommentViewModel {

    private int commentId;
    private Integer postId;
    @NotNull(message = "Please supply a date.")
    private LocalDate createDate;
    @NotEmpty(message = "Please supply a name for the commenter.")
    private String commenterName;
    @NotEmpty(message = "Please supply a comment")
    private String comment;

    public int getCommentId() {
        return commentId;
    }

    public void setCommentId(int commentId) {
        this.commentId = commentId;
    }

    public Integer getPostId() {
        return postId;
    }

    public void setPostId(Integer postId) {
        this.postId = postId;
    }

    public LocalDate getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }

    public String getCommenterName() {
        return commenterName;
    }

    public void setCommenterName(String commenterName) {
        this.commenterName = commenterName;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CommentViewModel that = (CommentViewModel) o;
        return getCommentId() == that.getCommentId() &&
                Objects.equals(getPostId(), that.getPostId()) &&
                Objects.equals(getCreateDate(), that.getCreateDate()) &&
                Objects.equals(getCommenterName(), that.getCommenterName()) &&
                Objects.equals(getComment(), that.getComment());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCommentId(), getPostId(), getCreateDate(), getCommenterName(), getComment());
    }
}
