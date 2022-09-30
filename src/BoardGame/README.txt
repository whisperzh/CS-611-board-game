# CS611-<1>
## <Board game of Tic-tac-toe and Order and Chaos>
---------------------------------------------------------------------------
<Renming Zhang>
<rmzhang@bu.edu>
<U97677301>

## Files
---------------------------------------------------------------------------
<A brief description of each file and what it does>
Classes:
   Room:
      Room

      Description: It is a game room to have games, it receive inputs from (real world)players, and decide which game to play.
      It contains a queue of teams, and let teams take turns to play games.
   Boards:
      Board
      TTT_Board
      OAC_Board

      Description: Are game itself, named board because it hold the pieces, it deal with most of the work on board, such as counting the pieces numbers in line,
      check the validity of players' inputs (because player shouldn't decide whether his input is right, it should be decided by the game itself )
   Pieces:
      Piece
      TTT_Piece
      OAC_Piece
   
         Description: Pieces instance of different games, show index(user friendly), can be extended to movable pieces in the future.
   Player:
      Player
      TTT_Player
      OAC_Player

      Description: Responsible for input and set piece on the board
   Teams:
      Teams
      TTT_Teams
      OAC_Teams

      Description: Team contains a queue of players. It assigns players' tasks and makes
      players play in turn. It also does calculate the score and make checkouts(when win).


## Notes
---------------------------------------------------------------------------
1. <Files to be parsed should be stored in ConfigFiles, for parser class to
   read class>
2. <Bonus Done>             Yes,the Game is team based, can have multiple teams, and team can have multiple players; and the winner is also team based
3. <Notes to grader>:
   please execute by:
   entering /src/,
   apply the following commands
   javac -d bin BoardGame\Main.java
   java -cp .\bin\ BoardGame.Main

