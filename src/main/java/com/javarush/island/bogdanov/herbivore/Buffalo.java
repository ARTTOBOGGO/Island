package com.javarush.island.bogdanov.herbivore;

import com.javarush.island.bogdanov.Plant;

public class Buffalo extends Herbivore{
    @Override
    public void eat(Plant plant) {
    }

    @Override
    public String toString() {
        return "Buffalo{" + "name='" + name + '\'' + ", icon='" + icon + '\'' + '}';
    }
}
