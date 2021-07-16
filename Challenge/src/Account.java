
public class Account {

    int acc;
    String name;
    float amount;

    void insert(int a, String n, float amt){
        acc =a;
        name =n;
        amount =amt;
    }

    void deposit(float amt){
        amount = amount+amt;
        System.out.println(amt + " Deposited");
    }

    void withdraw(float amt){
        if (amount>amt){
            System.out.println("insufficient balance");
        } else {
            System.out.println(amt + "withdraw");
        }
    }

    void checkBalance(){
        System.out.println("your balance is " +amount);
    }


    public static void main(String[]arg){
        Account a1 = new Account();
        a1.insert(1234,"Innocent",20000);
        a1.checkBalance();
        a1.deposit(40000);
        a1.checkBalance();
        a1.withdraw(15000);
        a1.checkBalance();

    }

}
