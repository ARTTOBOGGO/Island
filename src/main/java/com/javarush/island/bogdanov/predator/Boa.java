package com.javarush.island.bogdanov.predator;

import com.javarush.island.bogdanov.herbivore.Herbivore;

public class Boa extends Predator{
    @Override
    public void eat(Herbivore herbivore) {

    }

    @Override
    public String toString() {
        return "Boa{" + "name='" + name + '\'' + ", icon='" + icon + '\'' + '}';
    }
}
