package com.example.demo.Services;

import com.example.demo.Model.BlogModel;
import com.example.demo.Model.CommentModel;
import com.example.demo.Repositories.BloggerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BlogService {

    @Autowired
    private BloggerRepo bloggerRepo;


    public BlogModel createBlog(BlogModel blogData){
//        List<String> commendId =blogData.getComments();
//                List<CommentModel>
        return bloggerRepo.save(blogData);
    }

    public List<BlogModel>getAllBlogger(){
        return bloggerRepo.findAll();
    }

    public Optional<BlogModel> getBlogById(String id){
        return bloggerRepo.findById(id);
    }

    public List<BlogModel> getBlogByName(String name){
      return bloggerRepo.findByNames(name);
    }

    public Boolean updateBlogById(String id, BlogModel blogModel){
        Optional<BlogModel>isBlogAvailable =bloggerRepo.findById(id);
        if (isBlogAvailable .isPresent()){
        BlogModel blogModelData = isBlogAvailable.get();

        blogModelData.setTitle(blogModel.getTitle());
        blogModelData.setContent(blogModel.getContent());
        blogModelData.setTags(blogModel.getTags());
        blogModelData.setComments(blogModel.getComments());
        blogModelData.setUserId(blogModel.getUserId());


        bloggerRepo.save(blogModelData);
          return true;

        }else {
            return false;
        }
    }

    public Boolean deleteStudentById(String id){
        Optional<BlogModel>isBlogAvailable =bloggerRepo.findById(id);
        if (isBlogAvailable.isPresent()){
            bloggerRepo.deleteById(id);
            return true;
        }
        else{
            return false;
        }
    }




}
