import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class DeckTest {

    private Deck deck;
    private ArrayList<Card> cards;
    private Card card;




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
    public void canCreateHearts(){
        deck.createHearts();
        assertEquals(13, deck.countCards());
    }

    @Test
    public void canCreateClubs(){
        deck.createHearts();
        deck.createClubs();
        assertEquals(26, deck.countCards());
    }

    @Test
    public void canCreateSpades(){
        deck.createHearts();
        deck.createClubs();
        deck.createSpades();
        assertEquals(39, deck.countCards());
    }

    @Test
    public void canCreateDiamonds(){
        deck.createHearts();
        deck.createClubs();
        deck.createSpades();
        deck.createDiamonds();
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
        deck.shuffleCards();
    }

    @Test
    public void canGetCards() {
        deck.addAllCards();
        deck.getCards();
        assertEquals(52, deck.getCards().size());

    }

    @Test
    public void canDealcard(){
        deck.addAllCards();
        deck.dealCard();
        assertEquals(51, deck.countCards());
    }



}
