package commons;

public interface Validator<T> extends RequiredValidator, StrLengthValidator{
    void check(T o); //<┘
    void setException(RuntimeException e);  //<┘
}
