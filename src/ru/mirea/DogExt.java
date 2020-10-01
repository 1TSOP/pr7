package ru.mirea;

public class DogExt extends Dog{

    public DogExt(int age, int mass, String breed) {
        this.age = age;
        this.mass = mass;
        this.breed = breed;
    }
    @Override
    public void golos() {
        System.out.println("Woof");
    }
}