import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class GameTest {

    private ArrayList<Player> players;
    private Deck deck;
    private Card card;
    private Game game;
    private Player player1;
    private Player player2;


    @Before
    public void setUp(){
        player1 = new Player();
        player2 = new Player();
        players = new ArrayList<Player>();
        deck = new Deck();
        game = new Game(deck);


    }

    @Test
    public void canAddPlayer(){
        game.addPlayer(player1);
        assertEquals(1, game.playersCount());
    }

    @Test
    public void canDealCardToPlayer(){
        game.addPlayer(player1);
        game.addPlayer(player2);
        deck.addAllCards();
        deck.shuffleDeck();
        game.dealCardToPlayer(player1);
        assertEquals(1, player1.countHand());
    }

    @Test
    public void canDealCardToALlPlayers(){
        game.addPlayer(player1);
        game.addPlayer(player2);
        deck.addAllCards();
        deck.shuffleDeck();
        game.dealCardToAllPlayers();
        assertEquals(1, player1.countHand());
        assertEquals(1, player2.countHand());
    }



}
