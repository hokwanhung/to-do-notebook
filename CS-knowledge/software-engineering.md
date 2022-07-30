<!-----

Yay, no errors, warnings, or alerts!

Conversion time: 1.911 seconds.


Using this Markdown file:

1. Paste this output into your source file.
2. See the notes and action items below regarding this conversion run.
3. Check the rendered output (headings, lists, code blocks, tables) for proper
   formatting and use a linkchecker before you publish this page.

Conversion notes:

* Docs to Markdown version 1.0β33
* Fri Jul 29 2022 22:26:23 GMT-0700 (PDT)
* Source doc: Untitled document
* Tables are currently converted to HTML tables.
----->

<h1>COM3101 Software Engineering</h1> 

<table>
  <tr>
   <td colspan="2" >
<h2><strong>Lecture 1: Software Development Life Cycle</strong></h2>


   </td>
  </tr>
  <tr>
   <td>
<h3>Introduction to Software Engineering</h3>


   </td>
   <td>Definition of Software Engineering
<ul>

<li>= the engineering approach of systematic application of methods on reliable software developments.

<p>
Importance of “proper” Software Engineering
<ul>

<li>Maintain budget and time balance regarding the progress of software development. 
<ul>
 
<li>Examples: IBM OS/360 Operating System - seriously behind schedules and over budget.
</li> 
</ul>

<li>Reduce the risk of software failure. 
<ul>
 
<li>Examples: Ariane 5 rocket launch in 1996 - failed in 37 seconds due to a program bug.

<p>
People involved in a traditional software development team (SDLC-based)
<ul>

<li>User Departments - Users 
<ul>
 
<li>= (Representatives of) individuals who will interact with the system regularly.
 
<li>Characteristics/Functions:  
<ul>
  
<li>Provide user requirements and take part in testing
  
<li>Do not participate in design and development.
  
<li>Not considered a major part of the development team, traditionally.
</li>  
</ul>
 
<li>Different from stakeholders: anyone affected by(interested in) the project.
</li> 
</ul>

<li>IT Department - Technical specialists(supporting role)

<li>Software development team: 
<ul>
 
<li>Project managers (PM) - characteristics/functions:  
<ul>
  
<li>Take part in defining project scope and objectives(together with all stakeholders).   
<ul>
   
<li>Define and manage the project budget.
</li>   
</ul>
  
<li>Develop project plans and project schedules.   
<ul>
   
<li>Monitor project progress and oversee all steps in the SDLC.
</li>   
</ul>
  
<li>Form and manage one or more project teams and delegate duties to other members.   
<ul>
   
<li>Motivate the team to achieve their objectives.
   
<li>Measure project performance using appropriate tools and metrics (e.g. completion of goals)
</li>   
</ul>
  
<li>Perform risk analysis and prepare backup plans.
</li>  
</ul>
 
<li>System analysts (SA) - characteristics/functions:  
<ul>
  
<li>Familiar with the overall design of a computer system.
  
<li>Collect and analyze user requirements.
  
<li>Perform system design.
  
<li>Oversee system development.
  
<li>System integration and testing.   
<ul>
   
<li>Maintenance and support.
</li>   
</ul>
</li>   
</ul>
</li>   
</ul>

<li>External companies

<li>Vendors
</li>
</ul>
</li>
</ul>
</li>
</ul>
</li>
</ul>
   </td>
  </tr>
  <tr>
   <td>
<h3>SDLC (Software Development Life Cycle)</h3>


   </td>
   <td>Software Development Life Cycle (SDLC)
<ul>

<li>User Requirement Analysis 
<ul>
 
<li>Collect user requirements.
 
<li>Analyze requirements and specify it in formal documents.
 
<li>Produce User Requirement Documents.
</li> 
</ul>

<li>System Design 
<ul>
 
<li>Design how the software is to be written.  
<ul>
  
<li>From high level design (system architecture) to low level design (algorithms, pseudocodes, interface (API), user interface).
</li>  
</ul>
 
<li>Produce design documents (e.g., diagrams, program specifications) instead of writing codes.
</li> 
</ul>

<li>System Development  
<ul>
 
<li>Write programs and engage in related activities.
 
<li>Build software regarding previous design
 
<li>Perform unit tests.
</li> 
</ul>

<li>Testing (Verification) 
<ul>
 
<li>Test software systematically to see if it meets the requirements.  
<ul>
  
<li>Based on test cases and well-prepared test plans.
</li>  
</ul>
 
<li>Perform System integration test and User acceptance test (UAT).
</li> 
</ul>

