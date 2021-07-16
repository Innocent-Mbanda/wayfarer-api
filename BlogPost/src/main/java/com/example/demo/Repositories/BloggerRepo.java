package com.example.demo.Repositories;

import com.example.demo.Model.BlogModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface BloggerRepo extends MongoRepository<BlogModel, String> {

    @Query("{'names': ?0}")
    List<BlogModel> findByNames(String name);
}
