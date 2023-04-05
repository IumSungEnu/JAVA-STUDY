package exam01;

public class Schedule {
    private int year;
    private int month;
    private int day;

    public void setYear(int _year){
        year = _year;  //객체가 생성된 순간부터
        //멤버변수 = 지역변수
    }
    public int getYear(){
        return year;
    }

    public void setMonth(int _month){
        month = _month;
    }
    public int getMonth(){
        return month;
    }

    public void setDay(int _day){
        //_day 값 검증
        if(month == 2 && _day > 28){
            _day = 28;
        }
        day = _day;
    }
    public int getDay(){
        return day;
    }

    void showDate(){
        System.out.println("year= " + year + ", month= "+ month + ", day= " + day);
    }
}
