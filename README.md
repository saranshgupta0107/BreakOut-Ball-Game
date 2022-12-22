# BreakOut-Ball-Game 
Breakout Ball game is a widely used game which was developed in the 1970’s. In Breakout, a layer of bricks lines the top third of the screen and the goal is to destroy them all. A ball moves straight around the screen, bouncing off the top and two sides of the screen. When a brick I hit, the ball bounces back and the brick is destroyed. The player loses a turn when the ball touches the bottom of the screen; to prevent this from happening, the player has a horizontally movable paddle to bounce the ball upward, keeping it in play. The player uses the platform to keep the ball running. The goal is to break the bricks without missing the ball with your platform. 

The project makes use of **Java swing, OOPS concepts.**
Used new Java concepts like **AWT, Swing, JFrame, JPanel etc.**


## Functional components of the project
1. The player should be able to start the game in the terminal by pressing the ENTER key.
2. The player should be able to move the paddle sideways using the Leftwards and the Rightwards Arrow on the keyboard.
3. Once the player loses the ball, i.e. when the ball touches the bottom of the screen, the game ends.
4. Breaking each brick provides the player a certain number of points.
5. Once the game ends, the terminal will present the final score of the player and give him the option to restart the game again.


# UML Diagrams


## Use Case Diagram-
A use case diagram is used to represent the dynamic behaviour of a system. It encapsulates the system's functionality by incorporating use cases, actors, and their relationships. Following are the purposes of a use case diagram given below:
1. It gathers the system's needs.
2. It depicts the external view of the system.
3. It recognizes the internal as well as external factors that influence the system.
4. It represents the interaction between the actors. 
Extend relationship: The use case is optional and comes after the base use case. It is represented by a dashed arrow in the direction of the base use case.
Include relationship: The use case is mandatory and part of the base use case. It is represented by a dashed arrow in the direction of the included use case.

![image](https://user-images.githubusercontent.com/95615228/209070561-02a4a6c4-4c12-48e2-a726-2102ee868da7.png)



## Class diagram
Class diagrams are the main building blocks of every object-oriented method. The class diagram can be used to show the classes, relationships, interface, association, and collaboration. 
UML is standardized in class diagrams. Each class is represented by a rectangle having a subdivision of three compartments class name, attributes and methods. There are three types of modifiers that are used to decide the visibility of attributes and operations. 
1. '+' is used for public visibility(for everyone)
2. '#' is used for protected visibility (for friend and derived)
3. '–' is used for private visibility (for only me)
Class diagrams are used for describing the static view of the system, showing the collaboration among the elements of the static view, describing the functionalities performed by the system and construction of software applications using object-oriented languages.
![image](https://user-images.githubusercontent.com/95615228/209072003-2eb34760-00d2-45ec-9238-9fb2ae951b66.png)




## State Diagram
A state diagram is used to represent the condition of the system or part of the system at finite instances of time. It is a behavioural diagram and it represents the behaviour using finite state transitions. Uses of state diagram –
1.  We use it to state the events responsible for change in state (we do not show what processes cause those events).
2.  We use it to model the dynamic behaviour of the system.
3.  To understand the reaction of objects/classes to internal or external stimuli. 

a) We use a black filled circle represent the initial state of a System or a class.  A solid arrow to represent the transition or change of control from one state to another.  The arrow is labelled with the event which causes the change in state.
b) A rounded rectangle to represent a state.  A state represents the conditions or circumstances of an object of a class at an instant of time. 
c) We use a filled circle within a circle notation to represent the final state in a state machine diagram.
![image](https://user-images.githubusercontent.com/95615228/209072265-37678fd8-2eaa-4b09-9f58-dec7830414ea.png)




## Sequence Diagram
Sequence Diagrams are interaction diagrams that detail how operations are carried out. They capture the interaction between objects in the context of a collaboration. Sequence Diagrams are time focus and they show the order of the interaction visually by using the vertical axis of the diagram to represent time what messages are sent and when. Sequence Diagrams captures:
The interaction that takes place in a collaboration that either realizes a use case or an operation (instance diagrams or generic diagrams)
High-level interactions between user of the system and the system, between the system and other systems, or between subsystems (sometimes known as system sequence diagrams)
![image](https://user-images.githubusercontent.com/95615228/209072407-1faf74f2-3365-48d5-914f-3897a71d059b.png)





## CRC Diagram
Class-responsibility-collaboration (CRC) cards are a brainstorming tool used in the design of object-oriented software. One CRC card for each relevant class/object. The card is partitioned into three areas:
1. On top of the card, the class name
2. On the left, the responsibilities of the class
3. On the right, collaborators (other classes) with which the class interacts to fulfil its responsibilities. 
Using small cards minimizes the complexity of the design, reduces class responsibilities and keeps designers focused on the essentials of the classes without exploring implementation details.
![image](https://user-images.githubusercontent.com/95615228/209072508-febbb196-25f3-4aa5-9437-6796c72765bb.png)





## Future Scope
1. We can add difficulty levels – easy , medium and hard in which the speed of the ball and number of bricks will vary.
2. We can add option to change between different themes for the user interface like jungle theme in which the bricks, ball , background everything will be green in color and jungle based theme.
3. We can use backend to save the scores and thus keep track of highest score.




## Visuals from the Game
![image](https://user-images.githubusercontent.com/95615228/209072657-59973caa-1c73-4ee1-afd6-e6528eb93ced.png)
![image](https://user-images.githubusercontent.com/95615228/209072679-d12e7198-527e-42ec-8e24-ddc8a1fbd95b.png)
![image](https://user-images.githubusercontent.com/95615228/209072790-bfed3fe5-e040-4270-a503-2c3db9bfac35.png)
![image](https://user-images.githubusercontent.com/95615228/209072817-052dacf7-dc5d-400f-916d-96e460ee34f9.png)







  
  
  








