package com.example.test.demotest;

public class Animal {
    private String name;
    private Integer noOfLegs;

    public Animal(String name, Integer noOfLegs) {
        this.name = name;
        this.noOfLegs = noOfLegs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNoOfLegs() {
        return noOfLegs;
    }

    public void setNoOfLegs(Integer noOfLegs) {
        this.noOfLegs = noOfLegs;
    }
}
