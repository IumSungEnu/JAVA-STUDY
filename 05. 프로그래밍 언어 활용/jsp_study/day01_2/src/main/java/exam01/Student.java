package exam01;

import lombok.*;

//@Builder
//@AllArgsConstructor
@RequiredArgsConstructor
@Getter @Setter @ToString
public class Student {
    private final int id;
    @NonNull  //반드시 값이 있어야 한다.
    private String name;
    private String subject; //과목
}
