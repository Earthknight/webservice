package com.example.almtool.service;


import com.example.almtool.dto.UserLoginRequest;
import com.example.almtool.entities.Team;
import com.example.almtool.entities.User;
import com.example.almtool.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;


    public  String getLoginResponse(UserLoginRequest userLoginRequest) {
        Boolean check = userRepository.checkUsernamePassword(userLoginRequest.getUsername(),userLoginRequest.getPassword());
        if(check){
            return "Succefull login\n Welcome " + userLoginRequest.getUsername();
        }
        else {
            return "Failed login due to wrong credentials";
        }
    }

    public String getUserProfile(String userid) {
        Optional<User> user =  userRepository.findById(userid);
        String username = user.get().getUsername();
        String userteam = user.get().getTeam().getTeamname();
        return  username + " Works for " + userteam;
    }
}
