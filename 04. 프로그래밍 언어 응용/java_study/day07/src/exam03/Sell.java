package exam03;

public interface Sell {  //판매
    void sell();
    default void order(){
        System.out.println("Sell - 주문");
    }
}
