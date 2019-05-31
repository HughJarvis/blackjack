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

    public void createHearts(){
        for(RankType rank : RankType.values()){
            this.cards.add(new Card(SuitType.HEARTS, rank));
        }
    }

    public void createClubs(){
        for(RankType rank : RankType.values()){
            this.cards.add(new Card(SuitType.CLUBS, rank));
        }
    }

    public void createSpades(){
        for(RankType rank : RankType.values()){
            this.cards.add(new Card(SuitType.SPADES, rank));
        }
    }

    public void createDiamonds(){
        for(RankType rank : RankType.values()){
            this.cards.add(new Card(SuitType.DIAMONDS, rank));
        }
    }

    public void addAllCards(){
        this.createHearts();
        this.createClubs();
        this.createSpades();
        this.createDiamonds();
    }

    public void shuffleCards() {
        Collections.shuffle(this.cards);
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public Card dealCard() {
        return this.cards.remove(0);

    }
}
