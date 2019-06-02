import java.util.ArrayList;
import java.util.Collections;

public class Dealer {



        private ArrayList<Card> hand;

        public Dealer(){
            this.hand = new ArrayList<Card>();
        }


//        public void dealerShuffles() {
//            this.deck.shuffleDeck();
//        }
//
//        public Card dealCard() {
//            return this.deck.getCards().remove(0);
//        }


    public ArrayList<Card> getHand() {
        return hand;
    }

    public int countHand() {
            return this.hand.size();
        }

        public void addCardToHand(Card card) {
            this.hand.add(card);
        }

        public int getHandValue() {
            int handValue = 0;
            for (Card card : this.hand){
                handValue += card.getValueFromEnum();
            }
            return handValue;
        }

    public void dealCardToPlayer(Player player1) {
    }


}
