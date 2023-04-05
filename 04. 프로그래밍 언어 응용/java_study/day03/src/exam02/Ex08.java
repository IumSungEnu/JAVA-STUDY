package exam02;

public class Ex08 {
    public static void main(String[] args){
        //2차원 배열 선언(간단하게)
        int[][] nums = {{10,20,30}, {40,50,60}};

        System.out.println("행의 갯수 : " + nums.length);
        System.out.println("0행의 열 갯수 : " + nums[0].length);
        System.out.println("1행의 열 갯수 : " + nums[1].length);


        //값을 조회할때 for문 사용이 용이하다
        /*
        for(int i=0; i<nums.length; i++){  //행의 반복 0,1
            for(int j=0; j<nums[i].length; j++){  //각 행의 열의 반복 0,1,2
                System.out.println(i + "행," + j + "열: " + nums[i][j]);
            }
        }
        */

        // ↑ 위에보다 좀더 쉽게 코드를 작성하고 싶을때 향상된 for문을 사용한다.
        for(int[] num : nums){  //행
            for(int n : num){   //열
                System.out.println(n);
            }
        }
    }//main
}
