# java_related
## Rules:
   1. Try to use my own language to explain the knowledge(unless it used up too much time).
   2. Do revision before going to bed every day.
   3. **Test the codes immediately after a part is finished.**
   4. **If a task is complicated, break the project down with sub-methods with requirements for every one of them.**
## Tricks for Github documenting:
   1. The quotes in the quoting code do not follow any other Github documenting rules.
   2. No need to add spacebars to seperate lines before and after quotes.
   3. No need to add spacebars to seperate lines if blank line technique is used.
   4. Spacebar after listing codes are required.
   5. It seems to be a nested list if add 3 spacebars to any kind of lists(don't know why tho).
   
## 2020.12.18
**1. How to insert PI into calculation?**
   - ans: `Math.PI`
   - explanation: static double in Class `Math` (java.lang.Math - no requirement for installation of the class.))

**2. How to cor. to decimal places (For example 4 decimal places)?**
   - ans:
   ```
   DecimalFormat [variableName] = new DecimalFormat(#.####)
   *[variable].setRoundingMode(RoudingMode [roudingMode]) (optional)*
   [variable].format([inputVariableName])
   ```
   - explanation: 
      - subclass of `NumberFormat` (the naming explains itself)
      - [roudingMode] e.g. CEILLING / DOWN / FLOOR / UP
                   
**3. What is try-and-catch in Java Exceptions?**  
   - ans:
     ```
     try {  
     // Block of code to try  
     } catch (Exception e) {  
     // Block of code to handle errors  
     } *finally {  
     // Block of code to be executed regardless the result (optional)
     }*
     ```  
   - explanation: "Swallow the errors" with codes in the catch block instead of stop executing the codes when errors happen.
     
**3a. What is the difference between `break` statement, `continue` statement and `return` statement, and how to use them?**
   - ans:
      - `break` is used to exit from the loop.
      - `return` is used to go back to the step where the method was called or to stop further execution. 
      - `continue` is used to break one iteration in the loop and continues with the next iteration.
    
**3b. Why is `try-and-catch` and `while(true)` not recommened in java?**
   - ans: 
      - The usage of `while(true)` depends on situations whether `while(true)`+`break` or `boolean(flag)` fits better.
         - for the boolean(flag) method, just need to `while(flag)`. (no need to add "=" inside)
      - For `try-and-catch`, appears to be discussion about whether stop when errors happens is good or not.
      - **At least, it seems to be a good habit to not catch all exception, only the exception in needed.**
          
**4. How to power up a number?**
   - ans: `Math.pow([baseDouble], [exponentDouble])`
   - explanation:
      - **Noticeably, java allows the usage of nested methods.**
      - **It is more appriopriate to use double type in mathematics calculation.**

**5. How to root down a number?**
   - ans: `math.sqrt([variableName])`
   
**6. How to convert from String to integer?**
   - ans: `[variableName] = Integer.parseInt([stringName])`
   - explanation: Scan through the string to find any integer value.

## 2020.12.19
**7. How to check if the input is a positive number, zero or a negative number?**
   - ans: `Integer.signum([variableName])`
   - explanation: Positive number = "1", zero = "0" and negative number = "-1".
   
**8. What is object-oriented programming?**
   - ans: **Encapsulation + Abstraction + Inheritance + polymorphism**
   - explanation: 
      - Spegatti coding (Proceduaral Programming) = coding with loads of interdependent functions, which makes regulation much harder. 
      - Encapsulation = the grouping of related variables(referred as property) and functions (referred as methods) into a unit(referred as object).
         - Parameters are less to not required as it would be automatically collected to the function.  
         - Reduce complexity + increase reusability
      - Abstraction = Most of the variables and functions are hidden from the surface, showing only essential parts of the codes.
         - Reduce complexity + isolate impact of changes.
      - Inheritance = a mechanism allowing reduction of redundant codes.
         - Eliminate redundant codes.
      - Polymorphism = contains "many forms" allowing long swtich-case statements used to determine what to run into simplier one function.
         - Refactor ugly switch/case statements.
         
**8a. What is java method?**
   - ans:
      - method = block of code only runs when it is called.
      - data (known as parameters) are passed into the method.
      - certain actions are performed (known as functions) in the method.
         - public = visible and callable from other objects of other types. (other types includes private, protected, package, package-private)
         - static = associated with class, cacn be called without creating an object of the class.
         - void = has no return value
         - int = return an integer value
         
