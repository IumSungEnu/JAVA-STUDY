package exam01;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Builder
public class Student {
    private int id;
    private String name;
    private String subject;


}
