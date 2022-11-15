package com.javarush.island.bogdanov.herbivore;

import com.javarush.island.bogdanov.Plant;

public class Boar extends Herbivore{
    @Override
    public void eat(Plant plant) {
    }

    @Override
    public String toString() {
        return "Boar{" + "name='" + name + '\'' + ", icon='" + icon + '\'' + '}';
    }
}
