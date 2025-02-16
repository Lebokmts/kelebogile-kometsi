# kelebogile-kometsi
# Rock-Paper-Scissors Game

Description : Rock paper scissors is a hand game usually played between two people, in which each player simultaneously forms one of three shapes with an outstretched hand. These shapes are "rock", "paper", and "scissors".

# Game Play
The players must count aloud to three, or speak the name of the game (e.g. "Rock! Paper! Scissors!"), either raising one hand in a fist and swinging it down with each shout or holding it behind their back. They will then extend it thier hands towards their opponent. Variations include a version where players throw immediately on the third count (thus throwing on the count of "Scissors!"), or a version where they shake their hands three times before throwing. We are going to computerize this game play, so that computer will choose some random choice while the player will have the choice to choose one [Rock! Paper! or Scissors! ]

# Game Rules
A player who decides to play rock will beat another player who has chosen scissors ("rock crushes scissors" or sometimes "blunts scissors"), but will lose to one who has played paper ("paper covers rock"); a play of paper will lose to a play of scissors ("scissors cuts paper"). If both players choose the same shape, the game is tied and is usually immediately replayed to break the tie.

# Possible plays
if (player == rock) and (computer == paper); computer wins

if (player == paper) and (computer == paper); tie

if (player == scissors) and (computer == paper); player wins

if (player == rock) and (computer == rock); tie

if (player == paper) and (computer == rock); player wins

if (player == scissors) and (computer == rock); computer wins

if (player == rock) and (computer == scissors); player wins

if (player == paper) and (computer == scissors); computer wins

if (player == scissors) and (computer == scissors); tie
