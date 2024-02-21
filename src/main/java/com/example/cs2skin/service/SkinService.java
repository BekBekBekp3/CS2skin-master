package com.example.cs2skin.service;

import com.example.cs2skin.model.Skin;
import com.example.cs2skin.model.SkinOptions;
import com.example.cs2skin.repository.SkinRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;

@Service
public class SkinService {
    @Autowired
    SkinRepository skinRepository;

    @GetMapping()
    public List<Skin> getAllSkins(){
        List<Skin> skins = new ArrayList<>();
        skinRepository.findAll().forEach(skin -> skins.add(skin));
        return skins;
    }

    public Skin getSkinById(int id) {
        return skinRepository.findById(id).orElse(null);
    }
}
