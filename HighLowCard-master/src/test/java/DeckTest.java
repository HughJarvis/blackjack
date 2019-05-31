import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class DeckTest {

    Deck deck;
    ArrayList<Card> cards;
    Card card;




    @Before
    public void setUp(){
        cards = new ArrayList<Card>();
        deck = new Deck();
        card = new Card(SuitType.CLUBS, RankType.JACK);

    }

    @Test
    public void cardsArrayStartsEmpty(){
        assertEquals(0, deck.countCards());
    }

    @Test
    public void canAddaCardToDeck(){
        deck.addCard(card);
        assertEquals(1, deck.countCards());
    }

    @Test
    public void canCreateHeartCards(){
        deck.createHeartCards();
        assertEquals(13, deck.countCards());
    }

    @Test
    public void canCreateClubCards(){
        deck.createHeartCards();
        deck.createClubCards();
        assertEquals(26, deck.countCards());
    }

    @Test
    public void canCreateSpadeCards(){
        deck.createHeartCards();
        deck.createClubCards();
        deck.createSpadeCards();
        assertEquals(39, deck.countCards());
    }

    @Test
    public void canCreateDiamondCards(){
        deck.createHeartCards();
        deck.createClubCards();
        deck.createSpadeCards();
        deck.createDiamondCards();
        assertEquals(52, deck.countCards());
    }

    @Test
    public void canAddAllCards(){
        deck.addAllCards();
        assertEquals(52, deck.countCards());
    }

    @Test
    public void canShuffleCards(){
        deck.addAllCards();
        deck.shuffleDeck();
    }

    @Test
    public void canDealcard(){
        deck.addAllCards();
        deck.shuffleDeck();
        deck.dealCard();
        assertEquals(51, deck.countCards());
    }



//    @Test
//    public void canCreateAllHearts(){
//        deck.createHearts();
//        assertEquals(13, deck.countCards());
//    }
}
