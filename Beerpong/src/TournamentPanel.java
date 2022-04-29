import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


public class TournamentPanel extends JPanel {

    private static final JPanel gamepanel = new GamePanel();
    private static final JPanel rankingpanel = new JPanel();
    public TournamentPanel() {
        setLayout(null);
        setBackground(Color.RED);
        setBounds(0,0,500,500);
        ArrayList<String> players = new ArrayList<>();
        players.add("a");
        players.add("b");
        players.add("c");
        players.add("d");
        WettenPanel wettenpanel = new WettenPanel(players, "b","c",10,10);


        add(wettenpanel);
        updateUI();
    }


    private static ActionListener actionEingabeDerNamen = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
        }
    };

}
