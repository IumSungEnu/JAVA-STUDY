package exam04;

public class Ex08 {
    public static void main(String[] args){
        String str = "가abcdefg";
        char ch = str.charAt(2);
        System.out.println(ch);
        int code = str.codePointAt(0);
        System.out.println(code);//유니코드, 아스키코드로 반환 가능(한글)

        String str2 = str.concat("hij");
        System.out.println(str2);

        System.out.println(str2.contains("가"));
    }
}
