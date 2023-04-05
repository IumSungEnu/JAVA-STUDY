package exam02;

public class Ex09 {
    public static void main(String[] args){
        StringBuffer sb = new StringBuffer(100);
        //StringBuffer sb2 = sb.append("abc");
        //StringBuffer sb3 = sb2.append("def");
        sb.append("abc").append("def").append("ghi");  //연달아 호출 가능
                                                       //(메서드 체인 방식 - 체인처럼 연결되있으므로)
    }
}
