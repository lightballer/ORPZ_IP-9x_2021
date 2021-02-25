package ІП_90._00_Алещенко_Олексій_Вадимович.lab4;

public class SeaBoat implements Comparable<SeaBoat> {
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

    protected void myMethod() {
        System.out.println("IN SeaBoat");
    }
    protected void myMethod2() {
        System.out.println("IN SeaBoat");
    }

    @Override
    public int compareTo(SeaBoat o) {
//        return cruisingSpeed - o.cruisingSpeed;
        int speedCompare = Integer.compare(cruisingSpeed, o.cruisingSpeed);
        return speedCompare != 0 ? speedCompare : name.compareTo(o.name);
    }
}
