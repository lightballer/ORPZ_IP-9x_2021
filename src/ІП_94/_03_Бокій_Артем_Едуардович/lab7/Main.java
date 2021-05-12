package ІП_94._03_Бокій_Артем_Едуардович.lab7;

public class Main {
    public static void main(String[] args) {
        State state = new State();
        SocketState closed = new Closed();
        state.setSocketState(closed);

        for (int i = 0; i < 7; i++) {
            state.changeState();
            state.getSocketStateInfo();
        }
    }
}
