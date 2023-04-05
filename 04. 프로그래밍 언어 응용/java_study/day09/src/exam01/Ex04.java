package exam01;

public class Ex04 {
    public static void main(String[] args){
        MemberLoginService service = new MemberLoginService();
        try {
            service.login("user02", "1234");
        }catch (IdIncorrectException e){
            System.out.println(e.getMessage());

        }catch (PwIncorrectException e){
            System.out.println(e.getMessage());
        }
    }
}
