package com.example.challengevc.Controllers;

import Model.BusinessProfile;
import com.example.challengevc.Services.BusinessProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BusinessProfileController {

    @Autowired
    private BusinessProfileService businessProfileService;

    @PostMapping("businessProfile")

    public String AddBusinessProfile(@RequestBody BusinessProfile businessProfile) {
        return businessProfileService.AddBusinessProfile(businessProfile);
    }

    @GetMapping("businessProfile/{id}")
    public ResponseEntity<Object> getBusinessProfileById(@PathVariable String id) {
        return new ResponseEntity<>(businessProfileService.getBusinessProfile(id), HttpStatus.ACCEPTED);
    }

    @GetMapping("businesses")

    public ResponseEntity<List<BusinessProfile>>getAllBusinessProfile(){
        return new ResponseEntity<>(businessProfileService.getAllBusinessProfile(),HttpStatus.OK);
    }
}
