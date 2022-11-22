package com.javarush.island.bogdanov;

public class Plant extends Organizm{
    private String name = this.getClass().getSimpleName();
    public Plant() {

    }

    public void multiply(){

    }

    @Override
    public String getName() {
        return name;
    }
}
