import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeckTest {

    private Deck deck;
    private Card card1;

    @Before
    public void before(){
        deck = new Deck();
        card1 = new Card();
    }

    @Test
    public void deckStartsEmpty(){
        assertEquals(0, deck.deckCardCount());
    }

    @Test
    public void canAddCardToDeck(){
        deck.addCard(card1);
        assertEquals(1, deck.deckCardCount());
    }

    @Test
    public void canBuildDeck(){
        deck.buildDeck();
        assertEquals(52, deck.deckCardCount());
    }

    @Test
    public void canRemoveCardFromDeck(){
        deck.buildDeck();
        deck.removeCard();
        assertEquals(51, deck.deckCardCount());
    }

    @Test
    public void canShuffleCards(){
        deck.buildDeck();
        deck.shuffleDeck();
        assertEquals(, deck.)
    }
}
