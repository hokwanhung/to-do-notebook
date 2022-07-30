
<!-----

Yay, no errors, warnings, or alerts!

Conversion time: 0.806 seconds.


Using this Markdown file:

1. Paste this output into your source file.
2. See the notes and action items below regarding this conversion run.
3. Check the rendered output (headings, lists, code blocks, tables) for proper
   formatting and use a linkchecker before you publish this page.

Conversion notes:

* Docs to Markdown version 1.0β33
* Fri Jul 29 2022 22:41:49 GMT-0700 (PDT)
* Source doc: Untitled document
* Tables are currently converted to HTML tables.
----->

<h1>Learnt-from-Universities</h1>
<p>Diverse fields of knowledge related to CS learnt from universities.</p>

<table>
  <tr>
   <td colspan="2" >
<h2><strong>CS-Knowledge</strong></h2>


   </td>
  </tr>
  <tr>
   <td>
<h3>Data Structures(unfinished)</h3>


   </td>
   <td><a href="https://github.com/travrs629/Learnt-from-Universities/blob/main/CS-knowledge/data-structure(unfinished).md">https://github.com/travrs629/Learnt-from-Universities/blob/main/CS-knowledge/data-structure(unfinished).md</a> 
   </td>
  </tr>
  <tr>
   <td>
<h3>Software Engineering(COM3101)</h3>


   </td>
   <td><a href="https://github.com/travrs629/Learnt-from-Universities/blob/main/CS-knowledge/software-engineering.md">https://github.com/travrs629/Learnt-from-Universities/blob/main/CS-knowledge/software-engineering.md</a> 
   </td>
  </tr>
  <tr>
   <td>
<h3>Computer System (COM1103)</h3>


   </td>
   <td><a href="https://github.com/travrs629/Learnt-from-Universities/blob/main/CS-knowledge/computer-systems.pdf">https://github.com/travrs629/Learnt-from-Universities/blob/main/CS-knowledge/computer-systems.pdf</a> 
   </td>
  </tr>
  <tr>
   <td>
<h3>Java Swing Navigation Table (from Oracle)</h3>


   </td>
   <td><a href="https://github.com/travrs629/Learnt-from-Universities/blob/main/CS-knowledge/java-swing-navigation-table.md">https://github.com/travrs629/Learnt-from-Universities/blob/main/CS-knowledge/java-swing-navigation-table.md</a> 
   </td>
  </tr>
  <tr>
   <td>
<h3>Java Naming Conventions (from Oracle)</h3>


   </td>
   <td><a href="https://github.com/travrs629/Learnt-from-Universities/blob/main/CS-knowledge/java-naming-conventions.md">https://github.com/travrs629/Learnt-from-Universities/blob/main/CS-knowledge/java-naming-conventions.md</a> 
   </td>
  </tr>
</table>



<table>
  <tr>
   <td colspan="2" >
<h2><strong>Self-made-Tools</strong></h2>


   </td>
  </tr>
  <tr>
   <td>
<h3>detect-Input-Type method</h3>


   </td>
   <td>Detect input type and continuously request users until the correct type (e.g., int) is given.
<ul>

<li>A detection of String "STOP" is included to exit the execution. 
<ul>
 
<li>Returns a String instead of integer so as to fit with the detection of String "STOP".
</li> 
</ul>

<li>The conversion of String to integer, as well as the stop of execution, relies on the main method (and the if-else statement inside).

<li>The input of the method detectInput (String detectTarget) also requests the user's input to be in a string form.
</li>
</ul>
   </td>
  </tr>
  <tr>
   <td>
<h3>HTMLConverter_v0</h3>


   </td>
   <td>Even with Writage, some of the formatting might still be wrong (i.e. in my case it is listing in table).
<ul>

<li>A very rough program that allows me to implement different tags into the field, half-manually, is created.

<li>Current version allows: 
<ul>
 
<li>Insert “/”
 
<li>tag before and after the text.
 
<li>Insert the “/” tag before the text.
</li> 
</ul>
</li> 
</ul>
   </td>
  </tr>
</table>



<table>
  <tr>
   <td colspan="2" >
<h2><strong>Progress-Work</strong></h2>


   </td>
  </tr>
  <tr>
   <td>
<h3>detect-Prime-Number</h3>


   </td>
   <td>One of the exercises I did when I started to learn programming.
<ul>

<li>Aims to find the biggest prime number between 1 and the user's input.

<li>Definition of a prime number  = it can only be divisible by 1 and itself. 
<ul>
 
<li>If the number(n) is divisible by other integers(i), it is not a prime number.
 
<li>`n % i == 0`, n is not a prime number.
</li> 
</ul>

<li>If the (Divisor) > (Dividend)/2, there must be a remainder when testNumber modulus testTool.
</li>
</ul>
   </td>
  </tr>
  <tr>
   <td>
<h3>print-Out-Diamond-With-3-Loops-Simple-Version</h3>


   </td>
   <td>A classwork requires us to print out a diamond shape in 3 for loops.
<ul>

<li>The initial version that I finished the task with the `Math.abs()` method used as the task recommended. 
<ul>
 
<li>"Divide and conquer '' method is used to separate the diamond into two parts.
</li> 
</ul>

<li>The equation found is more based on listing out cases and finding the common factors.
</li>
</ul>
   </td>
  </tr>
  <tr>
   <td>
<h3>print-Out-Diamond-With-3-Loops-Advanced-Version</h3>


   </td>
   <td>An upgraded version of the classwork, though the max. no. of lines is inserted by the user.
<ul>

<li>Better structures using multiple "if-else" statements and mathematical calculations. 
<ul>
 
<li>"Divide and conquer" method is also used as this one.
</li> 
</ul>

<li>The program views the no. of spaces and stars as a whole first, and then prints out both of them separately.
</li>
</ul>
   </td>
  </tr>
  <tr>
   <td>
<h3>Farmer-Wolf-Goat-and-Cabbage-Problem (de-valued)</h3>


   </td>
   <td>A modified version of our school's example.
<ul>

<li>By examining the representation of a state (including start state and goal state), as well as safe state(excluding both start state and goal state): 
<ul>
 
<li>Whenever the side is, as long as the goat is with the man, the condition is safe.
 
<li>Whenever the side is, as long as the goat is with neither wolf nor cabbage, the condition is safe.
</li> 
</ul>

<li>Then listing out all operators, the problem becomes a far easier question to deal with.
</li>
</ul>
   </td>
  </tr>
  <tr>
   <td>
<h3>Monopoly-on-MVC</h3>


   </td>
   <td>A Monopoly game based on the MVC model.
<ul>

<li>More information on: <a href="https://github.com/travrs629/Learnt-from-Universities/blob/main/Progress-Works/MVC-based-Monopoly/version-control.md">https://github.com/travrs629/Learnt-from-Universities/blob/main/Progress-Works/MVC-based-Monopoly/version-control.md</a> 
</li>
</ul>
   </td>
  </tr>
</table>



<table>
  <tr>
   <td colspan="2" >
<h2><strong>How-to-Understand-Something</strong></h2>


   </td>
  </tr>
  <tr>
   <td colspan="2" >
     <img src="https://github.com/travrs629/Learnt-from-Universities/blob/main/How-to-Understand.jpg" height=600px width=515px>
   </td>
  </tr>
</table>
