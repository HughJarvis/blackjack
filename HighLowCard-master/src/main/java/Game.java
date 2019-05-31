import java.util.ArrayList;

public class Game {

    private Deck deck;
    private ArrayList<Player> players;
    private Dealer dealer;


    public Game(Dealer dealer, Deck deck){
        this.players = new ArrayList<Player>();
        this.dealer = dealer;
        this.deck = deck;
    }


    public void addPlayer(Player player) {
        this.players.add(player);
    }


    public int countPlayers() {
        return this.players.size();
    }

    public void dealCardToPlayer(Player player) {
        Card cardDealt = deck.dealCard();
        player.addCardToHand(cardDealt);
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
