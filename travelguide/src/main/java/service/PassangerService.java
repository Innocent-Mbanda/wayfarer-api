package service;

import model.PassangerModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repostory.PassangerRepo;

@Service
public class PassangerService {
    
    @Autowired
    private PassangerRepo passangerRepo;


    public PassangerModel createPassanger(PassangerModel passangerData){
        return passangerRepo.save(passangerData);
    }
}
