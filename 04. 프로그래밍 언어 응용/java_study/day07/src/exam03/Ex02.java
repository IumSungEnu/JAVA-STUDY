package exam03;

public class Ex02 {
    public static void main(String[] args){
        Order order = new Order();
        order.order();

        //인터페이스에서 다형성이 자주 사용된다.
        //Buy buy = order;
        //buy.order();  //buy, order

        //Sell sell = order;
        //sell.order();  //sell, order
    }
}
