package com.javarush.island.bogdanov;

import com.javarush.island.bogdanov.predator.Bear;
import com.javarush.island.bogdanov.predator.Wolf;
import com.javarush.island.bogdanov.service.GameFieldWorker;

import java.util.concurrent.TimeUnit;

public class Runner {
    public static void main(String[] args) throws InterruptedException {
        GameField gameField = new GameField();
        GameFieldWorker gameFieldWorker = new GameFieldWorker(gameField);
        gameFieldWorker.start();
        Thread.sleep(1250);
        gameFieldWorker.print();
        System.out.println("------------------");
        gameFieldWorker.join();
        System.out.println("End");




    }
}