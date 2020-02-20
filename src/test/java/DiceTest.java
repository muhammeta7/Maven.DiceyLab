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
    public void tossAndSumTest(){

        // Given
        Integer numberOfDice = 2;
        Dice newDice = new Dice(2);
        Integer upperRange = numberOfDice * 6;

        // When
        Integer actual = newDice.tossAndSum();

        // Then
        Assert.assertTrue(actual >= numberOfDice && actual <= upperRange);

    }

}
