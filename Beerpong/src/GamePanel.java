import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {
    public GamePanel () {
        setSize(new Dimension(400,500));
        setLocation(220,10);
        setLayout(null);
        setBackground( new Color(134,140,252));
        updateUI();
    }
}
