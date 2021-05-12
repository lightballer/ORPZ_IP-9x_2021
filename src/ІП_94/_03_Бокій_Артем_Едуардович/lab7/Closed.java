package ІП_94._03_Бокій_Артем_Едуардович.lab7;

public class Closed implements SocketState {
    @Override
    public void getInfo() {
        System.out.println("Connection closed.");
    }
}
