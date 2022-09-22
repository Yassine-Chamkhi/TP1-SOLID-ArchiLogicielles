package com.directi.training.srp.proposed_solution;


public class CarManager
{
    CarDb _carDb;
    CarComparer _carComparer;

    CarManager(){
        this._carDb = new CarDb();
        this._carComparer = new CarComparer(_carDb);
    }

    public Car getCarFromDb(final String carId)
    {
        return _carDb.getCarById(carId);
    }

    public String getCarsNames()
    {
        return _carDb.getCarsNames();
    }

    public Car getBestCar()
    {
        return _carComparer.getBestCar();
    }
}
