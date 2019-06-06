/* Simple Calculator Refactored:
    Refactor your simple calculator application to overload each method to handle each of the below input types:
        int, long, float, double

    Note: Method overloading allows us to have several methods with the same name.
*/

package com.company;

public class Calculator {

    // Add
    // Overloaded add(): This add method takes two int parameters
    public int add(int a, int b) {
        return a + b;
    }
    // Overloaded add(): This add method takes two long parameters
    public long add(long a, long b) {
        return a + b;
    }
    // Overloaded add(): This add method takes two float parameters
    public float add(float a, float b) {
        return a + b;
    }
    // Overloaded add(): This add method takes two double parameters
    public double add(double a, double b) {
        return a + b;
    }

    // Subtract
    // Overloaded subtract(): This subtract method takes two int parameters
    public int subtract(int a, int b) {
        return a - b;
    }
    // Overloaded subtract(): This subtract method takes two long parameters
    public long subtract(long a, long b) {
        return a - b;
    }
    // Overloaded subtract(): This subtract method takes two float parameters
    public float subtract(float a, float b) {
        return a - b;
    }
    // Overloaded subtract(): This subtract method takes two double parameters
    public double subtract(double a, double b) {
        return a - b;
    }

    // Multiply
    // Overloaded multiply(): This multiply method takes two int parameters
    public int multiply(int a, int b) {
        return a * b;
    }
    // Overloaded multiply(): This multiply method takes two long parameters
    public long multiply(long a, long b) {
        return a * b;
    }
    // Overloaded multiply(): This multiply method takes two float parameters
    public float multiply(float a, float b) {
        return a * b;
    }
    // Overloaded multiply(): This multiply method takes two double parameters
    public double multiply(double a, double b) {
        return a * b;
    }

    // Divide
    // Overloaded divide(): This divide method takes two int parameters
    public int divide(int a, int b) {
        return a / b;
    }
    // Overloaded divide(): This divide method takes two long parameters
    public long divide(long a, long b) {
        return a / b;
    }
    // Overloaded divide(): This divide method takes two float parameters
    public float divide(float a, float b) {
        return a / b;
    }
    // Overloaded divide(): This divide method takes two double parameters
    public double divide(double a, double b) {
        return a / b;
    }

}
