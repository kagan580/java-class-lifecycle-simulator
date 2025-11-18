# Java Class Lifecycle Simulator

A console-based Java project that demonstrates **how Java loads classes
and executes**:

-   `static` blocks
-   instance (initializer) blocks
-   constructors
-   an inheritance chain (`AClass → BClass → CClass`)
-   basic **polymorphism**
-   common **String methods**
-   `equals`, `equalsIgnoreCase`, `compareTo`

------------------------------------------------------------------------

## 🚀 Overview

This project is a small **learning lab** for Java OOP.\
From the console menu, you can run different scenarios and see the
execution order printed step by step.

The goal is to **visualize** how Java behaves at runtime rather than to
build a business app.

------------------------------------------------------------------------

## 📂 Project Structure

``` text
src/
 └─ simulator/
      ├─ ClassLogger.java      # Collects log messages
      ├─ AClass.java           # Base class with static/instance blocks + ctor
      ├─ BClass.java           # Extends AClass
      ├─ CClass.java           # Extends BClass
      ├─ SimulationMenu.java   # Console menu & test methods
      └─ Main.java             # Entry point (starts the menu)
```

------------------------------------------------------------------------

## 📜 Features

-   **Class lifecycle tests**
    -   `new AClass()`
    -   `new BClass()`
    -   `new CClass()`
    -   Shows the order of:
        -   static block
        -   instance block
        -   constructor
-   **String method tests**
    -   `length`, `charAt`, `substring`
    -   `toUpperCase`, `toLowerCase`
    -   `trim`, `contains`, `startsWith`, `endsWith`
    -   `indexOf`, `lastIndexOf`
    -   `replace`, `split`
-   **equals / compareTo tests**
    -   `==` vs `equals()`
    -   `equalsIgnoreCase()`
    -   `compareTo()`, `compareToIgnoreCase()`
-   **Basic polymorphism**
    -   Using `AClass`, `BClass`, `CClass` through `AClass` references

------------------------------------------------------------------------

## 🧪 How to Run

``` bash
git clone https://github.com/<kullanıcı_adın>/java-class-lifecycle-simulator.git
cd java-class-lifecycle-simulator
# Open in IntelliJ IDEA and run Main.java
```

From the console menu, choose an option (1--6) and follow the
instructions.\
After each test, press **ENTER** to return to the menu.

------------------------------------------------------------------------

## 🎓 Purpose

This project is meant as a **study tool** for:

-   understanding Java's class loading & initialization order\
-   practicing inheritance & polymorphism\
-   revising core `String` operations and equality methods

Perfect for students who want to go beyond "Hello World" and actually
see **what the JVM does under the hood**.
