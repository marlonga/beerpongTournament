import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class beerpong {
    private static final JFrame mainframe = new JFrame();
    private static final JPanel mainpanel = new StartPanel();
    private static final TournamentPanel tournamentpanel = new TournamentPanel();

    public static void main(String[] args) {

        mainframe.setSize(new Dimension(850,700));
        mainframe.setMinimumSize(new Dimension(840,700));
        mainframe.setMaximumSize(new Dimension(860,700));

        mainframe.setLayout(null);
        mainframe.setLocation(100,100);
        mainframe.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mainframe.add(mainpanel);

        JButton switchToTournamentPanel = new JButton();
        switchToTournamentPanel.setText("start game");
        switchToTournamentPanel.setBounds(10, 10, 100, 20);
        switchToTournamentPanel.addActionListener(actionSwitchToTournement);
        mainpanel.add(switchToTournamentPanel);

        mainpanel.updateUI();
        mainframe.setVisible(true);
    }
    static ActionListener actionSwitchToTournement = e -> {
        mainframe.remove(mainpanel);
        mainframe.add(tournamentpanel);
        tournamentpanel.updateUI();
    };
}
