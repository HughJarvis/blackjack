import java.util.ArrayList;

public class Card {

    private SuitType suit;
    private RankType rank;
    private ArrayList<Card> hearts;

    public Card(SuitType suit, RankType rank) {
        this.suit = suit;
        this.rank = rank;
        this.hearts = new ArrayList<Card>();
    }

    public SuitType getSuit(){
        return this.suit;
    }

    public RankType getRank(){
        return this.rank;
    }

    public int getValueFromEnum() {
        return this.rank.getValue();
    }


}