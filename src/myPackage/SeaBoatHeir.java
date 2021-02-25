package myPackage;

import ІП_90._00_Алещенко_Олексій_Вадимович.lab4.SeaBoat;

public class SeaBoatHeir extends SeaBoat implements MyInterface {
    SeaBoat seaBoat = new SeaBoat(1, 1, "A");

    public SeaBoatHeir(int cruisingSpeed, int waterDisplacement, String name) {
        super(cruisingSpeed, waterDisplacement, name);
    }



    @Override
    public void myMethod() {
        System.out.println("IN SeaBoatHeir");
        /*super.cruisingSpeed = 1;
        this.cruisingSpeed = 2;
        myMethod2();
        myMethod();*/
        /*new SeaBoat(1,1,"A").myMethod();
        new SeaBoat(1,1,"A").myMethod2();
        new SeaBoat(1,1,"A").cruisingSpeed = 1;*/
//        seaBoatHeir.cruisingSpeed = 3;
    }
//    @Override
    public void myMethod3() {
        System.out.println("IN SeaBoatHeir");
        /*super.cruisingSpeed = 1;
        this.cruisingSpeed = 2;
        myMethod2();
        myMethod();*/
        /*new SeaBoat(1,1,"A").myMethod();
        new SeaBoat(1,1,"A").myMethod2();
        new SeaBoat(1,1,"A").cruisingSpeed = 1;*/
//        seaBoatHeir.cruisingSpeed = 3;
    }

//    @Override
    public int getInt() {
        return 1;
    }
}
