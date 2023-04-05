package exam01;

public class Ex06 {
    public static void main(String[] args){
        try(MyResource my = new MyResource()){
            boolean bool = my instanceof AutoCloseable;
            System.out.println(bool);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
