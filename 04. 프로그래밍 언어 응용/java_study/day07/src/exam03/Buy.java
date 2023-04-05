package exam03;

public interface Buy {  //구매
    void buy();
    default void order(){
        System.out.println("Buy - 주문");
    }
}
