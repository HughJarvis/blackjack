import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class GameTest {


    private Deck deck;
    private Game game;
    private Player player1;
    private Player player2;
    private Player player3;
    private Dealer dealer;


    @Before
    public void setUp(){
        player1 = new Player();
        player2 = new Player();
        player3 = new Player();

        dealer = new Dealer();

        deck = new Deck();
        deck.addAllCards();
        deck.shuffleCards();

        game = new Game(dealer, deck);
        game.addPlayer(player1);

    }

    @Test
    public void canCountPlayers() {
        assertEquals(1, game.countPlayers());
    }

    @Test
    public void canAddPlayer(){
        game.addPlayer(player2);
        assertEquals(2, game.countPlayers());
    }


    @Test
    public void canDealCardToPlayer(){
        game.dealCardToPlayer(player1);
        assertEquals(1, player1.countHand());
        assertEquals(51, deck.countCards());
    }

    @Test
    public void canDealCardToDealer() {
        game.dealerTakesCard();
        assertEquals(1, dealer.countHand());
        assertEquals(51, deck.countCards());
    }

    @Test
    public void canDealTwoCardsToPlayer() {
        game.dealTwoCardsToPlayer(player1);
        assertEquals(2, player1.countHand());
        assertEquals(50, this.deck.countCards());
    }


    @Test
    public void canDealCardToAllPlayers(){
        game.addPlayer(player2);
        game.dealCardToAllPlayers();
        assertEquals(1, player1.countHand());
        assertEquals(1, player2.countHand());
        assertEquals(50, this.deck.countCards());
    }


    @Test
    public void canDealTwoCardsToAllPlayers(){
        game.addPlayer(player2);
        game.addPlayer(player3);
        game.deal2ToAllPlayers();
        assertEquals(2, player1.countHand());
        assertEquals(2, player2.countHand());
        assertEquals(2, player3.countHand());
        assertEquals(46, this.deck.countCards());
    }

    @Test
    public void canDealToStartGame() {
        game.dealToStartGame(player1);
        assertEquals(2, player1.countHand());
        assertEquals(2, this.dealer.countHand());
        assertEquals(48, this.deck.countCards());

    }
}
