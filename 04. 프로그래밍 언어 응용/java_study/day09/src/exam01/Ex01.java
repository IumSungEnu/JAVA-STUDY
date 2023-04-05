package exam01;

import java.io.FileInputStream;
import java.io.IOException;

public class Ex01 { //다중 예외 처리
    public static void main(String[] args){
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("a.txt");
            //throw new FileNotFoundException(...);

        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println(e.getMessage());  //메세지 출력

        } finally{ // 예외가 발생하든 안하든 무조건 실행되는 영역
            try{
                fis.close();
                // throw new NullPoint ...
                // throw new IOExcep...
            }catch (IOException | NullPointerException ee){
                //ee.printStackTrace();
            }catch (Exception ee){ // 예외가 발생하기는 하나, 뭔지 모를때(거의 마지막에 넣어줌)
                                   // 위에서부터 에러를 확인하기 때문에 Exception가 위에 있으면
                                   // IOException,NullPointerException이 에러가 발생
                System.out.println("Exception");
            }
            System.out.println("자원 해제");
        }
        System.out.println("아주 중요한 코드");
    }//main
}

