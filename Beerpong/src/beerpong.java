import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeListener;

public class beerpong {
    private static JFrame mainframe = new JFrame();
    private static JPanel mainpanel = new StartPanel();
    private static TournamentPanel tournamentpanel = new TournamentPanel();

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
    static ActionListener actionSwitchToTournement = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            mainframe.remove(mainpanel);
            mainframe.add(tournamentpanel);
            tournamentpanel.updateUI();
        }
    };
}
