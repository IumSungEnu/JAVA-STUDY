package validators;

public interface RequiredValidator {
    //항상 공유(상시)
    default void requeiredCheck(String value, RuntimeException e){
        if(value == null || value.isBlank()){ //기본 기능
            throw e;
        }
    }
}
