import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    private Player player;
    private Card card;

    @Before
    public void setUp(){
        player = new Player();
        ArrayList<Card> hand = new ArrayList<Card>();
        card = new Card(SuitType.DIAMONDS, RankType.NINE);
    }

    @Test
    public void startsWithNoCard(){
        assertEquals(0, player.countHand());
    }

    @Test
    public void canAddCardToHand(){
        player.addCardToHand(card);
        assertEquals(1, player.countHand());
    }

}
