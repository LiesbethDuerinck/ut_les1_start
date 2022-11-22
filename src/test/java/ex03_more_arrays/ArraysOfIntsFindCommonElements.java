package ex03_more_arrays;

import ex3_arrays.ArrayOfInts3;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArraysOfIntsFindCommonElements {
    private final ArrayOfInts3 arrayOfInts = new ArrayOfInts3();

    @Test
    public void nullArray(){
        int result = arrayOfInts.findCommonElements(null, null);
        assertEquals(0, result);
    }

    @Test
    public void oneEmptyArray(){
        int result = arrayOfInts.findCommonElements(new int[]{}, new int[]{11, 7, 8});
        assertEquals(0, result);
    }

    @Test
    public void happyFlow(){
        int result = arrayOfInts.findCommonElements(new int[]{3, 6, 9, 12, 15}, new int[]{5, 6, 12});
        assertEquals(new int[]{6, 12}, result);
    }
}
