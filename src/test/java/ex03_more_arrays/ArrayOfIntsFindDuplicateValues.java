package ex03_more_arrays;

import ex3_arrays.ArrayOfInts3;
import org.junit.jupiter.api.Test;

public class ArrayOfIntsFindDuplicateValues {
    private final ArrayOfInts3 arrayOfInts = new ArrayOfInts3();

    @Test
    public void nullArray(){
        int result = arrayOfInts.findDuplicateValues(null);

    }
}
