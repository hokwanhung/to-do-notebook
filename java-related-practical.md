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
      
**10. `Double` or `float`, which one of them has a bigger range?**
   - ans: `Double` is more precise as it can represents more decimal points.
   
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
         - Generate a `doulbe` number equals to 0.0 and less than 1.0.
      - `Math.round()`
         - Rounds a `double` number to the nearest integer.
      - `Math.floor()`
         - Rounds a `double` number downward to the nearest integer (returns in `double` type).
      - `Math.ceil()`
         - Rounds a `double` number upward to the nearest integer (returns in `double` type).
         - **If a `int` is inserted, any calculation inside `Math.ceil()` would already be rounded down, resulting in no `Math.ceil()`.**
         
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
         
**30. What is `printf()`?**
   - ans: **`printf()` and `format` after `System.out.` is similar to `print()` and `println()`, but with more control with the number outputed.**
   - explanation: 
      - `print()` and `println()` converted the arbitrary mixture of strings and numbers into some kind of string.
      - This is how it works: `public [PrintStream] format(String [format], Object... [args]])`
         - `format` = a format string specifying how the objects in the second parameter, `[args]` are to be formatted.
         - contains plain text as well as `format specifiers`

**30a. What is a `format specifiers`?**
   - ans: special characters formatting the arguments of `object... [args]`(also called `varargs` - varying numbers of arguments).
   - explanation: Begins with a percent sign(%) and end with a converter.
      - converter = a character indicating the type of argument to be formatted
      - for example:
         - `%d` = specifies the single variable as a decimal integer.
         - `%n` = a platform-independent newline character(appriopriate to the platform running the application).
         - `.3` = three places after decimal point
         - `8 = eight characters in width, with leading zeros as necessary(i.e. place zeros if not in eight chracters).
         - `10.3` = ten characters in width, right justified, with three places after decimal point(i.e. place a space if not in ten characters).
         - `+` = Include sign, whether positive or negative.
         - `-` = left-justified.
         - `td, te` = A date & time conversion.
   
**30b. How to convert a `double` into a `float`?(besides the range difference mentioned in Q10)**
   - ans: end the `double` with `f`, such as `float [newVariableName] = [doubleValue]f`
   - explanation: `float` is less precise than `double`, with only 32-bi precision IEEE 754 floating point.
   
**31. What is `Arrays.deepToString()`?**
   - ans: returns string representation of `arr[]`
   - explanation: `toString()` works for simple arrays instead of multidimensional arrays.
      - This method is designed for converting multi-dimensional arrays to strings.
      
**32. How to assign an array size for primitive type?**
   - ans: (for exmaple int)
      - `int[] [arrayName] = new int[[arrraySize]]`
      - `int[] [arrayName] = {...[values]}`
      - `int[] [arrayName] = new int[]{...[values]}`
      - **Remember all array starts from zero.**
      
**33. How to assign an array value afterward?**
   - ans: `[arrayName][[no. of row]][[no. of column]] = [value]`

**34. What does it means by `throw [exception]`?**
   - ans: **Indication that this method might throw one of the listed type exception.**
   - explanation: and thus similar to just ignore it.
   
**35. what is `bufferedwriter` class?**
   - ans: **It writes text to character-output stream, buffering characters.**
   - exxplanation:
      - Constructor: `BufferedWriter(Writer out, int [size])` Creates a buffered character-output stream.
         - If no size is given, it uses a default output stream.
      - Method: 
         - `write(int [arg])` = writes a single chracter that is specified by an integer argument.
         - `write(String [arg], int [offset], int [length])` = writes String in the file according to its arguments.
         - `newLine()` = breaks/separates line.
         - `flush()` = flushes character from writer buffer.
         - `close()` = flushes character from writer buffer and then close it.

**36. What is a `Filewriter` class?**
   - ans: Used for writing streams of characters.
   - explanation: 
      - Constructors:
         - `FileWriter(File [fileName])` creates a File object.
         - `Filewriter(File [fileName], boolean [append])` creates a `FileWriter` object given a `File` object with a boolean indicating whether or not to append the data writtern.
         - `FileWriter(FileDescriptor [fileDescription])` createws a `FileWriter` object associated with the given file descriptior.
         - `FileWriter(String [fileName])` creates a `FileWriter` object, given a file name.
         - `Filewriter(String [fileName], boolean [append])` creates a FileWriter object 
      - Methods:
         - `write(int [character]) throws IOException` writes a single character.
         - `write(char [character], int [offset], int [length])` writes a portion of an array of characters starting from offset and write a length of len.
         - `write(String [string], int [offset], int [length])` write a portion of a String from offset and with a length of len.

##2021.01.01
**37. What is a `System.getenv()`?**
   - ans: Gets the value of the specified `environment variable`.
   - explanation: `environment variable` = system-dependent external named value.
      - Used when a global effect is desired, or when an external system interface requires an environment variable e.g. PATH.
         
**38. what is a `trim()`?**
   - ans: a build-in function that eliminates leading and trailing spaces.
   - explanation: Check the Unicode value of space character "\u0020" and returns the omitted string.
   
**39. What is a `nextLine()`?**
   - ans: returns the line that was skipped (~Print out the line until a "\n" is met).
   
**40. What is a `.length` and `.length()`?**
   - ans: `[arrayName].length` and `string.length()`
   - explanation: 
      - The first one is used to obtain the size of an array.
      - The second one is used to obtain the number of characters presents in the string.
      
**41. What is a `split()`?
   - ans: It breaks a given string around matcches of the given regular expression.
   - explanation: 
       - `split(String [regex], int [limit])`
       - **To be continued...**
       
**42. What is `Integer.MAX_VALUE` and `Integer.MIN_VALUE`?**
   - ans:
      - `Integer.MAX_VALUE` = 2^31 - 1 = 2147483647
      - `Integer.MIN_VALUE` = -2^31 = -2147483648

**43. what is the value range of all primitive variable type?**
   - ans: **Type - Size - Range**
      - `byte` - `8 bits` - `-128 ... 127`
      - `short` - `16 bits` - `-32,768 ... 32, 767`
      - `int` - `32 bits` - `-2,147,483,648 ... 2,147,483,647`
      - `long` - `64 bits` - `-9,223,372,036,854,775,808 ... 9,223,372,036,854,775,807`
         - The `long` data type is a 64-bit two's complement integer.
      - `float` - `32 bits` - `3.40282347 x 10^38, 1.40239846 x 10^-45`
      - `double` - `64 bits` - `1.7976931348623157 x 10^308, 4.9406564584124654 x 10^-324`
      
**43. What is the `BigInteger` and `BigDecimal`class?**
   - ans: Used for mathematical operation involving very big integer calculations that are outside the limit of all available primitive data type.
   - explanation: The methods and compostors are actually similar to `Integer` data type.
      - `BigInteger` takes care for integers while `BigDecimal` takes care for decimal digits.
      
**43a. How to use the `BigInteger` class?**
   - ans:
      - Initializing the variable: `BigInteger [variableName] = new BigInteger([stringValue]);`
         - Some constants are defined in BigInteger class already, e.g. `.ONE`, `.ZERO` and `.TEN`
      - Converting to `BigInteger`: `[varialbeName] = BigInteger.valueOf([intValue]);`
      - Mathematical operations:
         - Adding two variables: `BigInteger [variableName] = [firstVariableName].add([secondVariableName])`
         - Other similar functions: `.subtract()`, `.multiply()`, `.divide()` and `.remainder()`
      - Converting to other data type: 
         - To `int`: `[BigIntegerVariableName].intValue()`
         - To `long`: `[BigIntegerVariableName].longValue()`
         - To `string`: `[BigIntegerVariableName].toString()`
         - For `int` and `long`, the value should within its limits.
      - Comparing `BigInteger`: `if ([firstVariableName].compareTo([secondVariableName] < 0))` = `if ([firstVariableName] < [secondVariableName])`
         - `compareTo()` returns -1(less than), 0(Equal) and 1(greater than) according to values.
      - Comparing `BigInteger`(equality): `if ([firstVariableName].equals([secondVariableName]))`
      - More methods of `BigInteger` class: [BigInteger Class in Java](https://www.geeksforgeeks.org/biginteger-class-in-java/)
         

**43b. When do use `new BigInteger` and `BigInteger.valueOf()`?**
   - ans: 
      - `new BigInteger`
         - The `BigInteger` would represent the `value` as accurately as possible, resulting in a lot mor digits being stored.
         - It is more correct than `valueOf()`, but also a lot less intuitive.
         - `0.1` cannot be represented by `double` as a binary fraction of any finite length.
         - Any value passed by may not exactly equal to `0.1`(the target value).
      - `BigInteger.valueOf()`
         - Use the [canonical `String` representation](https://docs.oracle.com/javase/7/docs/api/java/lang/Double.html#toString%28double%29) of the `double` value passed in to inistantiate the `BigInteger` object.
         - The value of the `BigInteger` object would be exactly of `System.out.println([variableName])`
   - explanation:
      - Generally, if the result is the same, `valueOf()` should be preferred.
         - It can do caching of common values and even change the caching behaviour without the caller having to be changed.
         - `new` will always instantiate a new value, even if not necessary (best example: `new Boolean(true)` vs ``)
   
**44. How to take care of very big `int`(integers)?**
   - ans:
      - Either to use the `BigInteger` class
      - Or to create a class for yourself: [How to handle very large numbers in Java without using java.math.BigInteger](https://stackoverflow.com/questions/5318068/how-to-handle-very-large-numbers-in-java-without-using-java-math-biginteger/5318896)

**45. What is `scope`?**
   - ans: **To be continued**

## 2020.01.05
**46. How to make an array size to be dynamic?**
   - ans: 
      - Either to allocate it first and readjust the size later,
      ```
      int[] oldItems = new int[10];
      for (int i = 0; i < 10; i++) {
          oldItems[i] = i + 10;
      }
      int[] newItems = new int[20];
      System.arraycopy(oldItems, 0, newItems, 0, 10);
      oldItems = newItems;
      ```
      - Or to use `ArrayList` to take care of the logic for growing array.
         - Generally preferred solution.

**46a. How to create and use an `ArrayList`?**
   - ans:
      - Declaring the array: `ArrayList<Integer> [arrayName] = nbew ArrayList<Integer>([sizeValue])`
      - Appending new elements: `[arrayName].add([value], [object])`
         - The `object` is used to add the element at a specific index, which the value in the original index would be index + 1.
      - Printing the array: `System.out.println([arrayName])`
      - Removing elements: `[arrayName].remove([index]/[value])`
      - Printing one of the elements: `System.out.println([arrayName].get([index]))`
      - Changing one of the elements: `[arrayName].set([index], [value])`
      - Iteration on the array(alternative):
      ```
      for (String str : al) {
         System.out.print(str + " ");
      }
      ```
      
**46b. How to convert from an `ArrayList` to an `array`?**
   - ans:
      - `Object[] [arrayName] = [arrayListName].toArray();`
         - Typecasting is required before using as `Integer` Object.
         ```
         for (Object obj : [arrayName]) {
            // Lines of codes
         }
         ```
         - A solution is to create an array into which elements of List need to be stored and pass it as an argument in `toArray()` method to store elements if it is big enough.
      - `Integer[] [arrayName] = new Integer[[arrayListName].size()]` + `[arrayName] = [arrayList].toArray([arrayName])`
         - If the new array(passed array) does not have enough space, a new array is created with same type and size of the given list.
         - If the passed array has sufficient space, the array is first filled with list elemetns, then null values are filled.
         - Generics = parameterized types, e.g. `Integer`, `String`(the exact opposite of the `primitive data type`).
      - Manually converting `ArrayList` using `get()` method,
      ```
      Integer[] [arrayName] = new Integer[[arrayListName].size()];
      for (int i = 0; i < [arrayListName].size(); i++) {
         [arrayName][i] = [arrayNameList].get(i);
      ```
      - Using streams API of collections to convert to array of primitive int type.
      ```
      int[] [arrayName] = list.stream().mapToInt(i -> i).toArray();
      ```

## 2021.01.06
**47. How to do a factorial of something?**
   - ans: 
   ```
   Recursive:
   // Java program to find factorial of given number 
   class Test 
   { 
       // method to find factorial of given number 
       static int factorial(int n) 
       { 
           if (n == 0) 
             return 1; 

           return n*factorial(n-1); 
       } 

       // Driver method 
       public static void main(String[] args)  
       { 
           int num = 5; 
           System.out.println("Factorial of "+ num + " is " + factorial(5)); 
       } 
   } 
   Iterative Solution:
   class Test 
   { 
       // Method to find factorial of given number 
       static int factorial(int n) 
       { 
           int res = 1, i; 
           for (i=2; i<=n; i++) 
               res *= i; 
           return res; 
       } 

       // Driver method 
       public static void main(String[] args)  
       { 
           int num = 5; 
           System.out.println("Factorial of "+ num + " is " + factorial(5)); 
       } 
   } 
   Using Ternary operator:
   // Java program to find factorial 
   // of given number 
   class Factorial { 

     int factorial(int n) 
     { 

       // single line to find factorial 
       return (n == 1 || n == 0) ? 1 : n * factorial(n - 1); 

     } 


     // Driver Code 
     public static void main(String args[])      
     { 
       Factorial obj = new Factorial(); 
       int num = 5; 
       System.out.println("Factorial of " + num +  
                         " is " + obj.factorial(num)); 
      } 
   ```
   - explanation: 
      - `Recursive` = the process of defiming a problem (or the solution to a problem) in terms of (a simpler version of) itself.
         - Do tasks that are too complex for an iterative approach.
      - `Iteration` = the repetition of a process or utterance.

**47a. What is a `ternary operator`?**
   - ans: `variable(resultant value) = Expression1 ? Expression2(true) : Expression3(false)`
   - explanation: The only conditional operator that takes three operands.
      - Used in place of `if-else` conditions or even switch conditions using nested ternary operators.
      - Useful in simplifying the `if-else` condition, and used a lot.

**47b. What is `recursive AI`?**
   - ans: Used in data structure algorithms like local search algorithms that can be used in AI.
   - explanation: 
      - BFS(Breadth-first search) = an algorithm for traversing or searching tree or graph data structures.
      - DFS(Depth-first search) = an algorithm for traversing or searching tree or graph data structures.
      - MEA(means-end analysis) = a problem-solving technique used commonly in artificial intelligence for limiting search in AI programs.
      
**48. Explain the Modular Arithmetics?**
   - ans: Some already explaiend in `Road-to-a-Gold-Medal Q5`
      - **Modulus arithmetics:(Some explained in Q5 already)**
         - Properties of addition in modular arithmetic:
         ```
         If a+b=c, then a(modN)+b(modN)≡c(modN).
         If a≡b (modN), then a+k≡b+k (modN) for any integer k.
         If a≡b (modN) and c≡d (modN), then a+c≡b+d (modN).
         If a≡b (modN), then −a≡−b (modN).
         ```
         - Properties of multiplication in modular arithmetic:
         ```
         If a⋅b=c, then a(modN)⋅b(modN)≡c(modN).
         If a≡b (modN), then ka≡kb (modN) for any integer k.
         If a≡b (modN) and c≡d (modN), then ac≡bd(modN).
         ```
         - Property of exponentiation in modular arithmetic:
         ```
         If a≡b (modN), then a^k≡b^k (modN) for any positive integer kk.
         ```
         - Property of division in modular arithmetic:
         ```
         If gcd(k,N)=1 and ka≡kb modN), then a≡b (modN).
         If k(a - b) is a multiple of N and gcd(k, N) = 1, then N must divide a - b,or equivalently, a≡b (mod N).
         ```
         - Property iof multiplicative inverses:
         ```
         If a and N are integers such that gcd(a,N)=1, then there exists an integer x such that ax≡1 (modN).
         x is called the multiplicative inverse of aa modulo N.
         ```
         
**49. How to obtain the length of a multi-dimensional array?**
   - ans: for example, a two-dimensional array:
      - `first array size: [arrayName].length`
      - `second array size: [arrayName][[indexOne]].length`
         - Get the length of the array in that specific index(especially useful when the array length of every row is not the same).
      - `third array size: [arrayName][[indexOne]][indexTwo].length`

**50. What is `int64`?**
   - ans: a data type in `Matlab`(needs more explanations).

## 2020.01.08
**51. What is the `gcd`?**
   - ans:
      - Brute Force
      ```
       int gcdByBruteForce(int n1, int n2) {
       int gcd = 1;
       for (int i = 1; i <= n1 && i <= n2; i++) {
           if (n1 % i == 0 && n2 % i == 0) {
               gcd = i;
           }
       }
       return gcd;
      }
      ```
      - Euclid's Algorithm: 
         - If the smaller number is subtracted from the larger number, the GCD doesn't change - therefore, if we keep on subtracting the number finally end up with their GCD.
         - When the smaller number exactly divides the larger number, the smaller number is the GCD of the two given numbers.
      ```
      int gcdByEuclidsAlgorithm(int n1, int n2) {
         if (n2 == 0) {
           return n1;
         }
         return gcdByEuclidsAlgorithm(n2, n1 % n2);
      }
      ```
      - Stein's Algorithm or Binary GCD Algorithm:
      ```
      To be continued
      ```
      
**52. How to use a `Scanner` class?**
   - ans: Used for obtaining the input of the primitive types like `int`, `double`, etc. and `string`.
      - The easiest way to read input, though not very efficient if you want an input method for scenarios where time is a constraint.
   - explanation: 
      - The predefined object `System.in` is passed, which represents the standard input stream.
         - An object of class `File` is passed if we want to read input from a file.
      - To read numerical values of a certain data type `Xyz`, the function to use is `nextXyz()`.
         - For example, to read a value of type `short`, we can use `nextShort()`.
      - To read `string`, we use `nextLine()`.
      - To read a single character, we use `next().charAt(0)`.
         - `next()` function returns the next token/word in the input as a string.
         - `charAt(0)` function returns the first character in that `string`.
      - To check if the next value we read is of a certain type or if the input has ended(EOF marker encountered).
         - Check if the scanner's input is of the type we want with the help of `hasNextXyz()` functions where `Xyz` is the type we are interested in.
         - To check for a string, we use `haxNextLine()`.
         - To check for a single character, we use `hasNext.charAt(0)`.

**52a. What is a `token`?**
   - ans:
      - Keywords: pre-defined or reserved words used to perform a specific function.
      - Identifiers: used as the general terminology for naming of variables, functions and arrays(user-defined).
      - Constants/Literals: similar to normal variables, but cannot be modified by the program once they are defined(fixed values).
      - Special Symbols: symbols used as having some special meaning.
         - Brackets`[]`: used as array element reference, indicating single and multi-dimensional subscripts.
         - Parentheses`()`: used to indicate function valls and function parameters.
         - Braces`{}`: marks the start and end of a block of code containing more than one executable statement.
         - Comma`,`: used to separate more than one statements like for separating parameters in function calls.
         - Semi-colon`;`: an operator that essentially invokes something called an initialization list.
         - Asterick`*`: used to create pointer variable.
         - Assignment operator`=`: used to assign values.
      - Operators:
         - Arithmetic Operators
         - Unary Operators
         - Assignment Operator
         - Relational Operators
         - Logical Operators
         - Ternary Operator
         - Bitwise Operators
         - Shift Operators
         - Instance of operator
         - Precedence and Associativity
  
## 2020.01.10
**53. How to use faster `I/O` in Competitive Programming?**
   - ans:
      - `Scanner` class
         - Easy, less typing, but very slow(`Time Limit Exceeds` are always found in `Scanner`).
         - Used built-in `nextInt()`, `nextLong()`, `nextDouble()` methods to read the desired object after initiating `scanner` object with input stream.
      - `BufferedReader` class
         - Fast, but requires lots of typing.
         - `Java.io.BufferedReader` class reads text from a chracter-input stream, buffering characters so as to provide for the efficient reading of characters, arrays and lines.
         - The value would have to be parsed every time for desired type.
         - Reading multiple words from single line adds to its complexity because of the use of `Stringtokenizer`.
         - Gets accepted with a running time of approx 0.89s.
      - Userdefined `FastReader` class
         - Uses the time advantage of `BufferedReader` and `StringTokenizer` and the advantage of user defined methods for less typing and therefore a faster input altogether.
         - Gets accepted with a time of 1.23s.
         - Easy to remember and is fast enough to meet the needs of most of the question in competitive coding.
         ```
         static class FastReader {
            BufferedReader br;
            StringTokenizer st;

            public FastReader() {
               br = new BufferedReader(new InputStreamReader(System.in));
               // Initialize a BufferedReader with InputStreamReader.
            }

            String next() {
               while (st == null || !st.hasMoreElements()) {
                  // When StringTokenizer has no meaning in it, assign it to read a line of the BufferedReader.
                  try {
                     st = new StringTokenizer(br.readLine());
                  } catch (IOException e) {
                     e.printStackTrace();
                  }
               }
               return st.nextToken();
               // When the StringTokenizer reads a line, it return the next token of the StringTokenizer(the line).
            }

            // Parse the string returned by the StringTokenizer and turn it into other data types.
            int nextInt() {
               return Integer.parseInt(next());
            }

            long nextLong() {
               return Long.parseLong(next());
            }

            double nextDouble() {
               return Double.parseDouble(next());
            }

            // Directly read a line without declaring a StringTokenizer to "chop down" the string.
            String nextLine() {
               String str = ""; // The variable is initially assigned to nothing(but not "null".)
               try {
                  str = br.readLine();
               } catch (IOException e) {
                  e.printStackTrace();
                  // Better referencing for the line that gives out errors.
               }
               return str;
            }
         }
         ```
      - `Reader` class
         - The fastest way but requires very cumbersome methods in its implementation. 
         - Uses `intputDataStream` to read through the stream of data and uses `read()` method and `nextInt()` methods for taking inputs.
         - Gets accepted with a surprising time of just 0.28s.
         - [Fast I/O in Java in Competitive Programming](https://www.geeksforgeeks.org/fast-io-in-java-in-competitive-programming/)

**53a. What is a `StringTokenizer` class?**
   - ans: Allows an application to break a string into tokens(with regards of whitespace).
      - Do not distinguish among identifiers, numbers and quoted strings, nor do they recognize and skip comments.
      - Its uses is discouraged in new code.
         - It is recommended to use the `split` method of `String` or the `java.util.regex package` instead.
   - explanation:
      - `countTokens()`: Calculates the no of the times that this tokenizer's `nextToken` method can be called before it generates an exception.
      - `hasMoreElements()`: Returns the same value as the `hasMoreTokens` method.
      - `hasMoreToekns`: Tests if there are more tokens available from this tokenizer's `string`.
      - `nextElement()`: Returns the same value as the `nextToken` method, except its declared return value is `Object` rather than `string`.
      - `nextToken()`: Returns the next token from this string tokenizer.

**53b. What is a `BufferedReader` class?**
   - ans: 
      - Reads text from a character-input stream, buffering characters so as to provide for the efficient reading of characters, arrays, and lines.
      - a `BufferedReader` is advised to be wrapped around any Reader whose `read()` operations may be costly, such as `FileReaders` and `InputStreamReaders`.
   - explanation:
      - `close()`: Closes the stream and releases any systemt resources associated with it.
      - `read()`: Reads a single character.
      - `readLine()`: Reads a line of text.
      - `skip([index])`: Skips characters.

**53c. What is the use of `printStackTrace()`?**
   - ans: Prints this throwable and its backtrace to the standard error stream that is the value of the field `System.err`.

**54. How to detect the whitespaces in a `string`?**
   - ans:
      - `[stringName].contains("[value]")` method
         - Searches the sequence of characters in the given `string`.
         - Returns `true` if sequence of char values are found in this `string` otherwise returns `false`.
         - Implies that the specified line must contain, somewhere within it, the specified `string`.
      - `isWhitespace` method
         - Retrusn `true` if the passed character is really a white space.
      - `[stringName].matches("[value]")` method
         - Returns `true` if, and only if, this `string` matches the given regular expression.
         - (.*) means if it is linked to another words, used either before or above the target `substring`.
         - Implies the specified line must match the specified `string`, which includes wildcards.
      - `regionMatches()` method
         - To be continued...

**54a. What is the `Escape Sequence`?**
   - ans:
      - `\t`: Insert a tab in the text at this point.
      - `\b`: Insert a backspace in the text at this point.
      - `\n`: Insert a newline in the text at this point.
      - `\r`: Insert a carriage return in the text at this point.
      - `\f`: Insert a formfeed in the text at this point.
      - `\'`: Insert a single quote character in the text at this point.
      - `\"`: Insert a double quote character in the text at this point.
      - `\\`: Insert a backslash character in the text at this point.
      
**54b. List out all the `isXyz()`?**
   - ans:
      - `isDigit()`: Determines if the specified character is a digit.
      - `isLetter()`: Determines if the specified character is a letter.
      - `Character.isWhitespace()`: Determines if the specified character is white space according to `Java`.
      - `isSpaceChar()`: Determines if the specified character is a Unicode space character.

**55. How to convert a `char` to a `String`?**
   - ans: `Character.toString([charName])` or `String.valueOf([charName])`
   
**56. What is `Regular Expression` in java?**
   - ans: A sequence of characters that forms a search pattern(`java.util.regex` package).
   - explanation:
      - When searching for data in a text, the search pattern can be used to describe what are searching for.
      - Can be a single character, or a more complicated pattern.
      - Can be used to perform all types of **text search** and **text replace** operations.
      - `Pattern` Class: Defines a pattern (to be used in a search).
      - `Matcher` Class: Used to search for the pattern.
      - `PatternSyntaxException` Class: Indicates syntax error in a regular expression pattern.
      
**56a. How to use `Regular Expression`?**
   - ans:
      - Flags:
         - `Pattern.CASE_INSENSITIVE`: The case of letters will be ignored when performing a search.
         - `Pattern.LITERAL`: Special characters in the pattern will not have any special meaning and will be treated as ordinary characters when performing a search.
         - `Pattern.UNICODE_CASE`: Use it together with the `CASE_INSENSITIVE` flag to also ignore the case of letters outside of the English alphabet.
      - `Regular Expression Patterns`:
         - `[abc]`: Find one character from the options between the brackets.
         - `[^abc]`: Find one character NOT between the brackets.
         - `[0-9]`: Find one character from the range 0 to 9.
      - Meta-characters:
         - `|`: 	Find a match for any one of the patterns separated by `|` as in: `cat|dog|fish`.
         - `.`: Find just one instance of any character.
         - `^`: Finds a match as the beginning of a `string` as in: `^Hello`.
         - `$`: Finds a match at the end of the string as in: `World$`.
         - `\d`: Find a digit.
         - `\s`: Find a whitespace character.
         - `\b`: Find a match at the beginning of a word like this: `\bWORD`, or at the end of a word like this: `WORD\b`.
         - `\uxxxx`: Find the Unicode character specified by the hexadecimal number `xxxx`.
      - Quantifiers:
         - `n+`: Mathces any string that contains at least one `n`.
         - `n*`: Mathces any string that contains zero or more occurrences of `n`.
         - `n?`: Matches any string that contains zero or one occurrences of `n`.
         - `n{x}`: Matches any string that contains a sequence of `X` `n`'s.
         - `n{x, y}`: Matches any string that contains a sequence of `X` to `Y` `n`'s.
         - `n{x,}`: Matches any string that contains a sequence of at least `X` `n`'s.
         
**57. How to add a `string` value to an occupied-`string` variable?**
   - ans:
      - Using the "+" operator:
         - `String [newStringName] = [stringNameOne] + [stringNameTwo];`
      - Using the `concat()` method: Accepts a `String` value, adds it to the current `String` and returns the concatenated value.
         - `String [newStringName] = [stringNameOne].concat([stringNameTwo])`
      - Using `StringBuffer` and `StringBuilder` class: Used as alternative to `String` when modification needed(similar to `string` except being mutable).
         - `StringBuilder [stringBuilderName] = new StringBuilder([stringNameOne])` + `[stringBuildername].append([stringNameTwo])`
         
**57a. What is the `StringBuilder` class?**
   - ans: Represents a mutable sequence of characters.
      - The `StringBuilder` class provides no guarantee of synchronization.
         - `StringBuilder` is designed for use as a drop-in replacement for `StringBuffer` in places where the `StringBuffer` was being used by a single thread（as is in generally the case）.
      - `StringBuilder` is more preferred to `StringBuffer` as it will be faster under most implementations.
   - explanation:
      - Constructors:
         - `StringBuilder [stringName] = new StringBuilder()`: Constructs a string builder with no characters in it and an initial capacity of 16 characters.
         - `StringBuilder([capacityValue])`: Constructs a string builder with no characters in it and an initial capacity(in `int`) specified by the capacity argument.
         - `StringBuilder([sequenceValue])`: Constructs a string builder that contains the same characters as the specified `CharSequence`.
         - `StringBuilder([stringName])`: Constructs a string builder initialized to the contents of the specified string.
      - [Methods](https://www.geeksforgeeks.org/stringbuilder-class-in-java-with-examples/)

**58. What is `compile errors`?**
   - ans: `Compiler errors` are due to inaccuracies in code, where the compiler throws an error to alert you to something which will not compile, and therefore cannot be run.

**58a. How to detect multiple lines in one scanner?**
   - ans:
   ```
   Scanner:
   public static void main(String args[]) {
      [Initialize a scanner]
      while([scannerName].hasNext()) { // Detect next token(if the codes inside has get the whole line, then getting the next token would not matter as it must get the next line then.)
         [get Inputs + codes]
   }
   
   BufferedReader:
   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   String input = "";
   String line;
   while((line = br.readLine()) != null){
       if(line.isEmpty()){
           break; // if an input is empty, break
       }
       input += line + "\n";
   }
   br.close();
   System.out.println(input);
   
   BufferedReader:
   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   String line;
   while ((line = br.readLine()) != null)
       for (String numStr: line.split("\\s"))
           sum += Integer.parseInt(numStr);
   
   BufferedReader:
   BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
   String line;
   while ((line = stdin.readLine()) != null && line.length()!= 0) {
       String[] input = line.split(" ");
       if (input.length == 2) {
           System.out.println(calculateAnswer(input[0], input[1]));
       }
   }
   
   FastReader:
   boolean hasNext() {
       if (st != null && st.hasMoreTokens()) {
           return true;
       }
       String tmp;
       try {
           br.mark(1000);
           tmp = br.readLine();
           if (tmp == null) {
               return false;
           }
           br.reset();
       } catch (IOException e) {
           return false;
       }
       return true;
   }
   ```
   - explanation:
      - The problem is `BufferedReader` does not have a method called `hasNext()`, which checks if there is a token and returns `true` and `false`.
      
**58b. What is `mark()` and `reset()`?**
   - ans:
      - `[readerName].mark([readAheadLimitIntegerValue])`: used to mark the stream as the checkpoint from where the stream read will start, once `reset()` is called.
         - The method is not supported by all subclasses of `Reader` class.
      - `[readerName].reset()`: an in-built method that resets variables maintaining the sum to zero.
         - When the object of the class is created its initial value is zero.
         
**59. What is `format()`?**
   - ans: Returns a formatted `string` using the given `locale`, specified `format string` and `arguments`
   - explanation: `String [stringName] = String.format("[localeString]%[localeString][formatting]", [targetString])`
      - `%a`: Accpets `floating point`(excepts `BigDecimal`) and returns `Hex` output of floating point number.
      - `%b`: Accepts any type and returns `true` if non-null, `false` if null.
      - `%c`: Accepts `character`and returns `Unicode character`.
      - `%d`: Accepts `integer(incl, byte, short, int, long, bigint)` and returns `decimal integer`.
      - `%e`: Accepts `floating point` and returns `decimal number` in `scientific notation`.
      - `%f`: Accepts `floating point` and returns `decimal number`.
      - `%g`: Accepts `floating point` and returns `decimal number`, possibly in `scientific notation` depending on the precision and value.
      - `%h`: Accepts any type and returns `Hex String` of value from `hashCode()` method.
      - `%n`: Accepts none and return platform-specific line separator.
      - `%o`: Accepts `integer(incl, byte, short, int, long, bigint)` and returns `octal number`.
      - `%s`: Accepts any type and return `String` value.
      - `%t`: Accepts `Date/Time(incl. long, Calendar, Date and TemporalAccessor)`, but requires more formatting flags to convert the `Date/Time`(`%t` is only the prefix).
      - `%x`: Accepts `integer(incl, byte, short, int, long, bigint)` and returns `Hex string`.

##2021.02.18
**60. How to get a String with whitespace wtihin?**
   - ans:
      - use `nextLine()` instead of `next()`
      - use `new Scanner(System.in).useDelimiter("\n")` with `next()`
         - it acts like `nextLine()` with `next()`
         - but `nextLine()` seems to have no change.

**61. What is `for-each` loop?**
   - ans: `for([dataType] [item]:[array])`
   - explanation: Similar to `for [variable] in [arrayName]` in Python.

##2021.03.09
**62. About Scanner**
   - ans: Never use `next()` or `nextInt()` together with `nextLIne()`
   - explanation: The first two method would not read past the end of line character.

**63. How to clear a Scanner?**
   - ans: The easiest way would be to create the scanner again.

**64. How to catch multiple exception?**
   - ans: 
      - use `|` between exception in one `catch` statement.
      - use multiple `catch` statement (before the newest version of Java).
