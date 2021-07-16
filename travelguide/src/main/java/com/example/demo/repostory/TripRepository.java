package com.example.demo.repostory;

import com.example.demo.model.TripModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TripRepository extends MongoRepository<TripModel, String> {
}