**8b. What is global and local variables, and how it interacts with methods?**
   - ans:
      - There is no global variables in java.
         - Access are free to all functions so it is hard to get track on in large projects.
         - Codes are less clear if global variables are used usually.
         - Variables can be passed instead.
      - Way to make global variables in java:
      ```
      public class Example {
         public static int a;
         public static int b;
      }
      Example.a;
      Example.b;
      ```
      - The goal of using global variables is to access and change values of the variables through multiple functions. However, there could be better ways to dealing with it(passing the variables).

**8c. How to pass variables between multiple methods and functions in java?**
   - ans:
      1. either choose to return values by using something other than `void`
      2. Using the Inheritance mechanism in java.
         - class [subclassName] extends [SuperclassName] ([subclassName] IS-A [SuperclassName] relationship)
         - subclass can access the field of both itself and its parent class.
         - Multiple inheritance are not preferred in java to prevent confusion in executing.
         - Multiple return types are not allowed in java method.

**9. How to check if a double is also an integer?**
   - ans:
      - There are many ways on performing such actions:
      ```
      if ((variable == Math.floor(variable)) && !Double.isInfinite(variable)) {
         // integer type
      }
      ```
      ```
      (d % 1) == 0
      ```
      ```
      public static boolean isInt(double d) {
         return d == (int) d;
      }
      ```
      
**10. Double or float, which one of them has a bigger range?**
   - ans: Double is more precise as it can represents more decimal points.
   
**11. Does switch statement supports range?**
   - ans: No.
   
**12. How to print three blank lines?**
   - ans:
      1. `System.out.print("\n\n\n")`
      2. 
      ```
      System.out.println();
      System.out.println();
      System.out.println();
      ```
      3. Use a loop with the above techniques
   
**13. How to use switch in a better way?**
   - ans: 
      - *`break` = breaks out of the switch block (optional)*
         - Stop the execution of more code and case testing inside the block.
      -  *`default` = specifies some code to run if no case is matched.(optional)*
   ```
   switch(expression) {
      case x:
         // code block
         break;
      case y:
         // code block
         break;
      default:
        // code block
   }
   ```
