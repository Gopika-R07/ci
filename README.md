
# Group 4 - Jenkins CI Pipeline

## Aim
To create a Continuous Integration pipeline using Jenkins
to automatically build and test Java programs stored in GitHub.

## Technologies
- Java 17
- IntelliJ IDEA
- Maven
- JUnit 5
- Git and GitHub
- Jenkins
- Ubuntu Linux

## Model Questions

### Experiment 11 - Palindrome Number
Check whether a given integer is a palindrome by reversing
its digits and comparing it with the original number.

### Experiment 12 - Prime Number
Check whether a given number is prime by testing divisibility
from 2 up to its square root.

### Experiment 13 - Factorial
Calculate the factorial of a number using a for loop.

### Experiment 14 - Fibonacci Series
Generate the first n terms of the Fibonacci sequence.

## Project Structure

src/main/java/org/example/Main.java
src/test/java/org/example/MainTest.java
pom.xml
Jenkinsfile
README.md
.gitignore

## Local Execution

Run all JUnit tests:

mvn clean test

Run the individual programs using IntelliJ IDEA:

- Main.java: Palindrome number
- PrimeNumber: Prime number
- Factorial: Factorial
- FibonacciSeries: Fibonacci sequence

## Test Cases

| Experiment | Input | Expected Result |
|---|---|---|
| Palindrome | 121 | Palindrome |
| Palindrome | 123 | Not Palindrome |
| Prime | 7 | Prime |
| Prime | 10 | Not Prime |
| Factorial | 5 | 120 |
| Factorial | 0 | 1 |
| Fibonacci | 5 | 0 1 1 2 3 |

## Jenkins CI Procedure

1. Push the Maven project to GitHub.
2. Start Jenkins on Ubuntu.
3. Create a Pipeline job.
4. Configure Pipeline script from SCM.
5. Connect the GitHub repository.
6. Execute the pipeline using Build Now.
7. Check Console Output.
8. Verify successful JUnit execution.

## Jenkins Pipeline

The Jenkinsfile contains two stages:

1. Checkout - retrieves source code from GitHub.
2. Build and Test - executes mvn clean test.

## Expected Result

All 12 JUnit test cases should pass.

Jenkins should display:

Finished: SUCCESS

## Result

Thus, the Jenkins CI pipeline was created successfully
to automate the compilation and testing of all four Java programs.
