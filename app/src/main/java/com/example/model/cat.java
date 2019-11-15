package com.example.model;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;
import java.util.List;

@Entity
public class cat {
    @PrimaryKey
    @NonNull
    private long id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    private String origin;
    //////////////////////////////////////////////////////////////
    private int energy_level;

    private int shedding_level;

    private int intelligence;
    ////////////////////////////////////////////////
    private int dog_friendly;

    private String weight_imperial;

    private String life_span;

    private String temperament;

    private String wikipedia_url;

    private String text;

    private String url;

    private  String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }



    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }



    public int getEnergy_level() {
        return energy_level;
    }

    public void setEnergy_level(int energy_level) {
        this.energy_level = energy_level;
    }

    @NonNull
    public long getId() {
        return id;
    }

    public void setId(@NonNull long id) {
        this.id = id;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public int getEnrgy_level() {
        return energy_level;
    }

    public void setEnrgy_level(int enrgy_level) {
        this.energy_level = enrgy_level;
    }

    public int getShedding_level() {
        return shedding_level;
    }

    public void setShedding_level(int shedding_level) {
        this.shedding_level = shedding_level;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getDog_friendly() {
        return dog_friendly;
    }

    public void setDog_friendly(int dog_friendly) {
        this.dog_friendly = dog_friendly;
    }

    public String getWeight_imperial() {
        return weight_imperial;
    }

    public void setWeight_imperial(String weight_imperial) {
        this.weight_imperial = weight_imperial;
    }

    public String getLife_span() {
        return life_span;
    }

    public void setLife_span(String life_span) {
        this.life_span = life_span;
    }

    public String getTemperament() {
        return temperament;
    }

    public void setTemperament(String temperament) {
        this.temperament = temperament;
    }

    public String getWikipedia_url() {
        return wikipedia_url;
    }

    public void setWikipedia_url(String wikipedia_url) {
        this.wikipedia_url = wikipedia_url;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}

