package exam;

public class Ex22 {
    public static void main(String[] args){
        //for문
        int total = 0;
        // 반복횟수, 1,2,3,4 -> 순서 -> 인덱스(index) : i
        for(int i = 1; i <= 100; i++){   //짝수만 더하기
            // 홀수를 건너뛰면 짝수?
            if(i % 2 == 1){
                continue;  // 건너뛰기
            }

            total += i;

            /*if (i % 2 == 0) {  //2로 나눈 나머지가 0이면 짝수
                total += i;
            }*/

            // 50번째에서 멈추고 싶을때
            /*if(i == 50){
                break;  // 반복 중단
            }*/
        }

        System.out.println("total: " + total);
    }
}
