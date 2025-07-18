package com.example.TrainingDemo.model;

import java.util.List;

public class Country {
    private String countryName;
    private List<State> states;

    public Country() {}

    public Country(String countryName, List<State> states) {
        this.countryName = countryName;
        this.states = states;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public List<State> getStates() {
        return states;
    }

    public void setStates(List<State> states) {
        this.states = states;
    }
}

