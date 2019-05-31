import java.util.ArrayList;

public class Dealer {



        private ArrayList<Card> hand;

        public Dealer(){
            this.hand = new ArrayList<Card>();
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

}
