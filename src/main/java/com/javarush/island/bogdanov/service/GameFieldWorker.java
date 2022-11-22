package com.javarush.island.bogdanov.service;

import com.javarush.island.bogdanov.Cell;
import com.javarush.island.bogdanov.GameField;
import com.javarush.island.bogdanov.Parametrs;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class GameFieldWorker extends Thread{
    GameField gameField;


    public GameFieldWorker(GameField gameField) {
        this.gameField=gameField;
    }

    @Override
    public void run() {

        Cell[][] gameField1 = gameField.getGameField();
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        for (int i = 0; i < Parametrs.HEIGHT; i++) {
            for (int j = 0; j < Parametrs.WIDTH; j++) {
                Cell cell = new Cell(gameField,i, j);
                executorService.execute(new CellWorker(cell));
                gameField1[i][j]=cell;
            }
        }
        try {
            executorService.awaitTermination(10, TimeUnit.SECONDS);
            executorService.shutdown();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        ExecutorService executorService2 = Executors.newFixedThreadPool(8);
        for (int i = 0; i < Parametrs.HEIGHT; i++) {
            for (int j = 0; j < Parametrs.WIDTH; j++) {
                Cell cell = gameField.getGameField()[i][j];
                executorService2.execute(new StartWorkCell(cell));
            }
        }
        try {
            executorService.awaitTermination(300,TimeUnit.SECONDS);
            System.out.println("End"+Thread.currentThread().getName());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }



    }
    public void print() throws InterruptedException {
        for (int i = 0; i < Parametrs.HEIGHT; i++) {
            for (int j = 0; j < Parametrs.WIDTH; j++) {
                System.out.println(gameField.getGameField()[i][j].getContentCell());
            }
        }
    }
}
