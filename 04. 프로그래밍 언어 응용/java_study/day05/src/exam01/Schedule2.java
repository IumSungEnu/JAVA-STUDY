package exam01;

public class Schedule2 {
    private int year;
    private int month;
    private int day;

    public Schedule2(){  //생성자 this()
        this(2023,2,28);
    }

    public Schedule2(int year, int month, int day){  // this.
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;   //this -> 지역변수로 모든 메서드에 추가
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }
    public void printThis(){
        System.out.println("this = " + this);
    }
    public Schedule2 returnThis(){
        return this;
    }

    @Override
    public String toString() {
        return "Schedule2{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }
}
