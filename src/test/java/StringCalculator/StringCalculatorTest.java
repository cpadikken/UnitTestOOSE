package StringCalculator;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringCalculatorTest {

    @Test
    public void emptyStringShouldReturnZero() { assertEquals(0, StringCalculator.add("")); }

    @Test
    public void valueOneReturnsOne() { assertEquals(1, StringCalculator.add("1")); }

    @Test
    public void valueTwoReturnsTwo() { assertEquals(2, StringCalculator.add("2")); }

    @Test
    public void valueTwelveReturnsTwelve() { assertEquals(12, StringCalculator.add("12")); }

    @Test
    public void twoPlusThreeReturnsFive() { assertEquals(5, StringCalculator.add("2,3")); }

    @Test
    public void testsNegativeNumbersShouldReturnSeven() { assertEquals(7, StringCalculator.add("13,3,-9")); }

    @Test
    public void correctValuesReturnTrue() { assertEquals(true, StringCalculator.checkValidityString("2,3")); }

    @Test
    public void checksForCommasAndShouldReturnFalse() { assertEquals(false, StringCalculator.checkForCommas("1234")); }

    @Test(expected = IllegalArgumentException.class)
    public void badInputShouldResultInIllegalArgumentException() { StringCalculator.add("Hello World");
    }

    @Test
    public void stringShouldBecomeStringArray() { assertArrayEquals(new int[] {1,2}, StringCalculator.parseStringToIntArray("1,2"));
    }

    @Test
    public void twoPlusThreeReturnsFiveFromIntArray() { assertEquals(5, StringCalculator.addNumbersUpFromIntArray(new int[]{2,3}));
    }

    @Test
    public void twoPlusThreePlusFifteenReturnTwentyFromIntArray() { assertEquals(20, StringCalculator.addNumbersUpFromIntArray(new int[]{2,3,15}));
    }
}