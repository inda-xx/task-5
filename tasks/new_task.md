# Java Game Development

This week's task will have you building a simple game application in Java. This exercise will help solidify your understanding of Java collections, specifically working with `Arrays` and `ArrayLists`. Additionally, the task will cover the use of the `static` keyword, as well as combining loops and collections to achieve a comprehensive solution.

### 📝 Preparation

- Review the [lecture slides](https://docs.google.com/presentation/d/1qIjQ10Dy7RW00wit0Ud5vX_012pH_1chOcuvpkt03cg/edit#slide=id.p) to refresh your knowledge about Java collections and object-oriented programming.
- Complete the questions in [Module 5: Grouping Objects](https://qbl.sys.kth.se/sections/dd1337_programming/container/grouping_objects) to ensure you understand grouping elements using collections.

### ✅ Learning Goals

This week, you will achieve the following learning goals:

- Mastery of working with `Arrays`.
- Comprehension of the `static` keyword and its implications.
- Practical experience with `ArrayLists`.
- Integration of loops and collections in Java.

### 🚨 Troubleshooting Guide

If you encounter issues or have questions, follow these steps:
1. Review [this week's issues](https://gits-15.sys.kth.se/inda-24/help/issues) to see if anyone else has faced similar problems.
2. If unresolved, post a question yourself by creating a [New Issue](https://gits-15.sys.kth.se/inda-24/help/issues/new). Ensure your title begins with "Task *x*: *summary of problem here*".
3. Consult with a TA during [weekly lab sessions](https://queue.csc.kth.se/Queue/INDA). Refer to your schedule for lab timings.

### 🏛 Game Development Project

You'll develop a simple game that incorporates player movement, a scoring system, and enemy interactions. This will require an understanding of Java arrays, array lists, and static methods.

<details>
<summary> 📚 Brief on Java's Arrays </summary>

Arrays in Java can be utilized to store collections of data in a fixed-size format. Here's a quick reminder of array usage:

```java
// Create an array
int[] scores = new int[4]; // Initializes an array that can hold 4 integers

// Direct assignment
int[] levels = {0, 1, 2, 3};

// Iterating using a for loop
for (int i = 0; i < levels.length; i++) {
    System.out.println("Level: " + levels[i]);
}
```

Remember, arrays can interact with methods:

```java
// Method returning the average score
public static double calculateAverage(int[] scores) {
    double total = 0;
    for (int score : scores) {
        total += score;
    }
    return total / scores.length;
}
```
</details>

<details>
<summary> 📚 Arrays versus ArrayLists </summary>

While arrays have a fixed size, `ArrayLists` are dynamic and part of Java’s collection framework:

```java
import java.util.ArrayList;

ArrayList<String> enemyNames = new ArrayList<>();
enemyNames.add("Goblin");
enemyNames.add("Orc");

// Iterating through ArrayList with a for-each loop
for (String enemy : enemyNames) {
    System.out.println("Enemy: " + enemy);
}
```

This adaptability makes `ArrayLists` preferable for situations where the collection size isn’t known beforehand.
</details>

<details>
<summary> 📚 Understanding the Static Keyword </summary>

Methods and fields marked as `static` belong to the class, not specific objects:

```java
public class GameConfig {
    public static int globalDifficulty = 3; // Shared among all instances

    public static int getDifficulty() {
        return globalDifficulty;
    }
}

// Static method usage
int difficulty = GameConfig.getDifficulty();
```
</details>

### 🕹️ Game Mechanics Development Task

#### Exercise 1: Player Movement
Create a `Player` class to manage player positions using an `Array`:

```java
public class Player {
    private int[] position = {0, 0}; // X and Y coordinates

    public void move(int x, int y) {
        position[0] += x;
        position[1] += y;
    }
    
    public int[] getPosition() {
        return position;
    }
}
```

#### Exercise 2: Scoring System
Design a `ScoreBoard` using the `static` keyword and `ArrayList` to manage scores:

```java
import java.util.ArrayList;

public class ScoreBoard {
    private static ArrayList<Integer> scores = new ArrayList<>();

    public static void addScore(int score) {
        scores.add(score);
    }

    public static double getAverageScore() {
        int total = 0;
        for (int score : scores) {
            total += score;
        }
        return total / (double) scores.size();
    }
}
```

#### Exercise 3: Enemy Interactions
Implement an `Enemy` class, using `ArrayLists` to track enemy states:

```java
import java.util.ArrayList;

public class Enemy {
    private static ArrayList<int[]> enemyPositions = new ArrayList<>();

    public static void addEnemy(int x, int y) {
        enemyPositions.add(new int[]{x, y});
    }

    public static boolean detectCollision(int[] playerPosition) {
        for (int[] enemyPosition : enemyPositions) {
            if (enemyPosition[0] == playerPosition[0] && enemyPosition[1] == playerPosition[1]) {
                return true; // Collision detected
            }
        }
        return false;
    }
}
```

### 🎉 Bringing It All Together
Create a `Main` class to integrate the components:

```java
public class Main {
    public static void main(String[] args) {
        // Player Movement
        Player player = new Player();
        player.move(1, 1);

        // Update Score
        ScoreBoard.addScore(10);

        // Enemy Interactions
        Enemy.addEnemy(1, 1);
        if (Enemy.detectCollision(player.getPosition())) {
            System.out.println("Collision occurred!");
        }

        // Display current average score
        System.out.println("Average Score: " + ScoreBoard.getAverageScore());
    }
}
```

Add complexity by dynamically adding scores, moving players, and interacting with enemies to deepen your understanding of combining loops and collections. This task will also require debugging and ensuring efficient collection management, preparing you for more advanced topics in Java programming.