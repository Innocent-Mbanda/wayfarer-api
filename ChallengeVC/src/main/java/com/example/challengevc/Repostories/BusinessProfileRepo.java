package com.example.challengevc.Repostories;

import Model.BusinessProfile;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface BusinessProfileRepo extends MongoRepository
        <BusinessProfile, String> {

}
