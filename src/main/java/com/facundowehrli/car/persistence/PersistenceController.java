package com.facundowehrli.car.persistence;

import com.facundowehrli.car.persistence.exceptions.NonexistentEntityException;
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

    public void deleteCar(int idCar) throws NonexistentEntityException {
        carJpa.destroy(idCar);
    }

    public Car getCar(int idCar) {
        return carJpa.findCar(idCar);
    }

    public void editCar(Car car) {
        try {
            carJpa.edit(car);
        } catch (Exception ex) {
            System.getLogger(PersistenceController.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }

}
