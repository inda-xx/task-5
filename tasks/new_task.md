# Building a Simple Game Application

This week, you will embark on creating a simple game application. Throughout this task, you'll learn to manage player movements, implement a scoring system, and handle enemy interactions in Java. This project will help you grasp Java collections - `Arrays` and `ArrayLists` - for organizing objects in the game environment.

### 📝 Preparation

- Review the [lecture slides](https://docs.google.com/presentation/d/1qIjQ10Dy7RW00wit0Ud5vX_012pH_1chOcuvpkt03cg/edit#slide=id.p)
- Read and answer all questions in [Module 5: Grouping Objects](https://qbl.sys.kth.se/sections/dd1337_programming/container/grouping_objects)

### ✅ Learning Goals

This week's learning goals include:

* Working with `Arrays`
* Understanding the `static` keyword
* Working with `ArrayLists`
* Combining loops and collections

### 🚨 Troubleshooting Guide

If you encounter any issues, follow these steps:

1. Check this week's [posted issues](https://gits-15.sys.kth.se/inda-24/help/issues) to see if other students are discussing your problem.
2. If not, create a [New Issue](https://gits-15.sys.kth.se/inda-24/help/issues/new). Give a concise descriptive title that begins with "Task *x*: *summary of problem here*".
3. Seek assistance from a TA during the [weekly lab](https://queue.csc.kth.se/Queue/INDA). Check your schedule for the next lab session.

Collaborate with peers to enhance understanding, **but do not share answers!** Similarly, AI services 🤖 can help explain concepts, **but refrain from submitting AI-generated solutions.** Ensure you understand and can explain your own solutions.

### 🏛 Assignment

This assignment involves creating a simple 2D game application in Java, centering around managing a player character, scoring points, and interacting with enemies. You will utilize both `Arrays` and `ArrayLists` to store and manipulate game elements efficiently.

<details>
<summary> 🎮 A summary of Java's collections </summary>

#### Arrays in Java

Arrays in Java are static in size and can store a specific number of elements of a single type. When working with arrays, remember that Java arrays are zero-indexed.

```java
int[] scores = new int[10]; // Array to store 10 scores
scores[0] = 100;            // Set the first score
```

```java
// Looping through arrays
for (int i = 0; i < scores.length; i++) {
    System.out.println("Score: " + scores[i]);
}
```

Arrays are a powerful but fixed-size structure for storing sequence data.

#### ArrayLists in Java

ArrayLists in Java are dynamic arrays and allow elements to be added and removed as needed. They can grow as required.

```java
import java.util.ArrayList;

ArrayList<String> playerActions = new ArrayList<>();
playerActions.add("Run");
playerActions.add("Jump");

// There can be duplicates
for (String action : playerActions) {
    System.out.println("Player Action: " + action);
}
```

The advantage of `ArrayList` is their dynamic resizing, which makes them highly suitable for scenarios where the number of elements is not known upfront.

#### Static Keyword

The `static` keyword in Java signifies that a particular field or method is associated with the class rather than any individual object. It allows you to define methods or variables that are shared across all instances of a class.

```java
public class GameUtils {
    public static int calculateScore(int level, int baseScore) {
        return baseScore * level;
    }
}

// Usage without creating an instance
int newScore = GameUtils.calculateScore(3, 100);
```

></details>

### 🎯 Task Overview

Your task is to create a minimal 2D game application, implementing core functionalities such as player movement, interaction with enemies, and score tracking.

#### File Structure

Create a folder `src` to store your Java files and work from there. The main components of your game application should be structured as follows:
- `Game.java`
- `Player.java`
- `Enemy.java`
- `GameUtils.java`

#### Exercise 6.0 -- Setting Up the Game

Begin by creating a `Game` class in a file called `Game.java`. This class will have an `ArrayList` managing the enemies on the screen and an `Array` for the player's score tracking.

```java
public class Game {
    private Player player;
    private ArrayList<Enemy> enemies;
    private static int[] scores; // Array to track scores per level

    public Game() {
        this.player = new Player();
        this.enemies = new ArrayList<>();
        scores = new int[10]; // Assume 10 levels
    }

    public static void setScore(int level, int score) {
        scores[level] = score;
    }
}
```

#### Exercise 6.1 -- Player Movement

Develop a `Player` class in `Player.java` that manages player positions within an array representing a 2D grid.

```java
import java.util.Scanner;

public class Player {
    private int x, y;
    
    public Player() {
        this.x = 0;
        this.y = 0; // Start position
    }

    public void move(char direction) {
        switch (direction) {
            case 'W': y--; break; // Move up
            case 'S': y++; break; // Move down
            case 'A': x--; break; // Move left
            case 'D': x++; break; // Move right
        }
    }
}
```

Test this by using a simple command-line input mechanism to simulate player movement:

```shell
> Enter direction (WASD): A
Player moved left
```

#### Exercise 6.2 -- Enemy Interactions

Create an `Enemy` class in `Enemy.java`. Have enemies be stored using an `ArrayList` inside the `Game` class.

```java
public class Enemy {
    private int x, y;
    
    public Enemy(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void moveTowardsPlayer(Player player) {
        // Implement logic to move towards the player
    }
}
```

Each enemy should have a method to interact with the player based on proximity (e.g., reduce score, end game).

#### Exercise 6.3 -- Scoring System

Implement a static utility method in `GameUtils.java` to calculate scores based on time or performance.

```java
public class GameUtils {

    public static int calculateScore(int elapsedTime, int enemiesDefeated) {
        return enemiesDefeated * 10 - elapsedTime;
    }
}
```
Demonstrate the utility by integrating it into gameplay.

#### Exercise 6.4 -- Putting it All Together

Write the main method in `Game.java` to simulate a game loop, handling player inputs, moving enemies, and updating scores.

```java
public class Game {
    public static void main(String[] args) {
        Game game = new Game();
        game.start();
    }

    private void start() {
        // Example interaction loop
    }
}
```

### 📝 Final Notes

These exercises will help guide your understanding of arrays, array lists, static methods, and loops. Explore compilation and testing to ensure your game functions as expected. Enjoy the coding journey and the satisfaction from building a mini-game engine.