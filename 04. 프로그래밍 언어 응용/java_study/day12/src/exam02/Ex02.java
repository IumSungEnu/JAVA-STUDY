package exam02;

public class Ex02 {
    public static void main(String[] args){
        //여기서 trans의 자료형 -> Tansportation
        //클래스명이 기본자료형이다.(참조자료형)
        Tansportation trans = Tansportation.BUS;

        switch(trans){
            case SUBWAY:
                System.out.println("지하철");
                break;
            case BUS :
                System.out.println("버스");
                break;
            case TAXI:
                System.out.println("택시");
                break;
            case TRAIN:
                System.out.println("기차");
                break;
        }
    }
}
