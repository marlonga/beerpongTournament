import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class GamePanel extends JPanel {
    JButton nameBlue = new JButton();
    JButton nameRed = new JButton();
    JButton nameNextBlue = new JButton();
    JButton nameRedNextRed = new JButton();



    public GamePanel (ArrayList<String> players) {
        setSize(new Dimension(400,500));
        setLocation(220,10);
        setLayout(null);
        setBackground( new Color(134,140,252));
        GameLogic G = new GameLogic(players);
        ArrayList<GameLogic.matches> allMatches = G.allMatches();


        nameBlue.setBackground(Color.BLUE);
        nameBlue.setBounds(60,100,140,45);
        nameBlue.setText("nameOne");

        nameRed.setBackground(Color.RED);
        nameRed.setBounds(200,100,140,45);
        nameRed.setText("nameTwo");

        nameNextBlue.setBackground(Color.BLUE);
        nameNextBlue.setBounds(100,160,100,25);
        nameNextBlue.setText("nameNextOne");

        nameRedNextRed.setBackground(Color.RED);
        nameRedNextRed.setBounds(200,160,100,25);
        nameRedNextRed.setText("nameNextTwo");

        add(nameBlue);
        add(nameRed);
        add(nameNextBlue);
        add(nameRedNextRed);
        updateUI();
    }
}
