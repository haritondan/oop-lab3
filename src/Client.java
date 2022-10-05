public class Client extends Person{
    public int number;
    public Client(String Name,int Number){
        super(Name);
        number = Number;
    }

    void arrClient(){
        System.out.println(name + " " +number + " has arrived\n");
    }
    void payClient(){
        System.out.println(name + " " +number + " paid and left.\n");
    }
    void clientComplaint(){
        System.out.println("This tastes awfully, let me speak with a manager.");
    }
    void clientToManager(){
        System.out.println("This tastes awfully, I want a replace for this order");
    }

}
