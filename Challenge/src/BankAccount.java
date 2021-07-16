

class BankAccount {

    private double balance =10000;
    private String userName = "studentAccount";
    private String password = "password";

    public  double getBalance (String userName,String password){
        if (this.userName.equals(userName) && this.password.equals(password)){
            return balance;
        } else {
            return 0.0;
        }

    }
    public static class AccessAccount{
        public static void main(String[] args) {
            BankAccount acc = new BankAccount();
           double result = acc.getBalance("studentAccount","passwooord");

            System.out.println(result);
        }
    }


}
