public class Card {

    private Suit suit;
    private CardRank rank;

    public Card(Suit suit, CardRank rank){
        this.suit = suit;
        this.rank = rank;
    }

    public Suit getSuit(){
        return this.suit;
    }

    public CardRank getCardRank(){
        return this.rank;
    }

    public int getCardValue(){
        return this.rank.getValue();
    }
}


//Create a Deck class with an ArrayList of cards.
//(Deck should start of empty)
//
//Come up with a method to populate the deck of cards.
//
//Find a way to shuffle the cards.
//
//Create a method to deal a card from the deck.