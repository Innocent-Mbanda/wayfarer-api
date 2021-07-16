

public class Student {
    int rollno;
    String name;

   public void insertRecords(int r, String n){
        rollno =r;
        name = n;
    }
    void displayInformation(){
        System.out.println(rollno + "" + name);
    }


}
