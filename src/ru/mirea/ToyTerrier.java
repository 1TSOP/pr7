package ru.mirea;

public class ToyTerrier extends Dog {

    public ToyTerrier(int age, int mass, int height) {
        this.age = age;
        this.mass = mass;
    }

    @Override
    public void golos() {
        System.out.println("Woof");
    }
}
