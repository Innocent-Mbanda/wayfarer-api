package com.example.challengevc.Controllers;


import Model.BusinessOwner;
import com.example.challengevc.Services.BusinessOwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BusinessOwnerController {

    @Autowired
    BusinessOwnerService businessOwnerService;


    @PostMapping("businessOwnerProfiler")

   public String AddBusinessOwnerProfile(@RequestBody BusinessOwner businessOwner){
        return businessOwnerService.addBusinessProfile(businessOwner);
    }
   @GetMapping("businessOwners")
    public ResponseEntity<List<BusinessOwner>>getAllBusinessOwners(){
        return new ResponseEntity<>(businessOwnerService.getAllBusinessOwners(),HttpStatus.OK);
    }





}
