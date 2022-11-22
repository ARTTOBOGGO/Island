package com.javarush.island.bogdanov.predator;

import com.javarush.island.bogdanov.Organizm;
import com.javarush.island.bogdanov.Parametrs;
import com.javarush.island.bogdanov.herbivore.Herbivore;

public class Boa extends Predator{
    public Boa() {
        super();
    }

    @Override
    public void eat(Organizm food) {
        super.eat(food);
    }

    @Override
    public String toString() {
        return "Boa{" + "name='" + name + '\'' + ", icon='" + icon + '\'' + '}';
    }
}
