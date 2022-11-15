package com.javarush.island.bogdanov;

import com.javarush.island.bogdanov.Cell;
import com.javarush.island.bogdanov.Parametrs;

import java.util.Arrays;
import java.util.concurrent.*;

public class GameField
{


    public GameField() {
        this.initialize();
    }

    Cell[][] gameField = new Cell[Parametrs.WIDTH][Parametrs.HEIGHT];
    ExecutorService executorService = Executors.newFixedThreadPool(8);

    public void initialize(){
        for (int i = 0; i < gameField.length; i++) {
            for (int j = 0; j < gameField[0].length; j++) {
                Future<Cell> submit = executorService.submit(new Cell(i, j));
                try {
                    gameField[i][j] =submit.get();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                } catch (ExecutionException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        executorService.shutdown();

    }
    public void print(){
        for (Cell[] cells : gameField) {
            for (Cell cell : cells) {
                System.out.println(cell.getContentCell());
//                System.out.println("---------------------------------------------------------------------------------");
//                try {
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
            }
        }
    }
    public void makeStep(){

    }
    public void printState(){

    }
}