<li>Maintenance 
<ul>
 
<li>Permit the system into production (i.e., being used for real tasks).
 
<li>Perform maintenance tasks:  
<ul>
  
<li>Handle changing requests in day-to-day operations.
  
<li>Fix problems (e.g., bugs).
  
<li>Handle changes related to the software environment (e.g., updates of software libraries).
  
<li>Perform regression tests to ensure the changes work as intended and existing functions are unaffected.

<p>
Characteristics of the SDLC (also called the “waterfall model”)
<ul>

<li>Each activity/stage is usually visited once, unless problems occur. 
<ul>
 
<li>Has detailed and well-defined outputs and relevant documents (user requirement specifications, design documents, test plans, the software itself).
</li> 
</ul>

<li>Work well when the user requirements can be clearly defined and no frequent changes, with a well-known problem and technology domain.

<li>Advantages: 
<ul>
 
<li>Well-defined project schedules.
 
<li>Errors can be spotted in early stages.
 
<li>Good for projects involving lots of traditional back-end processing (e.g., data processing tasks).
 
<li>Suitable for large projects that involve multiple teams and systems.
</li> 
</ul>

<li>Disadvantages: 
<ul>
 
<li>Not flexible - costly if it is necessary to go back to previous stages.
 
<li>Not suitable for changing user requirements (e.g., tasks involving lots of front-end GUI-based actions).
</li> 
</ul>
</li> 
</ul>
</li> 
</ul>
</li> 
</ul>
</li> 
</ul>
   </td>
  </tr>
  <tr>
   <td>Alternatives models
   </td>
   <td>Prototyping:
<ul>

<li>Build and test prototypes quickly for reviews and comments. 
<ul>
 
<li>The system is improved until the users are satisfied.
</li> 
</ul>

<li>Suitable when user requirements are unclear.

<li>Two types of prototyping: 
<ul>
 
<li>Evolutionary prototyping = prototype gradually evolves into final products.
 
<li>Throw-away prototyping = prototype is used only to gather reviews and comments only.

<p>
Agile
<ul>

<li>Projects are divided into short iterations (sprints), usually one to four weeks long. 
<ul>
 
<li>Each sprint is similar to a mini-SDLC (planning, design, building, testing).
</li> 
</ul>

<li>Each sprint implements some of the requirements and produces a new software release with additional features. 
<ul>
 
<li>Gather reviews and comments at the end of each iteration.
</li> 
</ul>

<li>Comparisons with SDLC: 
<ul>
 
<li>Less emphasis on documentation.
 
<li>More emphasis on coding and testing (test-driven development).
 
<li>More suitable for problems where the requirements are ill-defined and change frequently.
</li> 
</ul>

<li>Two types of agile: 
<ul>
 
<li>Scrum = a popular framework for agile methodology.  
<ul>
  
<li>Developers work in small teams (usually less than 10 people).
  
<li>A product owner lists out the desired product features (the “product backlog”), and their priorities.   
<ul>
   
<li>The development team selects a set of backlog items to be implemented during each sprint.
</li>   
</ul>
  
<li>Each sprint lasts around 2 weeks.   
<ul>
   
<li>Hold daily meetings (“stand-up meetings”) for progress review and problem-solving.
</li>   
</ul>
  
<li>Agile/Scrum team   
<ul>
   
<li>Scrum master (SM) -  characteristics/functions:    
<ul>
    
<li>Guide the team through each sprint.
    
<li>Conduct daily stand-up meetings.
    
<li>Ensure the team follows Agile/Scrum methodology.
    
<li>Help the team to overcome obstacles and challenges.
</li>    
</ul>
   
<li>Product owner = the person with a vision of a complete product, usually a leading user.    
<ul>
    
<li>Provide product requirements.
    
<li>Help to prioritize the product backlog items (the decision remains to the team).
    
<li>Communicate with the team regularly and provide feedback in a timely manner.
</li>    
</ul>
   
<li>Team members -  characteristics/functions:    
<ul>
    
<li>Create the delivery of each iteration.
    
<li>Decide the features to be implemented in each sprint, in a collective manner.     
<ul>
     
<li>Remain fixed until next iterations.
</li>     
</ul>
</li>     
</ul>
   
<li>Technical specialists (e.g., designers, database experts)
</li>   
</ul>
</li>   
</ul>
 
<li>Extreme Programming (XP)  
<ul>
  
<li>Suitable for problems that require a solution quickly, with frequently changed requirements.
  
<li>Use simple and easily understandable codes to replace the need for documentation.   
<ul>
   
