package com.javarush.island.bogdanov;

import com.javarush.island.bogdanov.herbivore.*;
import com.javarush.island.bogdanov.predator.*;
import com.javarush.island.bogdanov.Parametrs.*;
import com.javarush.island.bogdanov.Farm.*;

import java.util.*;
import java.util.concurrent.Callable;

public class Cell implements Callable<Cell> {
    private int row;
    private int col;
    private Names[] values = Names.values();
    private Map<String, List<Organizm>> contentCell;

    public Cell(int row, int col) {
        this.row = row;
        this.col = col;
        contentCell = new HashMap<>();
    }





    public Map<String, List<Organizm>> getContentCell() {
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
                organizms.add(organizm);
            }
            contentCell.put(value.getName(),organizms);
        }


    }


    @Override
    public Cell call() {
//        System.out.println(Thread.currentThread().getName());
        this.initialize();


        return this;
    }
}
