package com.javarush.island.bogdanov.predator;

import com.javarush.island.bogdanov.Animal;
import com.javarush.island.bogdanov.herbivore.Herbivore;

import java.util.ArrayList;

public abstract class Predator extends Animal {
    public Predator() {
        super();
    }

    public abstract void eat(Herbivore herbivore);
}
