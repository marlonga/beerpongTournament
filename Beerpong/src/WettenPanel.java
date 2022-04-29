import javax.swing.*;
import java.awt.*;
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
        setBackground(Color.BLUE);

        setBounds(x, y, 200, 500);
        setMaximumSize(new Dimension(200, 500));
        setMinimumSize(new Dimension(200, 500));
        draw();
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
            add(blueButtons.get(i));

            redButtons.add(new JButton("red"));
            redButtons.get(i).setBounds(90, 20 * i, 20, 20);
            add(redButtons.get(i));
        }
    }
}
