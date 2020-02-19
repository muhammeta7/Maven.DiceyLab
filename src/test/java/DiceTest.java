import org.junit.Assert;
import org.junit.Test;

public class DiceTest {

    @Test
    public void DiceTest1(){
        // Given
        Integer expected = 5;

        // When
        Dice dice = new Dice(expected);

        // Then
        Assert.assertEquals(dice.getNumberOfDice(), expected);
    }

    @Test
    public void DiceTest2(){
        // Given
        Integer expected = 2;

        // When
        Dice dice = new Dice(expected);

        // Then
        Assert.assertEquals(dice.getNumberOfDice(), expected);
    }


    /*@Test
    public void tossAndSumTest(){


    }*/

}
