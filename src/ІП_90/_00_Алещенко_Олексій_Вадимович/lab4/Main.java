package ІП_90._00_Алещенко_Олексій_Вадимович.lab4;
import myPackage.SeaBoatHeir;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        SeaBoat[] seaBoats = new SeaBoat[3];
//        SeaBoat seaBoats[] = new SeaBoat[3];
//        var seaBoats = new SeaBoat[3];
//        var seaBoats = {new SeaBoat()};
        SeaBoat[] seaBoats = {
                new SeaBoat(1, 1, "A"),
                new SeaBoat(1, 2, "A"),
                new SeaBoat(2, 2, "B")
        };

        Arrays.sort(seaBoats);

//        SeaBoatHeir seaBoatHeir = new SeaBoatHeir();
        /*SeaBoat seaBoat = new SeaBoatHeir();
        seaBoat.myMethod();
        seaBoat = new SeaBoat(1, 1, "A");
        seaBoat.myMethod();*/
//        seaBoatHeir.myMethod();
//        seaBoatHeir.cruisingSpeed = 3;
        System.out.println("Done!");
    }
}
