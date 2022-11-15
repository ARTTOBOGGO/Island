package com.javarush.island.bogdanov;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public abstract class Animal extends Organizm{

    public String name = Parametrs.names.get(this.getClass().getSimpleName());
    private double speed;
    private Double weight;
    private Double maxWeightFood;
    private Double maxCount;
    public String icon;
    private Cell cell;
    public int rowStep;
    public int collStep;
    public int collNow;
    public int rowNow;


    public Animal() {
        ArrayList<Double> fields = Parametrs.getFields().get(this.getClass().getSimpleName());
        this.speed=fields.get(2);
        this.weight=fields.get(0);
        this.maxWeightFood=fields.get(3);
        this.maxCount=fields.get(1);
        this.icon = Parametrs.icons.get(this.getClass().getSimpleName());


    }

    @Override
    public String toString() {
        return "Animal{" + "speed=" + speed + ", weight=" + weight + ", maxWeightFood=" + maxWeightFood + ", maxCount=" + maxCount +'}';
    }

    public void multiply(){


    }
    public void move(){
        rowStep = ThreadLocalRandom.current().nextInt(0,(int)speed);
        collStep = ThreadLocalRandom.current().nextInt(0,(int)speed);
        collNow = getCell().getColl();//TODO 1
        rowNow = getCell().getRow();
        Cell[][] gameField = GameField.getGameField();
        if(this.rowNow+this.rowStep<100 && this.collNow+this.collStep<100) {
            gameField[this.rowNow + this.rowStep][this.collNow + this.collStep].getContentCell().add(this);
            gameField[this.rowNow][this.collNow].getContentCell().remove(this);
        }
    }

    @Override
    public Cell getCell() {
        return cell;
    }

    @Override
    public void setCell(Cell cell) {
        this.cell = cell;
    }
}
