import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CardTest {

    Card card;

    @Before
    public void setUp(){
        card = new Card(SuitType.HEARTS, RankType.ACE);
    }


    @Test
    public void canGetSuit(){
        assertEquals(SuitType.HEARTS, card.getSuit());
    }

    @Test
    public void canGetRank(){
        assertEquals(RankType.ACE, card.getRank());
    }

    @Test
    public void eightHasValueOf8(){
        int value = card.getValueFromEnum();
        assertEquals(1, value);
    }



    //    @Test
//    public void suitCanBeMispelled(){
//        card = new Card("Heeeaarts");
//        assertEquals("Heeeaarts", card.getSuit());
//    }




}
