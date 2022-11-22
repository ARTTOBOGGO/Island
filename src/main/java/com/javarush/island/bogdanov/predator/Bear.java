package com.javarush.island.bogdanov.predator;

import com.javarush.island.bogdanov.Organizm;
import com.javarush.island.bogdanov.Parametrs;
import com.javarush.island.bogdanov.herbivore.Herbivore;

import java.util.ArrayList;

public class Bear extends Predator{
    public Bear() {
        super();
    }

    @Override
    public void eat(Organizm food) {
        super.eat(food);
    }

    @Override
    public String toString() {
        return "Bear{" + "name='" + name + '\'' + ", icon='" + icon + '\'' + '}';
    }
}
