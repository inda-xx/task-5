# Building a Simple Game Application

This week, you'll venture into creating a basic game application using Java, focusing on essential programming concepts and collections to manage game elements effectively.

### 📝 Preparation

- Review the [lecture slides on Game Development Basics](https://docs.google.com/presentation/d/example)
- Complete the reading and questions in [Module 6: Interactive Applications](https://qbl.sys.kth.se/sections/dd1337_programming/interactive_apps)

### ✅ Learning Goals

This week's learning goals will include:

* Working with `Arrays`
* Understanding the `static` keyword
* Working with `ArrayLists`
* Combining loops and collections to manipulate and manage game elements

### 🚨 Troubleshooting Guide

If you encounter any issues or have questions, follow this procedure:

1. Review this week's [common issues](https://gits-15.sys.kth.se/inda-24/help/issues).
2. Post a question by creating a [New Issue](https://gits-15.sys.kth.se/inda-24/help/issues/new) with a descriptive title beginning with "Task: Issue".
3. Seek assistance from a TA during the [weekly lab session](https://queue.csc.kth.se/Queue/INDA). Check your schedule for timings.

Feel free to discuss concepts with your peers, **but avoid sharing exact solutions!** Similarly, AI tools can aid understanding, **but solutions must be your own** and explainable during evaluations.

### 🏛 Assignment: Simple Game Application

In this assignment, you'll implement a simple 2D game featuring player movement, a scoring system, and enemy interactions using the following Java classes and concepts: `Arrays`, the `static` keyword, `ArrayList`, and loops.

<details>
<summary> 📚 A summary of Java's Arrays </summary>

Arrays in Java provide a way to store multiple items of the same type:

```java
int[] scores = {0, 0, 0}; // An array to keep track of player scores
```

Arrays are 0-indexed, meaning the first element is accessed with index 0.

```java
scores[0] = 10; // Set the first player's score
```

Learn more about arrays in the [Oracle Tutorials](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/arrays.html).

---
</details>

<details>
<summary> 📚 Using ArrayLists </summary>

Java's `ArrayList` class offers a flexible way to handle a growing list of elements:

```java
import java.util.ArrayList;

ArrayList<String> enemyList = new ArrayList<>();
enemyList.add("Goblin");
```

More about `ArrayList`: [Oracle Documentation](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/ArrayList.html).

---
</details>

<details>
<summary> 📚 The static keyword </summary>

`static` fields and methods belong to the class itself rather than an instance, useful for shared resources or utility methods:

```java
public static void updateScores(int[] scores, int player, int points) {
    scores[player] += points;
}
```

More about `static`: [Java Official Tutorial](https://docs.oracle.com/javase/tutorial/java/javaOO/classvars.html).

---
</details>

### 🌟 Game Development Exercises

#### Exercise 1: Set Up Game Environment

Create a class `Game` with a static integer array called `scores` to track the scores of up to 3 players. Initialize their scores to zero.

```java
public static int[] scores = new int[3];
```

#### Exercise 2: Player Movement

Implement a method `movePlayer` to simulate player movement across a grid represented by a 2D integer array (`board`). The player begins at a starting position `[0][0]`.

```java
public static void movePlayer(int[][] board, int x, int y) {
    board[x][y] = 1; // Mark new position on the board
}
```

Use loops to manage player movements.

#### Exercise 3: Scoring System

Add a method `updateScore` to update a player's score when they reach certain positions on the board.

```java
public static void updateScore(int playerIndex) {
    scores[playerIndex] += 10; // Increase the player’s score by 10
}
```

Combine this with loops to demonstrate scoring after a player makes a valid move.

#### Exercise 4: Manage Enemies

Use `ArrayList` to keep track of enemies appearing at random positions on the board. Implement a method `spawnEnemy` to randomly place an enemy.

```java
public static ArrayList<int[]> enemies = new ArrayList<>();

public static void spawnEnemy(int[][] board) {
    // Code to add a new enemy at a random position
}
```

Make sure the enemy list updates as enemies are added.

#### Exercise 5: Interact with Enemies

Create a method that checks for interaction with an enemy based on the player’s position and updates scores accordingly.

```java
public static void checkEnemyInteraction(int[][] board, ArrayList<int[]> enemies, int playerX, int playerY) {
    for (int[] enemy : enemies) {
        if (enemy[0] == playerX && enemy[1] == playerY) {
            scores[playerIndex] -= 5; // Deduct points for interacting with an enemy
        }
    }
}
```

Combine these elements with loops and collection operations to handle interactions effectively.

#### Exercise 6: Display Scores

After implementing gameplay logic, add a method to display current scores using a loop.

```java
public static void displayScores() {
    for (int score : scores) {
        System.out.println("Player Score: " + score);
    }
}
```

Integrate these exercises by ensuring you have a coherent and functional game application. Test thoroughly to confirm all features work as expected.

---

With these exercises, you'll explore key concepts and strengthen your Java programming skills, while creating a simple but interactive game. Enjoy coding! 🎮