## Key Points on each Design Patterns

### Creational DesignPatterns

    1.Singleton - If you want to create a object only once.
             eg - Database connection
    2.Prototype - When objaect can be cloned from existing once, create a clonning Interface
    3.Factory   - When object of sameType but different implementation is required
    4.Abstract Factory - When a Factory needed to be abstract and slected first to create a object
            eg - A OS based factory which will give os based GUI and contains buttons of different kind
    5.Builder  - Different Type complex odbject can be build using same builder code.
            eg - Making different type of pizza with the same same code and changing the toppings/sauce/crust.
### Structural Design Patterns

    1.Composite - core model of your app can be represented as a tree.
             eg - Directory and File implementing File component system, whree leaf is file 
    2.Adapter   - pattern that allows objects with incompatible interfaces to collaborate. (like power adaptor)
             eg - Normal Mediaplayer can be converted to advanced mediaplayer with a MediaAdapter.
    3.Decorator - lets you attach new behaviors to objects by placing these objects inside special wrapper objects that contain the behaviors.
             eg - Coffe Decortor wrapper can be added to use sugar and milk wrapper to get total cost.
    4.Facade    - simplified interface to a library, a framework, or any other complex set of classes.
             eg - Computer Facade will be having all cpu, memory and storage inside.

### Behavioural Design patterns
    
    1.Chain of responsibility - pass requests along a chain of handlers
                          eg  - Logger Interface being passed through multiple implementation.
    2.Command                 - Turns a request into a stand-alone object that contains all information about the request.
                          eg  - Command Interface implementing by Light On and Light Off and remote using these.
    3.State                   - Object alter its behavior when its internal state changes.
                          eg  - Media player changing it state as playing, paused, start, stop etc.
    4.Template                - Defines the skeleton of an algorithm in the superclass but lets subclasses override specific steps of the algorithm without changing its structure.
                          eg  - Abstaract DataMiner class with abstract and concrete methods and Subclass overides template methods.




    