package design.singleton;

public class Aclazz {
    private SocketClient socketClient;

    public Aclazz(){
        this.socketClient = SocketClient.getInstance();
        //여기서 위의 방식이 아니라,
        // this.socketClient = new SocketClient(); 라고 생성자 새롭게 Aclazz와 Bclazz에서 만들면 False가 출력된다.
    }

    public SocketClient getSocketClient(){
        return this.socketClient;
    }
}
