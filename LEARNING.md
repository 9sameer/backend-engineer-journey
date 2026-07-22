# Backend Engineer Journey

## Day 0

Date: 09 July 2026

Time Studied: 1 hour

Today's Topic:
-Roadmap
-Environment Setup
-Git Repository
-Things I Understood
-How our learning journey will work.
-Importance of Git.
-Enterprise project overview.
-Things I Didn't Understand
-Maven installation.
-Questions
None.
Day Number
-Topics Covered
-Assignments Completed
-Doubts Pending
-Next Day Plan
==============================================
📌 Day 3 Major Learning Notes

Ye apne notes me save kar lena:

Java is always Pass-by-Value.
Primitive variables ki value copy hoti hai.
Objects pass nahi hote.
Reference ki value copy hoti hai.
Do references same object ko point kar sakte hain.
Object modify karne se sab references ko change dikhta hai.
Reference ko new object assign karne se sirf local reference change hota hai.
Har method call ke liye ek new Stack Frame banta hai.
Method complete hote hi uska Stack Frame remove ho jata hai.
Spring Boot method calls bhi isi Java mechanism par based hain.
====================================================================
======================================================
📒 Day 3 Major Learning Points (Save These)

* Java is **always Pass-by-Value**. It never passes the actual object or reference; it passes a copy.
* For Primitive types, a direct copy of the value is passed (original variable remains unaffected).
* For Objects, a copy of the **reference value** (memory address) is passed.
* Every single method call creates a brand new **Stack Frame** in memory.
* Modifying an object inside a method (`x.name = "Sameer"`) changes the actual object in the Heap, so the caller sees the change.
* Reassigning a reference inside a method (`x = new Student()`) only breaks the local link in that Stack Frame; the original caller remains completely unaffected.
* A Stack Frame stores method parameters, local variables, primitive values, and reference variables.
* Stack Frames are automatically destroyed and popped off the stack as soon as the method completes execution.
* Spring Boot strictly follows this rule internally (e.g., passing an entity to `repository.save(user)` passes a copy of the reference).

======================================================
📒 Day 4 Major Learning Points (Save These)

* Object-Oriented Programming (OOP) solves procedural issues by binding **Data (State)** and **Behavior (Methods)** into a single unit called an Object.
* A **Class** is strictly a blueprint, template, or structural contract—it is not a real object and occupies no physical memory.
* An **Object** is a live, real instance of a class created in memory using the `new` keyword.
* Reference variables are stored in **Stack Memory**, while the actual complex objects reside in **Heap Memory**.
* Every single object has three essential pillars:
  * **State:** The data it holds (represented by instance variables).
  * **Behavior:** What it can do (represented by methods).
  * **Identity:** A unique identifier that distinguishes it from every other object in memory.
* Two separate objects with identical data fields (same state) are still completely different entities due to having unique identities.
* In Spring Boot, the classes we write (like `UserController` or `UserService`) are instantiated at startup by the framework into managed objects called **Spring Beans**.
======================================
📒 Day 6 Major Learning Points

Save these:

this refers to the current object.
this.field accesses the current object's field.
name = name assigns the parameter to itself.
this.name = name assigns the parameter value to the object's field.
this() calls another constructor of the same class.
Constructor Chaining helps remove duplicate initialization code.
this() must always be the first statement inside a constructor.
Static methods cannot use this because they don't belong to a specific object.
Complete Object Lifecycle:
new
Heap memory allocation
Constructor execution
Field initialization
Reference returned
Object usage
Reference lost
Garbage Collection
Memory freed

==============================================
Day 7 Major Learning Points (Save These) 
Encapsulation protects the internal state of an object.
Use private fields to prevent direct modification.
Getters expose data in a controlled way.
Setters should contain validation when required.
Not every field should have a setter.
Business behavior should be represented by methods (deposit(), withdraw(), buyPolicy()), not by exposing raw data.
Encapsulation is about controlled access + validation + data integrity, not just hiding data.
Good object design exposes behavior, not internal state.

======================================================
📒 Day 8 Major Learning Points (Save These)
Inheritance models an IS-A relationship.
extends is used to inherit from another class.
Child class inherits accessible fields and methods from the parent.
Parent constructor executes before the child constructor.
super refers to the parent class portion of the current object.
Inheritance reduces duplication, but its main purpose is proper modeling.
IS-A → Inheritance.
HAS-A → Composition (object contains another object).

