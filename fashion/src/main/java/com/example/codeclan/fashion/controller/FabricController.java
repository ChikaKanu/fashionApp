package com.example.codeclan.fashion.controller;

import com.example.codeclan.fashion.models.Fabric;
import com.example.codeclan.fashion.repository.fabrics.FabricRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fabrics")
public class FabricController {
    @Autowired
    FabricRepository fabricRepository;


    @PutMapping(value = "/{id}")
    public void updateAddFabric(@PathVariable long id) {
        Fabric fabric = fabricRepository.getOne(id);
        fabricRepository.save(fabric);
    }
}
