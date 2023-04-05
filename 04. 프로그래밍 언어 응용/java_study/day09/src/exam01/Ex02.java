package exam01;

public class Ex02 {  //예외 던지기 throw
    public static void main(String[] args){
        try{
            testMethod();
        }catch (RuntimeException e){ // e = new RuntimeException("예외발생1");
            System.out.println(e.getMessage());
        }
    }

    public static void testMethod(){
        boolean result = true;

        System.out.println("실행1");

        if(result) {
            throw new RuntimeException("예외 발생1");
        }

        System.out.println("실행2");

        if(result){
            throw new RuntimeException("예외 발생2");
        }
        System.out.println("실행3");
    }
}
