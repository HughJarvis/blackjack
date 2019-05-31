import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class GameTest {

   // private ArrayList<Player> players;
    private Deck deck;
    private Game game;
    private Player player1;
    private Player player2;
    private Player player3;


    @Before
    public void setUp(){
        player1 = new Player();
        player2 = new Player();
        player3 = new Player();
        // players = new ArrayList<Player>();
        deck = new Deck();
        game = new Game(deck);

        game.addPlayer(player1);
        game.addPlayer(player2);
        deck.addAllCards();
        deck.shuffleDeck();

    }

    @Test
    public void canAddPlayer(){
        game.addPlayer(player3);
        assertEquals(3, game.playersCount());
    }

    @Test
    public void canDealCardToPlayer(){
        game.dealCardToPlayer(player1);
        assertEquals(1, player1.countHand());
    }

    @Test
    public void canDealCardToAllPlayers(){
        game.dealCardToAllPlayers();
        assertEquals(1, player1.countHand());
        assertEquals(1, player2.countHand());
        assertEquals(50, this.deck.countCards());
    }


    @Test
    public void canDealTwoCardsToPlayer() {
        game.dealTwoCardsToPlayer(player1);
        assertEquals(2, player1.countHand());
        assertEquals(50, this.deck.countCards());
    }


    @Test
    public void canDealTwoCardsToAllPlayers(){
        game.deal2ToAllPlayers();
        assertEquals(2, player1.countHand());
        assertEquals(2, player2.countHand());
        assertEquals(48, this.deck.countCards());
    }


}
