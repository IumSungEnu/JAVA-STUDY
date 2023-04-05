package exam02;

public class Ex08 {  //버퍼 - 담았다가 한꺼번에 
    public static void main(String[] args){
        StringBuffer sb = new StringBuffer(100);
        System.out.println(System.identityHashCode(sb));

        sb.append("abc");
        System.out.println(System.identityHashCode(sb));

        sb.append("def");
        System.out.println(System.identityHashCode(sb));

        sb.append("ghi");
        System.out.println(System.identityHashCode(sb));

        String str = sb.toString();
        System.out.println(str);
        System.out.println(System.identityHashCode(sb));
    }
}
