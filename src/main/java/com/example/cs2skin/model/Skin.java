package com.example.cs2skin.model;

import jakarta.persistence.*;
import jdk.jfr.Category;

import java.util.concurrent.atomic.AtomicInteger;

import static jakarta.persistence.GenerationType.IDENTITY;

@Entity
@Table
public class Skin {
    private final  static AtomicInteger idgenerator = new AtomicInteger(0);
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private int id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private Category category;
    @Column(nullable = false)
    private Float skinFloat;
    @Column(nullable = false)
    private Rarity rarity;
    @Column(nullable = false)
    private Quality quality;
    @Column(nullable = true)
    private String ImageURL;
    @Column(nullable = true)
    private Boolean StatTrak;
    enum Category{
        Pistol, SMG, SniperRifel,Shotgun, Rifle, Equipment, knife, MachineGun, Gloves
    }
    enum Rarity{
        Exstraordinary, Covert, Classified, Restricted, MilSpec
    }
    enum Quality{
        FactoryNew, MinimalWear, FielTested, WellWorn, BattleScared
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Float getSkinFloat() {
        return skinFloat;
    }

    public void setSkinFloat(Float skinFloat) {
        this.skinFloat = skinFloat;
    }

    public Rarity getRarity() {
        return rarity;
    }

    public void setRarity(Rarity rarity) {
        this.rarity = rarity;
    }

    public Quality getQuality() {
        return quality;
    }

    public void setQuality(Quality quality) {
        this.quality = quality;
    }

    public String getImageURL() {
        return ImageURL;
    }

    public void setImageURL(String imageURL) {
        ImageURL = imageURL;
    }

    public Boolean getStatTrak() {
        return StatTrak;
    }

    public void setStatTrak(Boolean statTrak) {
        StatTrak = statTrak;
    }

}