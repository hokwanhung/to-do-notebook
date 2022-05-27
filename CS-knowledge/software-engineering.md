**1. Software Development Life Cycle**

* Definition of Software Engineering:
    * <span style="text-decoration:underline;">systematic application of methods</span> to build reliable software.
    * an engineering approach of systematic application of methods on software developments.
* Importance of “proper” Software Engineering:
    * maintain budget and time balance in regards to the progress of software development. 
        * e.g. IBM OS/360 Operating System - seriously behind schedules and over budget)
    * reduce the risk of software failure
        * e.g. Ariane 5 rocket launch in 1996 - failed in 37 seconds due to a program bug.
* People involved in a traditional software development team (SDLC-based)
    * User Departments - Users
        * = (Representatives of) individuals who will interact with the system regularly.
        * Characteristics/Functions:
            * Provide user requirements and take part in testing
            * Do not involve in design and development.
            * Traditionally, not considered a major part of the development team.
        * Different from stakeholders: anyone affected by(interested in) the project.
    * IT Department - Technical specialists(supporting role)
    * Software development team
        * Project managers (PM)
            * Characteristics/Functions:
                * Take part in defining project scope and objectives(together with all stakeholders).
                * Define and manage project budget.
                * Develop project plans and project schedules.
                * Form and manage one or more project teams and delegate duties to other members.
                * Monitor project progress and oversee all steps in the SDLC.
                * Motivate the team to achieve their objectives.
                * Measure project performance using appropriate tools and metrics (e.g. completion of goals)
                * Perform risk analysis and prepare backup plans.
        * System analysts (SA)
            * Characteristics/Functions:
                * Familiar with the overall design of a computer system.
                * Collect and analyze user requirements.
                * Perform system design.
                * Oversee system development.
                * System integration and testing.
                * Maintenance and supports.
        * Programmers (P)
            * Create program components according to design
            * documents (e.g., coding).
            * Unit testing (testing of individual program components).
            * Maintenance and supports.
    * External companies
    * Vendors (供应商)
* Software Development Life Cycle (SDLC)
    * 1. User Requirement Analysis
        * Collect user requirements.
        * Requirements are analyzed and specified in formal documents.
        * Produce User Requirement Documents.
    * 2. System Design
        * Design how the software is to be written.
        * Ranges from high level design (system architecture) to low level design (algorithms, pseudocodes, interface (API), user interface).
        * Produce design documents (e.g., diagrams, program specifications) instead of writing codes.
    * 3. System Development (implementation/coding/programming)
        * actual programming and related activities.
        * build software according to previous acquired design
        * unit tests.
    * 4. Testing (verification)
        * Software is tested systematically to see if it meets the requirements.
        * Based on test cases and well-prepared test plans.
        * System integration test and User acceptance test (UAT).
    * 5. Maintenance
        * The system goes live into production (i.e., being used by the user for the real tasks)/
        * Perform maintenance tasks
            * Handle changes requests from the users that are related to day-to-day operations.
            * Problem fixing (e.g., bugs)
            * Handle changes in environment (e.g., updates of software libraries)
            * Perform regression test to make sure the changes work as intended and other existing functions are not affected.
* also called <span style="text-decoration:underline;">the waterfall model.</span>
    * Each activity/stage is usually visited once, unless problems occur.
    * Each activity has detailed and well-defined outputs and relevant documents (user requirement specifications, design documents, test plans, the software itself).
    * Characteristics:
        * Work well when the user requirements can be clearly defined and do not change frequently, problem domain is well known, and the technology is well understood.
    * Advantages:
        * Project schedules are clearly defined well ahead.
        * May spot error in the early stage.
        * Good for projects that involve a lot of traditional back end processing, e.g., data processing tasks.
        * require well-defined schedules.
        * are large and involve multiple teams and many systems.
        * developers are experts in the domain.
    * Disadvantages:
        * Not flexible(each step is normally only visited once).
            * Costly if need to go back to previous stages.
        * Does not work well when the user requirements are unclear at the early stage or may change (i.e. when the users only have rough ideas of what they want)
            * e.g. Tasks that involve a lot of front end GUI-based actions.
        * Technology is new and evolving, and when** the developer is not the domain expert.**
