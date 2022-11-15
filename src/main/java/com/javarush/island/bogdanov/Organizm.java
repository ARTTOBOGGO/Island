package com.javarush.island.bogdanov;

public abstract class Organizm {

    public static int count=0;
    private Cell cell;
    public int rowStep;
    public int collStep;
    public int collNow;
    public int rowNow;

    public Cell getCell() {
        return cell;
    }

    public void setCell(Cell cell) {
        this.cell = cell;
    }

    public Organizm() {

    }
    public void move(){

    }
}
