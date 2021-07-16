package com.example.challengevc.Services;

import Model.BusinessProfile;
import com.example.challengevc.Repostories.BusinessProfileRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BusinessProfileService {

    @Autowired
    private BusinessProfileRepo businessProfileRepo;

    public String AddBusinessProfile(BusinessProfile businessProfile){
        businessProfileRepo.save(businessProfile);
        return "business was added successfully";
    }

    public Optional<BusinessProfile> getBusinessProfile(String id){
        return businessProfileRepo.findById(id);
    }

    public List<BusinessProfile> getAllBusinessProfile(){
        return businessProfileRepo.findAll();
    }

}
