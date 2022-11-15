package com.javarush.island.bogdanov.herbivore;

import com.javarush.island.bogdanov.Animal;
import com.javarush.island.bogdanov.Plant;

public abstract class Herbivore extends Animal {
    public abstract void eat(Plant plant);
}
