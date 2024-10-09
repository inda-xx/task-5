# Game Application Development

This week introduces fundamental concepts for creating a simple game application using Java. The goal is to implement functionalities such as player movement, a scoring system, and enemy interactions with an emphasis on programming concepts such as arrays, array lists, loops, and the `static` keyword.

### 📝 Preparation

- Review the [lecture slides](https://docs.google.com/presentation/d/1qIjQ10Dy7RW00wit0Ud5vX_012pH_1chOcuvpkt03cg/edit#slide=id.p).
- Read and answer all questions in [Module 5: Grouping Objects](https://qbl.sys.kth.se/sections/dd1337_programming/container/grouping_objects).

### ✅ Learning Goals

This week's learning goals include:

* Working with `Arrays`.
* Understanding the `static` keyword.
* Working with `ArrayLists`.
* Combining loops and collections.

### 🚨 Troubleshooting Guide

If you have any questions or problems, follow this procedure:

1. Look at this week's [posted issues](https://gits-15.sys.kth.se/inda-24/help/issues). Are other students asking about your problem?
2. If not, post a question yourself by creating a [New Issue](https://gits-15.sys.kth.se/inda-24/help/issues/new). Add a descriptive title, beginning with "Task *x*: *summary of problem here*".
3. Ask a TA in person during the [weekly lab](https://queue.csc.kth.se/Queue/INDA). Check your schedule to see when the next lab is.

We encourage you to discuss with your course friends, **but do not share answers!** Similarly, use of any AI services 🤖 can be great to help explain things, **but please do not submit AI-generated solutions** - you must be responsible for your own solutions and be able to explain them under examination.

### 🎮 Assignment: Simple Game Application

You will develop a simple text-based game that involves a player, a scoring system, and enemy interactions. Through this task, you will strengthen your understanding of `Arrays`, `ArrayLists`, and the `static` keyword while implementing practical game functionalities.

<details>
<summary> 📚 A summary of Java's arrays and ArrayLists </summary>

Java provides a couple of useful data structures for managing collections of data.

- **Arrays**: 
  - Zero-indexed and fixed in size.
  - Declared with square brackets, e.g., `int[] scores = new int[5];`.
  - Accessed using indices, e.g., `scores[0] = 10;`.

- **ArrayLists**:
  - Part of the `java.util` package. Import it using `import java.util.ArrayList;`.
  - Dynamic in size and store objects. Cannot directly store primitive types.
  - Use methods like `add()`, `get()`, `set()`, and `remove()` to manipulate elements.
  - Example: `ArrayList<String> names = new ArrayList<>(); names.add("Player1");`.

</details>

<details>
<summary> 📚 The static keyword </summary>

- The `static` keyword denotes that a particular member belongs to the class itself rather than to instances of the class. You can call static methods without creating an object of the class.
  
- Static variables are shared among all instances of a class. For example:
  ```java
  class Game {
      static int highScore;
  }
  ```

</details>

### 💻 Code Implementation Tasks

#### Exercise 1: Basic Setup

- Create a class called `Game.java` in the `src` folder.
- Define static variables to maintain the game state such as player score and highest score.

#### Exercise 2: Player Movement

- Create an `int[]` array to represent a 2D grid.
- Implement a method `public static void movePlayer(int[] playerPosition, String direction)` that adjusts the player's position based on input for movement (“up”, “down”, “left”, “right”).

#### Exercise 3: Scoring System

- Use a static field to keep track of the player's score.
- Implement a method `public static void updateScore(int points)` to update the player's score.

#### Exercise 4: Enemy Interactions

- Use `ArrayList<int[]>` to store positions of multiple enemies on the grid.
- Implement a method `public static boolean checkEnemyCollision(int[] playerPosition, ArrayList<int[]> enemies)` to check if the player's position conflicts with any enemy.

#### Exercise 5: Random Enemy Movement

- Use loops to iterate through enemy positions and randomly change their positions.
- Implement a `public static void moveEnemies(ArrayList<int[]> enemies)` function to randomly move enemies.

Here is an example of what your main method might look like:

```java
public static void main(String[] args) {
    int[] playerPosition = {0, 0};
    ArrayList<int[]> enemies = new ArrayList<>(); 
    enemies.add(new int[]{2, 2});
    enemies.add(new int[]{3, 4});
    
    // Example game loop
    for (int i = 0; i < 10; i++) {
        movePlayer(playerPosition, "up");
        moveEnemies(enemies);
        
        if (checkEnemyCollision(playerPosition, enemies)) {
            System.out.println("Collision with enemy!");
            updateScore(-10);
        } else {
            updateScore(10);
        }

        // Output the current score
        System.out.println("Current score: " + highScore);
    }
}
```

This exercise will help solidify your understanding of combining arrays, lists, and loops, while using static methods and properties to manage game state. Remember to refer to the Oracle documentation if you get stuck! 🚀