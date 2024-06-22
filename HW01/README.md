#Assignment 1 - Shimon Desta 

This project implements a Deterministic Finite State Machine (DFSM) that checks if a given string is accepted or rejected by the machine. The DFSM specifically checks if the string contains the substring "babb".

## Project Structure

The project consists of the following files:

- `Main.java`: Contains the main class to test the DFSM with different input strings.
- `DFSM.java`: Defines the DFSM class with the `compute` method to determine if a string is accepted.
- `TransitionFunction.java`: Defines the transition function for the DFSM.
- `Transition.java`: Represents a transition between states in the DFSM.
- `State.java`: Represents a state in the DFSM.
- `Alphabet.java`: Represents the alphabet used by the DFSM.

## How to Use

1. Clone the repository to your local machine.
2. Compile the Java files using your preferred Java IDE or command line tools.
3. Run the `Main` class to test the DFSM with different input strings.

## Example

Here is an example of the output you might see when running the `Main` class:

## Explanation

The `Main` class creates a DFSM that checks for the substring "babb" in the input strings. The `Has_babb_AsASubstring` method defines the DFSM with the following states and transitions:

- **Initial State (S1)**:
  - 'a' -> S1
  - 'b' -> S2

- **State 2 (S2)**:
  - 'a' -> S1
  - 'b' -> S3

- **State 3 (S3)**:
  - 'a' -> S3
  - 'b' -> S4

- **State 4 (S4)**:
  - 'a' -> S1
  - 'b' -> S5 (Accepting State)

- **State 5 (S5)**:
  - 'a' -> S5
  - 'b' -> S5

The `compute` method in the `DFSM` class iterates through each character in the input string and uses the transition function to determine the next state. If the machine ends in an accepting state, the string is accepted; otherwise, it is rejected.

# Instructions for VPL for Programming Assignment 1 in Java

1. **Upload Project Files to VPL:**
   - Log in to the Virtual Programming Lab (VPL) system using your browser.
   - Navigate to Programming Assignment 1 in Java.
   - Upload all your Java files (e.g., `Main.java`, `DFSM.java`, `TransitionFunction.java`, `Transition.java`, `State.java`, `Alphabet.java`) by clicking on the "Upload file" button.

2. **Compile the Java Files:**
   - Open the integrated terminal in VPL.
   - Compile all the Java files by running the following command:
     ```sh
     javac *.java
     ```

3. **Run the Code:**
   - After compiling, run the main file (`Main`) by executing the following command:
     ```sh
     java Main
     ```

4. **Check the Output:**
   - The output of the program will be displayed in the terminal window.
   - Ensure that the output matches the expected results, for example:
     ```
     Input:  is rejected
     Input: babb is accepted
     Input: abab is rejected
     Input: baba is rejected
     Input: aababb is accepted
     Input: bbabbba is accepted
     ```


