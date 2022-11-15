package com.javarush.island.bogdanov.predator;

import com.javarush.island.bogdanov.herbivore.Herbivore;

public class Wolf extends Predator{
    @Override
    public void eat(Herbivore herbivore) {

    }

    @Override
    public String toString() {
        return "Wolf{" + "name='" + name + '\'' + ", icon='" + icon + '\'' + '}';
    }
}
