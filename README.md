# kelebogile-kometsi
# Rock-Paper-Scissors Game

Description: Rock paper scissors is a hand game usually played between two people, in which each player simultaneously forms one of three shapes with their outstretched hand. These shapes are "rock", "paper", and "scissors".

# Game Play
The players must count aloud to three, or speak the name of the game (e.g. "Rock! Paper! Scissors!"), either raising one hand in a fist and swinging it down with each shout or holding it behind their back. They will then extend their hands towards their opponent. Other forms include a version where players throw immediately on the third count (thus throwing on the count of "Scissors!"), or a form where they shake their hands three times before throwing. We are going to computerize this game play, so the computer will choose a random choice while the player will have the choice to choose one, either Rock! Paper! or Scissors!

# Game Rules
A player who decides to play rock will beat another player who has chooses scissors (rock crushes scissors), but will lose to one who has played paper (paper covers rock); paper will lose to a scissors (scissors cuts paper). If both players choose the same shape, the game is tied and is usually immediately replayed to break the tie.

![360_F_214938772_cvWeBGtnd8Gqd7wtp7Cqdp7qRQMhKBCn](https://github.com/user-attachments/assets/f46a9333-6aa2-4547-a41b-3266937095be)

Image Credits: Adobe Stock

# Possible plays
if player picks rock and computer picks paper; computer wins

if player picks paper and computer picks paper; tie

if player picks scissors and computer picks paper; player wins

if player picks rock and computer picks rock; tie

if player picks paper and computer picks rock; player wins

if player picks scissors and computer picks rock; computer wins

if player picks rock and computer picks scissors; player wins

if player picks paper and computer picks scissors; computer wins

if player picks scissors and computer picks scissors; tie

# Algorithm
Start the game then define valid choices (Rock, Paper, Scissors).
Prompt the user to enter a choice.
If the user enters "exit", end the game.
Generate a random choice for the computer, and compare the user's choice with the computer's choice.
If both choices are the same, the prompt "It's a tie!" will be displayed.
If the user wins, the prompt "You win this round!" will be displayed
Otherwise the prompt "You lose this round!" will be displayed.
At the end of the round when a winner has been established, the prompt "Congratulations! You won the best of 3 series!"/"The computer won the best of 3 series. Better luck next time!" will be displayed 
Repeat the process until the user exits.
End the game.

# Example of project in action

![Screenshot 2025-02-16 214300](https://github.com/user-attachments/assets/f2fbc361-6346-47c4-84d3-8cb7def6f2b4)
![Screenshot 2025-02-16 214320](https://github.com/user-attachments/assets/68c5140d-f56e-4e4f-ae22-a86a9dcf72bc)


# Dependencies
Java

Since this is a console-based program, it does not require external libraries.
It only uses built-in Java libraries:
java.util.Scanner – To read user input.
java.util.Random – To generate the computer's random choice.

# Requirements
Java (JDK 8 or higher), a Java compiler (IDE of your choice) and a terminal or command prompt

