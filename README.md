# Shopping Cart Calculator

The Shopping Cart Calculator is a Java program that calculates the total cost of items in a shopping basket based on specific pricing rules.

## Features

- Calculates the total cost of a shopping basket with various items.
- Supports pricing rules such as buy one get one free and three for the price of two offers.
- Provides unit tests to ensure accurate calculations.

## Getting Started

### Prerequisites

- Java Development Kit (JDK)
- JUnit (for running unit tests)

### Installation

1. Clone the repository to your local machine:

    ```bash
    git clone https://github.com/NareshKundrapu/shopping-cart-calculator.git
    ```

2. Compile the Java source files:

    ```bash
    javac ShoppingCartCalculator.java
    ```

3. Run the program:

    ```bash
    java ShoppingCartCalculator.java
    ```

## Usage

1. Follow the on-screen instructions to input items for the shopping basket.
2. View the total cost of the shopping basket displayed on the console.

## Unit Tests

The project includes unit tests to verify the correctness of the calculation methods. To run the unit tests, use the following command:

```bash
java -cp .:junit-platform-console-standalone-1.8.1.jar org.junit.platform.console.ConsoleLauncher --class-path . --scan-classpath

```

## Sample Input and Output
### Sample Input:

```Apple Apple Banana Banana```

### Sample Output:

```
Total cost of the shopping basket: 110p
```
