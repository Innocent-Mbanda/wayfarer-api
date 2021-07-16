package com.example.demo.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.validation.annotation.Validated;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@Document(collection="blogInfo")
public class BlogModel {
    @Id
    private String Id;
    private String title;
    private String content;
    @CreatedDate
    private Date dateCreated = new Date();
    private List<String>tags;
    @DBRef(lazy = true)
    private List<CommentModel>comments;
    @DBRef(lazy = true)
    private List<UserModel> userId;

    public BlogModel(){

    }

    public String getBlogId() {
        return Id;
    }

    public void setBlogId(String blogId) {
        this.Id = blogId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public List<CommentModel> getComments() {
        return comments;
    }

    public void setComments(List<CommentModel> comments) {
        this.comments = comments;
    }

    public List<UserModel> getUserId() {
        return userId;
    }

    public void setUserId(List<UserModel> userId) {
        this.userId = userId;
    }
}



