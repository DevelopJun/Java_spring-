package design.adapter;

public class SocketAdapter implements  Electronic110v{
    // 일단 자식의 형태는 110v
    private Electronic220v electronic220v;
    // 연결시켜줄 220v
    public SocketAdapter(Electronic220v electronic220v){
        this.electronic220v = electronic220v;
    }

    @Override
    public void powerOn() {
        electronic220v.connect();
    }
}
