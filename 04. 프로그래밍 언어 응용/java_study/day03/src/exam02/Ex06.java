package exam02;

public class Ex06 {
    public static void main(String[] args){
        int[] nums = {10,20,30,40,50,60};   //50,60 값을 더 추가했을때
            System.out.println("공간의 갯수 : " + nums.length);
        //for(int i=0; i < nums.length; i++){  // i<=5로 수정함
        //    System.out.println(nums[i]);     //     ↓
                                               //     ↓
            //이러한 수정은 번거롭기 때문에 length 속성을 사용한다.
            //i < nums.length; -> i >= 0 and i < 7, 0,1,2,3,4,5,6

            //     ↓ (더 효율적으로 사용하는 방법)
            //     ↓

        //향상된 for문   -> 주로 많이 쓰이는 for문
        for(int num : nums){
            System.out.println(num);
        }
        
    }//main
}
