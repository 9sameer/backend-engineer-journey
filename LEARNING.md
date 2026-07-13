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

# Backend Engineer Journey – Day 3 (Java Methods & Pass-by-Value)

## 1. Java is Always Pass-by-Value

**Golden Rule:**

Java is **always Pass-by-Value**.

Java kabhi object ya reference pass nahi karti.

Java **value ki copy** pass karti hai.

* Primitive types → Primitive value ki copy
* Objects → Reference ki value ki copy

---

## 2. Method Call

Jab bhi koi method call hota hai, Java Stack me ek **naya Stack Frame** create karti hai.

Example:

```java
greet();
```

Flow:

```text
main() Stack Frame
        ↓
greet() Stack Frame
```

Method complete hone ke baad us Stack Frame ko automatically remove kar diya jata hai.

---

## 3. Primitive Type Passing

Example:

```java
int a = 10;

change(a);

void change(int x){
    x = 100;
}
```

Flow:

```text
a = 10

↓

Copy

↓

x = 10

↓

x = 100
```

Original variable `a` change nahi hota.

Output:

```text
10
```

---

## 4. Object Passing

Example:

```java
Student s = new Student();

change(s);
```

Method:

```java
void change(Student x){
    x.name = "Sameer";
}
```

Memory:

```text
Main Stack

s -----------> Student Object

Method Stack

x -----------> Same Student Object
```

Dono references same object ko point karte hain.

Object modify hoga.

Output:

```text
Sameer
```

---

## 5. Reference Reassignment

Example:

```java
void change(Student x){

    x = new Student();

    x.name = "Sameer";

}
```

Yahan:

* Naya object create hota hai.
* Sirf local reference `x` change hota hai.
* Original reference `s` change nahi hota.

Output:

```text
Ali
```

---

## 6. Difference

### Object Modification

```java
x.name = "Sameer";
```

✔ Same object modify hota hai.

✔ Sab references ko change dikhta hai.

---

### Reference Reassignment

```java
x = new Student();
```

✔ Sirf local reference change hota hai.

✔ Original caller unaffected rehta hai.

---

## 7. Stack Frame

Har method ke liye Stack me ek naya frame banta hai.

Stack Frame stores:

* Method Parameters
* Local Variables
* Primitive Values
* Reference Variables

Method complete hote hi Stack Frame remove ho jata hai.

---

## 8. Spring Boot Connection

Jab hum likhte hain:

```java
userService.save(user);
```

To Spring object pass nahi karta.

Reference ki value pass hoti hai.

Ye Java ke Pass-by-Value rule ko hi follow karta hai.

---

# Interview Takeaways

* Java is always Pass-by-Value.
* Primitive variables ki value copy hoti hai.
* Object pass nahi hota.
* Reference ki value copy hoti hai.
* Object modify karne se caller ko change dikhta hai.
* Reference ko new object assign karne se caller ko koi effect nahi hota.
* Har method call ke liye Stack Frame create hota hai.

---

# Golden Lines (Remember Forever)

* Java is always Pass-by-Value.
* Objects are never passed.
* References are never passed.
* Java passes a copy of the reference value.
* Modifying an object is different from changing a reference.
* Every method call creates a new Stack Frame.
* Stack Frames are automatically removed after method execution.

---

# Common Interview Trap

❌ Java is Pass-by-Reference.

✅ Incorrect.

✔ Correct Answer:

**Java is always Pass-by-Value. For objects, Java passes a copy of the reference value.**

---

# Day 3 Summary

By the end of Day 3, you should be able to explain:

* How method calls work.
* What a Stack Frame is.
* Why Java is Pass-by-Value.
* Difference between object modification and reference reassignment.
* How this concept is used internally by Spring Boot.

========================================================================================
# Backend Engineer Journey – Day 4 (OOP Foundations)

## 1. Why Object-Oriented Programming (OOP)?

Before OOP, procedural programming stored data and functions separately, making large applications difficult to maintain.

OOP solves this by combining **data (state)** and **behavior (methods)** into a single unit called an **Object**.