* Alternatives models:
    * Prototyping
        * Build and test prototypes quickly for user comments.
        * Useful when not all the requirement is well understood.
        * The prototype system is improved until the users are satisfied.
        * Two types:
            * Evolutionary prototyping = prototype gradually evolves into the final product.
            * Throw-away prototyping = prototype is for gathering comments and understanding requirements only.
    * Agile
        * Projects are divided into short iterations (called “sprint”), usually one to four weeks long.
        * Each sprint is like a mini-SDLC (planning, design, building, testing)
        * Each sprint implements some of the requirements and produces a new software release with additional features.
        * With reviews from the users at the end of each iteration.
        * Comparisons with SDLC:
            * Less emphasis on documentation compared to the waterfall model.
            * More emphasis on coding and testing (test-driven development).
            * More suitable for problems where the requirements are ill-defined and change frequently
                * e.g. applications that involve lots of GUI actions, or project involving new technologies.
        * Two types:
            * Scrum = a popular framework for realizing agile methodology.
                * Developers work in small teams (usually less than 10 people).
                * Lead by an experience scrum master (SM).
                    * A product owner lists out the desired product features (the
                    * “product backlog”), and their priorities.
                    * The development team selects a set of backlog items to be implemented during each sprint.
                * Each sprint lasts around 2 weeks.
                    * The team hold daily meetings (“stand-up meetings”) for progress review and problem-solving.
                * Agile/Scrum team
                    * Scrum master
                        * Guide the team through each sprint.
                        * Conduct daily stand-up meetings.
                        * Ensure the team follows Agile/Scrum methodology.
                        * Help the team to overcome obstacles and challenges.
                    * Product owner = person who has a vision of what the completed product will be like, usually a leading user.
                        * Provides product requirement information.
                        * Helps to prioritize the product backlog items (however, the team can usually decide which ones to do first).
                        * Communicate with the team regularly and provide feedback in a timely manner.
                    * Team members
                        * Create the delivery of each iteration.
                        * Note: in Scrum, the whole team collectively decide the features to be implemented in each sprint, which are then fixed until the next iteration.
                    * Technical specialists (Designers, database experts, etc.)
            * <span style="text-decoration:underline;">Extreme </span>Programming (XP)
                * Good for problems that need to produce a solution very quickly, with the requirement changing frequently.
                * Use simple and easy to understand program codes to replace the need for designing documents
                    * Using fewer classes and methods.
                    * Codes are expected to be restructured (re-factored) when necessary in the future to make them more maintainable.
                * Frequent and fast product releases for customer (user) comments.
                * On-site customers(users):
                    * is part of the development team.
                    * interact with customers frequently to obtain feedback.
                * Features to be developed are prioritized by the customer and followed by the team.
                * Requirements can be changed/added at any time, even in the middle of an iteration.
                * Developers work in small teams. Pair programming (two programmers work in the same workstation) is common.
                * Test-driven development:
                    * Place importance in testing programmes.
                    * Create unit-test programs for each functionality even before the functionality is implemented.

**2. Design pattern 1 (MVC) - related to Object-Oriented Programming.**



* Definition of Design patterns:
    * general, reusable program designs for solving common problems in software design.
* Examples of Design patterns:
    * MVC (Model – Controller – View)
        * Main = set up connection between the three, and instruct the View to start accepting user commands.
        * Model = **Handling/storing data while the program is running.**
            * Notify the controller to change the view.
            * e.g. add(), delete() and loopup(), as well as load() and save().
        * View = **Handling user inputs and outputs.**
            * Notify the controller to change the model on user actions.
            * e.g. doAdd(), doDelete() and doLoopup() which is called by processCommand(), as well as showMessage().
                * continue to process the command, passing appropriate inputs to the appropriate method in the Controller.
        * Controller = **Connecting the model and the view.**
            * Update the model based on user actions in the view.
            * Update the view when the data in the model has been changed.
            * e.g. setController(), processCommand(), as well as setView() and setModel(), and addToModel(), deleteFromModel() and lookupFromModel().
        * ~~Advantages:~~
            * ~~The data, the view and the business logics are independent of each all separated from each other.~~
            * ~~Modification on one part does not affect the rest of the program.~~
            * ~~Cleaner and easier-to-maintain codes.~~
            * ~~Faster development (better team-working)~~
            * ~~Examples:~~
                * ~~changing data storage method in the Model.~~
                * ~~replacing with a GUI-based one with the View.~~
        * Steps: View.processCommand() →
            * View.doAdd() → Controller.addToModel() → Model.add() + View.showMessage()
            * View.doDelete() → Controller.deleteFromModel() → Model.delete() + View.showMessage()
            * Controller.handleExit() → Model.closeDB()
            * View.doLookup() → Controller.lookupFromModel() → Model.lookup() + View.showMessage()
            * !!! connectDB() is called whenever Model is created().
        * GUI Steps: view.setVisible(true) → 
            * View.bLookupActionPerformed → Controller.lookupFromModel() → Model.lookup() + View.showMessage()
            * View.bDeleteButtonActionPerformed() → Controller.deleteFromModel() → Model.delete() + View.showMessage()
            * View.bAddActionPerformed() → Controller.addToModel() → Model.add() + View.showMessage()
            * View.showMessage() → JOptionPane.showMessageDialog()
        * Data Transfer Objects
    * Iterators
    * Adaptors
    * Singleton
* Some Conventions discovered?
    * No need to assign public or private attributes for class variables, unless it is connector, view or model(probably private tho? but then it needs getters and setters).
    * Methods that would not be called should be private.

**3. Design pattern 2**



* Memento = store backup of the program status, and restore if needed.
    * A memento object is passed from the Originator to the caretaker object for saving its internal state.
    * The CareTaker returns relevant information (previous status) if needed.
    * Steps:
        * Originator.save() → new Memento → Caretaker.addMemento()
        * Originator.restore() → Caretaker.removeMemento()
