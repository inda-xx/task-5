# Collections and Games

This week focuses on integrating Java collections—`Array` and `ArrayList`—into a simple game application, enabling players to interact with enemies and incorporating a scoring system. Throughout this task, you'll practice organizing groups of objects effectively.

### 📝 Preparation

- Review the [lecture slides](https://docs.google.com/presentation/d/1qIjQ10Dy7RW00wit0Ud5vX_012pH_1chOcuvpkt03cg/edit#slide=id.p)
- Read and answer all questions in [Module 5: Grouping Objects](https://qbl.sys.kth.se/sections/dd1337_programming/container/grouping_objects)

### ✅ Learning Goals

This week's learning goals include:

- Working with `Arrays`
- Understanding the `static` keyword
- Working with `ArrayLists`
- Combining loops and collections

### 🚨 Troubleshooting Guide

If you have any questions or problems, follow this procedure:

1. Look at this week's [posted issues](https://gits-15.sys.kth.se/inda-24/help/issues). Are other students asking about your problem?
2. If not, post a question yourself by creating a [New Issue](https://gits-15.sys.kth.se/inda-24/help/issues/new). Add a descriptive title, beginning with "Task *x*: *summary of problem here*"
3. Ask a TA in person during the [weekly lab](https://queue.csc.kth.se/Queue/INDA). Check your schedule to see when the next lab is.

We encourage you to discuss with your course friends, **but do not share answers!** Similarly, use any AI services 🤖 to help explain things, **but please do not submit AI-generated solutions**. You must be responsible for your own solutions and should be able to explain them under examination.

### 🎮 Assignment: Simple Game Application

In this assignment, you will develop a simple 2D game application that incorporates player movement, a scoring system, and enemy interactions using `Arrays` and `ArrayLists`.

<details>
<summary> 📚 A Summary of Java's Arrays </summary>

Arrays in Java are collections of variables of the same type, have a fixed length, and can be easily traversed using loops. Accessing elements is done by index, starting at 0.

```java
int[] scores = {5, 10, 15};
System.out.println("First score: " + scores[0]);
```

For more information, refer to [Oracle's Official Java Tutorial on Arrays](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/arrays.html).

</details>

<details>
<summary> 📚 Understanding the `static` Keyword </summary>

The `static` keyword signifies that a field or method belongs to the class itself, rather than to instances of the class. This concept will be useful when managing game mechanics that don't need object-specific behaviors.

```java
public class Game {
    public static int totalPlayers = 0;
}
```

More about `static` can be found in the [Java Tutorial](https://docs.oracle.com/javase/tutorial/java/javaOO/classvars.html).

</details>

<details>
<summary> 📚 A Summary of Java's ArrayLists </summary>

Unlike arrays, `ArrayLists` in Java grow dynamically and offer flexibility in manipulating collections. They are part of Java's standard library and require importation before use.

```java
import java.util.ArrayList;

ArrayList<String> enemies = new ArrayList<>();
enemies.add("Enemy1");
```

Read more in the [Oracle Java Documentation](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/ArrayList.html).

</details>

#### Exercise 1: Define Game Environment

1. Create a class `Game` in a file named `Game.java`. This file will encapsulate our game's environment.
2. Define the static variables for the game: `static int score = 0;` for the scoring system, and a static array `static char[] playerPosition = new char[10];` representing the player on a simple grid.
3. Implement methods `initializeGrid` to display the player's initial position represented by `P`, and empty cells by `.`.

#### Exercise 2: Player Movement

Define a method `public static void movePlayer(int position)` to update the player's position in the array. Ensure the player's movement stays within the grid boundaries.

#### Exercise 3: Scoring System

Create a method `public static int updateScore(int points)` that adds points to `score`. This method should be non-static and alter the score based on player actions like reaching specific positions on the grid.

#### Exercise 4: Enemy Interactions

1. Use an `ArrayList<String>` to hold the enemy types that interact with the player.
2. Implement methods to add enemies dynamically and determine outcomes of player encounters with a `public static void enemyEncounter(String enemyType)` method.
3. Define different outcomes based on the enemy type, such as deducting points, losing the game, or neutral interaction.

#### Exercise 5: Game Simulation

Develop a main method to simulate the game environment. Integrate loops to handle game rounds, where the player moves, encounters enemies, and updates scores. Ensure the loop effectively utilizes the `Arrays` and `ArrayList` collections iteratively.

<details>
<summary> 🛠 Example main method Example </summary>

```java
public static void main(String[] args) {
    initializeGrid();
    movePlayer(3);
    updateScore(10);
    enemyEncounter("Goblin");
}
```

</details>

### Concluding Challenge

Optimize the game's logic for handling multiple enemies, allowing for varying levels of difficulty. Experiment with player and enemy strategy patterns to enrich the game dynamics. This work should be done in separate methods using collections and loops.

Embark on this journey in integrating basic collections and game mechanics to gain a richer understanding of object-oriented programming applications in Java. Good luck and have fun exploring the realms of your own creation!