package com.example.demo.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.sql.Date;
import java.util.List;


@Data
@AllArgsConstructor
@Document(collection = "commentInfo")
public class CommentModel {
    @Id
    private String id;
    @DBRef(lazy = true)
    private List<BlogModel> blogId;
    private String useId;
    private String description;
    private Date date;
    private Boolean IsTrue;

    public CommentModel(){

    }

    public List<BlogModel> getBlogId() {
        return blogId;
    }

    public void setBlogId(List<BlogModel> blogId) {
        this.blogId = blogId;
    }

    public String getUseId() {
        return useId;
    }

    public void setUseId(String useId) {
        this.useId = useId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Boolean getTrue() {
        return IsTrue;
    }

    public void setTrue(Boolean aTrue) {
        IsTrue = aTrue;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
