package com.example.demo.controllers;

import com.example.demo.model.TripModel;
import com.example.demo.service.TripService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1")
public class TripController {

    @Autowired
    private TripService tripService;

    @PostMapping("trip")

    public ResponseEntity<TripModel>createTrip(@RequestBody TripModel tripData){
        return new ResponseEntity<>(tripService.createTrip(tripData),HttpStatus.OK);
    }

    @GetMapping ("trips")

    public ResponseEntity<List<TripModel>>getTrips(){
        return new ResponseEntity<>(tripService.getAllTrips(),HttpStatus.CREATED);

    }


    @GetMapping("trip/id")

    public ResponseEntity<Optional<TripModel>>getTripById(@PathVariable String id){
        return new ResponseEntity<>(tripService.getTripById(id),HttpStatus.OK);
    }



}
