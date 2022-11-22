package com.javarush.island.bogdanov;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public abstract class Animal extends Organizm{

    public String name = this.getClass().getSimpleName();
    public double speed;
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
//    public void move(){
//        System.out.println("move"+this.name);
//        rowStep = ThreadLocalRandom.current().nextInt(0, (int) speed);
//        collStep = ThreadLocalRandom.current().nextInt(0, (int) speed);
//        if((rowStep>=Parametrs.HEIGHT && collStep>=Parametrs.WIDTH)||(rowStep<0&&collStep<0)){
//            rowStep=0;
//            collStep=0;
//        }
//
//    }

    @Override
    public void eat(Organizm food) {
        String nameClass = food.getName();
//        System.out.println("eat"+this.name);
        String name1 = this.name;
        Double weightFood=Parametrs.fields.get(nameClass).get(0);
        Double aDouble = Parametrs.getFields().get(name1).get(3);
        if(weightFood< aDouble){
            weight=+weightFood;
            if(weight> aDouble){

            }
        }else {
            weight=Parametrs.getFields().get(nameClass).get(0);
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

    public String getName() {
        return name;
    }
}
