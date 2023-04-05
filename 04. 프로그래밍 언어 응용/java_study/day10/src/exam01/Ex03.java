package exam01;

public class Ex03 {   //동등성
    public static void main(String[] args){
        String str1 = new String("abc");
        String str2 = new String("abc");
        System.out.println("str1 == str2 : " + (str1 == str2));  //false
        System.out.println("str1.equals(str2) : " + (str1.equals(str2)));  //true
                                                                            //String::equals 재정의
        System.out.println("str1.hashCode() : " +str1.hashCode());
        System.out.println("str2.hashCode() : " +str2.hashCode());
        System.out.println("str1 : " + System.identityHashCode(str1));
        System.out.println("str2 : " + System.identityHashCode(str2));
    }
}