**14. How to compare strings?**
   - ans:
      - **`==` tests for reference equality(whether they are the same object).**\
         - ** It works with int and more as it is directed to handling the values in such cases.**
         - **In condition judgements, "==" must be used instead of "=". Although no errors are shown.**
      - **`.equals()` tests for value equality(whether they are logically "equal").**
      - **`Objects.equals()` checks for `null` before calling `.equals()` so you don't have to(PreferredMethod)**
         - Prefferred always unless dealing with interned string.
         - [Best ans I ever seen](https://stackoverflow.com/questions/513832/how-do-i-compare-strings-in-java)
      - **`String.equalsIgnoreCase()` value equality that ignores case.**
      - **`String.contentEquals()` compares the content of the `String` with the content of any `CharSequence`.**
         - No need to turn the StringBuffer into a String before comparison.
         - Need to do the null checking.
      ```
      // These two have the same value
      new String("test").equals("test") // --> true 

      // ... but they are not the same object
      new String("test") == "test" // --> false 

      // ... neither are these
      new String("test") == new String("test") // --> false 

      // ... but these are because literals are interned by 
      // the compiler and thus refer to the same object
      "test" == "test" // --> true 

      // ... string literals are concatenated by the compiler
      // and the results are interned.
      "test" == "te" + "st" // --> true

      // ... but you should really just call Objects.equals()
      Objects.equals("test", new String("test")) // --> true
      Objects.equals(null, "test") // --> false
      Objects.equals(null, null) // --> true
      ```

**15. What is a if-else statement?**
   - ans: 
      - if = specify a block of code to be executed, if a specified condition is true.
      - else = specify a block of code to be executed, if the same condition is false.
      - else if = specify a new condition to test, if the first condition is false.
  
## 2020.12.21
**16. Any alternative for `Integer.parseInt(String)?`**
   - ans: `Integer.valueOf(String)`
   - explanation: 
      - `parseInt(String)` returns a primitive `int`.
      - `valueOf(String)` returns a `new` `Integer()` object.
      
**16a. What is primitive types?**
   - ans: Most basic data types (a total of 8 types) available within the Java Language.
   - explanation: boolean, byte, char, short, int, long, float and double.
   
**16b. How do we convert `int` to `String`?**
   - ans: `Integer.toString()` or `String.valueOf()`
   - explanation:
      - `toString()` method pass a `Integer` class'object through and return a `String`.
      - `valueOf()` method allows both integer (as an `int` or `Integer`) and returna a `String`.

**16c. What is an `Integer` class objects?**
   - ans: `Integer class` is a wrapped class for the primitive type `int` to perform serveral actions.
   - Explanation: 
      - For example, to convert an `int` into a `String`.
      - An `object` of `Integer class` can hold a single `int` value.
      
**17. How can I make a try-and-catch method with while loop function?**
   - ans: Use a  `while` loop (either with `true and break` or `boolean(flag)`) to wrap the try-and-catch method.
   
**18. What if I construct a `switch` statement with no `break`?**
   - ans: The flow of control would fall through to subsequent cases until a break is reached.
   
**19. Can a string type do math calculations?**
   - ans: Through some advanced techniques, yes I guess.

## 2020.12.22
**20. Introduce some simple math functions?**
   - ans:
      - `Math.random()`
         - Generate a doulbe number equals to 0.0 and less than 1.0.
      - `Math.round()`
         - Rounds a double number to the nearest integer.
      - `Math.floor()`
         - Rounds a double number downward to the nearest integer (returns in double type).
      - `Math.ceil()`
         - Rounds a double number upward to the nearest integer (returns in double type).
         
**21. What about doing calculation in `return`?**
   - ans: simple calculation is acceptable, but it's better to assign it to a variable first for better clarification.
   
**22. How to do more than one increment?**
   - ans: for example, `i+=2`

**23. How to find out a prime number?(Insufficient answer)**
   - ans: `2n+1`
   - explanation: 
      - Prime no. is a number only divisible by 1 and itself.
      - Every `2n+1` is a prime number.
      - n is the available range of divisor as if number bigger than n must have remainder.
        - As `divisible` means there should be no remainder(the quotient must be an integer.)
        
**24. How do we convert a `double` into an `integer`?**
   - ans: 
      - `int [newVariableName] = (int) [doubleVariableName]`
         - Typecasting technique, truncates all digits after decimal point (~Math.floor()).
      - `Math.round()`
         - As above in Q20.
      - `iny [newVariableName] = [doubleVariableName].intValue()`
         - Also truncates all digits after decimal point (~Math.floor()).
         
**24a. What is typecasting techniques?**
   - ans: Assignment of one primitive data type to another with a value.
   - explanation: 
      - **Widening Casting (automatically): `byte` to `short` to `char` to `int` to `long` to `float` to `double`**
      - **Narrowing Casting (manually): Vice versa.**
         - **It's nothing wrong if a `double` type of data is actually an integer and thus narrowing it down to `int`.**
         - **However, this technique should not be used if a data has contains information that only current data type owns.**
      
**25. What does `>>` do in java?**
   - ans: `>>` shifts the bits towards the right one bit.
   - explanation:
      - Binary devices represents numbers as a sequence of 1s and 0s.
      - `>>` is part of the Bitshifting, which moves those sequences of 1s and 0s left or right.
         - `>>=` means `[variable] = [variable] >> 1/0` (one of the short-hand operators).
 
**26. How to define an array?**
   - ans: `[dataType][] [variableName] = {[value], [value], ...}` or `[dataType][] [variableName] = new [dataType][[numbers]]`
   - Explanation: The first one defines an array with actual values while the second one only reserves spots for values.
  
**26a. How to pass an array to methods?**
   - ans: for example, `public static void [methodName](int[] [arrayName])`
   - explantion: just like any other variables.
   
## 2020.12.30
**27. How to detect whether an integer is odd or even?**
   - ans: `if ((x % 2) == 0) { even... } else { odd... }` or `if ((x & 1) == 0) { even...} else { odd... }`
   - explanation:
      - The first one is to check by modulus the target by 2.
      - The second one is to check the low bit if it is set off, which would be an even number.
      
**27a. What is the differences between `&` and `&&`?**
   - ans: 
      - `&` is bitwise while `&&` is logical.
      - `&` evaluates both sides of the operation.
         - Any change in the data values due to the conditions will only be reflected in this case.
      - `&&` evaluates the left side of the operation, if it is `true`, it continues and evaluates the right side.
         - If any condition is false, it does not evaluate the statment any further.
      
**27b. What is `&`?**
   - ans: 
      - As a relational operator(check the above 27a).
      - As a Bitwise AND: & operator.
         - Used for adding Bitwise numbers in Java.

**27c. What is Bitwise numbers?**
   - ans: binary numbers stored in the form of integers.
   - explanation: All encoding and decoding of data is done in bits, as packing of a huge amount of information into a tiny space.

**28. How does integer performs division?**
   - ans: **If an integer performs division, the remainder would be thrown away.**
   
## 2020.12.30
**29. What is the difference between dash and underscore?**
   - ans:
      - dash `-` is originally preferred in search engine, especially Google from a long time ago.
         - That becomes a traditions to many websites and documents as well.
      - Questionable guess:
         - underscore `_` is treated as a single string of non-white character while dash `-` is treated as two single words.
