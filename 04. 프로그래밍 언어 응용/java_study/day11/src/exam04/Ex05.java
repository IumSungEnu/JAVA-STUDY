package exam04;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Ex05 {  //scanner
    public static void main(String[] args) throws IOException {
        int total = 0;
        Scanner sc = new Scanner(new File("data.txt"));
        while(sc.hasNext()){ //다음 라인에 데이터가 있으면 true
            int score = sc.nextInt(); //다음 라인의 데이터 -> 다음칸 이동
            total += score;
        }
        System.out.println(total);
    }//main
}
