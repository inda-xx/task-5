# Programming with Collections and Static Members

This week, we delve into the world of Java collections focusing on `Arrays` and `ArrayLists`, and explore the important concept of the `static` keyword. Mastery over these concepts helps in handling data effectively and facilitates cleaner code organization.

### 📝 Preparation

- Review the [lecture slides](https://docs.google.com/presentation/d/1qIjQ10Dy7RW00wit0Ud5vX_012pH_1chOcuvpkt03cg/edit#slide=id.p)
- Familiarize yourself with [Java Collections Framework](https://docs.oracle.com/javase/tutorial/collections/intro/index.html)
- Read and complete exercises from [Module 5: Grouping Objects](https://qbl.sys.kth.se/sections/dd1337_programming/container/grouping_objects)

### ✅ Learning Goals
This week aims to develop proficiency in:

* Using and manipulating `Arrays`
* Understanding the significance and use of the `static` keyword
* Implementing and working with `ArrayLists`
* Leveraging loops effectively to manipulate collections

### 🚨 Troubleshooting Guide
If you encounter issues, here's how to navigate them:

1. Check the [posted issues](https://gits-15.sys.kth.se/inda-24/help/issues) for similar queries.
2. Post a new question via [New Issue](https://gits-15.sys.kth.se/inda-24/help/issues/new) if your issue is unique. Include a descriptive title.
3. Engage with Teaching Assistants during [weekly lab sessions](https://queue.csc.kth.se/Queue/INDA).

Discuss with peers for clarity, **but refrain from sharing answers!** Using AI tools for understanding concepts is okay, **just ensure the solutions are genuinely yours.**

### 🏛 Assignment

Java provides the `Array` and `ArrayList` structures to manage collections of objects efficiently. We'll explore these through interesting exercises that also introduce the importance of static class members.

---

### 📚 Java Arrays Synopsis

Java arrays offer a simple structure to organize data. Indexing in arrays starts at 0, meaning the first element is accessed with index 0.

```java
int[] numbers = {1, 2, 3, 4, 5};
System.out.println(numbers[0]); // Outputs: 1
```

**Enhanced for loop**: This loop simplifies iterations over collections:

```java
for (int num : numbers) {
    System.out.println(num);
}
```

**Static Methods**: Static methods belong to the class rather than a specific instance, making them accessible without an object creation:

```java
public class MathUtils {
    
    public static int square(int x) {
        return x * x;
    }
}

// Call without an instance
int result = MathUtils.square(5);
```

---

### 📚 Java's ArrayLists

`ArrayList` is part of Java's collections framework providing dynamic resizing capabilities, unlike fixed-size arrays.

```java
import java.util.ArrayList;

ArrayList<Integer> list = new ArrayList<>();
list.add(42);
System.out.println(list.get(0)); // Outputs: 42
```

`ArrayList` is generic and designed to hold objects, not primitive types. Thus, wrapper classes are used, like `Integer` for `int`.

---

## Exercises

### 🔹 Exercise 1: Sum of Arrays

Create a static method that computes the sum of elements in an `int[]`.

```java
public static int sum(int[] array)
```

Test this method by calling it with, for example, the array `{4, 5, 6}`; the output should be `15`.

### 🔹 Exercise 2: Sum of ArrayLists

Implement a method to calculate the sum of integers in an `ArrayList<Integer>`.

```java
public static int sum(ArrayList<Integer> arrayList)
```

Make use of `for` or `foreach` loops. Try the solution with different data sets to ensure correctness.

### 🔹 Exercise 3: Static Counting

Add a method to count how many times a static method is invoked. Consider a static field `static int count` to record invocations, initializing it when the class is first loaded.

```java
public static void incrementCounter()
```

### 🔹 Exercise 4: Array to List Conversion

Write a method that converts an `int[]` into an `ArrayList<Integer>` and preserves the order.

```java
public static ArrayList<Integer> arrayToList(int[] array)
```

### 🔹 Exercise 5: List to Array Conversion

Conversely, create a method that converts an `ArrayList<Integer>` to an `int[]`.

```java
public static int[] listToArray(ArrayList<Integer> list)
```

### 🔹 Exercise 6: Static Utility Class

Create a utility class `ArrayUtils` with static methods:

1. `public static int max(int[] array)`: Finds the largest number in an array.
2. `public static int min(ArrayList<Integer> list)`: Finds the smallest number in a list.

### 🔹 Exercise 7: Even Number Extraction

Design a method to extract all even numbers from an `int[]` and return them in a new `ArrayList<Integer>`.

```java
public static ArrayList<Integer> extractEvens(int[] array)
```

### 🔹 Exercise 8: Combine and Filter

Implement a method combining two `ArrayList<Integer>` and then filtering out any duplicates. Ensure uniqueness in the resulting list.

```java
public static ArrayList<Integer> combineAndFilter(ArrayList<Integer> list1, ArrayList<Integer> list2)
```

---

Through completing these exercises, you'll be equipped with vital skills in handling arrays, utilizing static methods, and effective collection manipulation in Java. Make sure to test your implementations comprehensively to gain confidence in your solutions!