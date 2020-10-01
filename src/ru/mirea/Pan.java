package ru.mirea;

public class Pan  extends  Dish{

    public Pan(int radius, int deep) {
        this.radius = radius;
        this.deep = deep;
    }

    @Override
    public void calcVolume() {
        volume =  radius* deep* 10;
    }

    public void Done(){
        System.out.println("Done");
    }

}