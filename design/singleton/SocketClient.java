package design.singleton;

public class SocketClient {

    private static SocketClient socketClient = null;

    private SocketClient(){
    // 만약에 여기서 private public 하게 풀고 나서 저 다른 Aclazz랑 Bclazz로 넘어가서
    }

    public static SocketClient getInstance(){
        if(socketClient == null) {
            socketClient = new SocketClient();
        }
        return socketClient;
    }

    public void connect(){
        System.out.println("connect");
    }
}
