package com.javarush.island.bogdanov;

import com.javarush.island.bogdanov.herbivore.*;
import com.javarush.island.bogdanov.predator.*;
import com.javarush.island.bogdanov.Parametrs.*;
import com.javarush.island.bogdanov.Farm.*;

import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Cell{
    private int row;
    private int coll;
    private Names[] values = Names.values();
    private List<Organizm> contentCell;

    private GameField gameField;




    public Cell(GameField gameField, int row, int col) {
        this.row = row;
        this.coll = col;
        contentCell = new CopyOnWriteArrayList<>();
        this.gameField = gameField;
    }





    public List<Organizm> getContentCell() {
        return contentCell;
    }

//    public void initialize(){
//        System.out.println(Thread.currentThread().getName());
//        double aDouble;
//        for (Names value : values) {
//            aDouble = Parametrs.fields.get(value.getName()).get(1);
//            int  countAnimalOnOneCell= (int) aDouble;
//            for (double i = 0; i < countAnimalOnOneCell; i++) {
//                Organizm organizm = Farm.copyOrganizm.get(value.getName());
//                organizm.setCell(this);
//                contentCell.add(organizm);
//
//
//            }
//
//        }

//    }

//    @Override
//    public void run() {
//        for (int i = 0; i < this.contentCell.size(); i++) {
//            Organizm organizm = contentCell.get(i);
//            String simpleName = organizm.getClass().getSimpleName();
//            Animal ani= (Animal) organizm;
//            int rowStep = ThreadLocalRandom.current().nextInt(0, (int)ani.speed);
//            int collStep = ThreadLocalRandom.current().nextInt(0, (int) ani.speed);
//            if((rowStep>=Parametrs.HEIGHT && collStep>=Parametrs.WIDTH)||(rowStep<0&&collStep<0)){
//                rowStep=0;
//                collStep=0;
//            }
//            int i1 = row + rowStep;
//            int i2 = coll + collStep;
//           // Cell cell = GameField.gameField[i1][i2];
//           // cell.contentCell.add(organizm);
//
//
//        }
//
//    }

    public int getRow() {
        return row;
    }


    public int getColl() {
        return coll;
    }
    public GameField getGameField() {
        return gameField;
    }


}
