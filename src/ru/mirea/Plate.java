package ru.mirea;

public class Plate extends Dish{

    public Plate(int radius, int deep) {
        this.radius = radius;
        this.deep = deep;
        calcVolume();
    }
    @Override
    public void calcVolume() {
        volume = radius * deep;
    }
}