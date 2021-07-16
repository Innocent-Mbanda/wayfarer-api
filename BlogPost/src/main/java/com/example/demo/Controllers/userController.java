package com.example.demo.Controllers;

import com.example.demo.Model.CommentModel;
import com.example.demo.Model.UserModel;
import com.example.demo.Repositories.UserRepo;
import com.example.demo.Services.CommentService;
import com.example.demo.Services.UserService;
import org.apache.coyote.http2.HpackDecoder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1")
public class userController {
   @Autowired
    private UserService userService;
   private UserModel userModel;



   @PostMapping("/user")

    public ResponseEntity<UserModel>createUser(@RequestBody UserModel userInfo){
       return new ResponseEntity<>(userService.createUser(userInfo),HttpStatus.OK);
   }

   @GetMapping("/users")
    public ResponseEntity<List<UserModel>>getAllUsers(UserModel userModel){
       return new ResponseEntity<>(userService.getAllUsers(userModel),HttpStatus.OK);
   }

   @PutMapping("/user/id")
    public ResponseEntity<String>updateUserById(@RequestBody String id, @RequestBody UserModel userModel ){

       if (userService.updateUserById(id,userModel)){
           return new ResponseEntity<>("The user info is updated",HttpStatus.OK);
       } else {
           return new ResponseEntity<>("Not successful", HttpStatus.OK);
       }

   }

   public ResponseEntity<String>deleteUserById(@RequestBody String id){
       if (userService.deleteBlogUserId(id)){
           return new ResponseEntity<>("user-deleted by successfully",HttpStatus.OK);
       } else {
           return new ResponseEntity<>("user-delete was not successfully",HttpStatus.OK);
       }


   }
}
