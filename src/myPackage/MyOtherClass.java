package myPackage;

import java.util.Random;

public class MyOtherClass implements MyInterface {
    @Override
    public int getInt() {
        return new Random().nextInt();
    }
}
