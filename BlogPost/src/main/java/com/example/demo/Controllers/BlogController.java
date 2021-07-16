package com.example.demo.Controllers;

import com.example.demo.Model.BlogModel;
import com.example.demo.Services.BlogService;
import com.example.demo.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1")
public class BlogController {
  @Autowired
  private BlogService blogService;

  @Autowired
  private UserService userService;

  @PostMapping("/blogger")
    public ResponseEntity<BlogModel>createBlog(@RequestBody BlogModel blogInfo){
      return new ResponseEntity<>(blogService.createBlog(blogInfo), HttpStatus.OK);
  }

  @GetMapping("/blogs")

  public ResponseEntity<List<BlogModel>>getAllBlogs(){
    return new ResponseEntity<>(blogService.getAllBlogger(),HttpStatus.CREATED);
  }

  @GetMapping("/blog/{id}")
  public ResponseEntity<Optional<BlogModel>> getBlogById(@PathVariable String id, BlogModel blogModel){
    return  new ResponseEntity<>(blogService.getBlogById(id),HttpStatus.OK);
  }

  @GetMapping("/blog{name}")
  public ResponseEntity<List<BlogModel>> getBlogByName(@PathVariable String name){
    return new ResponseEntity<>(blogService.getBlogByName(name),HttpStatus.OK);
  }

  @PutMapping("/blog/{id}")
  public ResponseEntity<String>updateBlogById(@PathVariable String id,  @RequestBody BlogModel blogModelInfo){
    if (blogService.updateBlogById(id, blogModelInfo)){
      return new ResponseEntity<String>("Blog has been successfully updated",HttpStatus.CREATED);
    } else {
      return new ResponseEntity<>("the blog has not been updated",HttpStatus.OK);
    }

  }
  @DeleteMapping("/blog/{id}")
  public ResponseEntity<String>deleteBlogById(@PathVariable String id){
    if (blogService.deleteStudentById(id)){
      return new ResponseEntity<>("blog has been deleted",HttpStatus.OK);

    }else {
      return new ResponseEntity<>("deleting blog failed",HttpStatus.EXPECTATION_FAILED);
    }

  }


}
