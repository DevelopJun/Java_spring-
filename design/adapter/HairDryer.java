package design.adapter;

public class HairDryer implements Electronic110v {
    @Override // 메소드 제정의 기능으로, 상속된 메소드 내용이 자식 클래스에 맞지 않을 경우, 자식 클래스에서 동일한 메소드를 재정의한다.
    public void powerOn() {
        System.out.println("헤어 드라이기 110v on");
    }
}
