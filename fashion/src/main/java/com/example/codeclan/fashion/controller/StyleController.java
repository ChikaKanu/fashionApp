package com.example.codeclan.fashion.controller;

import com.example.codeclan.fashion.models.Style;
import com.example.codeclan.fashion.repository.selectedStyles.SelectedStyleRepository;
import com.example.codeclan.fashion.repository.styles.StyleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/styles")
public class StyleController {

    @Autowired
    StyleRepository styleRepository;

    @Autowired
    SelectedStyleRepository selectedStyleRepository;

    @PutMapping(value = "/{id}")
    public void updateAddStyle(@PathVariable long id) {
        Style style = styleRepository.getOne(id);
        styleRepository.save(style);
    }

    @PostMapping
    public List<Style> addStyle(@PathVariable Style style) {
        styleRepository.save(style);
        return styleRepository.findAll();
    }

    @DeleteMapping(value="{:id}")
    public void deleteStyle(@PathVariable long id){
        Style style = styleRepository.getOne(id);
        styleRepository.delete(style);
    }
}
