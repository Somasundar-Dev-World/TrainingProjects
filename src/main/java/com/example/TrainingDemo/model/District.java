package com.example.TrainingDemo.model;

public class District {
    private String districtName;
    private String pincode;
    private Long totalPopulation;
    private Long maleCount;
    private Long femaleCount;

    public District() {}

    public District(String districtName, String pincode, Long totalPopulation, Long maleCount, Long femaleCount) {
        this.districtName = districtName;
        this.pincode = pincode;
        this.totalPopulation = totalPopulation;
        this.maleCount = maleCount;
        this.femaleCount = femaleCount;
    }

    public String getDistrictName() {
        return districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public Long getTotalPopulation() {
        return totalPopulation;
    }

    public void setTotalPopulation(Long totalPopulation) {
        this.totalPopulation = totalPopulation;
    }

    public Long getMaleCount() {
        return maleCount;
    }

    public void setMaleCount(Long maleCount) {
        this.maleCount = maleCount;
    }

    public Long getFemaleCount() {
        return femaleCount;
    }

    public void setFemaleCount(Long femaleCount) {
        this.femaleCount = femaleCount;
    }
}