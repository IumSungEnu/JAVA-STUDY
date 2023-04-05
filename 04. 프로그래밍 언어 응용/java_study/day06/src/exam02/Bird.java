package exam02;

public class Bird extends Animal{  //새
    public void move(){  //하위 클래스
        System.out.println("두 날개로 날아간다.");
    }

    public  void  hetch(){  // 행동
        System.out.println("알을 낳는다");
    }
}
