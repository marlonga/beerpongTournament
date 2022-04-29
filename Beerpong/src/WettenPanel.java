import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class WettenPanel extends JPanel {
    private ArrayList<String> players;
    private ArrayList<JLabel> playerLabels;
    private ArrayList<JButton> blueButtons;
    private ArrayList<JButton> redButtons;
    private String player1;
    private String player2;

    WettenPanel(ArrayList<String> players, String player1, String player2,int x,int y){
        this.players = players;
        this.player1 = player1;
        this.player2 = player2;
        setBounds(x,y,200,500);
        setMaximumSize(new Dimension(200,500));
        setMinimumSize(new Dimension(200,500));
        draw();
    }

    public void draw(){
        for(int i = 0; i<players.size();i++){
            if(!(players.contains(player1) || players.contains(player2))){
                playerLabels.add(new JLabel(players.get(i)));
                add(playerLabels.get(i));
                playerLabels.get(i).setBounds(20,20*i,100,20);

                blueButtons.add(new JButton("blue"));
                add(blueButtons.get(i));
                blueButtons.get(i).setBounds(60,20*i,20,20);

                redButtons.add(new JButton("red"));
                add(redButtons.get(i));
                redButtons.get(i).setBounds(90,20*i,20,20);

            }
        }
    }



}
