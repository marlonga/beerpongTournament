import javax.swing.*;
import java.util.ArrayList;

public class WettenPanel extends JPanel {
    private ArrayList<String> players;
    private String player1;
    private String player2;

    WettenPanel(ArrayList<String> players, String player1, String player2,int x,int y){
        this.players = players;
        this.player1 = player1;
        this.player2 = player2;
        setBounds(x,y,200,500);
        for(int i = 0; i<players.size();i++){

        }
    }



}
