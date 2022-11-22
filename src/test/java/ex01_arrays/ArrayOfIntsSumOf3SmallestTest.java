package ex01_arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ArrayOfIntsSumOf3SmallestTest {

    private final ArrayOfInts arrayOfInts = new ArrayOfInts();

    @Test
    void happyflow() {
        int result = arrayOfInts.sumOf3SmallestInts(new int[]{1, 2, 3, 4});
        assertEquals(6, result);
    }

    @Test
    void paranoia() {
        int result = arrayOfInts.sumOf3SmallestInts(new int[]{2, 7});
        assertEquals(9, result);
    }

    @Test
    void emptyArray() {
        int result = arrayOfInts.sumOf3SmallestInts(new int[]{});
        assertEquals(0, result);
    }

    @Test
    void nullArray() {
        int result = arrayOfInts.sumOf3SmallestInts(null);
        assertEquals(0, result);
    }
}
