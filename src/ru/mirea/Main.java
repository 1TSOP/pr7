package ru.mirea;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Plate plate = new Plate(5,8);
        Dish pan = new Pan(35,40);
        plate.calcVolume();
        pan.calcVolume();
        ((Pan)pan).Done();
        System.out.println("Volume plate: " + plate.volume);
        System.out.println("Volume pan: " + pan.volume);
        ArrayList<Dish> allDishes = new ArrayList<>();
        allDishes.add(plate);
        allDishes.add(pan);
        Dog Shepherd = new DogExt(7, 30, "German Shepherd");
        Dog fufik = new ToyTerrier(3, 10, 15);
        Shepherd.golos();
        fufik.golos();
        ArrayList<Dog> allDogs = new ArrayList<>();
        allDogs.add(Shepherd);
        allDogs.add(fufik);
    }
}