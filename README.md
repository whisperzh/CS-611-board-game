# CS611-<1>
## <Board game of Tic-tac-toe and Order and Chaos>
---------------------------------------------------------------------------
<Renming Zhang>
<Student Email>
<U97677301>

## Files
---------------------------------------------------------------------------
<A brief description of each file and what it does>

## Notes
---------------------------------------------------------------------------
1. <Files to be parsed should be stored in ConfigFiles, for parser class to
   read class>
2. <Bonus Done>             Yes,the Game is team based, can have multiple teams, and team can have multiple players; and the winner is also team based
3. <Notes to grader>

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