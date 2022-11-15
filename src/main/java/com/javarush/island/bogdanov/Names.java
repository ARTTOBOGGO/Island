package com.javarush.island.bogdanov;

public enum Names {
    WOLF("Wolf"),
    BEAR("Bear"),
    BOAR("Boar"),
    CATERPILLAR("Caterpillar"),
    DEER("Deer"),
    DUCK("Duck"),
    GOAT("Goat"),
    HORSE("Horse"),
    MOUSE("Mouse"),
    RABBIT("Rabbit"),
    SHEEP("Sheep"),
    BOA("Boa"),
    EAGLE("Eagle"),
    FOX("Fox"),
    BUFFALO("Buffalo"),
    PLANT("Plant");


    public String getName() {
        return name;
    }

    private String name;

    Names(String name) {
        this.name = name;
    }





}
