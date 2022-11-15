package com.javarush.island.bogdanov.predator;

import com.javarush.island.bogdanov.herbivore.Herbivore;

import java.util.ArrayList;

public class Bear extends Predator{


    @Override
    public void eat(Herbivore herbivore) {

    }

    @Override
    public String toString() {
        return "Bear{" + "name='" + name + '\'' + ", icon='" + icon + '\'' + '}';
    }
}
