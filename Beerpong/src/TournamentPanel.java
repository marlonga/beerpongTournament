import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


public class TournamentPanel extends JPanel {
    private static JPanel wettenpanel = new JPanel();
    private static final JPanel gamepanel = new JPanel();
    private static final JPanel rankingpanel = new JPanel();
    public TournamentPanel() {
        setLayout(new BorderLayout());
        ArrayList<String> players = new ArrayList<>();
        players.add("a");
        players.add("b");
        players.add("c");
        players.add("d");
        wettenpanel = new WettenPanel(players, "b","c",0,0);
        add(wettenpanel,BorderLayout.LINE_START);
        add(gamepanel,BorderLayout.CENTER);
        add(rankingpanel,BorderLayout.LINE_END);
        add(wettenpanel);

        updateUI();
    }


    private static ActionListener actionEingabeDerNamen = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
        }
    };

}
