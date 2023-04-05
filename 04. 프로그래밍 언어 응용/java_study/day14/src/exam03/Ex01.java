package exam03;

import java.util.*;

public class Ex01 {  //HashMap
    public static void main(String[] args){
        //Map<String, String> members = new HashMap<>();   //HashMap<>
        Map<String, String> members = new TreeMap<>(Comparator.reverseOrder());   //TreeMap<>

        //추가, 조회
        members.put("user01","사용자01");
        members.put("user04","사용자04");  //Map.Entry 객체 생성
        members.put("user05","사용자02");
        members.put("user03","사용자03");
        members.put("user02","사용자02");

        Set<Map.Entry<String, String>> entries = members.entrySet();
        for(Map.Entry<String, String> entry : entries){
            String key = entry.getKey();
            String value = entry.getValue();

            System.out.printf("%s = %s%n", key, value);
        }


        /*
        //수정
        members.put("user02", "사용자02(수정)");
        //제거
        members.remove("user02");

        String userNm = members.get("user02");
        System.out.println(userNm
        );
        */
    }//main
}
