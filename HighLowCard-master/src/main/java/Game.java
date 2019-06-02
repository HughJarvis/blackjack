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

    public void dealerTakesCard() {
        Card dealersCard = deck.dealCard();
        dealer.addCardToHand(dealersCard);
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


    public void dealToStartGame(Player player) {
        this.dealCardToPlayer(player);
        this.dealerTakesCard();
        this.dealCardToPlayer(player);
        this.dealerTakesCard();
    }

    public ArrayList<Card> compareHands() {
        ArrayList<Card> winningHand = new ArrayList<Card>();
        for (Player player : this.players) {
            if ((player.getHandValue() > dealer.getHandValue() && player.getHandValue() <= 21) || (player.getHandValue() <= 21 && dealer.getHandValue() > 21)) {
                winningHand = player.getHand();
            }
            else winningHand = dealer.getHand();
        }
        return winningHand;
    }


    public void playerTwists(Player player1) {
        this.dealCardToPlayer(player1);
    }

    public void dealerTwists() {
        this.dealerTakesCard();
    }

    public void dealerStickOrTwist() {
        if (dealer.getHandValue() < 16){
            this.dealerTwists();
        }
        else this.compareHands();
    }
}
