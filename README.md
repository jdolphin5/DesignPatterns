# DesignPatterns

# Study of Head First Design Patterns


Book Summary: Head First Design Patterns, by Eric Freeman and Elisabeth Robson
Below is a summary of the main Design Patterns and Design Principles covered in the Head First Design Patterns book.

# Design Patterns

# Strategy
Encapsulates interchangeable algorithms/behaviours and uses delegation to decide which one to use.
Allows the algorithm to vary independently from the clients that use it.
# Observer
Defines a one-to-many dependency between objects so that when one object changes state, all of its dependents are updated and notified automatically.
# Decorator
Wraps another object dynamically and provides additional behaviour for it.
Provides a flexible alternative to subclassing for extending functionality.
Doesn't alter the interface but adds responsibility.
# Factory Method
Defines an interface for creating an object, but lets subclasses decide which class to instantiate.
Lets a class defer instantiation to subclasses.
# Abstract Factory
Provides an interface for creating families of related or dependent objects without specifying their concrete classes.
# Singleton
Ensures a class has only one instance, and provides a global point of access to it.
# Command
Encapsulates a request as an object, thereby letting you parameterise other objects with different requests, queue or log requests, and support undoable operations.
Decouples an object making a request from the one that knows how to perform it.
# Adapter
Wraps an object and provides a different interface to it.
Converts the interface of a class into another interface the clients expect.
Lets classes work together that couldn't otherwise because of incompatible interfaces.
# Facade
Wraps a bunch of objects to simplify their interface.
Provides a unified interface to a set of interfaces in a subsystem.
Defines a higher-level interface that makes the subsystem easier to use.
# Template Method
Encapsulates algorithms.
Defines the skeleton (/steps) of an algorithm in a method, deferring some steps to subclasses.
Subclasses decide how to implement steps in an algorithm (without changing the algorithm's structure).
# Iterator
Provides a way to traverse/access the elements of an aggregate object sequentially without exposing its internal structure.
Takes the job of iterating over an aggregate and encapsulates it in another object.
# Composite
Provides a structure to hold both individual objects and composite objects.
Lets clients treat individual objects and collections/compositions of objects uniformly.
# State
Allows an object to alter its behaviour when its internal state changes.
Encapsulates state into separate classes and delegates to the object representing the current state.
# Proxy
Wraps another object to control access to it.
Acts as a representative for another object.

# Design Principles

Encapsulate what varies – Identify the aspects of your application that vary and separate them from what stays the same. Take the parts that vary and encapsulate them.

Program to an interface, not to an implementation.

Composition over inheritance – Favour composition over inheritance.

Loose coupling – Strive for loosely coupled designs between objects that interact.

Open-Closed – Classes should be open for extension, but closed for modification.

Dependency inversion
Design upon abstractions. Do not depend on concrete classes.
High-level components should not depend on low-level components; rather, they should both depend on abstractions.
No variable should hold reference to a concrete class.
No class should derive from a concrete class.
No method should override an implemented method of any of its base classes.
Principle of least knowledge
Talk only to your immediate friends.
The Hollywood Principle
Don't call us, we'll call you.
High level components call low level components, and not vice-versa.
Single responsibility
A class should have only one responsibility.
A class should have only one reason to change.
