package exam;

public class Ex19 {
    public static void main(String[] args){
        String rank = "일등";

        switch (rank){
            case "일등":
                System.out.println("금메달");
                break;
            case "이등":
                System.out.println("은메달");
                break;
            case "삼등":
                System.out.println("동메달");
                break;
            default:
                System.out.println("노메달");
        }
    }
}
