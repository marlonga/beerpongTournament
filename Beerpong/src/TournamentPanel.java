import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TournamentPanel extends JPanel {
    public TournamentPanel() {
        setLayout(null);
        setBounds(0, 0, 500, 500);
        JTextField namenseingabe = new JTextField();
        namenseingabe.setBounds(10, 30, 100, 20);
        add(namenseingabe);
        updateUI();

    }

    private static ActionListener actionEingabeDerNamen = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
        }
    };

}
