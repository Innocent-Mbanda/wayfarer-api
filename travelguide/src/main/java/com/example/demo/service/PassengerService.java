package com.example.demo.service;

import com.example.demo.model.PassengerModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.repostory.PassengerRepo;

import java.util.List;
import java.util.Optional;

@Service
public class PassengerService {

    @Autowired
    private PassengerRepo passengerRepo;


    public PassengerModel createPassenger(PassengerModel passengerData) {
        return passengerRepo.save(passengerData);
    }

    public List<PassengerModel> getPassengers() {
        return passengerRepo.findAll();

    }

    public List<PassengerModel> findPassengerByNames(String names) {
        return passengerRepo.findByNames(names);
    }


    public boolean deletePassengerById(String id ) {
        Optional<PassengerModel> isPassengerExist = passengerRepo.findById(id);
        if (isPassengerExist.isPresent()) {
            passengerRepo.deleteById(id);
            return true;
        } else {
            return false;
        }
    }

    public boolean updatePassengerInfo(String id, PassengerModel passengerModel) {
        Optional<PassengerModel> isPassengerAvailable = passengerRepo.findById(id);
        if (isPassengerAvailable.isPresent()) {

           PassengerModel passengerData = isPassengerAvailable.get();
           passengerData.setPhone(passengerModel.getPhone());
            passengerData.setDate(passengerModel.getDate());
            passengerData.setDestination(passengerModel.getDestination());
            passengerData.setArrival(passengerModel.getArrival());

           passengerRepo.save(passengerData);
           return true;

        } else {
            return false;
        }


    }

}
