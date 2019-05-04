package com.example.codeclan.fashion.controller;

import com.example.codeclan.fashion.models.Tailor;
import com.example.codeclan.fashion.repository.tailors.TailorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tailors")
    public class TailorController {

    @Autowired
    TailorRepository tailorRepository;

    @PutMapping(value = "/{id}")
    public void updateAddTailor(@PathVariable long id) {
        Tailor tailor = tailorRepository.getOne(id);
        tailorRepository.save(tailor);
    }

}
