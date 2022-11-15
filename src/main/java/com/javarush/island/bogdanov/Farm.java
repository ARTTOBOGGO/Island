package com.javarush.island.bogdanov;

import com.javarush.island.bogdanov.herbivore.*;
import com.javarush.island.bogdanov.predator.*;

import java.util.HashMap;
import java.util.Map;

public class Farm {
    public static Map<String,Organizm> copyOrganizm= new HashMap<>();;


    static {
        inicializeMap();
    }


    public static void inicializeMap(){
        copyOrganizm.put(Names.WOLF.getName(),new Wolf());
        copyOrganizm.put(Names.BEAR.getName(), new Bear());
        copyOrganizm.put(Names.FOX.getName(),new Fox());
        copyOrganizm.put(Names.BOA.getName(),new Boa());
        copyOrganizm.put(Names.EAGLE.getName(),new Eagle());
        copyOrganizm.put(Names.HORSE.getName(),new Horse());
        copyOrganizm.put(Names.DEER.getName(),new Deer());
        copyOrganizm.put(Names.RABBIT.getName(),new Rabbit());
        copyOrganizm.put(Names.MOUSE.getName(),new Mouse());
        copyOrganizm.put(Names.GOAT.getName(),new Goat());
        copyOrganizm.put( Names.SHEEP.getName(),new Sheep());
        copyOrganizm.put(Names.BOAR.getName(),new Boar());
        copyOrganizm.put( Names.BUFFALO.getName(),new Buffalo());
        copyOrganizm.put(Names.DUCK.getName(),new Duck());
        copyOrganizm.put(Names.CATERPILLAR.getName(),new Caterpillar());
        copyOrganizm.put(Names.PLANT.getName(), new Plant());

    }

    public static Map<String, Organizm> getCopyOrganizm() {
        return copyOrganizm;
    }
}
