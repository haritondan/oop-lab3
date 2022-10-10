public class Waiter extends Person {


    public Waiter(String Name){
        super(Name);
    }

    public void greetClient(){
        System.out.println("Good evening, my name is " + name + " and today I will be you waiter");
    }

    public void showMenus(){
        System.out.println("We have 3 menus for you: Bar, Sushi or European. Which one would you like to see?\n");
    }

    public void bringOrder(){
        System.out.println("Here is your order. Enjoy your meal.\n");
    }

    @Override
    void showName(){
        System.out.println("I am waiter and My name is " + name);
    }
}
