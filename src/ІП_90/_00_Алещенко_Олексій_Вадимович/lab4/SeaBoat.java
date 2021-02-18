package ІП_90._00_Алещенко_Олексій_Вадимович.lab4;

public class SeaBoat {
    private /*protected*/ int cruisingSpeed; //крейсернаШвидкість;
    private int waterDisplacement;
    private String name;
//    todo add two fields

    public SeaBoat(int cruisingSpeed, int waterDisplacement, String name) {
        this.cruisingSpeed = cruisingSpeed;
        this.waterDisplacement = waterDisplacement;
        this.name = name;
    }

    /*public SeaBoat() {
    }*/

    public void myMethod() {
        System.out.println("IN SeaBoat");
    }
}
