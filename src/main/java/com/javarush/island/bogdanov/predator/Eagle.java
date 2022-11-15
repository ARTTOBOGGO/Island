package com.javarush.island.bogdanov.predator;

import com.javarush.island.bogdanov.herbivore.Herbivore;

public class Eagle extends Predator{
    @Override
    public void eat(Herbivore herbivore) {

    }

    @Override
    public String toString() {
        return "Eagle{" + "name='" + name + '\'' + ", icon='" + icon + '\'' + '}';
    }
}
