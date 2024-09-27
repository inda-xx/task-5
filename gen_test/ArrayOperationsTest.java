package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ArrayOperationsTest {

    @Test
    public void testSumOfArray() {
        int[] array = {1, 2, 3, 4, 5};
        assertEquals(15, ArrayOperations.sum(array));
    }

    @Test
    public void testSumOfArrayList() {
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        assertEquals(15, ArrayOperations.sum(arrayList));
    }

    @Test
    public void testArrayToListConversion() {
        int[] array = {1, 2, 3, 4};
        ArrayList<Integer> list = ArrayOperations.arrayToList(array);
        assertEquals(Arrays.asList(1, 2, 3, 4), list);
    }

    @Test
    public void testListToArrayConversion() {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        int[] array = ArrayOperations.listToArray(list);
        assertArrayEquals(new int[]{1, 2, 3, 4}, array);
    }

    @Test
    public void testMaxValueInArray() {
        int[] array = {1, 3, 2, 5, 4};
        assertEquals(5, ArrayOperations.max(array));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxValueInEmptyArray() {
        int[] array = {};
        ArrayOperations.max(array);
    }

    @Test
    public void testMinValueInList() {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(5, 3, 4, 1, 2));
        assertEquals(1, ArrayOperations.min(list));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinValueInEmptyList() {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayOperations.min(list);
    }

    @Test
    public void testExtractEvensFromArray() {
        int[] array = {1, 2, 3, 4, 5, 6};
        ArrayList<Integer> evens = ArrayOperations.extractEvens(array);
        assertEquals(Arrays.asList(2, 4, 6), evens);
    }

    @Test
    public void testCombineAndFilterUniqueElements() {
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(3, 4, 5));
        ArrayList<Integer> combined = ArrayOperations.combineAndFilter(list1, list2);
        assertEquals(Arrays.asList(1, 2, 3, 4, 5), combined);
    }
}

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;

