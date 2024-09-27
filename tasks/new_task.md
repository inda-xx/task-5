# Game Development with Java Collections

This week, we venture into the exciting world of game development, using Java collections to create a simple game application. The goal is to implement a basic game with player movement, a scoring system, and enemy interactions. Key to this challenge is the integration of Java arrays and `ArrayLists`.

### 📝 Preparation

- Carefully review the [lecture slides](https://docs.google.com/presentation/d/1qIjQ10Dy7RW00wit0Ud5vX_012pH_1chOcuvpkt03cg/edit#slide=id.p).
- Go through [Module 5: Grouping Objects](https://qbl.sys.kth.se/sections/dd1337_programming/container/grouping_objects) and answer all questions.

### ✅ Learning Goals

By the end of this exercise, you should be proficient in:

- Utilizing `Arrays` to manage fixed-size data collections.
- Understanding the `static` keyword and its usage in Java.
- Developing dynamic data models with `ArrayLists`.
- Combining loops and collections to efficiently iterate over and manipulate data.

### 🚨 Troubleshooting Guide

Follow this process if you encounter issues:

1. Browse the [posted issues](https://gits-15.sys.kth.se/inda-24/help/issues) for similar problems.
2. Post a new issue if needed, titled "Task *x*: *summary of the problem*".
3. Consult with a TA during weekly lab sessions found on the [weekly lab schedule](https://queue.csc.kth.se/Queue/INDA).

Collaborating with peers is encouraged, but ensure all work is original and that you can explain your solutions during assessments. Avoid submitting AI-generated content without understanding.

### 🏛 Assignment Overview

We focus on core Java data structures to store and organize game components. 

<details>
<summary> 📚 Working with Java Arrays </summary>

Java arrays are fixed-size containers useful for managing collections of the same type. You define an array size and populate it with elements, accessible via 0-based indexing.

```java
int[] scores = new int[10]; // Array to store scores
scores[0] = 100; // Setting the first element
```
Loops are powerful with arrays:

```java
for (int i = 0; i < scores.length; i++) {
    System.out.println(scores[i]);
}
```

Methods can operate on arrays, providing input and receiving outputs as arrays.

</details>

<details>
<summary> 📚 Understanding the static keyword </summary>

The `static` keyword associates fields and methods with the class rather than instances. Static methods do not need an object to be invoked, making them perfect for utility functions like calculations.

```java
public static int calculateScore(int[] scores) {
    // Implementation
}
```

Learn more in this [Java Tutorial](https://docs.oracle.com/javase/tutorial/java/javaOO/classvars.html).

</details>

<details>
<summary> 📚 Utilizing Java ArrayLists </summary>

`ArrayList` is part of Java's utility package, providing dynamic arrays that adjust in size as required. Perfect for cases like tracking enemy positions in a game.

```java
ArrayList<Enemy> enemies = new ArrayList<>();
enemies.add(new Enemy("Goblin"));
// Methods: add(), get(), remove(), size(), etc.
```

View the full [ArrayList Documentation](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/ArrayList.html).

</details>

## 🎮 Game Development Assignment

### Exercise 1: Setup Game Environment

Create a `Game.java` class that will house your program's execution. In this file, start by setting up the game's main environment:

```java
public class Game {
    public static void main(String[] args) {
        // Place initial game setup here
    }
}
```

### Exercise 2: Player Movement

Implement a player character that can move within a 2D grid. Use an `int[]` to represent the player's position:

```java
int[] playerPosition = {0, 0}; // x and y coordinates
```

Develop movement functions that update player position based on directional input.

Example:
```java
public static void movePlayer(int[] playerPosition, String direction) {
    // Implement logic to update playerPosition based on direction
}
```

### Exercise 3: Scoring System

Develop a scoring system using a `static` field in your `Game` class:

```java
private static int score = 0;
```

Incorporate methods to adjust the player's score when specific actions occur (e.g., collecting items).

### Exercise 4: Enemy Interactions

Utilize an `ArrayList` to manage a collection of enemies, represented by a simple `Enemy` class.

```java
ArrayList<Enemy> enemies = new ArrayList<>();
```

Develop interactions, ensuring game logic updates both player state and the list of enemies.

### Exercise 5: Combining Loops and Collections

Incorporate loops to iterate through the `enemies` list, determining interactions (e.g., removing an enemy when defeated). Use both `for` and enhanced `foreach` loops to practice different iteration styles.

### Exercise 6: Game Logic Integration

Tie all components together:

- **Player Movement**: Call movement functions based on user input.
- **Score Update**: Modify the score accordingly.
- **Enemy Handling**: Check and execute interactions.

Implement a loop that continues the game until a certain condition is met, like reaching a score threshold or expiry of a timer.

Experiment with this setup, learning how collections can efficiently manage the dynamic elements of your application. Good luck, and enjoy the process!