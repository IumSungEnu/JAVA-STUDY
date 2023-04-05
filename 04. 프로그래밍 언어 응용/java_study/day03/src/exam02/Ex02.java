package exam02;

public class Ex02 {
    public static void main(String[] args){
        int[] nums = new int[4];  //int num(4) -> 4개
        // 0,1,2,3 [] -> 인덱스 연산자
        nums[0] = 10;
        nums[1] = 20;
        nums[2] = 30;
        nums[3] = 40;

        /*
        System.out.println(nums[0]);
        System.out.println(nums[1]);
        System.out.println(nums[2]);
        System.out.println(nums[3]);
        */

        //배열은 순서와 인덱스번호가 존재하기 때문에 for문과 궁합이 잘 맞는다.
        for(int i=0; i<=3; i++){
            System.out.println(nums[i]);
        }
    }
}
