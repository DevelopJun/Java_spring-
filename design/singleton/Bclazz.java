package design.singleton;

public class Bclazz {

    private SocketClient socketClient;

    public Bclazz(){
        this.socketClient = SocketClient.getInstance();
        // this.socketClient = new SocketClient(); 라고 생성자 새롭게 Aclazz와 Bclazz에서 만들면 False가 출력된다.
    }

    public SocketClient getSocketClient(){
        return this.socketClient;
    }
}
