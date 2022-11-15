package com.javarush.island.bogdanov;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Parametrs {
    public static final int WIDTH=100;
    public static final int HEIGHT=20;

    public static Map<String, ArrayList<Double>> fields = new HashMap<>();
    public static Map<String, String> names = new HashMap<>();
    public static Map<String, String> icons = new HashMap<String, String>();

    public static Map<String, ArrayList<Double>> getFields() {
        return fields;
    }
    public static int[][] eatChange = new int[Names.values().length][Names.values().length];

    static {
        eatChange[Names.WOLF.ordinal()][Names.HORSE.ordinal()]=10;
        eatChange[Names.WOLF.ordinal()][Names.DEER.ordinal()]=15;
        eatChange[Names.WOLF.ordinal()][Names.RABBIT.ordinal()]=60;
        eatChange[Names.WOLF.ordinal()][Names.MOUSE.ordinal()]=80;
        eatChange[Names.WOLF.ordinal()][Names.GOAT.ordinal()]=60;
        eatChange[Names.WOLF.ordinal()][Names.SHEEP.ordinal()]=70;
        eatChange[Names.WOLF.ordinal()][Names.BOAR.ordinal()]=15;
        eatChange[Names.WOLF.ordinal()][Names.BUFFALO.ordinal()]=10;
        eatChange[Names.WOLF.ordinal()][Names.DUCK.ordinal()]=40;

        eatChange[Names.BOA.ordinal()][Names.FOX.ordinal()]=15;
        eatChange[Names.BOA.ordinal()][Names.RABBIT.ordinal()]=60;
        eatChange[Names.BOA.ordinal()][Names.MOUSE.ordinal()]=40;
        eatChange[Names.BOA.ordinal()][Names.DUCK.ordinal()]=10;

        eatChange[Names.FOX.ordinal()][Names.RABBIT.ordinal()]=70;
        eatChange[Names.FOX.ordinal()][Names.MOUSE.ordinal()]=90;
        eatChange[Names.FOX.ordinal()][Names.DUCK.ordinal()]=60;
        eatChange[Names.FOX.ordinal()][Names.CATERPILLAR.ordinal()]=40;

        eatChange[Names.BEAR.ordinal()][Names.BOA.ordinal()]=80;
        eatChange[Names.BEAR.ordinal()][Names.HORSE.ordinal()]=40;
        eatChange[Names.BEAR.ordinal()][Names.DEER.ordinal()]=80;
        eatChange[Names.BEAR.ordinal()][Names.RABBIT.ordinal()]=80;
        eatChange[Names.BEAR.ordinal()][Names.MOUSE.ordinal()]=90;
        eatChange[Names.BEAR.ordinal()][Names.GOAT.ordinal()]=70;
        eatChange[Names.BEAR.ordinal()][Names.SHEEP.ordinal()]=70;
        eatChange[Names.BEAR.ordinal()][Names.BUFFALO.ordinal()]=20;
        eatChange[Names.BEAR.ordinal()][Names.BOAR.ordinal()]=50;
        eatChange[Names.BEAR.ordinal()][Names.DUCK.ordinal()]=10;

        eatChange[Names.EAGLE.ordinal()][Names.FOX.ordinal()]=10;
        eatChange[Names.EAGLE.ordinal()][Names.RABBIT.ordinal()]=90;
        eatChange[Names.EAGLE.ordinal()][Names.MOUSE.ordinal()]=90;
        eatChange[Names.EAGLE.ordinal()][Names.DUCK.ordinal()]=80;

        eatChange[Names.HORSE.ordinal()][Names.PLANT.ordinal()]=100;
        eatChange[Names.DEER.ordinal()][Names.PLANT.ordinal()]=100;
        eatChange[Names.RABBIT.ordinal()][Names.PLANT.ordinal()]=100;
        eatChange[Names.MOUSE.ordinal()][Names.PLANT.ordinal()]=100;
        eatChange[Names.MOUSE.ordinal()][Names.CATERPILLAR.ordinal()]=90;
        eatChange[Names.GOAT.ordinal()][Names.PLANT.ordinal()]=100;
        eatChange[Names.SHEEP.ordinal()][Names.PLANT.ordinal()]=100;
        eatChange[Names.BOAR.ordinal()][Names.PLANT.ordinal()]=100;
        eatChange[Names.BOAR.ordinal()][Names.MOUSE.ordinal()]=50;
        eatChange[Names.BOAR.ordinal()][Names.CATERPILLAR.ordinal()]=90;
        eatChange[Names.BUFFALO.ordinal()][Names.PLANT.ordinal()]=100;
        eatChange[Names.DUCK.ordinal()][Names.PLANT.ordinal()]=100;
        eatChange[Names.DUCK.ordinal()][Names.CATERPILLAR.ordinal()]=90;
        eatChange[Names.CATERPILLAR.ordinal()][Names.PLANT.ordinal()]=100;
    }


    static {
        names.put(Names.WOLF.getName(),Names.WOLF.getName());
        names.put(Names.BEAR.getName(), Names.BEAR.getName());
        names.put(Names.FOX.getName(), Names.FOX.getName());
        names.put(Names.BOA.getName(), Names.BOA.getName());
        names.put(Names.EAGLE.getName(), Names.EAGLE.getName());
        names.put(Names.HORSE.getName(), Names.HORSE.getName());
        names.put(Names.DEER.getName(), Names.DEER.getName());
        names.put(Names.RABBIT.getName(), Names.RABBIT.getName());
        names.put(Names.MOUSE.getName(), Names.MOUSE.getName());
        names.put(Names.GOAT.getName(), Names.GOAT.getName());
        names.put(Names.SHEEP.getName(), Names.SHEEP.getName());
        names.put(Names.BOAR.getName(), Names.BOAR.getName());
        names.put(Names.BUFFALO.getName(), Names.BUFFALO.getName());
        names.put(Names.DUCK.getName(), Names.DUCK.getName());
        names.put(Names.CATERPILLAR.getName(), Names.CATERPILLAR.getName());
        names.put(Names.PLANT.getName(), Names.PLANT.getName());
    }

    static {
        fields.put(Names.WOLF.getName(), new ArrayList<>(Arrays.asList(50.0,30.0,3.0,8.0)));
        fields.put(Names.BEAR.getName(), new ArrayList<>(Arrays.asList(500d,5d,2d,80d)));
        fields.put(Names.FOX.getName(), new ArrayList<>(Arrays.asList(8d,30d,2d,2d)));
        fields.put(Names.BOA.getName(), new ArrayList<>(Arrays.asList(15d,30d,1d,3d)));
        fields.put(Names.EAGLE.getName(), new ArrayList<>(Arrays.asList(6d,20d,3d,1d)));
        fields.put(Names.HORSE.getName(), new ArrayList<>(Arrays.asList(400d,20d,4d,60d)));
        fields.put(Names.DEER.getName(), new ArrayList<>(Arrays.asList(300d,20d,4d,50d)));
        fields.put(Names.RABBIT.getName(), new ArrayList<>(Arrays.asList(2d,150d,2d,0.45)));
        fields.put(Names.MOUSE.getName(), new ArrayList<>(Arrays.asList(0.05,500d,1d,0.01)));
        fields.put(Names.GOAT.getName(), new ArrayList<>(Arrays.asList(60d,140d,3d,10d)));
        fields.put(Names.SHEEP.getName(), new ArrayList<>(Arrays.asList(70d,140d,3d,15d)));
        fields.put(Names.BOAR.getName(), new ArrayList<>(Arrays.asList(400d,50d,2d,50d)));
        fields.put(Names.BUFFALO.getName(), new ArrayList<>(Arrays.asList(700d,10d,3d,100d)));
        fields.put(Names.DUCK.getName(), new ArrayList<>(Arrays.asList(1d,200d,4d,0.15)));
        fields.put(Names.CATERPILLAR.getName(), new ArrayList<>(Arrays.asList(0.01,1000d,0d,0d)));
        fields.put(Names.PLANT.getName(), new ArrayList<>(Arrays.asList(1d,200d,null,null)));
    }

    static {
        icons.put(Names.WOLF.getName(),"\uD83D\uDC3A");
        icons.put(Names.BEAR.getName(),"\uD83D\uDC3B");
        icons.put(Names.FOX.getName()," \uD83E\uDD8A");
        icons.put(Names.BOA.getName()," \uD83D\uDC0D");
        icons.put(Names.EAGLE.getName(),"\uD83E\uDD85");
        icons.put(Names.HORSE.getName(),"\uD83D\uDC0E");
        icons.put(Names.DEER.getName(),"\uD83E\uDD8C");
        icons.put(Names.GOAT.getName(),"\uD83D\uDC10");
        icons.put(Names.MOUSE.getName(),"\uD83D\uDC01");
        icons.put(Names.SHEEP.getName(),"\uD83D\uDC11");
        icons.put(Names.RABBIT.getName(),"\uD83D\uDC07");
        icons.put(Names.BOAR.getName(),"\uD83D\uDC17");
        icons.put(Names.BUFFALO.getName(),"\uD83D\uDC03");
        icons.put(Names.DUCK.getName(),"\uD83E\uDD86");
        icons.put(Names.CATERPILLAR.getName(),"\uD83D\uDC1B");
        icons.put(Names.PLANT.getName(),"\uD83C\uDF3F");
    }
}
