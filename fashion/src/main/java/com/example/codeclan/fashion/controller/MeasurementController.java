package com.example.codeclan.fashion.controller;

import com.example.codeclan.fashion.models.Measurement;
import com.example.codeclan.fashion.repository.measurements.MeasurementRepository;
import com.example.codeclan.fashion.repository.selectedStyles.SelectedStyleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/measurements")
public class MeasurementController {

    @Autowired
    MeasurementRepository measurementRepository;

    @Autowired
    SelectedStyleRepository selectedStyleRepository;

    @PutMapping(value = "/{id}")
    public void updateAddMeasurement(@PathVariable long id) {
        Measurement measurement = measurementRepository.getOne(id);
        measurementRepository.save(measurement);
    }
}
