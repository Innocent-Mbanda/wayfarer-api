package controllers;

import model.PassangerModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.PassangerService;

@RestController
@RequestMapping("api/v1")
public class PassangerController {

    @Autowired
    private PassangerService passangerService;

    @PostMapping("passanger")

    public ResponseEntity<PassangerModel> createPassanger(@RequestBody PassangerModel passangeData ){
        return new ResponseEntity<>(passangerService.createPassanger(passangeData), HttpStatus.CREATED);
    }




//    @PostMapping("passanger")
//
//    public passangerModel


}
