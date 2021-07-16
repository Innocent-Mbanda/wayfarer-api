

public class OopStudentClass {
    int id;
    String name;
    public static void main(String args[]){
        OopStudentClass st1 = new OopStudentClass();
        System.out.println(st1.id);
        System.out.println(st1.name);

        OopStudentClass st2 = new OopStudentClass();
        st2.id=101;
        st2.name ="Inmbanda";

        System.out.println(st2.id + "" + st2.name);

        OopStudentClass st3 = new OopStudentClass();
        st1.id =101;
        st1.name ="mbanda";
        st2.id =102;
        st2.name = "amit";

        System.out.println(st1.id + "" + st1.name);
        System.out.println(st2.id + "" + st2.name);


    }



}
