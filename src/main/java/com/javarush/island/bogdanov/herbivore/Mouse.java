package com.javarush.island.bogdanov.herbivore;

import com.javarush.island.bogdanov.Plant;

public class Mouse extends Herbivore{
    @Override
    public void eat(Plant plant) {

    }

    @Override
    public String toString() {
        return "Mouse{" + "name='" + name + '\'' + ", icon='" + icon + '\'' + '}';
    }
}
