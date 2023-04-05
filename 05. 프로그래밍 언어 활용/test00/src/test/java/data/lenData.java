package data;

public interface lenData {
    //최소값, 최대값
    default void lenDataM(String len, int min, int max, RuntimeException e){
        if(len.length() < min || (max > 0 && len.length() > max)){
            throw e;
        }
    }
}
