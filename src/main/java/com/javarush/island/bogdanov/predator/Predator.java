package com.javarush.island.bogdanov.predator;

import com.javarush.island.bogdanov.Animal;
import com.javarush.island.bogdanov.Organizm;
import com.javarush.island.bogdanov.herbivore.Herbivore;

import java.util.ArrayList;

public abstract class Predator extends Animal {
    public Predator() {
        super();
    }

    @Override
    public void eat(Organizm food) {
        super.eat(food);
    }
}
