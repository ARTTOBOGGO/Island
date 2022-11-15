package com.javarush.island.bogdanov.herbivore;

import com.javarush.island.bogdanov.Plant;

public class Sheep extends Herbivore{
    @Override
    public void eat(Plant plant) {
    }

    @Override
    public String toString() {
        return "Sheep{" + "name='" + name + '\'' + ", icon='" + icon + '\'' + '}';
    }
}
