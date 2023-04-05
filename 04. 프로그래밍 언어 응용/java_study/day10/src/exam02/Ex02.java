package exam02;

public class Ex02 {  //주소가 같은 경우
    public static void main(String[] args){
        String str1 = "abc";
        String str2 = "abc";

        System.out.println("str1 = " + System.identityHashCode(str1));
        System.out.println("str2 = " + System.identityHashCode(str2));
    }
}
