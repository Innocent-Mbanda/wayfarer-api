

public class Employee {

 int id;
 String name;
 float salary;
 String position;

 void insertData(int i, String n, float s,String p){
     id =i;
     name =n;
     salary =s;
     position =p;
 }

   void display(){
       System.out.println(id + "" + name + "" + salary);

       Employee e1 = new Employee();
       Employee e2 = new Employee();
       Employee e3 = new Employee();

       e1.insertData(101,"ABC",5000,"Marketing");
       e2.insertData(102,"ABD",15000,"Accountant");
       e3.insertData(103,"ABC",25000,"Director");
       e1.display();
       e2.display();
       e3.display();
   }

}
