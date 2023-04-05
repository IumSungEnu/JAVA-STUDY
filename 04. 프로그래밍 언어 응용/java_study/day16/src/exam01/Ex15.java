package exam01;

import java.util.Optional;

public class Ex15 {  //Optional - null값을 처리하기 위한 기능
    public static void main(String[] args){
        //Optional<String> opt = Optional.of(null); //오류발생
        Optional<String> opt = Optional.ofNullable(null); //값을 "A"를 입력하면 A가 출력된다.
        //String str = opt.get();
        //System.out.println(str);
        if(opt.isPresent()) {
            String str = opt.orElse("기본값 대체");  //value값이 null인 경우 대체된다.
            System.out.println(str);
        }

        String str2 = opt.orElseGet(() -> "None");
        System.out.println(str2);

        //String str3 = opt.orElseThrow();
        String str3 = opt.orElseThrow(() -> new RuntimeException("만든 예외"));
    }
}
