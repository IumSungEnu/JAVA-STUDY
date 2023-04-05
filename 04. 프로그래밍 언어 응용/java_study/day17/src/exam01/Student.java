package exam01;

public class Student {
    private int grade;  //학년
    private char gender;  //성별
    private String name;  //이름

    public Student(int grade, char gender, String name){
        this.grade = grade;
        this.gender = gender;
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "grade=" + grade +
                ", gender=" + gender +
                ", name='" + name + '\'' +
                '}';
    }
}
