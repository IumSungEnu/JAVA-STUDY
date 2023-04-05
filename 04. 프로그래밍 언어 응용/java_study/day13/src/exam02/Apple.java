package exam02;

public class Apple extends Fruit {
    private  int price;
    public Apple(){}
    public Apple(int price){
        this.price = price;
    }
    public int getPrice(){
        return price;
    }
    public String getItemNm(){
        return  "Apple";
    }

//    public String toString(){
//
//        return "Apple";
//    }
}
