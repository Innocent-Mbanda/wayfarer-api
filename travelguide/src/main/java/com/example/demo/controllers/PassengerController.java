package com.example.demo.controllers;

import com.example.demo.model.PassengerModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.demo.service.PassengerService;

import java.util.IllegalFormatCodePointException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1")
public class PassengerController {

    @Autowired
    private PassengerService passengerService;

    @PostMapping("/passenger")

    public ResponseEntity<PassengerModel> createPassenger(@RequestBody PassengerModel passengerData) {
        return new ResponseEntity<>(passengerService.createPassenger(passengerData), HttpStatus.CREATED);
    }

    @GetMapping("/passengers")

    public ResponseEntity<List<PassengerModel>> getAllPassengers() {
        return new ResponseEntity<>(passengerService.getPassengers(), HttpStatus.CREATED);
    }

    @GetMapping("/passengers/name/{name}")
    public ResponseEntity<List<PassengerModel>> getPassengersByName(@PathVariable String name) {
        return new ResponseEntity<>(passengerService.findPassengerByNames(name), HttpStatus.OK);
    }

    @DeleteMapping("/passengers/id")

    public ResponseEntity<String> deletePassengerById(@PathVariable String id) {
        if (passengerService.deletePassengerById(id)) {
            return new ResponseEntity<String>("You deleted a passenger", HttpStatus.OK);


        } else {
            return new ResponseEntity<String>("Passenger does not exist",HttpStatus.OK);
        }
    }


    @PutMapping("/passenger/id")

    public ResponseEntity<String>updateStudentById(@PathVariable String id, @RequestBody PassengerModel passengerModel){

        if (passengerService.updatePassengerInfo(id,passengerModel)){
            return new ResponseEntity<>("Passenger has been updated" ,HttpStatus.OK);
        } else {
            return new ResponseEntity<String>("Update failure",HttpStatus.FAILED_DEPENDENCY);
        }

    }

}
