package myPackage;

import ІП_90._00_Алещенко_Олексій_Вадимович.lab4.SeaBoat;

public class SeaBoatHeir extends SeaBoat {
    public SeaBoatHeir(int cruisingSpeed, int waterDisplacement, String name) {
        super(cruisingSpeed, waterDisplacement, name);
    }



    @Override
    public void myMethod() {
        System.out.println("IN SeaBoatHeir");
        /*super.cruisingSpeed = 1;
        this.cruisingSpeed = 2;*/
//        SeaBoatHeir seaBoatHeir = new SeaBoatHeir();
//        seaBoatHeir.myMethod();
//        seaBoatHeir.cruisingSpeed = 3;
    }
}
