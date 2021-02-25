package ІП_90._00_Алещенко_Олексій_Вадимович.lab4;

import java.util.Objects;

public class SeaBoat implements Comparable<SeaBoat>, Cloneable {
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

    @Override
    public String toString() {
        return "SeaBoat{" +
                "cruisingSpeed=" + cruisingSpeed +
                ", waterDisplacement=" + waterDisplacement +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SeaBoat seaBoat = (SeaBoat) o;
        return cruisingSpeed == seaBoat.cruisingSpeed &&
                waterDisplacement == seaBoat.waterDisplacement &&
                Objects.equals(name, seaBoat.name);
    }

    /*@Override
    public int hashCode() {
        return Objects.hash(cruisingSpeed, waterDisplacement, name);
    }*/

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
