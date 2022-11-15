package com.javarush.island.bogdanov.herbivore;

import com.javarush.island.bogdanov.Plant;

public class Goat extends Herbivore{
    @Override
    public void eat(Plant plant) {

    }

    @Override
    public String toString() {
        return "Goat{" + "name='" + name + '\'' + ", icon='" + icon + '\'' + '}';
    }
}
