package interfacepackage;


import java.util.ArrayList;

public interface Mobile {

    public void calling(String number);
    public void sendMessage(String number);
}


class Apple implements Mobile{

    private ArrayList<String> contacts = new ArrayList<>();

    public void addContacts(String number){
        contacts.add(number);
    }

    @Override
    public void calling(String number) {
        System.out.println("Calling.." + number);
    }

    @Override
    public void sendMessage(String number) {

        System.out.println("sending Message ...." +number);

    }


}

class abstractDemo{
    public static void main(String[] args) {

        Apple myIphone = new Apple();
        myIphone.calling("123455");
        myIphone.sendMessage("hello hwz u?");
        myIphone.addContacts("4567");
    }
}