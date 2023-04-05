package exam01;

public class Ex03 {
    public static void main(String[] args){
        /*회원가입*/
        try{
            checkMobile();
        }catch (Exception e){
            System.out.println("회원가입 상황에 맞는 예외처리");
        }

        /*주문*/
        try{
            checkMobile();
        }catch (Exception e){
            System.out.println("주문상황에 맞는 예외처리");
        }

    }

    public static void checkMobile() throws Exception{ //에러 발생 영역
        // 처리로직 ...
        boolean result = true;

        if(result){
            throw new Exception("형식이 맞지 않습니다.");
        }
    }

}
