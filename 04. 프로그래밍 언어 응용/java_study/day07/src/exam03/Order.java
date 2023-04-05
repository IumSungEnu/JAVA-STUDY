package exam03;

public class Order implements Buy, Sell{  //주문
    //인터페이스가 다중상속이 가능한 이유
    //구현체는 하위클래스로 구성된다. -> 지금 order에서 구현한 것은 order 것이다.
    @Override
    public void buy() {
        System.out.println("구매");
    }


    @Override
    public void sell() {
        System.out.println("판매");
    }

    @Override
    public void order() {
        //Buy.super.order();
        System.out.println("주문");
    }
}
