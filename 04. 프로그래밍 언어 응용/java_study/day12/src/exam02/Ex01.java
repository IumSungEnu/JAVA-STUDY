package exam02;

import static exam02.Tansportation.*;
public class Ex01 {
    public static void main(String[] args){
        Tansportation trans = BUS;
        if(trans == BUS){ //주소비교
            System.out.println("버스");
        }
        System.out.printf("BUS orinal = %d%n", BUS.ordinal());  //순서번호
        System.out.printf("BUS name = %s%n", BUS.name());  //이름

        Tansportation trans2 = Enum.valueOf(Tansportation.class, "BUS"); //클래스를 정의하여 사용
        if(trans2 == trans){
            System.out.println("같다");
        }

        Tansportation trans3 = Tansportation.valueOf("BUS"); //다른 클래스 정의없이 사용가능
        if(trans3 == trans){
            System.out.println("같다");
        }
    }//main
}
