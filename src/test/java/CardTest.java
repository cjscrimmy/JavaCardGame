import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CardTest {
   private Card card;

    @Before
    public void before(){
        card = new Card(Suit.CLUBS, CardRank.SIX);
    }

    @Test
    public void canGetSuit(){
        assertEquals(Suit.CLUBS, card.getSuit());
    }

    @Test
    public void canGetRank(){
        assertEquals(CardRank.SIX, card.getCardRank());
    }

    @Test
    public void sixOfClubsHasValueOfSix(){
        assertEquals(6, card.getCardValue());
    }


}
