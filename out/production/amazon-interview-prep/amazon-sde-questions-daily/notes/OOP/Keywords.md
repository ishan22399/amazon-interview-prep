# OOP Keywords in Java: Detailed Interview Notes

This document covers all important Java keywords related to Object-Oriented Programming (OOP), with detailed explanations, interview perspectives (why, what, how, why not), and real Amazon SDE interview questions with answers.

---

## 1. `class`
- **What:** Blueprint for creating objects; defines properties (fields) and behaviors (methods).
- **Why:** Enables encapsulation, code reuse, and abstraction.
- **How:** Declared using `class` keyword.
- **Why not struct/other?** Java is purely OOP; `struct` is not supported as in C/C++.
- **Example:**
  ```java
  class Car {
      int speed;
      void drive() { ... }
  }
  ```

---

## 2. `object`
- **What:** Instance of a class; real entity in memory.
- **Why:** To use the properties and methods defined in a class.
- **How:** Created using `new` keyword.
- **Why not static?** Static members belong to class, not objects.
- **Example:**
  ```java
  Car myCar = new Car();
  ```

---

## 3. `static`
- **What:** Belongs to the class, not to any object.
- **Why:** For memory efficiency, shared data/methods.
- **How:** Declared with `static` keyword.
- **Why not instance?** Use static for utility or shared data.
- **Example:**
  ```java
  static int wheels = 4;
  static void printInfo() { ... }
  ```

---

## 4. `final`
- **What:** Used to declare constants, prevent inheritance, or prevent method overriding.
- **Why:** For immutability, security, and design constraints.
- **How:** Declared with `final` keyword.
- **Why not non-final?** Use non-final for flexibility.
- **Example:**
  ```java
  final int MAX_SPEED = 120;
  final class Utility { ... }
  final void show() { ... }
  ```

---

## 5. `this`
- **What:** Reference to current object.
- **Why:** To resolve ambiguity between instance variables and parameters, or to call other constructors.
- **How:** Used inside class methods/constructors.
- **Why not use variable name?** When parameter and field names are same, `this` is needed.
- **Example:**
  ```java
  class Car {
      int speed;
      Car(int speed) { this.speed = speed; }
  }
  ```

---

## 6. `super`
- **What:** Reference to parent class object.
- **Why:** To access parent class methods/fields/constructors.
- **How:** Used in subclass.
- **Why not this?** `this` refers to current class, `super` to parent.
- **Example:**
  ```java
  class Vehicle { void start() { ... } }
  class Car extends Vehicle {
      void start() { super.start(); }
  }
  ```

---

## 7. `extends`
- **What:** Used for inheritance (class to class).
- **Why:** To reuse code, achieve polymorphism.
- **How:** `class B extends A {}`
- **Why not implements?** `implements` is for interfaces.
- **Example:**
  ```java
  class Car extends Vehicle { ... }
  ```

---

## 8. `implements`
- **What:** Used to implement interfaces.
- **Why:** For abstraction, multiple inheritance (via interfaces).
- **How:** `class A implements Interface1, Interface2 {}`
- **Why not extends?** `extends` is for classes.
- **Example:**
  ```java
  class Car implements Drivable { ... }
  ```

---

## 9. `abstract`
- **What:** Used to declare abstract classes/methods (cannot be instantiated, must be implemented by subclass).
- **Why:** For partial abstraction.
- **How:** `abstract class A {}` or `abstract void run();`
- **Why not interface?** Use interface for full abstraction.
- **Example:**
  ```java
  abstract class Vehicle { abstract void start(); }
  ```

---

## 10. `interface`
- **What:** Blueprint for classes, only abstract methods (Java 8+: default/static methods allowed).
- **Why:** For full abstraction, multiple inheritance.
- **How:** `interface A { void run(); }`
- **Why not abstract class?** Use interface for multiple inheritance.
- **Example:**
  ```java
  interface Drivable { void drive(); }
  ```

---

## 11. `public`, `private`, `protected`, (default)
- **What:** Access modifiers.
- **Why:** To control visibility/scope.
- **How:**
  - `public`: visible everywhere
  - `private`: visible only in class
  - `protected`: visible in package + subclasses
  - (default): package-private
