import java.util.ArrayList;

public class GameLogic {
    ArrayList<String> players;

    GameLogic(ArrayList<String> players){
        this.players = players;
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
        public String getPlayer1() {return player1;}
        public String getPlayer2() {return player2;}
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
        public int getPoints() {return points;}
    }



    public ArrayList<matches> allMatches(){
        ArrayList<matches> match = new ArrayList<>();
        for(int i = 0;i<players.size();i++){
            for (String player : players) {
                if (!players.get(i).equals(player)) {
                    matches temp = new matches(players.get(i), player);
                    match.add(temp);
                }
            }
            players.remove(players.get(i));
            i--;
        }
        for (GameLogic.matches matches : match) {
            System.out.println(matches.toString());
        }
        return match;
    }
}
