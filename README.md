# 📚 Java Core Concepts Repository  

**A comprehensive collection of Java examples covering OOP, Multithreading, Stream API, Comparator, and modern Java features.**  
Perfect for learners, interview preparation, or quick refreshers on core Java concepts.  

![Java](https://img.shields.io/badge/Java-17%2B-orange?logo=openjdk)  
![Contributions Welcome](https://img.shields.io/badge/Contributions-Welcome-brightgreen)  

---

## 🌟 Why This Repository?  
- **Hands-on Learning**: Practical code snippets for key Java topics.  
- **Interview Prep**: Covers frequently asked OOP, threading, and Stream API questions.  
- **Production-Ready**: Demonstrates best practices (e.g., immutability, `CompletableFuture` error handling).  
- **Modular Structure**: Easy to navigate by topic.  

---

## 📌 Topics Covered  

### 1. OOP Concepts  
- Inheritance, Polymorphism (Method Overriding/Overloading)  
- Abstraction (Interfaces, Abstract Classes)  
- Encapsulation (Access Modifiers, Getters/Setters)  
- SOLID Principles (Basic Examples)  

### 2. Multithreading & Concurrency  
- Thread creation (`Thread` class vs. `Runnable`/`Callable`)  
- Synchronization (`synchronized`)  
- Thread Pools  
- Avoid Deadlocks & Race Conditions  

### 3. Stream API & Functional Programming  
- `map`, `filter`, `reduce`, `collect`  
- Custom Collectors  

### 4. Comparator & Collections  
- Natural Ordering (`Comparable`)  
- Custom Sorting (`Comparator` with Lambdas)    

### 5. Utilities  
- Functional Interfaces (`Predicate`, `Function`, `Supplier`)  
- Annotations (`@Override`, Custom Annotations)  

---

## 🚀 Getting Started  

### Prerequisites  
- **JDK 17+** (Recommended: [OpenJDK](https://openjdk.org/))  
- IDE (IntelliJ, Eclipse, or VS Code with Java extensions)  

### Run Locally  
1. Clone the repo:  
   ```bash
   git clone https://github.com/agarwalharshit085/OOPs-Concept.git

   javac -d ./out src/Multithreading/ThreadExample.java  
   java -cp ./out Multithreading.ThreadExample

### Project Structure

├── OOP-Concepts/  
│   ├── Inheritance/  
│   ├── Polymorphism/  
│   └── Abstraction/  
├── Multithreading/  
│   ├── ThreadBasics/  
│   ├── ExecutorServiceDemo/  
│   └── CompletableFutureExample/  
├── Stream-API/  
│   ├── MapFilterReduce/  
│   └── ParallelStreams/  
├── Comparator-Comparable/  
│   ├── NaturalSorting/  
│   └── CustomComparator/  
└── ...  
