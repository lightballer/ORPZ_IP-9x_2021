package ІП_90._00_Алещенко_Олексій_Вадимович.lab4;
import myPackage.MyInterface;
import myPackage.MyList;
import myPackage.MyOtherClass;
import myPackage.SeaBoatHeir;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args, List list1) {
        /*ArrayList arrayList = new ArrayList<String>();
        ArrayList<String> arrayListString = arrayList;
        List list = arrayList;
        list = arrayListString;
        arrayList.add(1);
//        arrayListString.add(1);
        arrayList = new ArrayList<Integer>();
        arrayList.add("A");

        MyList seaBoats = new MyList();

//=========

        seaBoats.add(new SeaBoat(1,1,"A"));
        arrayListString.add("A");


        List<List<?>> lists = new ArrayList<>();
        lists.add(seaBoats);
        lists.add(arrayListString);


//        ----
        String searchString = "A";
        lists.forEach(objects -> objects.contains(searchString));
//        lists.forEach(objects -> objects.add(searchString));
//        ----

//        =========

        SeaBoat seaBoat = new SeaBoatHeir(1,1,"A");
        SeaBoatHeir seaBoatHeir = (SeaBoatHeir) seaBoat;
        seaBoatHeir.myMethod3();*/
//        seaBoat.myMethod3();

        /*int a = Integer.MAX_VALUE;
        System.out.println(a);
        a++;
        System.out.println(a);*/
//        SeaBoat[] seaBoats = new SeaBoat[3];
//        SeaBoat seaBoats[] = new SeaBoat[3];
//        var seaBoats = new SeaBoat[3];
//        var seaBoats = {new SeaBoat()};
        SeaBoat[] seaBoats = {
                new SeaBoat(2, 2, "B"),
                new SeaBoat(1, 1, "C"),
                new SeaBoat(1, 2, "A"),
        };

//        System.out.println(seaBoats[0] < seaBoats[1]);
        System.out.println(seaBoats[0].compareTo(seaBoats[1]));
//        System.out.println(seaBoats[0].compareTo("A"));

        Arrays.sort(seaBoats);

        /*MyInterface myInterface = new SeaBoatHeir(1, 1, "A");
        System.out.println("int = " + myInterface.getInt());
        myInterface = new MyOtherClass();
        System.out.println("int = " + myInterface.getInt());


        SeaBoatHeir seaBoatHeir = new SeaBoatHeir(1, 1, "A");*/
//        seaBoatHeir.clone();
        /*SeaBoat seaBoat = new SeaBoatHeir();
        seaBoat.myMethod();
        seaBoat = new SeaBoat(1, 1, "A");
        seaBoat.myMethod();*/
//        seaBoatHeir.myMethod();
//        seaBoatHeir.cruisingSpeed = 3;
        System.out.println("Done!");
    }
}