* Singleton = restrict to only one object of a certain class.
    * Make the constructor private and provide static methods for obtaining an object.
        * which is always the same one based on the static attribute.
    * Steps:
        * private static constructor singleton;
        * private constructor()
        * public static constructor getInstance()
            * if (singleton == null) 

                singleton = new B();

    * Advantages:
        * static methods and variables are faster.
        * Singleton are more flexible and more object-oriented as it can be subclassed.
* Adapter = transfer the method calls to the ones provided by the supplier.
    * Steps:
        * Supplier supplier;
        * public Adapter (Supplier s) {

            	supplier = s;


            }

* Iterator = common and standardized approach to loop through items in the collections.
    * Supply with Iterator object, hasNext() and next() method.
    * Steps:
        * Iterator&lt;String> iterator = collection.iterator();
        * while (iterator.hasNext()) {

            	iterator.next();


            }


**4. Requirement Analysis and Use Case Analysis**



* Three steps:
    * Understand the requirements by interactions with the user community.
        * User requirements might sometimes be unclear.
        * Functional requirements - describe how the system interacts with users and with other systems.
            * Output: requirements specification document e.g. Use case analysis, user stories.
        * Non-functional requirements - other constraints on the system.
            * Quality related e.g. security, accuracy, response time.
            * Technology related e.g. specific choice of hardware and software.
            * Project related e.g. budget, schedule
    * Document the required functionalities.
    * Design a conceptual model of the system.
* Use case diagram & Use case description [Behaviour]
    * State the interactions for each goal of the Use Case Diagram.
        * Should not include details that the users does not need to know.
    * The description might include some complex rules or logics (business rules), which is better to write in a separate section.
    * Use case extension &lt;<extend>> = Additional processes only carried in some scenarios.
    * Use case inclusion &lt;<include>> = Additional processes carriedout every time in the main flow.
    * Secondary actors = another party contacted and interacted when requested by primary actors.
* User Story = short description of users requirements with some acceptance criteria in brackets.

**5. System Design and Diagrams**



* Things to consider before system design: choice of platform, choice of programming language (the functionality of the application and expertise of the company) and choice of user interface method (e.g. touch screen, regular computers).
* System design includes classes and methods, interfaces, files/databases and data backup-up/restoring.
    * Check the nouns in a use case diagram/description.
* Class diagram [Structure]
    * Iterate if any classes can be reduced/eliminated, while any new classes or attributes are required.
    * Getter and setter methods are not required.
    * Public attributes/methods are marked as + while private attributes/methods are marked as -.
    * Subclasses(generalisation) are marked as empty-arrow.
    * Composition and Aggregation
        * Composition = contains another object as an indivisible part.
        * Aggregation = another object can exists outside of the target object.
* Other common diagrams (Unified Modeling Language)
    * component diagram (higher level) [Structure]
    * deployment diagram (how various components are distributed across servers and platforms, including hardwares and softwares) [Structure]
    * sequence diagram (describe the time ordering of messages) [Behaviour]
    * activity diagram (describe the processing steps) [Behaviour]
    * state machine diagram (describe how system status are changed) [Behaviour]

**6. Implementation, Testing and Maintainance**



* Implementation
    * Coding standard e.g naming conventions, no ignore exceptions
    * Java Documentation /** Special Comments */ = can converted into API documents.
* Testing
    * Unit test
        * Individual unites of source code often tested by automated tests.
        * Based on white-box testing.
        * Responsible by programmer and is in development SDLC stage.
        * Example: JUnit(e.g. assertion), JUnit Framework
    * JUnit annotations
        * @BeforeClass
            * Executed once at the beginning before all tests, usually used for computationally expensive tasks e.g. connect to database.
        * @Before
            * Executed at the beginning of each individual test, used for common set-up steps e.g. re-initialise variables.
        * @Test
            * The tests themselves, order might vary and not necessarily top to buttom.
        * @After
            * Executed at the end of each individual test.
        * @AfterClass
            * Executed once at the end after all tests, usually used for releasing external resources e.g. disconnect from database.
    * System integration test (SIT)
        * Systematic testing of the whole system or multiple systems.
        * Based on both white-box testing and black-box testing (functional testing).
        * Responsible by system analyst and is in development testing SDLC stage.
    * User acceptance test (UAT)
        * Verify whether the system meets the customers’ requirements.
        * Based on black box testing.
        * Reponsible by user (do the testing) and system analyst (supporting), and is in the development testing SDLC stage.
        * Two types:
            * Alpha test - based on simulated data and environment.
            * Beta test - based on real data and customers.
    * Test plan and test cases
        * test plan: a list of test cases.
        * test case: a description of necessary actions and parameters (data) to achieve and verify the expected behaviour.
            * Including the input data, the process/procedures, the expected results.
* Maintenance
    * Ongoing supports for the deployed system, including…
        * Bug fixing (software errors) and emergency situation (e.g. hardware failure).
        * Day to day system supports (e.g., running of batch jobs, data backup,
        * user account maintenance, provide user supports)
        * Handle minor user requests that are related to day to day operations
        * Change in environment (e.g., updates of libraries used by software)
    * Systematic monitoring (e.g., system speed, check for broken links)
        * Could be same expensive for small scale projects in terms of development costs.
