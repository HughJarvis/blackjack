import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    private ArrayList<Card> cards;


    public Deck() {
        this.cards = new ArrayList<Card>();
    }

    public int countCards() {
        return this.cards.size();
    }

    public void addCard(Card card) {
        this.cards.add(card);
    }

    public void createHeartCards(){
        for(RankType rank : RankType.values()){
            this.cards.add(new Card(SuitType.HEARTS, rank));
        }
    }

    public void createClubCards(){
        for(RankType rank : RankType.values()){
            this.cards.add(new Card(SuitType.CLUBS, rank));
        }
    }

    public void createSpadeCards(){
        for(RankType rank : RankType.values()){
            this.cards.add(new Card(SuitType.SPADES, rank));
        }
    }

    public void createDiamondCards(){
        for(RankType rank : RankType.values()){
            this.cards.add(new Card(SuitType.DIAMONDS, rank));
        }
    }

    public void addAllCards(){
        this.createHeartCards();
        this.createClubCards();
        this.createSpadeCards();
        this.createDiamondCards();
    }

    public void shuffleDeck() {
        Collections.shuffle(this.cards);
    }

    public Card dealCard() {
        return this.cards.remove(0);

    }
}
