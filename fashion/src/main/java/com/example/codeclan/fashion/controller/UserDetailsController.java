package com.example.codeclan.fashion.controller;

import com.example.codeclan.fashion.models.UserDetail;
import com.example.codeclan.fashion.repository.userDetails.UserDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/userDetails")
public class UserDetailsController {

    @Autowired
    UserDetailRepository userDetailRepository;

    @PutMapping(value = "/{id}")
    public void updateAddUserDetail(@PathVariable long id) {
        UserDetail userDetail = userDetailRepository.getOne(id);
        userDetailRepository.save(userDetail);
    }
}
