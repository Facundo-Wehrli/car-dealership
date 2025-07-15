package com.facundowehrli.car.persistence;

import com.facundowehrli.car.service.Car;

public class PersistenceController {

    CarJpaController carJpa = new CarJpaController();

    public void addCar(Car car) {
        carJpa.create(car);
    }
    
}