<li>Use fewer classes and methods.
   
<li>Codes are expected to be restructured (re-factored) when necessary to be more maintainable.
</li>   
</ul>
  
<li>On-site customers(users):   
<ul>
   
<li>Participate as part of the development team.
   
<li>Interact frequently to obtain feedback.
</li>   
</ul>
  
<li>Features to be developed are prioritized by the customer and followed by the team.   
<ul>
   
<li>Requirements can be changed/added at any time, even in the middle of an iteration.
</li>   
</ul>
  
<li>Developers work in small teams.    
<ul>
   
<li>Common for pair programming (two programmers per workstation).
</li>   
</ul>
  
<li>Test-driven development:   
<ul>
   
<li>Place importance in program tests.
   
<li>Create unit-test programs for each functionality before implementing.
</li>   
</ul>
</li>   
</ul>
</li>   
</ul>
</li>   
</ul>
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
<h2><strong>Lecture 2: Design pattern 1 (MVC)</strong></h2>


   </td>
  </tr>
  <tr>
   <td>
<h3>Design Pattern</h3>


   </td>
   <td>Definition of Design Patterns:
<ul>

<li>= general, reusable program designs for common problems.
</li>
</ul>
   </td>
  </tr>
  <tr>
   <td>
<h3>MVC</h3>


   </td>
   <td>MVC (Model-Controller-View)
<ul>

<li>Main - connect between the three classes, and instruct View to start accepting user commands.

<li>Model - handle and store data while the program is running. 
<ul>
 
<li>Notify the Controller to change the View.
 
<li>Examples: add(), delete(), loop(), load() and save()
</li> 
</ul>

<li>View - handle user inputs and outputs. 
<ul>
 
<li>Notify the Controller to change the Model on user actions.
 
<li>Examples: doAdd(), doDelete(), doLookup(), processCommand(), showMessage().  
<ul>
  
<li>Continue to process the command, and pass appropriate inputs to methods in the Controller.
</li>  
</ul>
</li>  
</ul>

<li>Controller - connect the Model and the View. 
<ul>
 
<li>Update the Model based on user actions in the View.
 
<li>Update the View when the data in the Model has been changed.
 
<li>Examples: setController(), processCommand(), setView(), setModel(), addToModel(), deleteFromModel(), lookupFromModel().
</li> 
</ul>

<li>Advantages: 
<ul>
 
<li>Independent and Separation of the data, UI and the business logics.
 
<li>Modification on one part has no effects on others.
 
<li>Cleaner and easier-to-maintain codes.
 
<li>Faster development and better team-working.
</li> 
</ul>

<li>Steps: View.processCommand() → 
<ul>
 
<li>View.doAdd() → Controller.addToModel() → Model.add() + View.showMessage()
 
<li>View.doDelete() → Controller.deleteFromModel() → Model.delete() + View.showMessage()
 
<li>Controller.handleExit() → Model.closeDB()
 
<li>View.doLookup() → Controller.lookupFromModel() → Model.lookup() + View.showMessage()
 
<li>!!! connectDB() is called whenever Model is created().
</li> 
</ul>

<li>GUI Steps: view.setVisible(true) →  
<ul>
 
<li>View.bLookupActionPerformed → Controller.lookupFromModel() → Model.lookup() + View.showMessage()
 
<li>View.bDeleteButtonActionPerformed() → Controller.deleteFromModel() → Model.delete() + View.showMessage()
 
<li>View.bAddActionPerformed() → Controller.addToModel() → Model.add() + View.showMessage()
 
<li>View.showMessage() → JOptionPane.showMessageDialog()
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
<h2><strong>Lecture 3: Design pattern 2</strong></h2>


   </td>
  </tr>
  <tr>
   <td>
<h3>Memento</h3>


   </td>
   <td>Memento
<ul>

<li>Purpose: to store backup of the program status, and restore if needed.

<li>Process: 
<ul>
 
<li>A Memento object is passed from the Originator to the CareTaker object for saving its internal state.
 
<li>The CareTaker returns relevant information (previous status) if needed.
</li> 
</ul>

<li>Originator.save() → new Memento → Caretaker.addMemento()

<li>Originator.restore() → Caretaker.removeMemento()
</li>
</ul>
   </td>
  </tr>
  <tr>
   <td>
<h3>Singleton</h3>


   </td>
   <td>Singleton
<ul>

<li>Purpose: to restrict to only one object of a certain class. 
<ul>
 
<li>Make the constructor private and provide static methods for obtaining an object.  
<ul>
  
