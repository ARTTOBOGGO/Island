package com.javarush.island.bogdanov.herbivore;

import com.javarush.island.bogdanov.Plant;

public class Rabbit extends Herbivore{
    @Override
    public void eat(Plant plant) {

    }

    @Override
    public String toString() {
        return "Rabbit{" + "name='" + name + '\'' + ", icon='" + icon + '\'' + '}';
    }
}
