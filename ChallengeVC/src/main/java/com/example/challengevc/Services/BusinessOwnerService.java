package com.example.challengevc.Services;

import Model.BusinessOwner;
import com.example.challengevc.Repostories.BusinessOwnerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BusinessOwnerService {

    @Autowired
    BusinessOwnerRepo businessOwnerRepo;

    public String addBusinessProfile(BusinessOwner businessOwner) {
        businessOwnerRepo.save(businessOwner);
        return "business Profile was added successfully";
    }

    public List<BusinessOwner>getAllBusinessOwners(){
        return businessOwnerRepo.findAll();
    }
}