<li>Always be the same one based on the static attribute.
</li>  
</ul>
</li>  
</ul>

<li>Examples of Codes: 
<ul>
 
<li>private static constructor singleton;
 
<li>private constructor()
 
<li>public static constructor getInstance()  
<ul>
  
<li>if (singleton == null)    
<ul>
   
<li>singleton = new B();
</li>   
</ul>
</li>   
</ul>
</li>   
</ul>

<li>Advantages: 
<ul>
 
<li>Faster performance due to static methods and variables.
 
<li>More flexible and object-oriented as they could be subclassed.
</li> 
</ul>
</li> 
</ul>
   </td>
  </tr>
  <tr>
   <td>Adapter
   </td>
   <td>Adapter
<ul>

<li>Purpose: to transfer the method calls to the ones provided by the supplier.

<li>Examples of Codes: 
<ul>
 
<li>Supplier supplier;
 
<li>public Adapter (Supplier s) {  
<ul>
  
<li>supplier = s;
  
<li>}
</li>  
</ul>
</li>  
</ul>
</li>  
</ul>
   </td>
  </tr>
  <tr>
   <td>Iterator
   </td>
   <td>Iterator
<ul>

<li>Definition: A common and standardized approach to loop through items in the collections.

<li>Examples of Codes: 
<ul>
 
<li>Iterator&lt;String> iterator = collection.iterator();
 
<li>while (iterator.hasNext()) {  
<ul>
  
<li>iterator.next();
  
<li>}
</li>  
</ul>
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
<h2><strong>Lecture 4: Requirement Analysis and Use Case Analysis</strong></h2>


   </td>
  </tr>
  <tr>
   <td>
<h3>Requirement Analysis</h3>


   </td>
   <td>Steps for Requirement Analysis:
<ul>

<li>Understand the requirements by the user community’s interactions. 
<ul>
 
<li>User requirements might sometimes be unclear.
 
<li>Functional requirements - describe how the system interacts with users and with other systems.  
<ul>
  
<li>Output: requirements specification document e.g. Use case analysis, user stories.
</li>  
</ul>
 
<li>Non-functional requirements - other constraints on the system.  
<ul>
  
<li>Quality related e.g. security, accuracy, response time.
  
<li>Technology related e.g. specific choice of hardware and software.
  
<li>Project related e.g. budget, schedule
</li>  
</ul>
</li>  
</ul>

<li>Document the required functionalities.

<li>Design a conceptual model of the system.
</li>
</ul>
   </td>
  </tr>
  <tr>
   <td>
<h3>Use case diagram & Use case description</h3>


   </td>
   <td>
<h3>Use case diagram & Use case description:</h3>


<ul>

<li>State the interactions for each goal of the Use Case Diagram. 
<ul>
 
<li>Include only details that users should know/experience.
 
<li>If with some complex rules or logics (business rules), better to write in a separate section.
</li> 
</ul>

<li>Use case extension v.s. Use case inclusion: 
<ul>
 
<li><&lt;extend>> - additional processes only carried in some scenarios.
 
<li><&lt;include>> - additional processes carried out every time in the main flow.
</li> 
</ul>

<li>Secondary actors = another party contacted and interacted when requested by primary actors.
</li>
</ul>
   </td>
  </tr>
  <tr>
   <td>
<h3>Use Story</h3>


   </td>
   <td>
<h3>Short description of users requirements with some acceptance criteria in brackets.</h3>


   </td>
  </tr>
</table>



<table>
  <tr>
   <td colspan="2" >
<h2><strong>Lecture 5: System Design and Diagrams</strong></h2>


   </td>
  </tr>
  <tr>
   <td>
<h3>System Design</h3>


   </td>
   <td>Factors to consider before system design
<ul>

<li>Choice of platform.

<li>Choice of programming language (application functionalities and company’s expertise).

<li>Choice of user interface method (e.g. touch screen, regular computers).

<p>
System Design
<ul>

<li>Include classes and methods, interfaces, files/databases and data backup-up/restoring. 
<ul>
 
<li>Check the nouns in a use case diagram/description.
</li> 
</ul>

<li>Class diagram [Structure] 
<ul>
 
<li>Iterate again if any classes can be reduced/eliminated, or any new classes or attributes are required.  
<ul>
  
<li>Common rules for drawing class diagram:
  
<li>Do not include getter and setter methods.
  
<li>Mark public attributes and methods with + and private attributes and methods with -.
  
<li>Mark subclasses(generalization) with empty-arrow.
  
