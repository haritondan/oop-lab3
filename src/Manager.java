import java.awt.*;

public class Manager extends Person{

    public String position;
    Manager(String Name, String Position){
        super(Name);
        position = Position;
    }

    void openRestaurnt(){
        System.out.println("Uchiha RestoBar is now open\n");
    }
    void talkToClient(){
        System.out.println("\nHello sir. My name is " + name + ", I am the " + position + ". What can I help you with?");
    }

    void getNewOrder(){
        System.out.println("\nHere is your new order. I am truly sorry for the inconvenience, enjoy your meal sir.");
    }

    void closeRestaurant(){
        System.out.println("The Restaurant has been closed");
    }
}
