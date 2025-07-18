package com.facundowehrli.car.service;

import com.facundowehrli.car.persistence.PersistenceController;
import com.facundowehrli.car.persistence.exceptions.NonexistentEntityException;
import java.util.List;

public class Controller {
    
    PersistenceController controlPersis = new PersistenceController();
    
    public void addCar(String model, String brand, String engine, String licencePlate, String color, int doorCount) {
        //create a new Car befor saving it on persistence layer
        Car car = new Car();
        car.setModel(model);
        car.setBrand(brand);
        car.setEngine(engine);
        car.setColor(color);
        car.setLicencePlate(licencePlate);
        car.setDoorCount(doorCount);
        
        controlPersis.addCar(car);
    }
    
    public List<Car> getCars() {
        return controlPersis.getCars();
    }
    
    public void deleteCar(int idCar) throws NonexistentEntityException {
        controlPersis.deleteCar(idCar);
    }
    
    public Car getCar(int idCar) {
        return controlPersis.getCar(idCar);
    }
    
    public void editCar(Car car, String model, String brand, String engine, String licencePlate, String color, int doorCount) {
        car.setModel(model);
        car.setBrand(brand);
        car.setColor(color);
        car.setDoorCount(doorCount);
        car.setEngine(engine);
        car.setLicencePlate(licencePlate);
        
        controlPersis.editCar(car);
    }
    
}
