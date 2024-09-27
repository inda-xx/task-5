# Creating a Simple Game: Arrays, ArrayLists, and More!

Welcome to this week's programming challenge where you will create a simple game application. This task will help you understand Java collections like `Array` and `ArrayList`, and learn about concepts such as player movement, scoring system, and enemy interactions.

### 📝 Preparation

- Dive into [lecture slides](https://docs.google.com/presentation/d/1qIjQ10Dy7RW00wit0Ud5vX_012pH_1chOcuvpkt03cg/edit#slide=id.p) for a better understanding.
- Complete all questions in [Module 5: Grouping Objects](https://qbl.sys.kth.se/sections/dd1337_programming/container/grouping_objects).

### ✅ Learning Goals

This week’s objectives are:

* Working with `Arrays`
* Understanding the `static` keyword
* Working with `ArrayLists`
* Combining loops and collections
* Implementing basic game mechanics

### 🚨 Troubleshooting Guide

Having trouble? Here’s what to do:

1. Check [posted issues](https://gits-15.sys.kth.se/inda-24/help/issues) to see if others have the same problem.
2. Post a new issue if your problem isn’t listed. Use [this link](https://gits-15.sys.kth.se/inda-24/help/issues/new) to create it.
3. Consult a TA during the [weekly lab](https://queue.csc.kth.se/Queue/INDA).

Discuss with your peers to gain insights, but do not share answers. Additionally, while AI services 🤖 can aid your understanding, ensure that your submissions are original and can be explained during evaluations.

### 🎮 Game Assignment: Let's Get Moving!

You are tasked with creating a simple game with core functionalities using Java. The game will involve player movement, scoring, and enemy interactions. Below are the fundamental concepts and exercises to guide your development process.

#### 📚 Understanding Arrays in Java

Arrays are core components in Java to store a fixed number of elements of the same type. Let’s explore some basics:

```java
// Initializing an array
int[] scores = new int[10];
scores[0] = 42; // Assigning a value
```

#### 📚 ArrayLists in Java

Unlike arrays, `ArrayLists` offer dynamic arrays that can grow or shrink as needed:

```java
import java.util.ArrayList;

ArrayList<Integer> enemyPositions = new ArrayList<>();
enemyPositions.add(5); // Adding an element

int firstPosition = enemyPositions.get(0); // Accessing elements
```

### 🔄 Game Mechanics and Collections

Java collections are crucial to implementing the game mechanics efficiently. Let’s start building your mini-game piece by piece with specific tasks that enhance the gameplay.

#### 🏛 Assignment

1. **Player Movement:**

   Create a method that initializes a player’s position and allows movement in a grid:

   ```java
   public static int[] movePlayer(int[] position, String direction) {
       // Implement logic to move player based on direction
       return position;
   }
   ```

   Use an `Array` to handle player position (`[x, y]`). Incorporate logic to change the position based on user input (e.g., "up", "down").

2. **Scoring System:**

   Implement a scoring method that uses `ArrayLists` to track and update scores after player actions:

   ```java
   public static ArrayList<Integer> updateScore(ArrayList<Integer> scores, int points) {
       // Add points to score list
       return scores;
   }
   ```

3. **Enemy Interactions:**

   Create logic to add enemies on the grid and determine if they occupy the same space as the player:

   ```java
   public static boolean checkCollision(ArrayList<int[]> enemies, int[] playerPos) {
       // Determine if player has collided with an enemy
       return false;
   }
   ```

   Use `ArrayLists` of arrays to manage enemy positions, utilizing loops to identify collisions.

4. **Game Loop Integration:**

   Write a `static` method to integrate all functionalities into a loop simulating continuous gameplay:

   ```java
   public static void gameLoop() {
       // Main game loop, handling movement, scoring, and collisions
   }
   ```

   Ensure seamless integration of previous methods into a loop structure that manages game updates on each iteration.

5. **Bonus Challenge - Leaderboard:**

   Enhance your game by keeping a leaderboard of high scores using an `ArrayList`:

   ```java
   public static void updateLeaderboard(ArrayList<Integer> leaderboard, int score) {
       // Insert logic to maintain a list of top scores
   }
   ```

   Use `ArrayList` methods efficiently to maintain order and uniqueness.

#### ➕ Helpful Resources

- [Java Arrays Documentation](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/arrays.html)
- [Java ArrayList API](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/ArrayList.html)
- [Enhanced For Loop Explanation](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/for.html)

Embrace the challenge and enhance your understanding of data structures and algorithms while creating this fun and educational project. Good luck, and have fun coding your simple game! 🎮