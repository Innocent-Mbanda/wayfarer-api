package com.example.demo.Controllers;

import com.example.demo.Model.CommentModel;
import com.example.demo.Services.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1")
public class CommentController {
    @Autowired
    private CommentService commentService;

    @PostMapping("/comment")
    public ResponseEntity<CommentModel> createComment(@RequestBody CommentModel commentModel){
        return new ResponseEntity<>(commentService.createComment(commentModel), HttpStatus.OK);
    }

    @GetMapping("/comment/id")

    public ResponseEntity<Optional<CommentModel>>getCommentById(@PathVariable String id){
        return new ResponseEntity<>(commentService.getCommentById(id),HttpStatus.OK);
    }

    @GetMapping("/comments")
    public ResponseEntity<List<CommentModel>>getAllComments(){
        return new ResponseEntity<>(commentService.getAllComments(),HttpStatus.OK);
    }

    @PutMapping("comments/id")

    public ResponseEntity<String>updateCommentById(@RequestBody String id, @PathVariable CommentModel commentData){
        if (commentService.updateCommentsById(id,commentData)){
            return new ResponseEntity<>("comment has been updated",HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Updating failure",HttpStatus.OK);
        }
    }

    @DeleteMapping("/comment/id")

    public ResponseEntity<String>deleteCommentById(@PathVariable String id){
        if (commentService.deleteCommentById(id)){
            return new ResponseEntity<>("comment has been deleted",HttpStatus.OK);
        } else {
            return new ResponseEntity<>("deleting comment failured",HttpStatus.OK);
        }
    }


}
