import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest {


    private Card card1;
    private Card card2;
    private Card card3;
    private Card card4;
    private Deck deck;
    private Game game;
    private Player player1;
    private Player player2;
    private Player player3;
    private Dealer dealer;


    @Before
    public void setUp(){
        card1 = new Card(SuitType.HEARTS, RankType.FIVE );
        card2 = new Card(SuitType.DIAMONDS, RankType.TEN );
        card3 = new Card(SuitType.SPADES, RankType.QUEEN );
        card4 = new Card(SuitType.CLUBS, RankType.JACK );

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

    @Test
    public void canCompareHandsAndReturnWinner() {
        player1.addCardToHand(card1);
        dealer.addCardToHand(card2);
        player1.addCardToHand(card3);
        dealer.addCardToHand(card4);
        assertEquals(dealer.getHand(), game.compareHands());
    }

    @Test
    public void playerCanTwist() {
        game.dealToStartGame(player1);
        game.playerTwists(player1);
        assertEquals(3, player1.countHand());
    }

    @Test
    public void dealerCanTwist() {
        game.dealToStartGame(player1);
        game.dealerTwists();
        assertEquals(3, dealer.countHand());
    }

    @Test
    public void dealerTwistsIfHandValueGreaterThan16(){
        dealer.addCardToHand(card1);
        dealer.addCardToHand(card2);
        game.dealerStickOrTwist();
        assertEquals(3, dealer.countHand());
    }
}
