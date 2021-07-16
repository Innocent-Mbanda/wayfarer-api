package OOPUdemy;

public class Addition {

    public static int var =1;
    public int findSum(int a, int b){
        int sum = 0;
        sum = a+b;
        return sum;
    }

    public static int get(){
        return var++;
    }


}

class AdditionEX{
    public static void main(String[] args) {
        Addition ob = new Addition();
        int result =   ob.findSum(10,40);

        System.out.println(result);

    }
}


