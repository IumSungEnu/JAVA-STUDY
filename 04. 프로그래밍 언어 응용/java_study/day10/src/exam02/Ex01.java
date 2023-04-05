package exam02;

public class Ex01 {  //주소가 다른 경우
    public static void main(String[] args){
        String str1 = new String("abc");
        String str2 = new String("abc");

        System.out.println("str1 = " + System.identityHashCode(str1));
        System.out.println("str2 = " + System.identityHashCode(str2));
    }
}
