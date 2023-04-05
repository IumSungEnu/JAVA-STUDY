package exam02;

import static exam02.Tansportation.*;

public class Ex03 {
    public static void main(String[] args){
        //Tansportation trans = new Tansportation(10000); -> 용도가 한정적이다.
        int busFare = BUS.getBasicFare();
        System.out.println(busFare);
    }

}
