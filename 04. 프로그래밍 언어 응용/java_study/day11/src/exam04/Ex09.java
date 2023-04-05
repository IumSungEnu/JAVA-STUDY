package exam04;

public class Ex09 {
    public static void main(String[] args){

        String str = "Apple, Mango, Melon, Banana, Apple";

        System.out.println(str.startsWith("Apple"));
        System.out.println(str.startsWith("Banana"));

        System.out.println("----------------------------------");

        System.out.println(str.indexOf("Mango"));  //문자열의 위치[0,1,2,3, ... ,7]
        System.out.println(str.indexOf("Mango2"));  //찾을수 없는 문자열이여서 -1이 출력

        System.out.println("----------------------------------");

        System.out.println(str.indexOf("Apple"));  //왼쪽 -> 오른쪽 위치
        System.out.println(str.lastIndexOf("Apple"));  //오른쪽 -> 왼쪽 위치
    }
}
