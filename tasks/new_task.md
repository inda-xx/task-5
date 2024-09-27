# 🎮 Simple Game Application: Arrays, ArrayLists, and `static` Mastery

This task invites you to create a simple game application in Java, integrating essential programming concepts while building an interactive experience with player movement, a scoring system, and enemy interactions. You'll delve into working with `Arrays`, `ArrayLists`, and understanding the `static` keyword, alongside combining loops and collections to achieve the game's functionalities.

### 📝 Preparation

- Review the [lecture slides](https://docs.google.com/presentation/d/1qIjQ10Dy7RW00wit0Ud5vX_012pH_1chOcuvpkt03cg/edit#slide=id.p)
- Explore [Module 6: Game Development and Data Structures](https://qbl.sys.kth.se/sections/dd1337_programming/game_dev/data_structures)

### ✅ Learning Goals
By the end of this assignment, you should be able to:

- Implement and manipulate `Arrays` in Java.
- Use the `static` keyword appropriately in classes and methods.
- Work with `ArrayLists` and understand their dynamic nature.
- Combine loops and collections to animate game logic.

### 🚨 Troubleshooting Guide

1. Review this week's [posted issues](https://gits-15.sys.kth.se/inda-24/help/issues). Check if others are experiencing similar challenges.
2. Post a query with a descriptive title using [New Issue](https://gits-15.sys.kth.se/inda-24/help/issues/new) if your issue isn't addressed.
3. Talk to a TA during [weekly lab sessions](https://queue.csc.kth.se/Queue/INDA). Consult your schedule for details.

We urge collaboration with peers for concept discussions, **but avoid sharing direct answers**. Using AI tools for explanations is allowed, **but ensure solutions submitted are your own work**.

### 🏛 Assignment Overview

You'll develop a simple game involving player movement and interactions with enemies. This project will solidify your understanding of Java arrays, the power of collections with `ArrayList`s, and static members.

<details>
<summary> 📚 Understanding Arrays </summary>

Arrays are fixed-size data structures used to store multiple items of the same type in Java. Here's an example of array declaration and initialization:

```java
public class GameArrayExample {
    public static void main(String[] args) {
        int[] scores = {10, 20, 30, 40};
        // Iterate over array
        for (int score : scores) {
            System.out.println("Score: " + score);
        }
    }
}
```
</details>

<details>
<summary> 📚 The Role of the `static` Keyword </summary>

The `static` keyword in Java is used for variables and methods shared across all instances of a class. Static members can be accessed directly via the class without needing an instance.

```java
public class GameUtil {
    public static int maxScore = 100;

    public static void displayMaxScore() {
        System.out.println("Max Score: " + maxScore);
    }
}
```
Read more in the [Java Static Guide](https://docs.oracle.com/javase/tutorial/java/javaOO/classvars.html).
</details>

<details>
<summary> 📚 Dynamic Data with ArrayLists </summary>

An `ArrayList` is part of Java's `java.util` package and allows dynamic resizing. Unlike regular arrays, `ArrayList`s can grow as items are added or removed.

```java
import java.util.ArrayList;

public class GameArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> players = new ArrayList<>();
        players.add("Player1");
        players.add("Player2");
        System.out.println("Players: " + players);
    }
}
```
</details>

### 💻 Implementation Tasks

#### Task 1: Initial Setup

- Create a class called `Game.java` as your main starting point.
- Implement a simple text-based menu to control game start and exit.

#### Task 2: Player Movement with Arrays

- Implement an array to track the player's position on a grid (e.g., `[x, y]` coordinates).
- Create functions to move the player up, down, left, and right.
  
```java
public static int[] playerPosition = {0, 0}; // Static position array

public static void moveUp() {
    playerPosition[1] += 1;
}
```

#### Task 3: Scoring System using Static Keyword

- Create a static variable `score` to hold the player's score.
- Implement methods to update and display the score.

#### Task 4: Enemies with ArrayLists

- Use an `ArrayList` to manage enemy positions.
- Implement methods to add and remove enemies dynamically.
  
```java
public static ArrayList<int[]> enemies = new ArrayList<>(); // List to track enemies

public static void spawnEnemy(int x, int y) {
    enemies.add(new int[]{x, y});
}
```

#### Task 5: Combine Loops and Collections for Interactions

- Implement a loop to check interactions between the player and enemies.
- Deduct scores on collision or add new game features like power-ups.

```java
for (int[] enemyPosition : enemies) {
    if (Arrays.equals(playerPosition, enemyPosition)) {
        System.out.println("Enemy encountered!");
        // Deduct score or implement interaction logic here
    }
}
```

<details>
<summary> 🛠 Example Interaction Flow </summary>

Simulate game events such as:

```java
public static void gameLoop() {
    while (true) {
        // Move player and update game state
        moveUp();
        checkInteractions();
        // ... Game continues
    }
}
```
</details>

#### 📈 Extensions (Optional)

- Enhance the game with simple graphics using `Graphics2D` or a graphics library.
- Add levels and complexity as the player's score increases.

### 🌟 Goal Review

By completing this task, you will have developed a basic framework for a simple game application using Java's `Arrays`, `ArrayList`s, and static methods. This project integrates vital programming concepts and encourages you to explore Java's extensive capabilities.

This task is crafted to challenge you and improve your programming proficiency, focusing on every detail to ensure a comprehensive understanding. Remember, practice and hands-on coding are key to mastering these concepts. Enjoy developing your game! 🚀