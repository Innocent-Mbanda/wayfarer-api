package OOPUdemy;

public class DEMO1 {
    public int a;

    DEMO1(){
        //non parameterized constructor
        a =10;
    }
    //parameterize constructor00
    public DEMO1(int a){
        this.a = a;
    }

    public void get(){
        System.out.println("the value of " + a);
    }

    public class DEMOX{
        public void main(String[] args) {
            DEMO1 d = new DEMO1();
            d.get();
        }
    }

}
