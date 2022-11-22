package com.javarush.island.bogdanov.predator;

import com.javarush.island.bogdanov.Organizm;
import com.javarush.island.bogdanov.herbivore.Herbivore;

public class Wolf extends Predator{
    public Wolf() {
        super();
    }

    @Override
    public void eat(Organizm food) {
        super.eat(food);
    }

    @Override
    public String toString() {
        return "Wolf{" + "name='" + name + '\'' + ", icon='" + icon + '\'' + '}';
    }
}
