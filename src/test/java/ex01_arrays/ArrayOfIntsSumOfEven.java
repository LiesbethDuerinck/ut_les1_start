package ex01_arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayOfIntsSumOfEven {

    private final ArrayOfInts arrayOfInts = new ArrayOfInts();

    @Test
    void happyflow() {
        int result = arrayOfInts.sumOfEven(new int[]{1, 2, 2});
        assertEquals(4, result);
    }

    @Test
    void paranoia() {
        int result = arrayOfInts.sumOfEven(new int[]{2, 7, 7, 2});
        assertEquals(4, result);
    }

    @Test
    void emptyArray() {
        int result = arrayOfInts.sumOfEven(new int[]{});
        assertEquals(0, result);
    }

    @Test
    void nullArray() {
        int result = arrayOfInts.sumOfEven(null);
        assertEquals(0, result);
    }
}