======================================
📒 Day 6 Major Learning Points

Save these:

this refers to the current object.
this.field accesses the current object's field.
name = name assigns the parameter to itself.
this.name = name assigns the parameter value to the object's field.
this() calls another constructor of the same class.
Constructor Chaining helps remove duplicate initialization code.
this() must always be the first statement inside a constructor.
Static methods cannot use this because they don't belong to a specific object.
Complete Object Lifecycle:
new
Heap memory allocation
Constructor execution
Field initialization
Reference returned
Object usage
Reference lost
Garbage Collection
Memory freed

==============================================
Day 7 Major Learning Points (Save These) 
Encapsulation protects the internal state of an object.
Use private fields to prevent direct modification.
Getters expose data in a controlled way.
Setters should contain validation when required.
Not every field should have a setter.
Business behavior should be represented by methods (deposit(), withdraw(), buyPolicy()), not by exposing raw data.
Encapsulation is about controlled access + validation + data integrity, not just hiding data.
Good object design exposes behavior, not internal state.

======================================================
📒 Day 8 Major Learning Points (Save These)
Inheritance models an IS-A relationship.
extends is used to inherit from another class.
Child class inherits accessible fields and methods from the parent.
Parent constructor executes before the child constructor.
super refers to the parent class portion of the current object.
Inheritance reduces duplication, but its main purpose is proper modeling.
IS-A → Inheritance.
HAS-A → Composition (object contains another object

===============================================================
📒 Day 9 Major Learning Points (Save These)
Polymorphism allows one common type to have multiple implementations.
Method Overloading = Same class, different parameters, compile-time polymorphism.
Method Overriding = Parent-child relationship, same method signature, runtime polymorphism.
Runtime polymorphism uses the actual object, not the variable type.
Parent p = new Child(); is valid because Child IS-A Parent.
Child c = new Parent(); is invalid because every Parent is not a Child.
Polymorphism promotes loose coupling and flexibility.
Spring Boot uses polymorphism extensively through interfaces and dependency injection.

======================================================================================
📒 Day 10 Major Learning Points (Save These)
Abstraction hides implementation details while exposing essential behavior.
Abstract classes define a common contract for child classes.
Child classes provide the implementation of abstract methods.
Abstract classes can have:
Variables
Constructors
Concrete methods
Abstract methods
Abstract classes cannot be instantiated (no object creation).
Encapsulation hides data.
Abstraction hides implementation.
Use abstraction when every child must provide its own implementation.

📒 Abstract Class Inheritance Rules (Interview Trap!)
* YES, any concrete (normal) child class MUST override and implement all abstract methods of its parent abstract class.
* If the child class fails to implement them, Java will throw a Compile-Time Error.
* This is NOT just an Interface rule—it applies to both Abstract Classes and Interfaces equally to maintain type safety and prevent runtime crashes.
* The only exception is if the child class itself is declared as `abstract`.
* 

==================================================================
# 📒 Day 11 Major Learning Points (Save These)

- Interfaces define **contracts**, not implementations.
- A class can implement multiple interfaces.
- A class can extend only one class.
- Interfaces promote **loose coupling**.
- Spring Boot uses interfaces heavily for flexibility and dependency injection.
- Interface methods are implemented by the implementing class.
- Interfaces **cannot have constructors**.
- Interface variables are implicitly `public static final` (constants).
- Program to an **interface**, not to an implementation

- =======================================================================
- 📒 Day 12 Major Learning Points
- 
Collections provide a framework to manage groups of objects.
ArrayList is dynamic and internally backed by an array.
ArrayList maintains insertion order.
Duplicate values and null are allowed.
Generics work only with reference types, not primitives.
remove(int) removes by index.
remove(Object) removes by value.
Prefer List over ArrayList in declarations to achieve loose coupling.
Program to an interface, not to an implementation.

* `new ArrayList<>()` creates an empty array with an initial capacity of 0.
* On the absolute first `add()` operation, the capacity instantly jumps to 10 (Default Capacity).
* Resizing triggers ONLY when the array is 100% full and a new element tries to enter.
* The growth factor is exactly 1.5x (Current Capacity + 50% of Current Capacity).
* Internal Formula: `int newCapacity = oldCapacity + (oldCapacity >> 1);`
* Resizing involves allocating a new larger array in Heap and performing a `System.arraycopy()` from the old array.
* 
- 📚 Notes (Save These)
Collections manage groups of objects efficiently.
ArrayList is dynamic and internally backed by an array.
ArrayList maintains insertion order.
Duplicates and null values are allowed.
Collections store objects, not primitives.
Prefer programming to the List interface rather than the concrete ArrayList implementation.
Map is part of the Collections Framework but does not extend the Collection interface.

=======================================================================================
- 📒 Day 13 Major Learning Points
📌 Notes to Remember
super
super keyword hai.
super() parent constructor call karta hai.
First statement hona mandatory hai.
this
this current object ka reference hai.
this() same class ke constructor ko call karta hai.
this() aur super() ek hi constructor me saath use nahi kar sakte.
@Override
Optional annotation hai.
Runtime behavior change nahi karta.
Compile-time validation deta hai.
Abstract Class
Object nahi bana sakte.
Abstract method ko concrete child implement karega.
Agar child bhi abstract hai to implementation defer kar sakta hai.
=====================================================
- 📒 Day 14 Major Learning Points

- 📌 Cheat Sheet
Interface → Contract
implements → Fulfills contract
List → Interface
ArrayList → Class
Program to Interface → Loose Coupling
Service Layer → Business Logic
======================================================
📒 Day 16 Major Learning Points (Save These)

### 1. Equality Comparison: `==` vs `equals()`
* `==` Operator:
  * For Primitives: Compares actual **Values** (`10 == 10` ➔ `true`).
  * For Objects: Compares **References / Memory Addresses** (`s1 == s2` ➔ `false` for separate heap allocations).
* `equals()` Method:
  * Compares **Logical Content / State** inside objects (e.g., comparing string characters).
  * Cannot be called on primitives (Compile-Time Error).
* String Comparison Rule:
  * Yes, String *can* technically use `==`, but it checks reference equality (String Pool behavior), not content.
  * **Always prefer `equals()` for String content comparison** in enterprise applications.

### 2. Service Layer & Reusable Architecture
* Returning `null`: Services return `null` to explicitly indicate that a requested entity/record was not found in memory/database.
* Separation of Concerns:
  * **Service Layer:** Strictly handles Business Logic & Data Retrieval. It should NEVER contain `System.out.println()`.
  * **Main / Controller Layer:** Handles Presentation and UI rendering.
* Reusability Reason: If a Service prints to the console directly, it cannot be reused by an Android App, Web Frontend, or REST API. Services must return raw data and let the presentation layer decide how to display it.

### 3. Collection Search Iterations (Linear Search)
* Searching in a List checks elements sequentially from index 0:
  * Best/Mid Case: Loop terminates early as soon as the target ID is matched.
  * Worst Case (Item at end or missing): Traverses all $N$ elements completely (e.g., searching for non-existent `P999` scans all 3 items).

### 4. Method Signature Basics (Interview Trap)
* `Return Type` vs `Returned Value`:
  * `Policy findPolicyById(String id)` ➔ Return Type is the class/data type: **`Policy`**.
  * `null` or a live object is the **value** being returned at runtime, NOT the return type itself.

====================================================
Day 17
📌 Cheat Sheet
Iterator  ----->  Forward traversal

hasNext()  -----> Check

next()  ----->  Move

remove()  ----->  Safe delete

for-each  ----->  Internally uses Iterator

=====================================================
Day 18 
Update Operation performed 

===================================================\
DAY 19 – Exception Handling (Part 1)

📌 Cheat Sheet
Exception

↓

Runtime problem

try

↓

Risky code

catch

↓

Handle problem

finally

↓

Always executes

e.getMessage()

↓

Short message

e.printStackTrace()

↓

Full error details

============================================================================
DAY 20 – throw, throws, Checked vs Unchecked Exceptions + First Custom Exception
📌 Cheat Sheet
throw
↓

Actually throws

throws
↓

Declares

Checked

↓

Compiler

Unchecked

↓

Runtime

Custom Exception

↓

Business-specific

RuntimeException

↓

Unchecked Exception