- **Why not all public?** For encapsulation and security.
- **Example:**
  ```java
  public int x;
  private int y;
  protected int z;
  int w; // default
  ```

---

## 12. `new`
- **What:** Used to create objects.
- **Why:** To allocate memory for objects.
- **How:** `ClassName obj = new ClassName();`
- **Why not static?** Static does not require object creation.
- **Example:**
  ```java
  Car myCar = new Car();
  ```

---

## 13. `return`
- **What:** Returns value from method.
- **Why:** To output result from function.
- **How:** `return value;`
- **Why not void?** Use `void` when no return value needed.
- **Example:**
  ```java
  int getSpeed() { return speed; }
  ```

---

## 14. `void`
- **What:** Method does not return any value.
- **Why:** For actions, not calculations.
- **How:** `void methodName() { ... }`
- **Why not return type?** Use return type when value is needed.
- **Example:**
  ```java
  void drive() { ... }
  ```

---

## 15. `instanceof`
- **What:** Checks if object is instance of class/interface.
- **Why:** For type checking at runtime.
- **How:** `obj instanceof ClassName`
- **Why not getClass()?** `instanceof` works with inheritance.
- **Example:**
  ```java
  if (car instanceof Vehicle) { ... }
  ```

---

## 16. `synchronized`, `volatile`, `transient`, `native`, `strictfp`
- **What:** Advanced keywords for concurrency, serialization, native code, floating-point precision.
- **Why:** For special use-cases (multi-threading, performance, platform-specific code).
- **How:**
  - `synchronized`: thread safety
  - `volatile`: variable visibility
  - `transient`: skip serialization
  - `native`: native methods
  - `strictfp`: floating-point consistency
- **Example:**
  ```java
  synchronized void increment() { ... }
  volatile int count;
  transient int temp;
  native void callC();
  strictfp class Calc { ... }
  ```

---

# Amazon SDE Interview Questions on OOP Keywords (with Answers)

### Q1. What is the difference between `static` and `final` keywords?
**A:** `static` means the member belongs to the class, not objects. `final` means the value cannot be changed (for variables), method cannot be overridden, or class cannot be inherited.

### Q2. Why do we use `this` keyword? Can you give a scenario where it is necessary?
**A:** `this` is used to refer to the current object. It is necessary when local variables shadow instance variables, e.g., in constructors or setters.

### Q3. What is the use of `super` keyword?
**A:** `super` is used to access parent class members, especially when they are hidden by subclass members, or to call parent constructor.

### Q4. Can you override a `final` method?
**A:** No, a `final` method cannot be overridden.

### Q5. What is the difference between `abstract` class and `interface`?
**A:** Abstract class can have both abstract and concrete methods, can have state. Interface (before Java 8) only abstract methods, no state. Interface supports multiple inheritance.

### Q6. What is the default access modifier in Java?
**A:** Package-private (no modifier) is the default, meaning visible only within the same package.

### Q7. Why do we need `instanceof` operator?
**A:** To check type of object at runtime, useful in downcasting and avoiding `ClassCastException`.

### Q8. Can a class be both `final` and `abstract`?
**A:** No, `final` means cannot be extended, `abstract` means must be extended.

### Q9. What is the use of `transient` keyword?
**A:** To prevent a field from being serialized.

### Q10. What is the use of `volatile` keyword?
**A:** Ensures visibility of changes to variables across threads.

---

# Tips for Interviews
- Always explain with examples.
- Cover why, what, how, and why not.
- Relate keywords to OOP principles: encapsulation, inheritance, polymorphism, abstraction.
- Mention real-world scenarios.

---

# More Amazon SDE Interview Questions (Practice)
1. What happens if you remove `static` from the main method?
2. Can you overload static methods?
3. Can you access non-static variables from a static context?
4. What is the difference between `==` and `equals()`?
5. How does Java achieve polymorphism?
6. What is method hiding?
7. Can an interface extend another interface?
8. Can a class implement multiple interfaces?
9. What is the use of `default` methods in interfaces (Java 8+)?
10. What is the difference between `public`, `private`, `protected`?

---

# End of Notes
