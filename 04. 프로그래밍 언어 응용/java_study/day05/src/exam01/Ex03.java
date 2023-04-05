package exam01;

public class Ex03 {
    public static void main(String[] args){
        Schedule s1 = new Schedule();

        s1.setYear(2023);
        s1.setMonth(2);
        s1.setDay(32);

        //s1.year = 2023;
        //s1.month = 2;
        //s1.day = 32;
        s1.showDate();

        int month = s1.getMonth();
        System.out.println(month);

    }
}
