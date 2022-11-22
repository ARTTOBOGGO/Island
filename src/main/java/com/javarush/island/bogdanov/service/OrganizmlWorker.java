package com.javarush.island.bogdanov.service;

import com.javarush.island.bogdanov.*;
import com.javarush.island.bogdanov.herbivore.*;
import com.javarush.island.bogdanov.predator.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class OrganizmlWorker{
    Organizm organizm;

    public OrganizmlWorker(Organizm organizm) {
        this.organizm = organizm;
    }

    public void run() {
        try {
            move();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        eat();

    }

    public void move() throws InterruptedException {
        int rowNow = organizm.rowNow;
        int collNow = organizm.collNow;

        double aDouble = Parametrs.getFields().get(organizm.getClass().getSimpleName()).get(2);
        System.out.println(Thread.currentThread().getName() + " try to move" + organizm.getName());
        int row = ThreadLocalRandom.current().nextInt(0, (int) aDouble);
        int coll = ThreadLocalRandom.current().nextInt(0, (int) aDouble);
//        System.out.println("Hi");
        if (row + rowNow < Parametrs.HEIGHT && coll + collNow < Parametrs.WIDTH) {
            Cell[][] gameField = organizm.getGameField().getGameField();
            gameField[rowNow + row][collNow + coll].getContentCell().add(organizm);
            gameField[rowNow][collNow].getContentCell().remove(organizm);
        }
    }

    public void eat() {
        boolean eatable = false;
        List<Organizm> contentCell = organizm.getCell().getContentCell();
        ArrayList<Names> herbivores = Parametrs.getHerbivores();
        if (organizm instanceof Predator) {
            Predator predator = (Predator) organizm;

            int randomFood = ThreadLocalRandom.current().nextInt(0, herbivores.size() - 1);
            Names food = herbivores.get(randomFood);
            String name = food.getName();
            System.out.println(Thread.currentThread().getName() + " try to eat" + predator.getName() + "=" + name);
            while (!eatable) {
                for (Organizm organizmFood : contentCell) {
                    String s = organizmFood.getName();
                    if (s.equals(name)) {
                        int names = Names.valueOf(predator.getClass().getSimpleName().toUpperCase()).ordinal();
                        int namesFoods = Names.valueOf(organizmFood.getClass().getSimpleName().toUpperCase()).ordinal();
                        int bound;
                        try {
                            bound = Parametrs.eatChange[names][namesFoods];
                        } catch (Exception e) {

                            throw new RuntimeException("OrganExeption");

                        }
                        int select = 0;
                        int r = 0;
                        if (bound > 0) {
                            select = ThreadLocalRandom.current().nextInt(0, bound);
                            r = ThreadLocalRandom.current().nextInt(0, 100);
                        }
                        eatable = true;
                        if (r < select) {
                            predator.eat(organizmFood);
                            contentCell.remove(organizmFood);

                        }
                        break;
                    }

                }
                break;
            }
        }else if (organizm instanceof Herbivore) {
                    Herbivore herbivore = (Herbivore) organizm;
                    for (Organizm plant : contentCell) {
                        if (plant instanceof Plant) {
                            System.out.println(Thread.currentThread().getName() + " try to eat" + herbivore.getName() + "=" + plant.getName());
                            int names = Names.valueOf(herbivore.getName().toUpperCase()).ordinal();
                            int namesFood = Names.valueOf(Names.PLANT.getName().toUpperCase()).ordinal();
                            int select = ThreadLocalRandom.current().nextInt(0, Parametrs.eatChange[names][namesFood]);
                            int r = ThreadLocalRandom.current().nextInt(0, 100);
                            if (r < select) {
                                herbivore.eat(plant);
                                organizm.getCell().getContentCell().remove(plant);
                            }
                            break;
                        }
                    }
                }
            }



}

