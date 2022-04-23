import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class TournamentPanel extends JPanel {
    public TournamentPanel() {
        setLayout(null);
        setBounds(0, 0, 500, 500);
        JTextField Tournament = new JTextField();
        Tournament.setText("TOURNIR");
        Tournament.setBounds(10,10,100,20);
        add(Tournament);
        updateUI();

    }


    private static ActionListener actionEingabeDerNamen = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
        }
    };

}
