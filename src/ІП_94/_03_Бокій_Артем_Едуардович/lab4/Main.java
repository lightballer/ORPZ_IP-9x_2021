package ІП_94._03_Бокій_Артем_Едуардович.lab4;

public class Main {
    public static void main(String[] args) {
        Subsystem subsystem = new Subsystem("dir1", "dir2",
                "1.txt", "2.txt", "3.txt");
        subsystem.create();
        subsystem.destroy();
    }
}
