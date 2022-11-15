package com.javarush.island.bogdanov;

import com.javarush.island.bogdanov.herbivore.*;
import com.javarush.island.bogdanov.predator.*;
import com.javarush.island.bogdanov.Parametrs.*;
import com.javarush.island.bogdanov.Farm.*;

import java.util.*;
import java.util.concurrent.Callable;

public class Cell implements Runnable{
    private int row;
    private int coll;
    private Names[] values = Names.values();
    private List<Organizm> contentCell;

    public Cell(int row, int col) {
        this.row = row;
        this.coll = col;
        contentCell = new LinkedList<>();
        this.initialize();
    }





    public List<Organizm> getContentCell() {
        return contentCell;
    }

    private void initialize(){
        System.out.println(Thread.currentThread().getName());
        double aDouble;
        for (Names value : values) {
            aDouble = Parametrs.fields.get(value.getName()).get(1);
            int  countAnimalOnOneCell= (int) aDouble;
            List<Organizm> organizms = new ArrayList<>();
            for (double i = 0; i < countAnimalOnOneCell; i++) {
                Organizm organizm = Farm.copyOrganizm.get(value.getName());
                contentCell.add(organizm);
            }

        }

    }

    @Override
    public void run() {

        this.move();
    }
    private void move() {
        for (Organizm organizm : this.contentCell) {
            organizm.move();
        }
    }

    public int getRow() {
        return row;
    }


    public int getColl() {
        return coll;
    }



}
