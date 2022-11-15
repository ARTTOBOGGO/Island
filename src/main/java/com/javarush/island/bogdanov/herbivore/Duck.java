package com.javarush.island.bogdanov.herbivore;

import com.javarush.island.bogdanov.Plant;

public class Duck extends Herbivore{
    @Override
    public void eat(Plant plant) {

    }

    @Override
    public String toString() {
        return "Duck{" + "name='" + name + '\'' + ", icon='" + icon + '\'' + '}';
    }
}
