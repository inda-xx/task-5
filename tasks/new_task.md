# Create Your Own Game 🎮

In this task, you will embark on an exciting journey of creating a simple game. This exercise will allow you to practice and enhance your understanding of programming concepts like player movement, scoring systems, and enemy interactions through Java collections like `Arrays` and `ArrayLists`. You will also dive deeper into the utilization of the `static` keyword and the powerful combination of loops and collections.

### 📝 Preparation

- Review the [lecture slides](https://docs.google.com/presentation/d/1qIjQ10Dy7RW00wit0Ud5vX_012pH_1chOcuvpkt03cg/edit#slide=id.p).
- Read the [Module 5: Grouping Objects](https://qbl.sys.kth.se/sections/dd1337_programming/container/grouping_objects) and answer all questions to solidify your understanding.

### ✅ Learning Goals
This week's learning objectives include:

- Working with `Arrays`
- Understanding the `static` keyword
- Working with `ArrayLists`
- Combining loops and collections

### 🚨 Troubleshooting Guide
If you encounter any challenges or questions, here's how to proceed:

1. Check this week’s [posted issues](https://gits-15.sys.kth.se/inda-24/help/issues) to see if your problem has already been discussed.
2. If not, feel free to create a [New Issue](https://gits-15.sys.kth.se/inda-24/help/issues/new) with a descriptive title starting with "Task *x*: *brief description of the challenge*".
3. Reach out to a TA during the [weekly lab](https://queue.csc.kth.se/Queue/INDA). Double-check your schedule for the lab timings.

Feel free to chat with your peers about your findings, but remember, **do not share solutions!** Similarly, using AI for help is great for explanations, but refrain from submitting AI-generated solutions. Craft your own solutions and ensure you understand them thoroughly.

### 🏛 Assignment Overview
You'll be using Java Collections, such as `Arrays` and `ArrayLists`, to architect a simple game involving player movements, a scoring system, and enemy interactions. Let's dive into the specifics:

<details>
<summary> 📚 Arrays and the `static` Keyword </summary>

An array is a fundamental data structure in Java, providing a way to store fixed-size sequential collections of elements of the same type. Understanding how to work with arrays is crucial for this task:

```java
// Example of array creation in Java
int[] scores = new int[3];
scores[0] = 10; // First player's score

// Example of using the static keyword
public static int calculateTotalScore(int[] scores) {
    int total = 0;
    for (int score : scores) {
        total += score;
    }
    return total;
}
```

The `static` keyword denotes that a particular method or field belongs to the class, not to instances of the class. This allows you to call it without needing to create an instance.

--- 
</details>

<details>
<summary> 📚 ArrayList and Combining Loops </summary>

`ArrayList` is a dynamic array, part of Java's standard library, allowing you to resize and store elements dynamically:

```java
import java.util.ArrayList;

// Creating an ArrayList to store enemies
ArrayList<String> enemies = new ArrayList<>();
enemies.add("Goblin");
enemies.add("Troll");

// Iterating over the ArrayList
for (String enemy : enemies) {
    System.out.println("Encountered: " + enemy);
}
```

Utilize loops efficiently to manipulate and iterate over collections like `ArrayList`.

---
</details>

### Build A Simple Game 🔧

#### Step 1: Setup Your Classes
Begin by creating the base class for your game, organized in separate files within the `src` directory:

- **Player.java**: Contains player attributes and movement logic.
- **Enemy.java**: Defines enemy behavior and interactions.
- **Game.java**: Main class that coordinates all elements: scoring, player movement, and enemy interactions.

#### Step 2: Implement Player Movement
Design a method in `Player.java` allowing the player to move within a grid:

```java
public class Player {
    private int x, y;

    public Player(int startX, int startY) {
        this.x = startX;
        this.y = startY;
    }

    public void move(String direction) {
        // Logic for moving the player based on the direction
    }
}
```

#### Step 3: Setup Scoring System
In `Game.java`, implement a scoring system using arrays to track scores. Use a `static` method for calculating the total score from an array of player scores:

```java
public static int calculateTotalScore(int[] playerScores) {
    // Calculate and return total score
}
```

#### Step 4: Manage Enemy Interactions
In `Enemy.java`, manage a dynamic list of enemies using `ArrayList`. Integrate a method to display all active enemies and interactions:

```java
import java.util.ArrayList;

public class Enemy {
    private ArrayList<String> enemies = new ArrayList<>();

    public void spawnEnemy(String enemyType) {
        // Add new enemy
    }

    public void displayEnemies() {
        // Display all enemies
    }
}
```

#### Step 5: Combine and Execute
In `Game.java`, bring together the player, enemies, and scoring into a cohesive game loop using loops to iterate player actions and game state:

```java
public class Game {
    public static void main(String[] args) {
        // Instantiate player, enemies, and setup the game loop
    }
}
```

### 🔍 Examples and Testing
Create test cases to verify the movement of players, update and calculation of scores, and enemy interactions. This will reinforce your understanding and ensure the functionality of each component in your game.

This task not only sharpens your understanding of Java's collections and `static` methods but also encourages you to think like a game developer. Explore, innovate, and have fun building your own game universe! 🎮