package com.javarush.island.bogdanov.herbivore;

import com.javarush.island.bogdanov.Plant;

public class Horse extends Herbivore{
    @Override
    public void eat(Plant plant) {

    }

    @Override
    public String toString() {
        return "Horse{" + "name='" + name + '\'' + ", icon='" + icon + '\'' + '}';
    }
}
