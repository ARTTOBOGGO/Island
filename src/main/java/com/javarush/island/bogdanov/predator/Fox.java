package com.javarush.island.bogdanov.predator;

import com.javarush.island.bogdanov.herbivore.Herbivore;

public class Fox extends Predator{
    @Override
    public void eat(Herbivore herbivore) {

    }

    @Override
    public String toString() {
        return "Fox{" + "name='" + name + '\'' + ", icon='" + icon + '\'' + '}';
    }
}
