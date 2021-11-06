package com.haydikodlayalim.exchandling.dto;

public class Car {
    private String brand;
    private String name;

    public Car() {
    }

    public Car(String brand, String name) {
        this.brand = brand;
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
