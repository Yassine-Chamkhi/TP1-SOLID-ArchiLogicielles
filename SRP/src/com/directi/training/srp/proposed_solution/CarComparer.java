package com.directi.training.srp.proposed_solution;

public class CarComparer {
    CarDb _carDb;

    CarComparer(CarDb carDb){
        this._carDb = carDb;
    }

    public Car getBestCar()
    {
        Car bestCar = null;
        for (Car car : _carDb.getAllCars()) {
            if (bestCar == null || car.getModel().compareTo(bestCar.getModel()) > 0) {
                bestCar = car;
            }
        }
        return bestCar;
    }
}
