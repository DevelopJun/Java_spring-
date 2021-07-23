package design.adapter;

public class AirConditioner implements Electronic220v{
    @Override
    // 자 여기서 잘
    public void connect() {
        System.out.println("에어컨 220v on");

    }
}
