package com.example.demo.Services;

import com.example.demo.Model.UserModel;
import com.example.demo.Repositories.UserRepo;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepo userRepo;


    public UserModel createUser(UserModel userModel) {
        return userRepo.save(userModel);
    }

    public List<UserModel> getAllUsers(UserModel userData) {
        return userRepo.findAll();
    }


    public Boolean deleteBlogUserId(String id){
        Optional<UserModel> isUserAvailable=userRepo.findById(id);
        if (isUserAvailable.isPresent()){
            userRepo.deleteById(id);
            return true;
        }else {
            return false;
        }
    }
    public Boolean updateUserById(String id, UserModel userInfo) {
        Optional<UserModel> isUserAvailable = userRepo.findById(id);
        if (isUserAvailable.isPresent()){


            UserModel userData = userRepo.save(userInfo);

            userData.setUserName(userInfo.getUserName());
            userData.setLocation(userInfo.getLocation());
            userData.setPassword(userInfo.getPassword());
            userData.setEmail(userInfo.getEmail());

            userRepo.save(userData);
            return true;
        } else {
            return false;
        }



    }


}
