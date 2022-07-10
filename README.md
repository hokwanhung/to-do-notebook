# Learnt-from-Universities
Diverse fields of knowledge related to CS learnt from universities.

## CS-Knowledge
  1. Data Structures(unfinished): https://github.com/travrs629/Learnt-from-Universities/blob/main/CS-knowledge/data-structure.md
  2. Software Engineering(unmodified): https://github.com/travrs629/Learnt-from-Universities/blob/main/CS-knowledge/software-engineering.md
  3. Java Swing Navigation Table: https://github.com/travrs629/Learnt-from-Universities/blob/main/CS-knowledge/java-swing-navigation-table.md

## Self-made-Tools
   1. detect-Input-Type method
      - Detect input type and continuously requesting users until the correct type (integer) is given.
      - A detection of String "STOP" is included to exit the execution.
      - Returns a String instead of integer so as to fits with the detection of String "STOP".
      - The conversion of String to integer, as well as the stop of execution, relies on the main method (and the if-else statement inside).
      - The input of the method detectInput(String detectTarget) also request the user's input to be in a string form, though the user never knows.
   2. HTMLConverter_v0
      - Even with **Writage**, some of the formatting might still be wrong (i.e. in my case it is listing in table).
      - As a result, I created a very rough program that allows me to implement different tags into the field, half-manually, so I can spare my hands from doing the same work over and over again.
      - Current version allows:
         - Insert /<li/> tag before and after the text.
         - Insert the /<br/> tag before the text.

## Progress-Works
   1. detect-Prime-Number
      - One of the exercise I did when I started to learn programming.
      - Aims to find the biggest prime number between 1 and the user's input.
      - Definition of prime number is that it can only be divisible by 1 and itself.
         - If the number(n) is divisible by other integers(i), it is not a prime number.
         - `n % i == 0`, n is not a prime number.
      - If the (Divisor) > (Dividend)/2, there must be a remainder when testNumber modulus testTool.
   2. print-Out-Diamond-With-3-Loops-Simple-Version
      - A classwork requires us to print out a diamond shape in 3 for loops.
      - The initial version that I finished the task, with the Math.abs() method used as the task recommended.
      - "Divide and conquer" method is used to seperate the diamond into two parts.
      - The equations found is more based on listing out cases and finding the common factors.
   3. print-Out-Diamond-With-3-Loops-Advanced-Version
      - An upgrade version of the classwork, though the max. no. of lines is inserted by the user.
      - Better structures using multiple "if-else" statements and mathematical calculations.
      - "Divide and conquer" method is also used as the above one.
      - The program view the no. of spaces and stars as a whole first, and then print out both of them seperately.
   4. Farmer-Wolf-Goat-and-Cabbage-Problem (de-valued)
      - A modified version of our school's example.
      - By examinating the representation of a state (including start state and goal state), as well as safe state(excluding both start state and goal state):
         - Whenever the side is, as long as the goat is with the man, the condition is safe.
         - Whenever the side is, as long as the goat is with neither wolf nor cabbage, the condition is safe.
      - Then listing out all operators, the problem becomes a far easy question to deal with.
  5. Monopoly-on-MVC
      - A Monopoly game based on the MVC model. 
      - More information on: https://github.com/travrs629/Learnt-from-Universities/blob/main/Progress-Works/MVC-based-Monopoly/version-control.md

## How-to-Understand-Something
<img src="https://github.com/travrs629/Learnt-from-Universities/blob/main/How-to-Understand.jpg" height=600px width=515px>
