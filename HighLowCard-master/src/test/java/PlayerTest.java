import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    private Player player;
    private Card card1;
    private Card card2;

    @Before
    public void setUp(){
        player = new Player();
        card1 = new Card(SuitType.DIAMONDS, RankType.NINE);
        card2 = new Card(SuitType.HEARTS, RankType.FOUR);
    }

    @Test
    public void startsWithNoCard(){
        assertEquals(0, player.countHand());
    }

    @Test
    public void canAddCardToHand(){
        player.addCardToHand(card1);
        assertEquals(1, player.countHand());
    }

    @Test
    public void canGetHandValue() {
        player.addCardToHand(card1);
        player.addCardToHand(card2);
        assertEquals(13, player.getHandValue());


    }

    @Test
    public void canGetHand() {
        player.addCardToHand(card1);
        player.addCardToHand(card2);
        assertEquals(2, player.getHand().size());
    }
}
