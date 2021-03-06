import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CardTest {
    Card card;
    @Before
    public void before(){
        card = new Card(SuitType.HEARTS, RankType.TEN) ;
    }
    @Test
    public void cardHasSuit(){
        assertEquals(SuitType.HEARTS, card.getSuit());
    }

    @Test
    public void cardHasRank() {
        assertEquals(RankType.TEN, card.getRank());
    }
    @Test
    public void cardHasValue(){
        assertEquals(10, card.getValue());
    }
}
