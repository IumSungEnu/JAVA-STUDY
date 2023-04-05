package commons;

public interface RequiredValidator {
    //Validator는 이 Validator의 틀에서만 작동한다.

    /* 필수 항목 체크 - String */
    default void requiredCheck(String str, RuntimeException e){
        //str이 없을 경우 RuntimeException e가 발생하도록
        if(str == null || str.isBlank()){
            throw e;
        }
    }//main
    
    /*정수범위 체크
    @param num
    @param min
    @param max
    @param e
     */

    /* 필수 항목 체크 - long */
    default  void requiredCheck(long num, long min, long max, RuntimeException e){
        if(num < min || (max > 0 && num > max)){
            //num가 min보다 작거나 max가 0보다 크거나 num가 max보다 클때 예외발생
            throw e;
        }
    }

    default void requiredCheck(long num, long min, RuntimeException e){
        requiredCheck(num, min, 0, e);
    }

    /*실수범위 체크
    @param num
    @param min
    @param max
    @param e
     */

    /* 필수 항목 체크 - double */
    default  void requiredCheck(double num, double min, double max, RuntimeException e){
        if(num < min || (max > 0 && num > max)){
            //num가 min보다 작거나 max가 0보다 크거나 num가 max보다 클때 예외발생
            throw e;
        }
    }

    default void requiredCheck(double num, double min, RuntimeException e){
        requiredCheck(num, min, 0, e);
    }
}

//숫자는 정수와 실수로 나뉘어져 있다. 그렇기에 정수와 실수 두개를 모두 정의해줘야 한다.
//double은 정수와 실수 모두 포함되어있지만 long값을 따로 정의하였다. long값을 따로 정의안해도 문제x
