package com.example.TrainingDemo.model;

import java.util.List;

public class State {
    private String name;
    private List<District> districts;

    public State() {}
    public State(String name, List<District> districts) {
        this.name = name;
        this.districts = districts;
    }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public List<District> getDistricts() { return districts; }
    public void setDistricts(List<District> districts) { this.districts = districts; }
}
