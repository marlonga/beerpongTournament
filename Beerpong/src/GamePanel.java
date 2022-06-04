import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class GamePanel extends JPanel {
    JButton nameBlue = new JButton();
    JButton nameRed = new JButton();
    JButton nameNextBlue = new JButton();
    JButton nameRedNextRed = new JButton();
    int index = 0;
    ArrayList<GameLogic.matches> allMatches;


    public GamePanel(ArrayList<String> players) {
        setSize(new Dimension(400, 500));
        setLocation(220, 10);
        setLayout(null);
        setBackground(new Color(134, 140, 252));
        GameLogic G = new GameLogic(players);
        allMatches = G.allMatches();
        drawPlayers();
        nameBlue.addActionListener(winnerButtons);
        nameRed.addActionListener(winnerButtons);

        nameBlue.setBackground(Color.BLUE);
        nameBlue.setBounds(60, 100, 140, 45);

        nameRed.setBackground(Color.RED);
        nameRed.setBounds(200, 100, 140, 45);

        nameRedNextRed.setBackground(Color.RED);
        nameRedNextRed.setBounds(200, 160, 100, 25);

        nameNextBlue.setBackground(Color.BLUE);
        nameNextBlue.setBounds(100, 160, 100, 25);

        add(nameBlue);
        add(nameRed);
        add(nameNextBlue);
        add(nameRedNextRed);
    }

    public void drawPlayers() {
        if (allMatches.size()-1 > index) {
            nameNextBlue.setText(allMatches.get(index + 1).getPlayer1());
            nameRedNextRed.setText(allMatches.get(index + 1).getPlayer2());
        }else {
            remove(nameNextBlue);
            remove(nameRedNextRed);
        }
        if(allMatches.size() > index) {
            nameBlue.setText(allMatches.get(index).getPlayer1());
            nameRed.setText(allMatches.get(index).getPlayer2());
        }
        updateUI();
    }



    ActionListener winnerButtons = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if(allMatches.size() > index){
                index++;
                drawPlayers();
                System.out.println(index);

            }
           // updateUI();
        }
    };


}
