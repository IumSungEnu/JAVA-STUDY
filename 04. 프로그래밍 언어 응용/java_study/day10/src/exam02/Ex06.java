package exam02;

public class Ex06 {  //String - 공간이 한정, 이사를 가야 한다, 문자열의 불변
    public static void main(String[] args){
        String str = "abc";
        System.out.println(System.identityHashCode(str));

        str += "def";
        System.out.println(System.identityHashCode(str));

        str += "ghi";
        System.out.println(System.identityHashCode(str));
    }
}
