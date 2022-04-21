import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeListener;

public class beerpong {
    private static JFrame mainframe = new JFrame();
    private static JPanel mainpanel = new StartPanel();
    private static JPanel tournamentpanel = new TournamentPanel();

    public static void main(String[] args) {

        mainframe.setLayout(null);
        mainframe.setSize(500,500);
        mainframe.setLocation(100,100);
        mainframe.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mainframe.add(mainpanel);
        System.out.println("AHHASHHSAD");
        System.out.println("AHHASHHSAD");
        System.out.println("AHHASHHSAD");
        System.out.println("AHHASHHSAD");







        JButton switchToTournamentPanel = new JButton();
        switchToTournamentPanel.setText("start game");
        switchToTournamentPanel.setBounds(10, 10, 100, 20);
        switchToTournamentPanel.addActionListener(actionSwitchToTournement);
        mainframe.add(switchToTournamentPanel);

        mainpanel.updateUI();
        mainframe.setVisible(true);
    }
    static ActionListener actionSwitchToTournement = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            JComponent temp = (JComponent) e.getSource();
            JFrame tempz = (JFrame) temp.getParent();
            JComponent[] tempComp = (JComponent[]) tempz.getComponents();
            for (JComponent x : tempComp ){
                if(x.getName() == temp.getName())
                {
                    tempz.add(x);
                }
            }
        }
    };
}
