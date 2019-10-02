package com.example.codeclan.fashion.controller;

import com.example.codeclan.fashion.models.SelectedStyle;
import com.example.codeclan.fashion.repository.fabrics.FabricRepository;
import com.example.codeclan.fashion.repository.measurements.MeasurementRepository;
import com.example.codeclan.fashion.repository.selectedStyles.SelectedStyleRepository;
import com.example.codeclan.fashion.repository.styles.StyleRepository;
import com.example.codeclan.fashion.repository.tailors.TailorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/selectedStyles")
public class SelectedStyleController {
    @Autowired
    SelectedStyleRepository selectedStyleRepository;

    @Autowired
    StyleRepository styleRepository;

    @Autowired
    TailorRepository tailorRepository;

    @Autowired
    FabricRepository fabricRepository;

    @Autowired
    MeasurementRepository measurementRepository;

    @PutMapping(value = "/{id}")
    public void updateAddSelectedStyle(@PathVariable long id){
        SelectedStyle selectedStyle = selectedStyleRepository.getOne(id);

        selectedStyleRepository.save(selectedStyle);
    }



}
