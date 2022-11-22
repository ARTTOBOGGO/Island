package com.javarush.island.bogdanov.service;

import com.javarush.island.bogdanov.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class CellWorker extends Thread{
    Cell cell;

    public CellWorker(Cell cell) {
        this.cell=cell;
    }

    @Override
    public void run() {
        initialize();

    }

    private void initialize() {
        for (Names value : Names.values()) {
            double doubles =Parametrs.getFields().get(value.getName()).get(1);
            for (int i = 0; i < doubles; i++) {
                Organizm organizm = Farm.copyOrganizm.get(value.getName());
                organizm.setCell(cell);
                organizm.setGameField(cell.getGameField());
                cell.getContentCell().add(organizm);
            }

        }
    }

//    public void eat(){
//        ExecutorService executorService = Executors.newFixedThreadPool(4);
//        int ran = ThreadLocalRandom.current().nextInt(0,cell.getContentCell().size());
//        Organizm organizm = cell.getContentCell().get(ran);
//        executorService.execute(new OrganizmlWorker(organizm));
//
//
//
//
//    }
}
