import java.awt.desktop.SystemEventListener;
import java.util.ArrayList;

public class European extends  Menus{

    public ArrayList<String> item;

    European(String Name){
        super(Name);
        item = new ArrayList<>();
        item.add("Zeama UTM");
        item.add("Pasta Pardono");
        item.add("Lovele Saltele\n");
    }

    void showElements(){
        for(int i = 0; i < item.size(); i++){
            System.out.println(item.get(i));
        }
    }
}
