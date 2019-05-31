import java.util.ArrayList;

public class Game {

    private Deck deck;
    private ArrayList<Player> players;
    private Player player;

    public Game(Deck deck){
        this.deck = deck;
        this.players = new ArrayList<Player>();

    }



    public void addPlayer(Player player) {
        this.players.add(player);
    }

    public int playersCount(){
       return this.players.size();
    }

    public void dealCardToPlayer(Player player) {
        Card dealtCard = deck.dealCard();
        player.addCardToHand(dealtCard);

    }

    public void dealCardToAllPlayers() {
        for (Player player : this.players) {
            this.dealCardToPlayer(player);
        }
    }
//
//    public void getValueOfCardInHand(){
//        return
//    }


}
