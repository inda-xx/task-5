import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;

public class ArrayOperations {

    // Exercise 1: Sum of Arrays
    public static int sum(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }

    // Exercise 2: Sum of ArrayLists
    public static int sum(ArrayList<Integer> arrayList) {
        int sum = 0;
        for (int num : arrayList) {
            sum += num;
        }
        return sum;
    }

    // Exercise 3: Static Counting
    private static int count = 0;

    public static void incrementCounter() {
        count++;
    }

    public static int getCounter() {
        return count;
    }

    // Exercise 4: Array to List Conversion
    public static ArrayList<Integer> arrayToList(int[] array) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int num : array) {
            list.add(num);
        }
        return list;
    }

    // Exercise 5: List to Array Conversion
    public static int[] listToArray(ArrayList<Integer> list) {
        int[] array = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }
        return array;
    }

    // Exercise 6: Static Utility Class - max and min
    public static int max(int[] array) {
        if (array.length == 0) {
            throw new IllegalArgumentException("Array is empty.");
        }
        int max = array[0];
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static int min(ArrayList<Integer> list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("ArrayList is empty.");
        }
        int min = list.get(0);
        for (int num : list) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    // Exercise 7: Even Number Extraction
    public static ArrayList<Integer> extractEvens(int[] array) {
        ArrayList<Integer> evens = new ArrayList<>();
        for (int num : array) {
            if (num % 2 == 0) {
                evens.add(num);
            }
        }
        return evens;
    }

    // Exercise 8: Combine and Filter
    public static ArrayList<Integer> combineAndFilter(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        HashSet<Integer> set = new HashSet<>(list1);
        set.addAll(list2);
        return new ArrayList<>(set);
    }
}