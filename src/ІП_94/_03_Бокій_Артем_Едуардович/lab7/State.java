package ІП_94._03_Бокій_Артем_Едуардович.lab7;

public class State {
    private SocketState socketState;

    void setSocketState(SocketState socketState) {
        this.socketState = socketState;
    }

    void changeState() {
        if (socketState instanceof Closed) {
            setSocketState(new Listening());
        } else if (socketState instanceof Listening) {
            setSocketState(new Established());
        } else if (socketState instanceof  Established) {
            setSocketState(new Closed());
        }
    }

    void getSocketStateInfo() {
        socketState.getInfo();
    }
}
