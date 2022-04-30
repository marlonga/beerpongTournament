import java.security.PublicKey;
import java.util.ArrayList;

public class GameLogic {
    ArrayList<String> players;

    //NOCH TESTEN!!!!!!!

    GameLogic(ArrayList<String> players){
        this.players = players;
        allMatches();
    }

    public static class matches {
        String player1;
        String player2;

        matches(String player1,String player2){
            this.player1 = player1;
            this.player2 = player2;
        }

        public void setPlayer1(String player1) {
            this.player1 = player1;
        }

        public void setPlayer2(String player2) {
            this.player2 = player2;
        }

        @Override
        public String toString(){
            return player1 + player2;
        }
    }



    public static class ranking {
        String player;
        int points;
        ranking(String player,int points){
            this.player = player;
            this.points = points;
        }
        public void increment(){
            this.points++;
        }
    }



    public ArrayList<matches> allMatches(){
        ArrayList<matches> match = new ArrayList<>();
        for(int i = 0;i<players.size();i++){
            for(int j = 1;j< players.size();j++) {
                if(!players.get(i).equals(players.get(j))) {
                    matches temp = new matches(players.get(i), players.get(j));
                    match.add(temp);
                }
            }
            players.remove(players.get(i));
        }
        for (GameLogic.matches matches : match) {
            System.out.println(matches.toString());
        }
        return match;
    }
}
