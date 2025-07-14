package com.facundowehrli.car.service;

public class Car {

    private int id;
    private String model;
    private String brand;
    private String engine;
    private String licencePlate;
    private String color;
    private int doorCount;

    public Car() {
    }

    public Car(int id, String model, String brand, String engine, String licencePlate, String color, int doorCount) {
        this.id = id;
        this.model = model;
        this.brand = brand;
        this.engine = engine;
        this.licencePlate = licencePlate;
        this.color = color;
        this.doorCount = doorCount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getLicencePlate() {
        return licencePlate;
    }

    public void setLicencePlate(String licencePlate) {
        this.licencePlate = licencePlate;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getDoorCount() {
        return doorCount;
    }

    public void setDoorCount(int doorCount) {
        this.doorCount = doorCount;
    }

}
