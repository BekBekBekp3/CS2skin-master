package com.example.cs2skin.controller;

import com.example.cs2skin.model.Skin;
import com.example.cs2skin.service.SkinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/skins")
public class SkinController {
@Autowired
    SkinService skinService;
    @GetMapping()
    List<Skin> getAllSkins(){
        return skinService.getAllSkins();
    }

    @GetMapping("/{id}")
    public Skin getSkinById(@PathVariable int id) {
        return skinService.getSkinById(id);
    }

    @DeleteMapping("/{id}")
    void deleteSkinById(@PathVariable int id) {
        skinService.deleteSkinById(id);
    }

}
