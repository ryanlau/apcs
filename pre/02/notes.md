### Variables

**Declaration**

To declare a variable, write the type of the variable followed by the variable name.
```java
String message;
int hour, minute; // declare multiple variables at once
```

**Assignment**

To assign a value to a declared variable, write the variable name followed by "=" and the value.
```java
message = "Hello";
```

Assignment can be done in the same line as declaration.
```java
int date = 27;
```

**Floats**

To represent decimals/fractions, the `double` type is used.
```java
double pi = 3.14;
```

Floating point division is performed when one or more operands are doubles.
```java
double x = pi / 2; // 1.57
double y = 1 / 3; // 0.0
```

**Constants**

The keyword `final` indicates that a variable is a constant. Constants should also be completely uppercase with underscores between each word.

```java
final double CM_PER_INCH = 2.54;
```

### Scanner

The `Scanner` class is similar to Python's `input()`.

```java
import java.util.Scanner; // import the Scanner class from java.util

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // create a new Scanner that takes input from System.in

        System.out.print("what is your age? ");
        int age = in.nextInt(); // store user input in int variable age
        System.out.println("your age is " + age);
        in.nextLine(); // read the newline

        System.out.print("what is your name? ");
        String name = in.nextLine(); // store user input in String variable name
        System.out.println("your name is " + name);
    }
}
```

### Format Strings

`printf` statements can be used to specify how a string should be formatted when printed through **format specifiers**.

```java
System.out.print(4.0 / 3.0); // 1.3333333333333333
System.out.printf("%.3f", 4.0/ 3.0); // 1.333
```
| format specifier | description                               | example  |
|------------------|-------------------------------------------|----------|
| %d               | decimal integer                           | 12345    |
| %08d             | padded with zeros, at least 8 digits wide | 00012345 |
| %f               | floating-point                            | 6.789000 |
| %.2f             | rounded to 2 decimal places               | 6.79     |


### Type casting

To convert one type to another, we can use the casting operator. The casting operator converts what follows the operator to that type.

```java
double pi = 3.14;
int x = (int) pi; // 3
```

Casting happens before arithmetic operations but after parenthesis.

```java
double pi = 3.14;
int x = (int) pi * 20; // 60
int y = (int) (pi * 20); // 62
```
