package tests;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.io.TempDir;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class AppTest2 {

    @TempDir  // 임시 폴더 생성
    private File folder; //임시로 쓸 경우

    @BeforeAll
    public static void beforeAll(){  //한번만 호출
        System.out.println("모든 테스트 실행 전 - BeforeAll");
    }

    @BeforeEach
    //@BeforeEach : 테스트를 하기전에 필요한 사전 작업
    public void beforeTest(){  //각각의 모든 테스트 케이스마다 각각 실행된다.
        System.out.println("테스트 케이스 실행 전 - BeforeEach");
        System.out.println(folder.getAbsolutePath()); //임시 폴더 경로 -> 제거 : AfterEach에서.
    }

    @Test
    @DisplayName("테스트1")
    public void test1(){
        System.out.println("test1");
    }

    @Test
    //@Disabled //테스트 배제
    @DisplayName("테스트2")
    @Timeout(value = 2, unit = TimeUnit.SECONDS) //2초이내의 통과
    public void test2() throws Exception{
        System.out.println("test2");
        Thread.sleep(5000);  //예외발생 -> 2초이내에 통과가 되어야 하는데 5초가 넘어가 오류 발생
    }


    //@AfterEach : 테스트를 실행한 후
    @AfterEach
    public void afterTest(){  //각각의 모든 테스트 케이스마다 각각 실행된다.
        System.out.println("테스트 케이스 실행 후 - AfterEach");
    }

    @AfterAll
    public static void AfterAll(){  //한번만 호출
        System.out.println("모든 테스트 실행 후 - AfterAll");
    }
}

//제한점 : 메서드를 정적 메서드로 정의해야 한다.