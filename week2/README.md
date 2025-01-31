# Week 2 Java Exercises

This directory contains Java programs demonstrating various fundamental concepts:

## 1. SalaryAdvanced.java
- **Purpose**: Advanced salary calculator with overtime and holiday pay
- **Features**:
  - Handles regular hours (≤8) and overtime (>8)
  - Different rates for weekdays vs holidays
  - Demonstrates nested `if-else` statements
  - Alternative implementation using ternary operators (commented)

## 2. Task1.java
- **Purpose**: Variable type demonstration with intentional errors
- **Key Points**:
  - Shows proper initialization of primitive types
  - Contains commented examples of invalid assignments:
  - `byte` overflow (128)
  - `int` overflow (2147483648)
  - Multi-character `char` assignment ('hello')

## 3. Task2.java
- **Purpose**: Proper variable typing practice
- **Good Examples**:
  - `long` for large numbers (7.8 billion)
  - `float` with 'f' suffix
  - Appropriate use of `boolean`, `byte`, and `short`

## 4. Task3.java
- **Purpose**: Simple salary calculation
- **Implementation**:
  - Basic multiplication of hourly rate × hours
  - Demonstrates simple output formatting

## 5. Task4.java
- **Purpose**: Refactored salary calculator using constants
- **Improvements**:
  - Uses `final` constants for rates
  - Combines regular and overtime calculation in single expression
  - More compact logic using ternary operator

## 6. UnitTest.java
- **Purpose**: Validation of salary calculations
- **Key Features**:
  - Compares outputs of Task4 and SalaryAdvanced
  - Uses output stream capturing for testing
  - Handles floating-point comparisons with tolerance
  - Implements regex-based number extraction

## 7. WeirdSum.java
- **Purpose**: Demonstration of negative number arithmetic
- **Simple Example**:
  - Shows proper syntax for negative number operations
  - Outputs result of (-3) + (-4) = -7

## Common Themes:
- Variable type selection (primitive types)
- Conditional logic implementations
- Code organization best practices
- Error prevention through proper typing
- Output formatting and validation 