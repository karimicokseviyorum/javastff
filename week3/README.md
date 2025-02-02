# Week 3 Java Exercises

This directory contains Java programs demonstrating important programming concepts:

## FloatingComparison.java
- **Purpose**: Demonstrates proper floating-point number comparison
- **Key Learnings**:
  - Integer vs floating-point division differences
  - Why direct equality comparison (`==`) is unreliable for floating-point numbers
  - Using tolerance/epsilon for safe floating-point comparisons
  - Demonstrates how arithmetic operations can affect floating-point precision

## EscapeLoop.java
- **Purpose**: Demonstrates loop control statements (`break` and `continue`)
- **Key Learnings**:
  - Using `break` to exit loops completely
  - Using `continue` to skip remaining loop body and start next iteration
  - Examples in both `while` and `for` loops
  - Proper handling of loop counters with `continue`
- **Examples Include**:
  - Breaking while loop at specific value
  - Skipping specific iterations using continue
  - Breaking for loop at condition
  - Using continue to filter even numbers

## OperatorTest.java
- **Purpose**: Illustrates type conversion and division operations
- **Key Learnings**:
  - Integer division vs floating-point division
  - Implicit type conversion with mixed operands
  - Explicit casting using `(double)`
  - Order of operations in type casting
- **Examples Include**:
  - Integer division (1/3 = 0)
  - Mixed operand division (1.0/3 = 0.3333...)
  - Cast before vs after division operations

## NearestInt.java
- **Purpose**: Demonstrates rounding techniques for floating-point numbers
- **Key Learnings**:
  - Converting floating-point to integer using casting
  - Implementing manual rounding using addition/subtraction before casting
  - Handling both positive and negative number rounding
- **Examples Include**:
  - Simple truncation using `(int)` casting
  - Rounding to nearest integer using +0.5 technique
  - Proper rounding for negative numbers using -0.5

## TestFormat.java
- **Purpose**: Comprehensive demonstration of Java's string formatting capabilities
- **Key Learnings**:
  - Format specifier syntax: `%[flags][width][.precision]type`
  - Various formatting flags and their uses
  - Combining multiple format flags
  - Special number formatting cases
- **Format Flags Examples**:
  - `-` Left justification within width
  - `+` Forces display of sign (+ or -)
  - ` ` (space) Adds space before positive numbers
  - `0` Zero padding
  - `(` Parentheses for negative numbers
  - `,` Thousand separators grouping
  - Width control (e.g., `%10.2f`)
  - Precision control (e.g., `.2f`)
- **Special Cases**:
  - Scientific notation formatting
  - Percentage formatting
  - Currency formatting
  - Combining compatible flags

## Key Takeaways for Week 3:
- Floating-point arithmetic is inherently imprecise due to binary representation
- Always use tolerance-based comparison for floating-point numbers
- Understanding type conversion in arithmetic operations
- Importance of proper variable initialization and comparison methods
- Loop control statements provide flow control within iterations
- `break` and `continue` serve different purposes in loop management
- Careful counter management needed when using `continue`
- Type casting timing affects calculation results
- Understanding implicit vs explicit type conversion
- Different rounding techniques for positive and negative numbers
- Manual rounding implementation using casting and arithmetic
- String formatting provides powerful number presentation control
- Format flags can be combined but some combinations are mutually exclusive
- Understanding width and precision in number formatting
- Proper usage of format specifiers for different number types
- Special formatting for scientific notation, percentages, and currency



