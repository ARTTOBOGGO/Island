package com.javarush.island.bogdanov.herbivore;

import com.javarush.island.bogdanov.Plant;

public class Deer extends Herbivore{
    @Override
    public void eat(Plant plant) {

    }

    @Override
    public String toString() {
        return "Deer{" + "name='" + name + '\'' + ", icon='" + icon + '\'' + '}';
    }
}