## How to compile and run
---------------------------------------------------------------------------
1. Navigate to the directory "pa1" after unzipping the files
2. Run the following instructions:
   <Example below>
   javac -d bin src/*.java
   java -cp bin Main

## Input/Output Example
---------------------------------------------------------------------------
<Place here an example of how the program runs. Include both its
outputs and correctly formatted inputs. Please clearly mark the inputs.>
Mine:

Hi there, Welcome to boardgame
Please choose your game.
Games
[1] Tic-tac-toe
[2] Order and Chaos
1
Your Input: [1]
please choose the size of the game the minimal size of game is 3
3
+--+--+--+
|1 |2 |3 |
+--+--+--+
|4 |5 |6 |
+--+--+--+
|7 |8 |9 |
+--+--+--+
Team O:
Player's turn:
please choose a grid
3
Your Input:3
outputs:
+--+--+--+
|  |  |O |
+--+--+--+
|  |  |  |
+--+--+--+
|  |  |  |
+--+--+--+
+--+--+--+
|1 |2 |3 |
+--+--+--+
|4 |5 |6 |
+--+--+--+
|7 |8 |9 |
+--+--+--+
Team X:
Player's turn:
please choose a grid
2
Your Input:2
outputs:
+--+--+--+
|  |X |O |
+--+--+--+
|  |  |  |
+--+--+--+
|  |  |  |
+--+--+--+
+--+--+--+
|1 |2 |3 |
+--+--+--+
|4 |5 |6 |
+--+--+--+
|7 |8 |9 |
+--+--+--+
Team O:
Player's turn:
please choose a grid
5
Your Input:5
outputs:
+--+--+--+
|  |X |O |
+--+--+--+
|  |O |  |
+--+--+--+
|  |  |  |
+--+--+--+
+--+--+--+
|1 |2 |3 |
+--+--+--+
|4 |5 |6 |
+--+--+--+
|7 |8 |9 |
+--+--+--+
Team X:
Player's turn:
please choose a grid
1
Your Input:1
outputs:
+--+--+--+
|X |X |O |
+--+--+--+
|  |O |  |
+--+--+--+
|  |  |  |
+--+--+--+
+--+--+--+
|1 |2 |3 |
+--+--+--+
|4 |5 |6 |
+--+--+--+
|7 |8 |9 |
+--+--+--+
Team O:
Player's turn:
please choose a grid
7
Your Input:7
outputs:
+--+--+--+
|X |X |O |
+--+--+--+
|  |O |  |
+--+--+--+
|O |  |  |
+--+--+--+
Game Over
winner is Team O
Team name       Score   Round
Team X  0       1
Team O  1       1
Do you want to play again?(y/n)
y
Input: yes
+--+--+--+
|1 |2 |3 |
+--+--+--+
|4 |5 |6 |
+--+--+--+
|7 |8 |9 |
+--+--+--+
Team X:
Player's turn:
please choose a grid
2
Your Input:2
outputs:
+--+--+--+
|  |X |  |
+--+--+--+
|  |  |  |
+--+--+--+
|  |  |  |
+--+--+--+
+--+--+--+
|1 |2 |3 |
+--+--+--+
|4 |5 |6 |
+--+--+--+
|7 |8 |9 |
+--+--+--+
Team O:
Player's turn:
please choose a grid
5
Your Input:5
outputs:
+--+--+--+
|  |X |  |
+--+--+--+
|  |O |  |
+--+--+--+
|  |  |  |
+--+--+--+
+--+--+--+
|1 |2 |3 |
+--+--+--+
|4 |5 |6 |
+--+--+--+
|7 |8 |9 |
+--+--+--+
Team X:
Player's turn:
please choose a grid
1
Your Input:1
outputs:
+--+--+--+
|X |X |  |
+--+--+--+
|  |O |  |
+--+--+--+
|  |  |  |
+--+--+--+
+--+--+--+
|1 |2 |3 |
+--+--+--+
|4 |5 |6 |
+--+--+--+
|7 |8 |9 |
+--+--+--+
Team O:
Player's turn:
please choose a grid
6
Your Input:6
outputs:
+--+--+--+
|X |X |  |
+--+--+--+
|  |O |O |
+--+--+--+
|  |  |  |
+--+--+--+
+--+--+--+
|1 |2 |3 |
+--+--+--+
|4 |5 |6 |
+--+--+--+
|7 |8 |9 |
+--+--+--+
Team X:
Player's turn:
please choose a grid
3
Your Input:3
outputs:
+--+--+--+
|X |X |X |
+--+--+--+
|  |O |O |
+--+--+--+
|  |  |  |
+--+--+--+
Game Over
winner is Team X
Team name       Score   Round
Team O  1       2
Team X  1       2
Do you want to play again?(y/n)
y
Input: yes
+--+--+--+
|1 |2 |3 |
+--+--+--+
|4 |5 |6 |
+--+--+--+
|7 |8 |9 |
+--+--+--+
Team O:
Player's turn:
please choose a grid
1
Your Input:1
outputs:
+--+--+--+
|O |  |  |
+--+--+--+
|  |  |  |
+--+--+--+
|  |  |  |
+--+--+--+
+--+--+--+
|1 |2 |3 |
+--+--+--+
|4 |5 |6 |
+--+--+--+
|7 |8 |9 |
+--+--+--+
Team X:
Player's turn:
please choose a grid
5
Your Input:5
outputs:
+--+--+--+
|O |  |  |
+--+--+--+
|  |X |  |
+--+--+--+
|  |  |  |
+--+--+--+
+--+--+--+
|1 |2 |3 |
+--+--+--+
|4 |5 |6 |
+--+--+--+
|7 |8 |9 |
+--+--+--+
Team O:
Player's turn:
please choose a grid
9
Your Input:9
outputs:
+--+--+--+
|O |  |  |
+--+--+--+
|  |X |  |
+--+--+--+
|  |  |O |
+--+--+--+
+--+--+--+
|1 |2 |3 |
+--+--+--+
|4 |5 |6 |
+--+--+--+
|7 |8 |9 |
+--+--+--+
Team X:
Player's turn:
please choose a grid
2
Your Input:2
outputs:
+--+--+--+
|O |X |  |
+--+--+--+
|  |X |  |
+--+--+--+
|  |  |O |
+--+--+--+
+--+--+--+
|1 |2 |3 |
+--+--+--+
|4 |5 |6 |
+--+--+--+
|7 |8 |9 |
+--+--+--+
Team O:
Player's turn:
please choose a grid
8
Your Input:8
outputs:
+--+--+--+
|O |X |  |
+--+--+--+
|  |X |  |
+--+--+--+
|  |O |O |
+--+--+--+
+--+--+--+
|1 |2 |3 |
+--+--+--+
|4 |5 |6 |
+--+--+--+
|7 |8 |9 |
+--+--+--+
Team X:
Player's turn:
please choose a grid
7
Your Input:7
outputs:
+--+--+--+
|O |X |  |
+--+--+--+
|  |X |  |
+--+--+--+
|X |O |O |
+--+--+--+
+--+--+--+
|1 |2 |3 |
+--+--+--+
|4 |5 |6 |
+--+--+--+
|7 |8 |9 |
+--+--+--+
Team O:
Player's turn:
please choose a grid
3
Your Input:3
outputs:
+--+--+--+
|O |X |O |
+--+--+--+
|  |X |  |
+--+--+--+
|X |O |O |
+--+--+--+
+--+--+--+
|1 |2 |3 |
+--+--+--+
|4 |5 |6 |
+--+--+--+
|7 |8 |9 |
+--+--+--+
Team X:
Player's turn:
please choose a grid
6
Your Input:6
outputs:
+--+--+--+
|O |X |O |
+--+--+--+
|  |X |X |
+--+--+--+
|X |O |O |
+--+--+--+
+--+--+--+
|1 |2 |3 |
+--+--+--+
|4 |5 |6 |
+--+--+--+
|7 |8 |9 |
+--+--+--+
Team O:
Player's turn:
please choose a grid
4
Your Input:4
outputs:
+--+--+--+
|O |X |O |
+--+--+--+
|O |X |X |
+--+--+--+
|X |O |O |
+--+--+--+
Game Over
A Stalemate!
Team name       Score   Round
Team X  1       3
Team O  1       3
Do you want to play again?(y/n)
n
Input: no
Thank you for playing!
Team X won 1 times.
Team O won 1 times.
There were 1 stalemates.
GoodBye

*********************************************************************
e.g.:
Output:
Welcome to Tic-Tac-Toe!
Please enter player 1's name:
Input: Alex
Output:
Please enter player 2's name:
Input: Bob
Output:
Please enter the size of the board:
Input: 3
Output:
+--+--+--+
|  |  |  |
+--+--+--+
|  |  |  |
+--+--+--+
|  |  |  |
+--+--+--+
Alex please make a move:
Input: 1,2
Output:
+--+--+--+
|  |  |  |
+--+--+--+
|X |  |  |
+--+--+--+
|  |  |  |
+--+--+--+
.
.
.
+--+--+--+
|X |  |  |
+--+--+--+
|X |O |  |
+--+--+--+
|X |O |  |
+--+--+--+
Alex wins! Would you like to play again?
Input: no
Output:
Thank you for playing!
Alex won 1 time.
Bob won 0 times.
There were 0 stalemates.

Hi there, Welcome to boardgame
Please choose your game.
Games
[1] Tic-tac-toe
[2] Order and Chaos
2
Your Input: [2]
+--+--+--+--+--+--+
|1 |2 |3 |4 |5 |6 |
+--+--+--+--+--+--+
|7 |8 |9 |10|11|12|
+--+--+--+--+--+--+
|13|14|15|16|17|18|
+--+--+--+--+--+--+
|19|20|21|22|23|24|
+--+--+--+--+--+--+
|25|26|27|28|29|30|
+--+--+--+--+--+--+
|31|32|33|34|35|36|
+--+--+--+--+--+--+
Order:
Player's turn:
please choose a grid
9
please choose a piece type (O/X)
o
Your Input: position:9 symbol:O
outputs:
+--+--+--+--+--+--+
|  |  |  |  |  |  |
+--+--+--+--+--+--+
|  |  |O |  |  |  |
+--+--+--+--+--+--+
|  |  |  |  |  |  |
+--+--+--+--+--+--+
|  |  |  |  |  |  |
+--+--+--+--+--+--+
|  |  |  |  |  |  |
+--+--+--+--+--+--+
|  |  |  |  |  |  |
+--+--+--+--+--+--+
+--+--+--+--+--+--+
|1 |2 |3 |4 |5 |6 |
+--+--+--+--+--+--+
|7 |8 |9 |10|11|12|
+--+--+--+--+--+--+
|13|14|15|16|17|18|
+--+--+--+--+--+--+
|19|20|21|22|23|24|
+--+--+--+--+--+--+
|25|26|27|28|29|30|
+--+--+--+--+--+--+
|31|32|33|34|35|36|
+--+--+--+--+--+--+
Chaos:
Player's turn:
please choose a grid
8
please choose a piece type (O/X)
x
Your Input: position:8 symbol:X
outputs:
+--+--+--+--+--+--+
|  |  |  |  |  |  |
+--+--+--+--+--+--+
|  |X |O |  |  |  |
+--+--+--+--+--+--+
|  |  |  |  |  |  |
+--+--+--+--+--+--+
|  |  |  |  |  |  |
+--+--+--+--+--+--+
|  |  |  |  |  |  |
+--+--+--+--+--+--+
|  |  |  |  |  |  |
+--+--+--+--+--+--+
+--+--+--+--+--+--+
|1 |2 |3 |4 |5 |6 |
+--+--+--+--+--+--+
|7 |8 |9 |10|11|12|
+--+--+--+--+--+--+
|13|14|15|16|17|18|
+--+--+--+--+--+--+
|19|20|21|22|23|24|
+--+--+--+--+--+--+
|25|26|27|28|29|30|
+--+--+--+--+--+--+
|31|32|33|34|35|36|
+--+--+--+--+--+--+
Order:
Player's turn:
please choose a grid
5
please choose a piece type (O/X)
o
Your Input: position:5 symbol:O
outputs:
+--+--+--+--+--+--+
|  |  |  |  |O |  |
+--+--+--+--+--+--+
|  |X |O |  |  |  |
+--+--+--+--+--+--+
|  |  |  |  |  |  |
+--+--+--+--+--+--+
|  |  |  |  |  |  |
+--+--+--+--+--+--+
|  |  |  |  |  |  |
+--+--+--+--+--+--+
|  |  |  |  |  |  |
+--+--+--+--+--+--+
+--+--+--+--+--+--+
|1 |2 |3 |4 |5 |6 |
+--+--+--+--+--+--+
|7 |8 |9 |10|11|12|
+--+--+--+--+--+--+
|13|14|15|16|17|18|
+--+--+--+--+--+--+
|19|20|21|22|23|24|
+--+--+--+--+--+--+
|25|26|27|28|29|30|
+--+--+--+--+--+--+
|31|32|33|34|35|36|
+--+--+--+--+--+--+
Chaos:
Player's turn:
please choose a grid
4
please choose a piece type (O/X)
x
Your Input: position:4 symbol:X
outputs:
+--+--+--+--+--+--+
|  |  |  |X |O |  |
+--+--+--+--+--+--+
|  |X |O |  |  |  |
+--+--+--+--+--+--+
|  |  |  |  |  |  |
+--+--+--+--+--+--+
|  |  |  |  |  |  |
+--+--+--+--+--+--+
|  |  |  |  |  |  |
+--+--+--+--+--+--+
|  |  |  |  |  |  |
+--+--+--+--+--+--+
+--+--+--+--+--+--+
|1 |2 |3 |4 |5 |6 |
+--+--+--+--+--+--+
|7 |8 |9 |10|11|12|
+--+--+--+--+--+--+
|13|14|15|16|17|18|
+--+--+--+--+--+--+
|19|20|21|22|23|24|
+--+--+--+--+--+--+
|25|26|27|28|29|30|
+--+--+--+--+--+--+
|31|32|33|34|35|36|
+--+--+--+--+--+--+
Order:
Player's turn:
please choose a grid
5
please choose a piece type (O/X)
x
Your Input: position:5 symbol:X
Your Input is Invalid
please choose a grid
6
please choose a piece type (O/X)
o
Your Input: position:6 symbol:O
outputs:
+--+--+--+--+--+--+
|  |  |  |X |O |O |
+--+--+--+--+--+--+
|  |X |O |  |  |  |
+--+--+--+--+--+--+
|  |  |  |  |  |  |
+--+--+--+--+--+--+
|  |  |  |  |  |  |
+--+--+--+--+--+--+
|  |  |  |  |  |  |
+--+--+--+--+--+--+
|  |  |  |  |  |  |
+--+--+--+--+--+--+
+--+--+--+--+--+--+
|1 |2 |3 |4 |5 |6 |
+--+--+--+--+--+--+
|7 |8 |9 |10|11|12|
+--+--+--+--+--+--+
|13|14|15|16|17|18|
+--+--+--+--+--+--+
|19|20|21|22|23|24|
+--+--+--+--+--+--+
|25|26|27|28|29|30|
+--+--+--+--+--+--+
|31|32|33|34|35|36|
+--+--+--+--+--+--+
Chaos:
Player's turn:
please choose a grid
12
please choose a piece type (O/X)
o
Your Input: position:12 symbol:O
outputs:
+--+--+--+--+--+--+
|  |  |  |X |O |O |
+--+--+--+--+--+--+
|  |X |O |  |  |O |
+--+--+--+--+--+--+
|  |  |  |  |  |  |
+--+--+--+--+--+--+
|  |  |  |  |  |  |
+--+--+--+--+--+--+
|  |  |  |  |  |  |
+--+--+--+--+--+--+
|  |  |  |  |  |  |
+--+--+--+--+--+--+
+--+--+--+--+--+--+
|1 |2 |3 |4 |5 |6 |
+--+--+--+--+--+--+
|7 |8 |9 |10|11|12|
+--+--+--+--+--+--+
|13|14|15|16|17|18|
+--+--+--+--+--+--+
|19|20|21|22|23|24|
+--+--+--+--+--+--+
|25|26|27|28|29|30|
+--+--+--+--+--+--+
|31|32|33|34|35|36|
+--+--+--+--+--+--+
Order:
Player's turn:
please choose a grid
18
please choose a piece type (O/X)
o
Your Input: position:18 symbol:O
outputs:
+--+--+--+--+--+--+
|  |  |  |X |O |O |
+--+--+--+--+--+--+
|  |X |O |  |  |O |
+--+--+--+--+--+--+
|  |  |  |  |  |O |
+--+--+--+--+--+--+
|  |  |  |  |  |  |
+--+--+--+--+--+--+
|  |  |  |  |  |  |
+--+--+--+--+--+--+
|  |  |  |  |  |  |
+--+--+--+--+--+--+
+--+--+--+--+--+--+
|1 |2 |3 |4 |5 |6 |
+--+--+--+--+--+--+
|7 |8 |9 |10|11|12|
+--+--+--+--+--+--+
|13|14|15|16|17|18|
+--+--+--+--+--+--+
|19|20|21|22|23|24|
+--+--+--+--+--+--+
|25|26|27|28|29|30|
+--+--+--+--+--+--+
|31|32|33|34|35|36|
+--+--+--+--+--+--+
Chaos:
Player's turn:
please choose a grid
24
please choose a piece type (O/X)
o
Your Input: position:24 symbol:O
outputs:
+--+--+--+--+--+--+
|  |  |  |X |O |O |
+--+--+--+--+--+--+
|  |X |O |  |  |O |
+--+--+--+--+--+--+
|  |  |  |  |  |O |
+--+--+--+--+--+--+
|  |  |  |  |  |O |
+--+--+--+--+--+--+
|  |  |  |  |  |  |
+--+--+--+--+--+--+
|  |  |  |  |  |  |
+--+--+--+--+--+--+
+--+--+--+--+--+--+
|1 |2 |3 |4 |5 |6 |
+--+--+--+--+--+--+
|7 |8 |9 |10|11|12|
+--+--+--+--+--+--+
|13|14|15|16|17|18|
+--+--+--+--+--+--+
|19|20|21|22|23|24|
+--+--+--+--+--+--+
|25|26|27|28|29|30|
+--+--+--+--+--+--+
|31|32|33|34|35|36|
+--+--+--+--+--+--+
Order:
Player's turn:
please choose a grid
30
please choose a piece type (O/X)
x
Your Input: position:30 symbol:X
outputs:
+--+--+--+--+--+--+
|  |  |  |X |O |O |
+--+--+--+--+--+--+
|  |X |O |  |  |O |
+--+--+--+--+--+--+
|  |  |  |  |  |O |
+--+--+--+--+--+--+
|  |  |  |  |  |O |
+--+--+--+--+--+--+
|  |  |  |  |  |X |
+--+--+--+--+--+--+
|  |  |  |  |  |  |
+--+--+--+--+--+--+
+--+--+--+--+--+--+
|1 |2 |3 |4 |5 |6 |
+--+--+--+--+--+--+
|7 |8 |9 |10|11|12|
+--+--+--+--+--+--+
|13|14|15|16|17|18|
+--+--+--+--+--+--+
|19|20|21|22|23|24|
+--+--+--+--+--+--+
|25|26|27|28|29|30|
+--+--+--+--+--+--+
|31|32|33|34|35|36|
+--+--+--+--+--+--+
Chaos:
Player's turn:
please choose a grid
2
please choose a piece type (O/X)
x
Your Input: position:2 symbol:X
outputs:
+--+--+--+--+--+--+
|  |X |  |X |O |O |
+--+--+--+--+--+--+
|  |X |O |  |  |O |
+--+--+--+--+--+--+
|  |  |  |  |  |O |
+--+--+--+--+--+--+
|  |  |  |  |  |O |
+--+--+--+--+--+--+
|  |  |  |  |  |X |
+--+--+--+--+--+--+
|  |  |  |  |  |  |
+--+--+--+--+--+--+
+--+--+--+--+--+--+
|1 |2 |3 |4 |5 |6 |
+--+--+--+--+--+--+
|7 |8 |9 |10|11|12|
+--+--+--+--+--+--+
|13|14|15|16|17|18|
+--+--+--+--+--+--+
|19|20|21|22|23|24|
+--+--+--+--+--+--+
|25|26|27|28|29|30|
+--+--+--+--+--+--+
|31|32|33|34|35|36|
+--+--+--+--+--+--+
Order:
Player's turn:
please choose a grid
14
please choose a piece type (O/X)
x
Your Input: position:14 symbol:X
outputs:
+--+--+--+--+--+--+
|  |X |  |X |O |O |
+--+--+--+--+--+--+
|  |X |O |  |  |O |
+--+--+--+--+--+--+
|  |X |  |  |  |O |
+--+--+--+--+--+--+
|  |  |  |  |  |O |
+--+--+--+--+--+--+
|  |  |  |  |  |X |
+--+--+--+--+--+--+
|  |  |  |  |  |  |
+--+--+--+--+--+--+
+--+--+--+--+--+--+
|1 |2 |3 |4 |5 |6 |
+--+--+--+--+--+--+
|7 |8 |9 |10|11|12|
+--+--+--+--+--+--+
|13|14|15|16|17|18|
+--+--+--+--+--+--+
|19|20|21|22|23|24|
+--+--+--+--+--+--+
|25|26|27|28|29|30|
+--+--+--+--+--+--+
|31|32|33|34|35|36|
+--+--+--+--+--+--+
Chaos:
Player's turn:
please choose a grid
20
please choose a piece type (O/X)
x
Your Input: position:20 symbol:X
outputs:
+--+--+--+--+--+--+
|  |X |  |X |O |O |
+--+--+--+--+--+--+
|  |X |O |  |  |O |
+--+--+--+--+--+--+
|  |X |  |  |  |O |
+--+--+--+--+--+--+
|  |X |  |  |  |O |
+--+--+--+--+--+--+
|  |  |  |  |  |X |
+--+--+--+--+--+--+
|  |  |  |  |  |  |
+--+--+--+--+--+--+
+--+--+--+--+--+--+
|1 |2 |3 |4 |5 |6 |
+--+--+--+--+--+--+
|7 |8 |9 |10|11|12|
+--+--+--+--+--+--+
|13|14|15|16|17|18|
+--+--+--+--+--+--+
|19|20|21|22|23|24|
+--+--+--+--+--+--+
|25|26|27|28|29|30|
+--+--+--+--+--+--+
|31|32|33|34|35|36|
+--+--+--+--+--+--+
Order:
Player's turn:
please choose a grid
26
please choose a piece type (O/X)
x
Your Input: position:26 symbol:X
outputs:
+--+--+--+--+--+--+
|  |X |  |X |O |O |
+--+--+--+--+--+--+
|  |X |O |  |  |O |
+--+--+--+--+--+--+
|  |X |  |  |  |O |
+--+--+--+--+--+--+
|  |X |  |  |  |O |
+--+--+--+--+--+--+
|  |X |  |  |  |X |
+--+--+--+--+--+--+
|  |  |  |  |  |  |
+--+--+--+--+--+--+
Game Over
winner is Order
Team name       Score   Round
Chaos   0       1
Order   1       1
Do you want to play again?(y/n)
n
Input: no
Thank you for playing!
Chaos won 0 times.
Order won 1 times.
There were 0 stalemates.
GoodBye