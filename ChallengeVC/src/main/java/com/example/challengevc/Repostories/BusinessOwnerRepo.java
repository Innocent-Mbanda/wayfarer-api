package com.example.challengevc.Repostories;

import Model.BusinessOwner;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BusinessOwnerRepo extends MongoRepository<BusinessOwner, String>{
}
