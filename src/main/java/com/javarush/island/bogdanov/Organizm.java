package com.javarush.island.bogdanov;

public abstract class Organizm {


    private Cell cell;
    public int rowStep;
    public int collStep;
    public int collNow;
    public int rowNow;
    public double speed;
    private GameField gameField;

    private double weight;
    private String name;


    public GameField getGameField() {
        return gameField;
    }

    public void setGameField(GameField gameField) {
        this.gameField = gameField;
    }

    public Cell getCell() {
        return cell;
    }

    public void setCell(Cell cell) {
        this.cell = cell;
    }

    public Organizm() {
//        this.rowNow=cell.getRow();
//        this.collNow=cell.getColl();

    }
    public void eat(){

    }
    public void move(){

    }

    public void eat(Organizm food) {

    }

    public String getName() {
        return name;
    }
}
