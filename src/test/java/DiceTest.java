import org.junit.Assert;
import org.junit.Test;

public class DiceTest {

    @Test
    public void DiceTest(){
        // Given
        Integer expected = 5;

        // When
        Dice dice = new Dice(expected);

        // Then
        Assert.assertEquals(dice.getNumberOfDice(), expected);
    }

    @Test
    public void DiceTest(){
        // Given
        Integer expected = 5;

        // When
        Dice dice = new Dice(expected);

        // Then
        Assert.assertEquals(dice.getNumberOfDice(), expected);
    }


    @Test
    public void tossAndSumTest(){


    }

}
