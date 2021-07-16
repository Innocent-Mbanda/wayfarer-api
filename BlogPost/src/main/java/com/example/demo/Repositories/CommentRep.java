package com.example.demo.Repositories;

import com.example.demo.Model.CommentModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CommentRep extends MongoRepository<CommentModel, String> {


}
