import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {
    public GamePanel () {
        setSize(new Dimension(400,400));
        JButton switchToTournamentPanel = new JButton();
        switchToTournamentPanel.setText("test");
        switchToTournamentPanel.setBounds(10, 10, 100, 20);
        add(switchToTournamentPanel);
        updateUI();
    }
}
