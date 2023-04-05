package exam04;

import java.util.StringTokenizer;

public class Ex07 {
    public static void main(String[] args){
        String str = "Apple#Melon,Orange#Banana";
        StringTokenizer st = new StringTokenizer(str, ",#");
        while(st.hasMoreTokens()){
            String s = st.nextToken();
            System.out.println(s);
        }
    }
}
