package exam03;

public class Ex01 {
    public static void main(String[] args){
        Order order = new Order();
        order.buy();  //구현체가 있는 Order에서 호출을 한다.
        order.sell();
    }
}
