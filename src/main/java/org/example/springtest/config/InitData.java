package org.example.springtest.config;

import org.example.springtest.model.Car;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class InitData {

    private ArrayList<Car> carList = new ArrayList<>();

    public InitData(){

        carList.add(new Car(1, "volvo", 2012, "Sedan", "Red", "ABC123", "blåvolvostationcar.jpg"));
        carList.add(new Car(1, "Ford", 2008, "HatchBack", "Grey", "Poopy", "generic.jpg"));
        carList.add(new Car(1, "Dodge", 2001, "Sports Car", "Yellow", "DubaiBaby", "GrønVWpolo.jpg"));
        carList.add(new Car(1, "Fisker", 2025, "Shit", "Black", "Can'tDrive", "GulVWBobbel.jpg"));
        carList.add(new Car(1, "Suzuki", 2009, "Best Car", "Grey", "BestCar", "WesternstarRødTruck.jpg"));
    }


    public ArrayList<Car> getCarList(){
        return carList;
    }
}
