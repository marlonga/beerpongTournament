import java.util.ArrayList;
import javax.swing.*;

public class Singleton {

    private static  Singleton uniqueInstance = new Singleton();
    private ArrayList<String> spieler = new ArrayList();



    Singleton() {
    }

    public static Singleton getInstance () {
        return uniqueInstance;
    }

    public void addSpieler ( String Spieler ){
        uniqueInstance.spieler.add(Spieler);
    }

    public String getSpieler (int index){
        return uniqueInstance.spieler.get(index);
    }

}
