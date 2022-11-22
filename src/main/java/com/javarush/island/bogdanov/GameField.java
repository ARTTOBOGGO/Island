package com.javarush.island.bogdanov;

import com.javarush.island.bogdanov.Cell;
import com.javarush.island.bogdanov.Parametrs;
import com.javarush.island.bogdanov.predator.Wolf;

import java.util.Arrays;
import java.util.concurrent.*;

public class GameField
{


    public GameField() {
//        this.initialize();
//        try {
//            Thread.sleep(4000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        this.move();
    }

    public Cell[][] gameField = new Cell[Parametrs.HEIGHT][Parametrs.WIDTH];
//    ExecutorService executorService = Executors.newFixedThreadPool(1);

//    public void initialize(){
//        for (int i = 0; i < Parametrs.HEIGHT; i++) {
//            for (int j = 0; j < Parametrs.WIDTH; j++) {
////                Future<Cell> submit = executorService.submit(new Cell(i, j));
////                try {
//                Cell cell = new Cell(i, j);
//                cell.initialize();
//                gameField[i][j]=cell;
////                } catch (InterruptedException e) {
////                    throw new RuntimeException(e);
////                } catch (ExecutionException e) {
////                    throw new RuntimeException(e);
////                }
//
//            }
//        }
//
//
//    }
//    public void print(){
//        int all=0;
//        for (Cell[] cells : gameField) {
//
//            for (Cell cell : cells) {
//                int count=0;
//                for (Organizm organizm : cell.getContentCell()) {
//                    count++;
//                }
//
//                System.out.println(count+"="+cell.getRow()+"++"+cell.getColl());
//
//            }
//
//        }
//
//    }
//    public void move(){
//        for (int i = 0; i < gameField.length; i++) {
//            for (int j = 0; j < gameField[i].length; j++) {
//                executorService.execute(gameField[i][j]);
//            }
//        }
//
//    }

    public Cell[][] getGameField() {
        return gameField;
    }

    public void printState(){

    }
}
