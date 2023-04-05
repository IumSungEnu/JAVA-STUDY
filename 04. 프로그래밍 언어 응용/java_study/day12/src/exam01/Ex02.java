package exam01;

public class Ex02 {
    public static void main(String[] args){
        String cellPhone = "010-1111-1111";
        cellPhone = cellPhone.replaceAll("\\D","");
        //String pattern = "01[016][0-9]{3,4}[0-9]{4}"
        String pattern = "^01[016]\\d{3,4}\\d{4}$"; //위에 [0-9]와 같은 의미

        if(cellPhone.matches(pattern)){
            System.out.println("휴대폰 번호 형식이 맞습니다.");
        }else {
            System.out.println("휴대폰 번호 형식이 아닙니다.");
        }
    }
}
