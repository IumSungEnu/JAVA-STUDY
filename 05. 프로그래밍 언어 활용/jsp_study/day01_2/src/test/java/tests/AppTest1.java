package tests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest1 {
    @Test
    public void test1(){
        int result = 2 + 5;
        //assertEquals(result, 7);
        assertEquals(7, result);
        //실제 값(actual)이 기대하는 값(expected)과 같은지 검사한다.
        //            ↔ 반대
        //assertNotEquals(unexpected, actual)
        //실제 값(actual)이 특정 값(unexpected)과 같지 않은지 검사한다.
    }

    @Test
    public void test2(){ //특정 클래스만 실행시키고 싶을때 'test2'더블클릭하여 마우스 오른쪽버튼
                         //클릭하여 Run클릭하면 된다.(많이 사용)
        int result = 2 + 5;
        assertEquals(result, 7);
    }
}
