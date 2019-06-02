import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

    public class DealerTest {

        private Card card1;
        private Card card2;
        private Deck deck;
        private Dealer dealer;

        @Before
        public void setUp(){
            card1 = new Card(SuitType.DIAMONDS, RankType.NINE);
            card2 = new Card(SuitType.HEARTS, RankType.FOUR);
            deck = new Deck();
            deck.addAllCards();
            dealer = new Dealer();
        }

//        @Test
//        public void canDealCard() {
//            dealer.dealCard();
//            assertEquals(51, deck.countCards());
//        }

        @Test
        public void startsWithNoCardinHand(){
            assertEquals(0, dealer.countHand());
        }

        @Test
        public void canAddCardToHand(){
            dealer.addCardToHand(card1);
            assertEquals(1, dealer.countHand());
        }

        @Test
        public void canGetHand() {
            dealer.addCardToHand(card1);
            dealer.addCardToHand(card2);
            assertEquals(2, dealer.getHand().size());
        }

        @Test
        public void canGetHandValue() {
            dealer.addCardToHand(card1);
            dealer.addCardToHand(card2);
            assertEquals(13, dealer.getHandValue());
        }
    }