<li>Composition v.s. Aggregation:   
<ul>
   
<li>Composition = contain target object as an indivisible part.
   
<li>Aggregation = target object can exist outside of the object.
</li>   
</ul>
</li>   
</ul>
</li>   
</ul>
</li>   
</ul>
</li>   
</ul>
   </td>
  </tr>
  <tr>
   <td>
<h3>Other common diagrams</h3>


   </td>
   <td>
<h3>Other common diagrams (Unified Modeling Language)</h3>


<ul>

<li>Component diagram [Structure] - describe higher level of the components.

<li>Deployment diagram [Structure] - describe how various components are distributed across servers and platforms, including hardwares and softwares.

<li>Sequence diagram [Behavior] - describe the time ordering of messages. 

<li>Activity diagram [Behavior] - describe the processing steps.

<li>State machine diagram [Behavior] - describe how system status are changed.
</li>
</ul>
   </td>
  </tr>
</table>



<table>
  <tr>
   <td colspan="2" >
<h2><strong>Lecture 6: Implementation, Testing and Maintenance</strong></h2>


   </td>
  </tr>
  <tr>
   <td>
<h3>Implementation</h3>


   </td>
   <td>Implementation
<ul>

<li>Emphasis on coding standards. 
<ul>
 
<li>Examples: naming conventions, no ignored exceptions.  
<ul>
  
<li>Java Documentation /** Special Comments */ can be converted into API documents.
</li>  
</ul>
</li>  
</ul>
</li>  
</ul>
   </td>
  </tr>
  <tr>
   <td>
<h3>Testing</h3>


   </td>
   <td>Unit test
<ul>

<li>Individual units of source code are often tested by automated tests. 
<ul>
 
<li>Based on white-box testing.
</li> 
</ul>

<li>Responsible for programming and is in the SDLC Development stage.

<li>Example: JUnit(e.g. assertion), JUnit Framework

<p>
JUnit annotations
<ul>

<li>@BeforeClass 
<ul>
 
<li>Executed once at the beginning before all tests, usually used for computationally expensive tasks , e.g., connecting to the database.
</li> 
</ul>

<li>@Before 
<ul>
 
<li>Executed at the beginning of each individual test, used for common set-up steps e.g. re-initialise variables.
</li> 
</ul>

<li>@Test 
<ul>
 
<li>The tests themselves, order might vary and not necessarily top to bottom.
</li> 
</ul>

<li>@After 
<ul>
 
<li>Executed at the end of each individual test.
</li> 
</ul>

<li>@AfterClass 
<ul>
 
<li>Executed once at the end after all tests, usually used for releasing external resources e.g. disconnect from database.

<p>
System Integration Test (SIT)
<ul>

<li>Systematic testing of the whole system or multiple systems.

<li>Based on both white-box testing and black-box testing (functional testing).

<li>Responsible for system analyst and is in development testing SDLC stage.

<p>
User acceptance test (UAT)
<ul>

<li>Verify whether the system meets the customers’ requirements.

<li>Based on black box testing.

<li>Responsible for user (do the testing) and system analyst (supporting), and is in the development testing SDLC stage.

<li>Two types: 
<ul>
 
<li>Alpha test - based on simulated data and environment.
 
<li>Beta test - based on real data and customers.

<p>
Test plan and test cases
<ul>

<li>Test plan: a list of test cases.

<li>Test case: a description of necessary actions and parameters (data) to achieve and verify the expected behavior. 
<ul>
 
<li>Include the input data, the process/procedures, the expected results.
</li> 
</ul>
</li> 
</ul>
</li> 
</ul>
</li> 
</ul>
</li> 
</ul>
</li> 
</ul>
</li> 
</ul>
</li> 
</ul>
   </td>
  </tr>
  <tr>
   <td>
<h3>Maintenance</h3>


   </td>
   <td>
<h3>Maintenance</h3>


<ul>

<li>Ongoing support for the deployed system: 
<ul>
 
<li>Bug fixing (software errors) and emergency situations (e.g. hardware failure).
 
<li>Day to day system supports (e.g., running of batch jobs, data backup,
 
<li>User account maintenance, provide user supports)
 
<li>Handle minor user requests that are related to day to day operations
 
<li>Change in environment (e.g., updates of libraries used by software)
</li> 
</ul>

<li>Systematic monitoring (e.g., system speed, check for broken links) 
<ul>
 
<li>Could be equally expensive for small scale projects in terms of development costs.
</li> 
</ul>
</li> 
</ul>
   </td>
  </tr>
</table>

