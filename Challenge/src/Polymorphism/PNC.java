package Polymorphism;

public class PNC extends Bank {

    float getRateOfInterest(){
        return 8.4f;
    }

    public class JPM extends Bank{

        float getRateOfInterest(){
            return 8.8f;
        }

    }


}
