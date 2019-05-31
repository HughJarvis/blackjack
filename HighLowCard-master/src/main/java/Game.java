import java.util.ArrayList;

public class Game {

    private Deck deck;
    private ArrayList<Player> players;


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

    public void dealTwoCardsToPlayer(Player player) {
        Card firstDealtCard = deck.dealCard();
        player.addCardToHand(firstDealtCard);
        Card secondDealtCard = deck.dealCard();
        player.addCardToHand(secondDealtCard);
    }

    public void deal2ToAllPlayers() {
        for (Player player : this.players) {
            this.dealTwoCardsToPlayer(player);
        }
    }
}
