package com.javarush.island.bogdanov.herbivore;

import com.javarush.island.bogdanov.Organizm;
import com.javarush.island.bogdanov.Parametrs;
import com.javarush.island.bogdanov.Plant;

public class Duck extends Herbivore{
    @Override
    public void eat(Organizm food) {
        super.eat(food);
    }



    @Override
    public String toString() {
        return "Duck{" + "name='" + name + '\'' + ", icon='" + icon + '\'' + '}';
    }
}
