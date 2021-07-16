package com.example.demo.service;

import com.example.demo.model.TripModel;
import com.example.demo.repostory.TripRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TripService {

    @Autowired
    private TripRepository tripRepository;

    public TripModel createTrip(TripModel tripData){
        return tripRepository.save(tripData);
    }


    public List<TripModel>getAllTrips(){
        return tripRepository.findAll();
    }

    public Optional<TripModel> getTripById(String id) {
        return tripRepository.findById(id);
    }
}
