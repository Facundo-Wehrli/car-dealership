package com.facundowehrli.car.persistence;

import com.facundowehrli.car.service.Car;
import java.util.List;

public class PersistenceController {

    CarJpaController carJpa = new CarJpaController();

    public void addCar(Car car) {
        carJpa.create(car);
    }

    public List<Car> getCars() {
        return carJpa.findCarEntities();
    }

}
