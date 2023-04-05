package exam;

public class Ex02 {
    public static void main(String[] args){
        char ch1 = 'A';
        //char ch2 = ch1+1;  //char ch1 + int 1 -> char ch1 -> int ch1
        char ch2 = (char)(ch1+1);   //문자열로 만들고 싶어 명시적 형변환을 선언

        System.out.println(ch2);
        System.out.println(ch2 + 10);

        char ch3 = '가';  // 한글은 유티코드에서 2바이트 형태의 숫자로 나타낼수 있다.
        System.out.println(ch3 + 1);

        if(ch3 < '나'){
            System.out.println("작다");
        }
        boolean result = true;
        boolean result2 = false;
    }
}
