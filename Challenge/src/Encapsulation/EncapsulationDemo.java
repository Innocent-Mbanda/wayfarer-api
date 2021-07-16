package Encapsulation;




class Account{
    private double balance;

    public double getBalance(){
        return this.balance;
    }

    public double setBalance(double balance){
        return this.balance =balance;
    }

}
public class EncapsulationDemo {
    public static void main(String[] args) {

        Account acc = new Account();
        acc.setBalance(5000000);

        System.out.println( "your balance is &" + acc.getBalance());
    }


}
