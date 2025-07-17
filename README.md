# Magic 8 Ball Java Command-Line Program

This program is a simple command line Magic 8 Ball simulator written in Java. The user sets their name, asks a question, and receives a random response.

## Author

Nicholas Bleeker

July 16, 2025

## Overview

This program includes four Java classes:

* magic8Ball.java
  * Contains the logic for generating random Magic 8 Ball responses
* ballResponses.java
  * Stores the list of randomized responses
* user.java
  * Manages user data using setters and getters
* Main.java
  * Handles the main loop and user interface logic

## How to Run

Make sure all 4 java files are located in the same folder:

```bash
Magic-8-Ball/
| - > magic8Ball.java
| - > ballResponses.java
| - > user.java
| - > Main.java
```

Once in the Magic-8-Ball directory, compile and run the program in the terminal using the following commands:

```bash
javac Main.java
java Main
```

## Expected Output

On startup, the program displays a menu:

```bash
===== Magic 8 Ball =====
1. Set Name
2. Ask a Question
3. Exit Program
Set Name Before Asking a Question.
```

*You must set a name before asking a question.*

Once the name is set, you can ask any "yes" or "no" question and the program will return a random Magic 8 Ball style response such as:

```bash
You asked: Should I give the creator of this program an internship?
Magic 8 Ball says: Signs point to yes.
Press "Enter" key to continue:
```

After pressing the "Enter" key, the program loops back to the menu where you can:

* Change your name
* Ask another question
* Exit the program

Example menu after setting a name:

```bash
===== Magic 8 Ball =====
1. Change Name
2. Ask a Question
3. Exit Program
Choose an option (1-3)
```
