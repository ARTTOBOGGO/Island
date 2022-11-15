package com.javarush.island.bogdanov;

import java.util.ArrayList;

public abstract class Animal extends Organizm {

    public String name = Parametrs.names.get(this.getClass().getSimpleName());
    private Double speed;
    private Double weight;
    private Double maxWeightFood;
    private Double maxCount;
    public String icon;

    public Animal() {
        ArrayList<Double> fields = Parametrs.getFields().get(this.getClass().getSimpleName());
        this.speed=fields.get(2);
        this.weight=fields.get(0);
        this.maxWeightFood=fields.get(3);
        this.maxCount=fields.get(1);
        this.icon = Parametrs.icons.get(this.getClass().getSimpleName());


    }

    @Override
    public String toString() {
        return "Animal{" + "speed=" + speed + ", weight=" + weight + ", maxWeightFood=" + maxWeightFood + ", maxCount=" + maxCount +'}';
    }

    public void multiply(){


    }
    public void muve(){

    }
}
