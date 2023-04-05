package exam;

public class Ex24_text {
    public static void main(String[] args){

//        1.변수 두 개를 선언해서 20과 3.0을 대입하고 두 변수의 사칙연산 결과를 정수로 출력해 보시오

        int a = 20;
        double b = 3.0;
        System.out.println( "a + b = " + (int)(a + b));


        System.out.println("----------------------------------------------");

//        2. 학생 40명이 리조트에 수학여행을 갔습니다.
//        리조트로 수학여행을 갔습니다.리조트는 방이 10개 있고 방번호는 0~9번까지 있습니다,
//        40명의 학생이 각각 번호표를 받아 한 방에 4명씩 배정하여 다음과 같이 출력하시오(예 : 학생1, 방번호 1번)

        for(int i = 1; i <= 40; i++){
            // 0~ 9 -> 10 -> 나머지 0~9
            int roomNo = i % 10;
            System.out.println("방번호 : " + roomNo + ", 학생" + i);
        }


        System.out.println("----------------------------------------------");

//        3. 5층 건물이 있습니다. 1층 약국, 2층 정형외과, 3층 피부과, 4층 치과, 5층 헬스클럽입니다.
//        건물의 층을 누르면 그 층이 어떤 곳인지 알려주는 엘리베이터가 있을 때 이를
//        swich ~ case문으로 구현하시오(5층인 경우 ‘5층 헬스클럽입니다.’)

        String blak = "5층";

        switch (blak){
            case "1층":
                System.out.println(blak + "약국");
                break;
            case "2층":
                System.out.println(blak + "정형외과");
                break;
            case "3층":
                System.out.println(blak + "피부과");
                break;
            case "4층":
                System.out.println(blak + "치과");
                break;
            case "5층":
                System.out.println(blak + " 헬스클럽");
                break;
            default:
                System.out.println("기타");
        }


        System.out.println("----------------------------------------------");

//        4. 구구단을 홀수 단만 출력하도록 프로그램을 만드시오. 구현 소스

        // 홀수만 2n
        for (int i=2; i <= 9; i++){
            System.out.println("==== " + i + "단" + " ====");
            for (int j=1; j<=9; j++){
                if(i%2 == 0){
                    break;
                }
                System.out.println(i + " x " + j + " = " + (i*j));
            }
        }


        System.out.println("----------------------------------------------");

//        5. 구구단을 단보다 곱하는 수가 크거나 같은 경우만 출력하는 프로그램을 만들어 보세요.구현 소스

        for (int i=1; i <= 9; i++){
            System.out.println("==== " + i + "단" + " ====");
            for (int j=1; j<=9; j++){

                if(i <= j){
                    System.out.println(i + " x " + j + " = " + (i*j));
                }
            }
        }

    }//main
}
