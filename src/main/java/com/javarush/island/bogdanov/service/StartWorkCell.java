package com.javarush.island.bogdanov.service;

import com.javarush.island.bogdanov.Cell;
import com.javarush.island.bogdanov.Organizm;

import java.util.Iterator;

public class StartWorkCell extends Thread{
    Cell cell;
    public StartWorkCell(Cell cell) {
        this.cell=cell;
    }

    @Override
    public void run(){
        // ExecutorService executorService = Executors.newFixedThreadPool(4);
//        Iterator<Organizm> iterator = cell.getContentCell().iterator();
//        while (iterator.hasNext()){
//            System.out.println("Start");
//            new OrganizmlWorker(iterator.next()).run();
//        }
        System.out.println(cell.getRow()+"+"+cell.getColl()+"="+Thread.currentThread().getName());
        for (Organizm organizm : cell.getContentCell()) {
            new OrganizmlWorker(organizm).run();
        }

    }
}
