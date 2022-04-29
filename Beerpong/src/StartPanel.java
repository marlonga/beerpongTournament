import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Stack;

public class StartPanel extends JPanel {
    private static ArrayList<JLabel> labelSpieler = new ArrayList<>();
    private static ArrayList<JButton> minusSpieler = new ArrayList<>();
    private static int spielerzahl = 0;
    private int playercount = 0;
    String comboBoxSize[] = {"1","2","3","4"};
    int TeamSize = 0;
    public StartPanel() {
        setLayout(null);
        setBounds(0,0,500,500);
        JTextField namenseingabe = new JTextField();
        namenseingabe.setBounds(10,30,100,20);
        namenseingabe.addActionListener(actionEingabeDerNamen);
        JComboBox teamSize = new JComboBox(comboBoxSize);
        teamSize.setBounds(140,30,100,20);
        add(namenseingabe);
        add(teamSize);
        updateUI();
    }

    public static JLabel getPlayers(int x){
        return labelSpieler.get(x);
    }
    private ActionListener actionEingabeDerNamen = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if(!(spielerzahl >19)){
                JTextField temp = (JTextField) e.getSource();
                JLabel neuerSpieler = new JLabel();
                neuerSpieler.setText(temp.getText());
                neuerSpieler.setBounds(10,50+25*spielerzahl,100,20);
                labelSpieler.add(neuerSpieler);
                add(labelSpieler.get(spielerzahl));

                temp.setText("");

                JButton neuesMinus = new JButton();
                neuesMinus.setBounds(120,57+25*spielerzahl,15,5);
                neuesMinus.setBackground(Color.RED);
                neuesMinus.addActionListener(actionMinusSpieler);
                minusSpieler.add(neuesMinus);
                add(minusSpieler.get(spielerzahl));

                spielerzahl++;
                updateUI();
            }
        }
    };
    private ActionListener actionMinusSpieler = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if(spielerzahl > 0){
                JButton temp = (JButton) e.getSource();
                remove(temp);
                updateUI();
            }
        }
    };
}
