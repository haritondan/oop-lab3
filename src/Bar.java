import java.awt.desktop.SystemEventListener;
import java.util.ArrayList;

public class Bar extends  Menus{

    public ArrayList<String> item;

    Bar(String Name){
        super(Name);
        item = new ArrayList<>();
        item.add("Enzo");
        item.add("Martini");
        item.add("B52\n");
    }

    void showElements(){
        for(int i = 0; i < item.size(); i++){
        System.out.println(item.get(i));
        }
    }
}
