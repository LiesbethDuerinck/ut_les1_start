package ex01_arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;

public class ArrayOfInts {
    public int sumOfInts(int[] arrayOfInts) {
        if (arrayOfInts == null) return 0;
        int sum = 0;
        for (int i : arrayOfInts)
            sum += i;
        return sum;
    }

    public int sumOf3SmallestInts(int[] arrayOfInts) {
        if (arrayOfInts == null) return 0;
        int[] copy = Arrays.copyOf(arrayOfInts, arrayOfInts.length);
        Arrays.sort(copy);
        return sumOfInts(Arrays.copyOf(copy, 3));
    }

    public int sumOfEven(int[] arrayOfInts) {
        if (arrayOfInts == null) return 0;
        int[] even = new int[arrayOfInts.length];
        int evenLength = 0;
        for (int i : arrayOfInts)
            if (i % 2 == 0) even[evenLength++] = i;
        return sumOfInts(even);
    }

    public int sumOfXLargest(int[] arrayOfInts, int x) {
        if (arrayOfInts == null) return 0;

        if (x > arrayOfInts.length) x = arrayOfInts.length;
//      int startIndex = Math.max(0, arrayOfInts.length-x);

        int[] copy = Arrays.copyOf(arrayOfInts, arrayOfInts.length);
        Arrays.sort(copy);
        return sumOfInts(Arrays.copyOfRange(copy, copy.length - x, copy.length));
    }

    public int countMostPopularNumber(int[] arrayOfInts){
        if (arrayOfInts == null) return 0;
        HashMap<Integer, Integer> counter = new HashMap<Integer, Integer>();
        for(Integer i : arrayOfInts){
           counter.put(i, counter.getOrDefault(i, 0)+1);
        }
        Collection<Integer> values = counter.values();
        int max = 0;
        for(Integer v : values) if(v > max) max = v;
        return max;
    }

    public static void main(String[] args) {
        ArrayOfInts ex1 = new ArrayOfInts();
        int result = ex1.sumOfInts(new int[]{1, 2, 3, 4});
        System.out.println(result);
    }
}
