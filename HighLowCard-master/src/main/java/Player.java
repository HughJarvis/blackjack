import java.util.ArrayList;

public class Player {

    private ArrayList<Card> hand;

    public Player(){
        this.hand = new ArrayList<Card>();
    }


    public int countHand() {
        return this.hand.size();
    }

    public void addCardToHand(Card card) {
        this.hand.add(card);
    }

//    public void seeHand(){
//        this.hand.rank.getvalue();
//    }
}
