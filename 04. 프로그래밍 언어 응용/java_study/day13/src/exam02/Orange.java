package exam02;

public class Orange extends Fruit{

    private int price;
    public Orange(){}
    public Orange(int price){
        this.price = price;
    }
    public int getPrice(){
        return price;
    }
    @Override
    public String getItemNm() {
        return "Orange";
    }
}
