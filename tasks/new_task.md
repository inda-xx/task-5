# Simple Game Application

This week's task involves creating a simple game application. You will apply your understanding of Java collections, specifically `Array` and `ArrayList`, to develop functionalities like player movement, a scoring system, and interactions with enemies.

### 📝 Preparation

- Review the [lecture slides on Arrays and ArrayLists](https://docs.google.com/presentation/d/1qIjQ10Dy7RW00wit0Ud5vX_012pH_1chOcuvpkt03cg/edit#slide=id.p).
- Read and respond to all questions in [Module 5: Grouping Objects](https://qbl.sys.kth.se/sections/dd1337_programming/container/grouping_objects).

### ✅ Learning Goals

This week's learning goals include:

- Working with `Arrays`
- Understanding the `static` keyword
- Working with `ArrayLists`
- Combining loops and collections

### 🚨 Troubleshooting Guide

If you encounter any questions or issues, please follow this procedure:

1. Review this week's [posted issues](https://gits-15.sys.kth.se/inda-24/help/issues). Check if other students have asked about your problem.
2. If not, post a question by creating a [New Issue](https://gits-15.sys.kth.se/inda-24/help/issues/new). Add a descriptive title, beginning with "Task *x*: *summary of problem here*"
3. Ask a TA in person during the [weekly lab](https://queue.csc.kth.se/Queue/INDA). Check your schedule to know the next lab timing.

**Discussion with peers is encouraged, but do not share answers!** AI tools can be useful for explanations, **but do not use them to generate solutions.** You must be responsible for your solutions and able to explain them during assessments.

---

### 🏛 Assignment

You are tasked with creating a simple game application that uses Java collections effectively.

#### Exercise 1: Player Movement

Create a class `Player` with the following properties:

- An `ArrayList<Integer>` representing positions.
- A `static` integer array called `DIRECTION` with four elements to represent possible directions (e.g., {UP, DOWN, LEFT, RIGHT}).

Implement methods for player movement:
- `public void move(int direction)`: Moves the player in the specified direction.
- Use the `static` keyword to demonstrate shared properties or methods belonging to the class itself.

```java
public class Player {
    private ArrayList<Integer> position;
    public static int[] DIRECTION = {0, 1, 2, 3};

    // Constructor and methods
    public Player() {
        // Initialize player at a starting position
    }

    public void move(int direction) {
        // Logic to move the player based on direction
    }
}
```

#### Exercise 2: Scoring System

Create a `Score` class to maintain and update the player's score:

- Use an `int[]` array to track scores from different actions.
- Write a method `updateScore(int points)` that modifies the score array.
- Ensure the static integer field `totalScore` updates whenever individual scores change.

```java
public class Score {
    private int[] actionScores;
    public static int totalScore;

    public Score() {
        // Initialize actionScores
    }

    public void updateScore(int points) {
        // Add points to the totalScore and track specific action
    }
}
```

#### Exercise 3: Enemy Interactions

Develop an `Enemy` class where colorful enemy interactions occur:

- Use an `ArrayList<Enemy>` to manage multiple enemies.
- Implement `public void interact(Player player)` to define interaction with the player.
- Combine loops and collections to determine interactions between enemies and the player.

```java
import java.util.ArrayList;

public class Enemy {
    private ArrayList<Enemy> enemies;

    public Enemy() {
        // Initialize enemies list
    }

    public void interact(Player player) {
        // Define what happens when an enemy interacts with the player
    }
}
```

#### Exercise 4: Game Logic

Using an `ArrayList`, manage the sequence of game actions:

- Define game events and use `for` loops to iterate over collections to update the game state.
- Implement a game loop `runGame()` that processes player inputs, updates scores, and handles enemy interactions.

```java
public class Game {
    private Player player;
    private Score score;
    private ArrayList<Enemy> enemies;

    public Game() {
        // Initialize player, score, and enemies
    }

    public void runGame() {
        // Main game loop logic
        // Process inputs, update scores, interact with enemies
    }
}
```

#### 📚 Key Concepts Recap

- **Arrays**: Understand and manipulate indexed collections.
- **Static Keyword**: Share data across instances, useful for shared game values.
- **ArrayLists**: Manage variable-length sequences like enemy lists efficiently.
- **Loops and Collections**: Use loops to manage sequences, such as game events and interactions.

---

This assignment is designed to help you explore core concepts of data organization in Java while enhancing your software engineering skills through hands-on practice in the enjoyable context of a game! Happy coding! 🎮