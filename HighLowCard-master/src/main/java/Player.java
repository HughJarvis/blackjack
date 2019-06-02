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

    public ArrayList<Card> getHand() {
        return hand;
    }

    public int getHandValue() {
            int handValue = 0;
        for (Card card : this.hand){
            handValue += card.getValueFromEnum();
        }
        return handValue;
    }

    public int getHandValueAcesHigh() {
        int handValue = 0;
        for (Card card : this.hand) {
            if (card.getRank() == RankType.ACE) {
                handValue += card.getValueFromEnum() + 9;
            } else handValue += card.getValueFromEnum();

        }
        return handValue;
    }

}



