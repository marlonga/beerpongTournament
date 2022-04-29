import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class WettenPanel extends JPanel {
    private ArrayList<String> players;
    private ArrayList<JLabel> playerLabels = new ArrayList<>();
    private ArrayList<JButton> blueButtons = new ArrayList<>();
    private ArrayList<JButton> redButtons = new ArrayList<>();
    private String player1;
    private String player2;

    public WettenPanel(ArrayList<String> players, String player1, String player2, int x, int y) {
        this.players = players;
        this.player1 = player1;
        this.player2 = player2;
        players.remove(player1);
        players.remove(player2);
        setLayout(null);
        setBackground( new Color(134,252,221));

        setBounds(x, y, 200, 500);
        setMaximumSize(new Dimension(200, 500));
        setMinimumSize(new Dimension(200, 500));
        JButton b= new JButton("click me");
        b.setBounds(100,300,50,100);
        b.addActionListener(onButtonResult);
        draw();

        add(b);
        updateUI();
    }

    public void draw() {
        for (int i = 0; i < players.size(); i++) {
            playerLabels.add(new JLabel(players.get(i)));
            playerLabels.get(i).setBounds(20, 20 * i, 100, 20);
            add(playerLabels.get(i));

            JButton tempx = new JButton("blue");
            tempx.setBounds(60, 20 * i, 20, 20);
            blueButtons.add(tempx);
            blueButtons.get(i).addActionListener(buttonListener);
            add(blueButtons.get(i));

            redButtons.add(new JButton("red"));
            redButtons.get(i).setBounds(90, 20 * i, 20, 20);
            redButtons.get(i).addActionListener(buttonListener);
            add(redButtons.get(i));
        }
    }
    public ArrayList<String> whoWon(String color) {
        ArrayList<String> winners = new ArrayList<>();
        if (color.equals("blue")) {
            for (int i = 0; i < blueButtons.size(); i++) {
                if (blueButtons.get(i).isEnabled()) {
                    winners.add(playerLabels.get(i).getText());
                }
            }
        } else if (color.equals("red")) {
            for (int i = 0; i < redButtons.size(); i++) {
                if (redButtons.get(i).isEnabled()) {
                    winners.add(playerLabels.get(i).getText());
                }
            }
        }
        return winners;
    }

    ActionListener buttonListener =new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton temp = (JButton) e.getSource();
            if(blueButtons.contains(temp)){
                int x = blueButtons.indexOf(temp);
                redButtons.get(x).setEnabled(false);
            }
            else if(redButtons.contains(temp)){
                int y = redButtons.indexOf(temp);
                blueButtons.get(y).setEnabled(false);
            }
        }
    };
    ActionListener onButtonResult = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println(whoWon("red"));

        }
    };
}
