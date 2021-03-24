package ІП_94._03_Бокій_Артем_Едуардович.lab3;

public class Main {
    public static void main(String[] args) {
        Toolbar toolbar = new Toolbar();
        Tool upScaler = new UpScaler();
        Tool downScaler = new DownScaler();
        Tool manipulator = new Manipulator();
        toolbar.addComponent(upScaler);
        toolbar.addComponent(downScaler);
        toolbar.addComponent(manipulator);
        toolbar.acting();
    }
}
