package exam02;

public class Human extends Animal{  //인간

    @Override     //정보제공만 해준다.기능 x
    public void move(){  //하위 클래스
        System.out.println("두 다리로 직립 보행한다.");
    }

    public  void  readBook(){  // 행동
        System.out.println("독서를 한다.");
    }
}
