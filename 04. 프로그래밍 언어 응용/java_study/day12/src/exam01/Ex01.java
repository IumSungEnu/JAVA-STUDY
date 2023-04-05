package exam01;

import java.util.Arrays;

public class Ex01 { //많이 사용하니 꼭 기억하세요.
    public static void main(String[] args){
        String str = "abcdefg";
        System.out.printf("문자열 길이=%d%n", str.length());

        char[] chars = str.toCharArray();
        System.out.println(Arrays.toString(chars));

        String str2 = "1 little 2 little, 3 little indians";
        String str3 = str2.replace("little","big");  //단어 수정
        System.out.println(str3);

        String cellPhone = "010-3481-2101";
        String cellPhone2 = cellPhone.replaceAll("[^0-9]", "");
        System.out.println(cellPhone2);

        String str4 = str2.substring(9);
        System.out.println(str4);

        String str5 = str2.substring(9,17);
        System.out.println(str5);

        String str6 = "     abcd      ";
        String str7 = str6.trim(); // 공백 제거
        System.out.println(str7);

        System.out.println("    ".trim().isEmpty());
        System.out.println("    ".isBlank()); // -> trim() + isEmpty()를 합친거와 같다
    }
}
