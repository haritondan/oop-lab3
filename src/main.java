import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
public class main {
    public static  void main(String[] args){
        Object obj = new Object();
        obj.showObject();
        Waiter w1 = new Waiter("Cristian");
        Waiter w3 = new Waiter("Francesca");
        Client c1 = new Client("Client", 1);
        Client c3 = new Client("Client", 3);
        Manager m1 = new Manager("Dan", "General Manager");
        m1.openRestaurnt();

        Bar b1 = new Bar("Bar");
        European e1 = new European("European");
        Sushi s1 = new Sushi("Sushi");

        c1.arrClient();
        w1.greetClient();
        w1.showMenus();

        //Random zone
        int min = 1;
        int max = 3;
        int min2 = 1;
        int max2 = 4;
        int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
        int random_int2 = (int)Math.floor(Math.random()*(max2-min2+1)+min2);

        //Client random choices
        if(random_int == 1){
            System.out.println("Client chose the " + b1.name + " menu: ");
            b1.showElements();
            System.out.println("Client made the order");
            w1.bringOrder();
            if(random_int2 > 1) {
                c1.payClient();
            }else{
                c1.clientComplaint();
                m1.talkToClient();
                c1.clientToManager();
                m1.getNewOrder();
                c1.payClient();
            }
        } else if (random_int == 2) {
            System.out.println("Client chose the " + e1.name + " menu: ");
            e1.showElements();
            System.out.println("Client made the order");
            w1.bringOrder();
            if(random_int2 > 1) {
                c1.payClient();
            }else{
                c1.clientComplaint();
                m1.talkToClient();
                c1.clientToManager();
                m1.getNewOrder();
                c1.payClient();
            }
        }else{
            System.out.println("Client chose the " + s1.name + " menu: ");
            b1.showElements();
            System.out.println("Client made the order");
            w1.bringOrder();
            if(random_int2 > 1) {
                c1.payClient();
            }else{
                c1.clientComplaint();
                m1.talkToClient();
                c1.clientToManager();
                m1.getNewOrder();
                c1.payClient();
            }
        }

        //Another Client
        c3.arrClient();
        w3.greetClient();
        w3.showMenus();



        //Client random choices
        if(random_int == 3){
            System.out.println("Client chose the " + b1.name + " menu: ");
            b1.showElements();
            System.out.println("Client made the order");
            w3.bringOrder();
            if(random_int2 == 2) {
                c3.payClient();
            }else{
                c3.clientComplaint();
                m1.talkToClient();
                c3.clientToManager();
                m1.getNewOrder();
                c3.payClient();
            }
        } else if (random_int == 1) {
            System.out.println("Client chose the " + e1.name + " menu: ");
            e1.showElements();
            System.out.println("Client made the order");
            w3.bringOrder();
            if(random_int2 == 4) {
                c3.payClient();
            }else{
                c3.clientComplaint();
                m1.talkToClient();
                c3.clientToManager();
                m1.getNewOrder();
                c3.payClient();
            }
        }else{
            System.out.println("Client chose the " + s1.name + " menu: ");
            b1.showElements();
            System.out.println("Client made the order");
            w3.bringOrder();
            if(random_int2 == 1) {
                c3.payClient();
            }else{
                c3.clientComplaint();
                m1.talkToClient();
                c3.clientToManager();
                m1.getNewOrder();
                c3.payClient();
            }
        }

        Stock stock = new Stock("Restaurant Stock");
        stock.showElements();
        m1.closeRestaurant();


    }
}






