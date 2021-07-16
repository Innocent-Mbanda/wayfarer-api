package Models;

public class Students {

    private String id;
    private String StudentFirstName;
    private String StudentLastName;
    private int age;
    private String  gender;

    public Students(){

    }

    public String getId() {
        return id;
    }

    public Students(String id, String studentFirstName, String studentLastName, int age, String gender) {
        this.id = id;
        StudentFirstName = studentFirstName;
        StudentLastName = studentLastName;
        this.age = age;
        this.gender = gender;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStudentFirstName() {
        return StudentFirstName;
    }

    public void setStudentFirstName(String studentFirstName) {
        StudentFirstName = studentFirstName;
    }

    public String getStudentLastName() {
        return StudentLastName;
    }

    public void setStudentLastName(String studentLastName) {
        StudentLastName = studentLastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
