package com.example.demo.Repositories;

import com.example.demo.Model.CommentModel;
import com.example.demo.Model.UserModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends MongoRepository<UserModel,String> {

}
