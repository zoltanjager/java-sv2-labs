package exceptions.sum;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class NumbersSumTest {

    @Test
    void getSumIntTest() {
        int[] numbers = {1, 2, 3};
        NumbersSum numbersSum = new NumbersSum();

        assertEquals(6, numbersSum.getSum(numbers));
    }

    @Test
    void getSumStringTest() {

        String[] numbers = {"1", "2", "3"};
        NumbersSum numbersSum = new NumbersSum();

        assertEquals(6, numbersSum.getSum(numbers));
    }

    @Test
    void getSumIntNullParameterTest(){
        NumbersSum numbersSum = new NumbersSum();

        int[] numbers = null;
        Exception ex = assertThrows(IllegalArgumentException.class,
                () -> numbersSum.getSum(numbers));
        assertEquals("Parameter is null", ex.getMessage());
    }

    @Test
    void getSumStringParameterTest(){
        NumbersSum numbersSum = new NumbersSum();

        String[] numbers = null;
        Exception ex = assertThrows(IllegalArgumentException.class,
                () -> numbersSum.getSum(numbers));
        assertEquals("Parameter is null", ex.getMessage());
    }

    @Test
    void getSumStringInvalidNumberTest(){
        NumbersSum numbersSum = new NumbersSum();

        String[] numbers = {"1", "2", "a"};
        Exception ex = assertThrows(IllegalArgumentException.class,
                () -> numbersSum.getSum(numbers));
        assertEquals("It is not a number", ex.getMessage());
    }
}