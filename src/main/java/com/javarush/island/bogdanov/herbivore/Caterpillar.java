package com.javarush.island.bogdanov.herbivore;

import com.javarush.island.bogdanov.Plant;

public class Caterpillar extends Herbivore{
    @Override
    public void eat(Plant plant) {

    }

    @Override
    public String toString() {
        return "Caterpillar{" + "name='" + name + '\'' + ", icon='" + icon + '\'' + '}';
    }
}