### Benefits of OOP

* Better code organization
* Reusability
* Easy maintenance
* Scalability for large applications
* Real-world modeling
* Easier teamwork in enterprise applications

---

# 2. Class

A **Class** is a blueprint or template used to create objects.

It defines:

* Properties (Fields/Variables)
* Behaviors (Methods)

Example:

```java
class Customer {

    String name;
    String email;

    void buyPolicy() {

    }

}
```

A class itself is **not a real object**.

---

# 3. Object

An **Object** is a real instance of a class.

Example:

```java
Customer c1 = new Customer();

Customer c2 = new Customer();
```

Here:

* One Class
* Two Objects

Each object has its own memory.

---

# 4. Class vs Object

| Class                  | Object              |
| ---------------------- | ------------------- |
| Blueprint              | Real Instance       |
| Template               | Actual Entity       |
| Defines structure      | Stores actual data  |
| Used to create objects | Created using `new` |

---

# 5. Object Memory

Example:

```java
Student s = new Student();
```

Memory:

```text
Stack

s
↓

Heap

Student Object
```

* Reference variable (`s`) → Stack
* Object → Heap

---

# 6. Three Characteristics of an Object

## State

Current data of an object.

Example:

```text
Name = Sameer
Age = 22
Email = abc@gmail.com
```

State is represented by instance variables.

---

## Behavior

What an object can do.

Examples:

```text
study()

login()

buyPolicy()

renewPolicy()

withdraw()
```

Behavior is represented by methods.

---

## Identity

Every object has its own unique identity.

Even if two objects have exactly the same data, they are still different objects.

Example:

```java
Student s1 = new Student();

Student s2 = new Student();
```

Both are different objects even if their field values are identical.

---

# 7. OOP Principle

OOP combines:

* Data (State)
* Behavior (Methods)

inside a single object.

Instead of writing separate functions for everything, objects manage their own data and actions.

---

# 8. Spring Boot Connection

Almost everything in Spring Boot is based on OOP.

Examples:

```java
UserController

UserService

UserRepository
```

These are classes.

During application startup, Spring creates objects (called **Beans**) from these classes and manages them.

---

# 9. Important Memory Concepts

* Objects are created in Heap memory.
* Reference variables are stored in Stack memory.
* One class can create multiple objects.
* Every object has its own separate memory.
* Multiple references can point to the same object.

---

# Interview Takeaways

* OOP models real-world entities.
* A class is a blueprint, not an object.
* An object is an instance of a class.
* Every object has:

  * State
  * Behavior
  * Identity
* One class can create many objects.
* Objects are stored in Heap memory.
* Reference variables are stored in Stack memory.
* Spring Beans are objects managed by the Spring Framework.

---

# Golden Lines (Remember Forever)

* A class defines what an object **can have** and **can do**.
* An object is a real instance of a class.
* State = Data.
* Behavior = Methods.
* Identity = Every object is unique.
* One class can create unlimited objects.
* OOP combines data and behavior into a single unit.
* Spring Boot is built on OOP principles.

---

# Common Interview Traps

❌ "A class is an object."

✅ Incorrect.

A class is a blueprint. Objects are created from it.

---

❌ "Two objects with the same data are the same object."

✅ Incorrect.

They have the same state but different identities.

---

❌ "Spring Bean is a class."

✅ Incorrect.

A Spring Bean is an **object** created and managed by the Spring Framework.

---

# Real Project Connection (PolicyHub)

### Customer

**State**

* customerId
* name
* email
* phone
* address
* status

**Behavior**

* register()
* login()
* buyPolicy()
* renewPolicy()
* updateProfile()
* viewPolicies()

**Identity**

* `customerId`

This is exactly how we model real enterprise applications.

---

# Day 4 Summary

By the end of Day 4, you should be able to explain:

* Why OOP exists.
* Difference between Class and Object.
* State, Behavior, and Identity.
* How objects are created.
* Why Spring Boot is built on OOP.
* How to think about designing real-world software using classes and objects.



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
