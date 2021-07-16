package com.example.demo.Services;

import com.example.demo.Model.CommentModel;
import com.example.demo.Repositories.CommentRep;
import com.example.demo.Repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CommentService {


    @Autowired
    private CommentRep commentRep;

    public CommentModel createComment(CommentModel commentDetails){
        return commentRep.save(commentDetails);
    }

    public Optional<CommentModel> getCommentById(String id){
        return commentRep.findById(id);
    }

    public List<CommentModel>getAllComments(){
        return commentRep.findAll();
    }

    public Boolean updateCommentsById(String id, CommentModel commentInfo){
        Optional<CommentModel>isCommentsAvailable =commentRep.findById(id);
        if (isCommentsAvailable.isPresent()) {

            CommentModel commentData = commentRep.save(commentInfo);
            commentData.setDate(commentInfo.getDate());
            commentData.setBlogId(commentInfo.getBlogId());
            commentData.setDescription(commentInfo.getDescription());
            commentData.setIsTrue(commentInfo.getIsTrue());

            commentRep.save(commentInfo);
            return true;


        }else {
            return false;
        }
    }

    public Boolean deleteCommentById(String id){
        Optional<CommentModel>isCommentAvailable =commentRep.findById(id);
        if (isCommentAvailable.isPresent()){
            commentRep.deleteById(id);
            return true;
        } else{
            return false;
        }
    }

}
