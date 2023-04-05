package commons;

public interface StrLengthValidator {
    default void lengthCheck(String str, int min, int max, RuntimeException e){
        int len = str.length();
        if(len < min || (max > 0 && len > max)){
            throw e;
        }
    }

    default void lengthCheck(String str, int min, RuntimeException e){
        lengthCheck(str, min, 0, e);
    }
}
