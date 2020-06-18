import java.util.ArrayList;

public class Deck {

    private ArrayList<Card> cards;

    public Deck(){
        this.cards = new ArrayList<Card>();
    }

    public int deckCardCount(){
        return this.cards.size();
    }

    public void addCard(Card card){
        cards.add(card);
    }

    public void buildDeck(){
        Card newCard;

        for (int i = 0; i < Suit.values().length ; i++) {
            for (int j = 0; j < CardRank.values().length; j++) {
                newCard = new Card(Suit.values()[i], CardRank.values()[j]);
                cards.add(newCard);
            }
        }
    }

    public Card removeCard(){
       return this.cards.remove(0);
    }

//    public void shuffleDeck() {
//        cards.shuffle();
//    }

//    public void shuffleDeck2(ArrayList cards){
//        Collections.shuffle(cards);
//    }



}
