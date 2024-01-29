# Testing and verification Java project
Master's project designed to demonstrate key concepts and techniques for testing software systems, model checking and model-based testing.
For this project, an algorithmic problem has been selected for solution using Java programming. The task can be found at [link to the problem statement](https://www.infoarena.ro/problema/granita). 
The documentation file contains the resolved requirements based on the Java code provided.
## Technologies
- Java 17
- JUnit
## Tasks solved within the project
- _Functional testing_ - tests generated using:
    - **equivalence partitioning**
    - **boundary value analysis**
    - **cause-effect graphing**
- _Structural testing_ - Transform the program into an directed graph and, based on it, find a set of tests that satisfies the **modified condition/decision coverage (MC/DC) criterion**.
- Determine the **coverage level** achieved by each set of tests
- Write a **first-order equivalent mutant** of the program. For one of the test cases above, write a **non-equivalent mutant** that is _killed_ by the test and a non-equivalent mutant that is _not killed_ by the test.
