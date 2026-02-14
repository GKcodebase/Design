# Creational Design Patterns

This package contains Java implementations of the **Creational Design Patterns** from the Gang of Four (GoF). Creational patterns abstract the object instantiation process and make the system independent of how its objects are created, composed, and represented.

---

## Table of Contents

- [Abstract Factory](#abstract-factory)
- [Builder](#builder)
- [Factory Method](#factory-method)
- [Prototype](#prototype)
- [Singleton](#singleton)
- [Project Structure](#project-structure)
- [Running the Demos](#running-the-demos)

---

## Abstract Factory

**Intent:** Provide an interface for creating families of related or dependent objects without specifying their concrete classes.

**Use when:** The system should be independent of how its products are created, and you need to enforce that products from the same family are used together (e.g., all UI elements from one theme).

### Structure

| Package / File | Description |
|----------------|-------------|
| `AbstractFactory/factories/` | `GUIFactory` interface; `MacOSFactory`, `WindowsFactory` implementations |
| `AbstractFactory/buttons/` | `Button` interface; `MacOSButton`, `WindowsButton` |
| `AbstractFactory/checkboxes/` | `Checkbox` interface; `MacOSCheckbox`, `WindowsCheckbox` |
| `AbstractFactory/app/` | `Application` — uses a `GUIFactory` to create and paint UI |
| `AbstractFactory/Demo.java` | Selects factory by OS (`mac` → MacOS, else Windows) and runs `app.paint()` |

### Run

Execute `CreationalDesignPattern.AbstractFactory.Demo` — output depends on `os.name` (Mac vs non-Mac).

---

## Builder

**Intent:** Separate the construction of a complex object from its representation so that the same construction process can create different representations.

**Use when:** An object has many optional components or step-by-step construction, and you want to avoid a large constructor or multiple constructors.

### Structure

| Package / File | Description |
|----------------|-------------|
| `Builder/builders/` | `Builder` interface; `CarBuilder`, `CarManualBuilder` |
| `Builder/cars/` | `Car`, `Manual`, `CarType` |
| `Builder/components/` | `Engine`, `Transmission`, `TripComputer`, `GPSNavigator` |
| `Builder/director/` | `Director` — orchestrates build steps (e.g. `constructSportsCar`) |
| `Builder/Demo.java` | Builds a sports car and its manual via the director |

### Run

Execute `CreationalDesignPattern.Builder.Demo` — prints the built car type and car manual.

---

## Factory Method

**Intent:** Define an interface for creating an object, but let subclasses decide which class to instantiate. Creation is deferred to subclasses.

**Use when:** A class cannot anticipate the exact class of objects it must create, or you want to keep object creation in one place (e.g. dialogs creating platform-specific buttons).

### Structure

| Package / File | Description |
|----------------|-------------|
| `Factory/factory/` | `Dialog` (abstract, `createButton()`); `WindowsDialog`, `HtmlDialog` |
| `Factory/buttons/` | `Button` interface; `WindowsButton`, `HtmlButton` |
| `Factory/Demo.java` | Chooses dialog by OS (Windows 10 → Windows, else Html), then calls `renderWindow()` |

### Run

Execute `CreationalDesignPattern.Factory.Demo` — renders a window with the appropriate button implementation.

---

## Prototype

**Intent:** Create new objects by copying an existing object (prototype) instead of constructing from scratch.

**Use when:** Object creation is expensive or when you need independent copies of objects whose classes are only known at runtime.

### Structure

| Package / File | Description |
|----------------|-------------|
| `Prototype/shapes/` | `Shape` (abstract, `clone()`); `Circle`, `Rectangle` with copy constructors |
| `Prototype/Demo.java` | Creates shapes, clones them into a list, and compares references and equality |

### Run

Execute `CreationalDesignPattern.Prototype.Demo` — prints comparison results for original vs cloned shapes.

---

## Singleton

**Intent:** Ensure a class has only one instance and provide a global access point to it.

**Use when:** Exactly one instance of a class is needed (e.g. configuration, connection pool, logging).

### Structure

| Package / File | Description |
|----------------|-------------|
| `Singelton/Naive/SingleThreaded/` | Basic singleton; `DemoSingleThread` |
| `Singelton/Naive/MultiThreaded/` | Same singleton used from multiple threads; `DemoMultiThread` (may show race issues) |
| `Singelton/ThreadSafe/` | Double-checked locking (DCL) with `volatile`; `DemoMultiThread` for thread-safe demo |

### Run

- Single-threaded: `CreationalDesignPattern.Singelton.Naive.SingleThreaded.DemoSingleThread`
- Multi-threaded (naive): `CreationalDesignPattern.Singelton.Naive.MultiThreaded.DemoMultiThread`
- Thread-safe: `CreationalDesignPattern.Singelton.ThreadSafe.DemoMultiThread`

---

## Project Structure

```
CreationalDesignPattern/
├── AbstractFactory/
│   ├── app/           # Application using GUIFactory
│   ├── buttons/       # Button products
│   ├── checkboxes/    # Checkbox products
│   ├── factories/     # GUIFactory and implementations
│   └── Demo.java
├── Builder/
│   ├── builders/      # Builder interface and Car/Manual builders
│   ├── cars/          # Car, Manual, CarType
│   ├── components/    # Engine, Transmission, etc.
│   ├── director/      # Director
│   └── Demo.java
├── Factory/
│   ├── buttons/       # Button products
│   ├── factory/       # Dialog (factory) and implementations
│   └── Demo.java
├── Prototype/
│   ├── shapes/        # Shape, Circle, Rectangle (clone support)
│   └── Demo.java
├── Singelton/
│   ├── Naive/
│   │   ├── SingleThreaded/
│   │   └── MultiThreaded/
│   └── ThreadSafe/
└── Readme.md          # This file
```

---

## Running the Demos

From the project root (where `pom.xml` or source path is configured):

- **Maven:**  
  `mvn exec:java -Dexec.mainClass="CreationalDesignPattern.<Pattern>.<Pattern>.Demo"`  
  (e.g. `CreationalDesignPattern.AbstractFactory.Demo`)

- **IDE:**  
  Run the `main` method in the corresponding `Demo.java` for each pattern.

Replace `<Pattern>` with `AbstractFactory`, `Builder`, `Factory`, or `Prototype`. For Singleton, use the demo classes under `Singelton.Naive.*` or `Singelton.ThreadSafe.*` as listed above.
