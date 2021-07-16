package com.example.demo.repostory;

import com.example.demo.model.PassengerModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface PassengerRepo extends MongoRepository<PassengerModel,String> {
    @Query("{'names': ?0}")
    List<PassengerModel>findByNames(String names);

}
