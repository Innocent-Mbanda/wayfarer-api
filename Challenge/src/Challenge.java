import java.util.Scanner;

public class Challenge {
    public static void main(String[] args) {

        int num =15;

//        num/3{return;fizz} if else num/5{return;buzz}|| else if (num/3 && num/5 { return;fizzBuzz}
//
//        }

        if (num % 3==0 || num % 5==0) {
            System.out.println("fizz");

        } else if (num % 5 == 0){
            System.out.println("Buzz");

        } else {
            if (num % 3 == 0 && num %5 ==0 ){

                System.out.println("FizzBuzz");

            }
        }

    }
}
