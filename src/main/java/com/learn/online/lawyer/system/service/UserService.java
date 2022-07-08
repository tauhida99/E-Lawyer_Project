package com.learn.online.lawyer.system.service;

import com.learn.online.lawyer.system.entity.User;
import com.learn.online.lawyer.system.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;


    public void saveUsers(User user) {
        userRepository.save(user);
    }

    public List<User> displayAllUser() {
        return userRepository.findAll();
    }


    public User updateAllUser(Integer userid) {
       return userRepository.findById(userid).get();
    }

    public void deleteAllUser(Integer userid) {
        userRepository.deleteById(userid);
    }
}
