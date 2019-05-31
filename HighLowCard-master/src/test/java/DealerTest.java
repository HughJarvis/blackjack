import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

    public class DealerTest {

        private Dealer dealer;
        private Card card1;
        private Card card2;

        @Before
        public void setUp(){
            dealer = new Dealer();
            card1 = new Card(SuitType.DIAMONDS, RankType.NINE);
            card2 = new Card(SuitType.HEARTS, RankType.FOUR);
        }

        @Test
        public void startsWithNoCard(){
            assertEquals(0, dealer.countHand());
        }

        @Test
        public void canAddCardToHand(){
            dealer.addCardToHand(card1);
            assertEquals(1, dealer.countHand());
        }

        @Test
        public void canGetHandValue() {
            dealer.addCardToHand(card1);
            dealer.addCardToHand(card2);
            assertEquals(13, dealer.getHandValue());
        }
    }


