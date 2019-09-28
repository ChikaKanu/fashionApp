package com.example.codeclan.fashion.controller;

import com.example.codeclan.fashion.models.SelectedStyle;
import com.example.codeclan.fashion.repository.selectedStyles.SelectedStyleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/selectedStyle")
public class SelectedStyleController {
    @Autowired
    SelectedStyleRepository selectedStyleRepository;

    @PutMapping("/{id}")
    public void updateAddSelectedStyle(@PathVariable long id){
        SelectedStyle selectedStyle = selectedStyleRepository.getOne(id);
        selectedStyleRepository.save(selectedStyle);
    }



}
