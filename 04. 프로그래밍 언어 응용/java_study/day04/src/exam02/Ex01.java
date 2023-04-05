package exam02;

public class Ex01 {
    public static void main(String[] args){
        Schedule s1 = new Schedule();

        s1.setYear(2023);
        s1.setMonth(2);
        s1.setDay(32);

        /*
        s1.year = 2023;
        s1.month = 2;
        s1.day = 32;  // 변수에 값을 대입하면 잘못된 값을 입력해도 그 값이 저장이 된다.
        */            // 잘못된 값을 통제할수 없다.

        s1.showDate();
    }
}
