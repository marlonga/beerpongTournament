import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Stack;

public class StartPanel extends JPanel {
    private static ArrayList<JLabel> labelSpieler = new ArrayList<>();
    private static int spielerzahl = 0;
    private int playercount = 0;
    public StartPanel() {
        setLayout(null);
        setBounds(0,0,500,500);
        JTextField namenseingabe = new JTextField();
        namenseingabe.setBounds(10,30,100,20);
        namenseingabe.addActionListener(actionEingabeDerNamen);
        add(namenseingabe);
        updateUI();
        System.out.println("ahshdhha");System.out.println("ahshdhha");
        System.out.println("ahshdhha");
        System.out.println("ahshdhha");System.out.println("ahshdhha");
        System.out.println("ahshdhha");
        System.out.println("ahshdhha");
        System.out.println("ahshdhha");
        System.out.println("ahshdhha");
        System.out.println("ahshdhha");
        System.out.println("ahshdhha");
        System.out.println("ahshdhha");
        System.out.println("ahshdhha");
        System.out.println("ahshdhha");
        System.out.println("ahshdhha");
        System.out.println("ahshdhha");
        System.out.println("ahshdhha");
        System.out.println("ahshdhha");
        System.out.println("ahshdhha");System.out.println("ahshdhha");
        System.out.println("ahshdhha");
        System.out.println("ahshdhha");




    }

    public static JLabel getPlayers(int x){
        return labelSpieler.get(x);
    }
    private ActionListener actionEingabeDerNamen = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            JTextField temp = (JTextField) e.getSource();
            JLabel neuerSpieler = new JLabel();
            neuerSpieler.setText(temp.getText());
            neuerSpieler.setBounds(10,50+25*spielerzahl,100,20);
            labelSpieler.add(neuerSpieler);
            add(labelSpieler.get(spielerzahl));
            spielerzahl++;
            temp.setText("");
            updateUI();

        }
    };
}
