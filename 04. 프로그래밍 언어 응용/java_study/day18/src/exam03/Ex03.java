package exam03;

import java.io.IOException;
import java.io.PrintStream;

public class Ex03 {   //.setErr()
    public static void main(String[] args) throws IOException {
        PrintStream stm = new PrintStream("err.log");
        System.setErr(stm);

        String str = null;
        str.toUpperCase();
    }//main
}
