# Game Development Basics 🎮

This week you'll learn how to make a simple game application using Java. You'll explore key programming concepts such as player movement, scoring systems, and enemy interactions. We'll focus on using data structures such as `Arrays` and `ArrayLists`, and you'll gain an understanding of how to efficiently manage in-game data.

### 📝 Preparation

- Review the [lecture slides on Collections and Basic Game Concepts](https://docs.google.com/presentation/d/1qIjQ10Dy7RW00wit0Ud5vX_012pH_1chOcuvpkt03cg/edit#slide=id.p).
- Ensure you understand Java's `static` keyword by reviewing the [lecture slides on Class and Object Design](https://docs.oracle.com/javase/tutorial/java/javaOO/classvars.html).
- Familiarize yourself with [Arrays in Java](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/arrays.html) and [ArrayLists](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/ArrayList.html).

### ✅ Learning Goals

This week's learning goals include:

- Working with `Arrays`
- Understanding the `static` keyword
- Working with `ArrayLists`
- Combining loops and collections

### 🚨 Troubleshooting Guide

If you need help, try these steps:

1. Check the week's [posted issues](https://gits-15.sys.kth.se/inda-24/help/issues).
2. Post your own question if it's not already covered by creating a [New Issue](https://gits-15.sys.kth.se/inda-24/help/issues/new).
3. Visit a TA during the [weekly lab](https://queue.csc.kth.se/Queue/INDA) for personal guidance.

Remember to collaborate and discuss with classmates, but ensure that your solutions are your own and can be explained by you.

### 🎯 Assignment

In this assignment, you'll create a simple 2D game application. Your game will feature player movement, scoring, and interactions with enemies. Let's break it down step by step:

### 📚 Background

The goal of this assignment is to integrate several programming concepts into a single project. You'll use Java data structures like `Arrays` and `ArrayLists` to manage game elements and practice using loops to control game logic. You'll also explore the use of the `static` keyword to manage data shared across instances.

### 🏆 Essential Task: Game Application

Follow these detailed exercises to develop your game:

#### Exercise 1: Set Up Your Game World 🌍

1. **Design your game world** as a 2D grid. Use a 10x10 grid for simplicity.
2. **Use an `int[][] grid` to represent the game space**. Each cell in the grid can have different values indicating empty space, player position, or enemy presence.

```java
public class GameWorld {
    private static final int SIZE = 10;
    private static final int PLAYER = 1;
    private static final int ENEMY = 2;
    
    private int[][] gameGrid = new int[SIZE][SIZE];
    
    // Initialize your game world
    public GameWorld() {
        // Set a starting position for the player
        // Place enemies in the grid
    }
}
```

#### Exercise 2: Player Movement 🚶‍♂️

3. **Implement a method to move the player** within the grid: 

Method header:
```java
public void movePlayer(char direction)
```
- Use 'W', 'A', 'S', 'D' inputs to represent movement up, left, down, and right.

```java
for (int i = 0; i < SIZE; i++) {
    for (int j = 0; j < SIZE; j++) {
        if (gameGrid[i][j] == PLAYER) {
            // Move the player based on input
            break;
        }
    }
}
```

#### Exercise 3: Scoring System 🏅

4. **Create a scoring system to keep track of player's score**. Use a `static int score` field.
5. **Increase the score** each time a player 'captures' an enemy by moving to a cell occupied by the enemy.

```java
public class GameWorld {
    private static int score = 0;

    // Call this when the player captures an enemy
    public static void increaseScore() {
        score++;
    }
}
```

#### Exercise 4: Enemy Interactions 👾

6. **Place multiple enemies in the grid**. Use an `ArrayList<int[]>` to maintain enemy positions:

```java
ArrayList<int[]> enemies = new ArrayList<>();
```

7. **Implement enemy movement** using a loop that randomly changes their position:

```java
for (int[] enemy : enemies) {
    // Randomly update enemy position
}
```

8. **Ensure player and enemies do not occupy the same position without interaction** by checking positions using loops and conditions.

#### Exercise 5: Victory Condition 🎉

9. **Create a victory condition** that is triggered when the player captures all enemies.

```java
public boolean checkVictory() {
    return enemies.isEmpty();
}
```

### 📦 Final Submission

Package your classes in a project, ensuring methods are well-documented and code is cleanly structured. Offer instructions on how a player can interact with your game (e.g., input formats).

### 🔍 Reflection

After completing the exercises, consider how the use of static fields, arrays, and array lists affected your program design and efficiency. Share insights in your learning reflection journal.

Now, dive into the game development world, apply your programming knowledge, and have fun creating your interactive game! 🎮🚀