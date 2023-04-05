package exam07;

public class Outer { //지역 내부 클래스
    public Calculator cal = new Calculator() {
        @Override
        public int add(int num1, int num2) {
            return num1 + num2;
        }
    };

    // 실제로 많이 사용한다.
    public Calculator method(int num){  //활용도가 넓어진다.
        Calculator cal = new Calculator() {
            public int add(int num1, int num2){
                //num *= 2; //오류발생 - 상수화 final int num(바뀔수 없다)
                return num + num1 + num2;
            }
        };

        //int result = cal.add(20,30);  //활용도가 한정되어 있다.
        //System.out.println(result);
        return cal;
    }
}


    //익명 내부 클래스
    //public Calculator method(int num){
    //    return new Calculator() {   --> 바로 리턴값을 매긴다.
    //        public int add(int num1, int num2){
    //            return num + num1 + num2;
    //        }
    //    };
