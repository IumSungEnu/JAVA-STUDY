package validators;

public interface Validator<T> extends RequiredValidator, StrLengthValidator{ //기본틀
    void check(T t);  //반드시 예외가 발생해야 한다.
}
