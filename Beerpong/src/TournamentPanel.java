import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


public class TournamentPanel extends JPanel {

    private static final JPanel rankingpanel = new RankingPanel();
    public TournamentPanel() {
        setLayout(null);
        setBackground(new Color(250,110,110));
        setBounds(0,0,840,700);
        ArrayList<String> players = new ArrayList<>();
        players.add("a");
        players.add("b");
        players.add("c");
        players.add("d");
        players.add("e");
        players.add("f");
        players.add("g");


        WettenPanel wettenpanel = new WettenPanel(players, "b","c",10,10);
        JPanel gamepanel = new GamePanel(players);

        add(wettenpanel);
        add(gamepanel);
        add(rankingpanel);

        updateUI();
    }


    private static final ActionListener actionEingabeDerNamen = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
        }
    };

}
