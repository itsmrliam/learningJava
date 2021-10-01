package com.company;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World"); // This is a comment
        System.out.println("This is a string"); /* This is a mutli line
        comment useful for multi line comments */
        System.out.print("print - prints on current line "); // prints on current line
        System.out.println("println - prints on new line "); // prints on current line
        String name = "Liam"; // This is a string
        String lastname = "Cttn";
        System.out.println(name);
        int age = 23; // This is an integer used for storing numbers
        System.out.println(age); // This is to print a string
        int number;
        number = 424; // Assigning a value to a previously defined variable
        System.out.println(number);
        double dickSize = 2.49; // This is a double, used for storing numbers with a decimal place
        System.out.println(dickSize);
        System.out.println(number);
        final int myNum = 15; // Sets final value to a variable so it cannot be changed later on
        // myNum = 20; won't work because final value is set above
        float height = 300.72f;
        System.out.println(height);
        char a = 'A'; // This is a char used for storing single characters
        System.out.println(a);
        boolean attractive = true; // Boolean is for true or false statements
        System.out.println(attractive);
        System.out.print("Hello, " + name + lastname + " you are " + age + " years old!");
        System.out.print(" your dick size is " + dickSize + " inches. That's not very big!");
         /* if (dickSize < 4;
            System.out.print(" your dick size is " + dickSize + " inches. That's not very big!"); */
        // Maths
        int x = 5;
        int y = 6;
        System.out.println(x + y);
        int b = 5, c = 7, d = 50; // Declaring multiple variables on the same line
        // int q, w, r, t = 27; // Doesn't work -- Declaring multiple variables with the same value, on one line
        System.out.println(b + c - d);
        System.out.println(y - b / x);
        // LEARNING NUMBERS
        byte myByte = 120; // Stores whole numbers from -128 to 127
        short myShort = 5000; // Stores whole numbers from -32768 to 32767
        int myInt = 120434; // Stores whole numbers from -2147483648 to 2147483647 - Preferred number type
        long myLong = 1240000000L; /* Stores whole numbers from -9223372036854775808 to 9223372036854775807
        used when int isn't long enough */
        float myFloat = 45.24f; // used for decimal numbers 3.4e−038 to 3.4e+038
        double myDouble = 10.99; // used for decimal numbers 1.7e−308 to 1.7e+308
        float f1 = 35e3f;
        double d1 = 12E4d;
        System.out.println(f1);
        System.out.println(d1);
        boolean isJavaFun = true;
        boolean isStuffingTasty = false;
        System.out.println(isJavaFun);     // Outputs true
        System.out.println(isStuffingTasty);   // Outputs false
        /* TYPE CASTING - Widening Casting (automatically) - converting a smaller type to a larger type size
           Narrowing Casting (manually) - converting a larger type to a smaller size type
         */
        int myNumber = 9;
        double myDblNumber = myNumber; // Automatic casting: int to double
        System.out.println(myInt);      // Outputs 9
        System.out.println(myDouble);   // Outputs 9.0
        // Narrowing casting must be done manually by placing the type in parentheses in front of the value
        double myDoubleNum = 9.78d;
        int myIntNum = (int) myDouble; // Manual casting: double to int
        System.out.println(myDoubleNum);   // Outputs 9.78
        System.out.println(myIntNum);      // Outputs 9
        // Operators
        int opNumber1 = 10;
        System.out.println(opNumber1);
        int opNumber2 = 20;
        int sum1 = opNumber1 + opNumber2; // Addition
        int sum2 = opNumber1 + 250; // Addition
        int sum3 = opNumber1 - opNumber2; // Subtraction
        int sum4 = opNumber1 % opNumber2; // Finds remainder
        int sum5 = opNumber1 % myNumber; // Finds remainder
        ++opNumber1;
        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3);
        System.out.println(sum4);
        System.out.println(opNumber1);
        --opNumber2;
        System.out.println(sum5);
        /* Comparison Operators
            == Equal to
            != Not equal to
            > Greater than
            < Less than
            >= Greater than or equal to
            <= Less than or equal to
         */
        // STRINGS
        String greeting = "Hello!";
        System.out.println("The length of the greeting string is: " + greeting.length()); // Gets length of a string
        System.out.println(greeting.toUpperCase()); // Converts string into all Upper Case
        System.out.println(greeting.toLowerCase()); // Converts string into all Lower Case
        String txt = "Please locate where 'locate' occurs!";
        System.out.println(txt.indexOf("locate")); /* The indexOf() method returns the index (the position)
        of the first occurrence of a specified text in a string */
        String name1 = "John";
        String name2 = "Doe";
        System.out.println(name1.concat(name2)); // Concatenate two strings
        /* Using special characters like quotes - " = \"   ' = \'   \ = \\
         */
        String specialCharacters = "We are the so called \'Vikings\' from the North.";
        /* Other escape characters
        \n - New Line
        \r - Carriage Return
        \t - Tab
        \b - Backspace
        \f - Form feed
         */
        String escText = "Hello\nWorld"; // new Line
        System.out.println(escText);
        String escText2 = "Hel\blo Wo\brld!"; // Backspace (2 added in this case)
        System.out.println(escText2);
        int xNum = 10;
        int yNum = 20;
        int zNum = xNum + yNum; // Adding two numbers results in a number
        System.out.println(zNum);
        String xStr = "10";
        String yStr = "20";
        String zStr = xStr + yStr; // Adding two strings results in string concatentation
        String xStr1 = "10";
        int yInt = 20;
        String zStr2 = xStr1 + yInt; // adding a number and a string, the result will be a string concatenation:
        // Java Math
        System.out.println(Math.max(5, 10)); // Finds the maximum number of the values given
        System.out.println(Math.min(x, y)); // Finds the minimum number of the values given
        System.out.println(Math.sqrt(64)); // Finds the square root of the value given.
        System.out.println(Math.sqrt(yInt));
        System.out.println(Math.abs(-27.3)); // Finds the absolute (positive) value of a negative number.
        System.out.println(Math.random()); // returns a random number between 0.0 (inclusive), and 1.0 (exclusive)
        int randomNum = (int) (Math.random() * 101); // Random number between 0 to 100
        System.out.println(randomNum);
        // Java Booleans
        int xBool = 10;
        int yBool = 92;
        System.out.println(x > y); // returns 'False' because x(10) is lower than y(92)
        System.out.println(10 > 9); // returns 'True' because 10 is higher than 9
        System.out.println(xBool == 10); // returns 'True' because the value of x is equal to 10
        System.out.println(10 == 15); // returns 'False' because 10 is not equal to 15.
        /* Java If Else statements
        if - to specify a block of code to be executed, if a specified condition is true
        else-  to specify a block of code to be executed, if the same condition is false
        else if - to specify a new condition to test, if the first condition is false
        switch - to specify many alternative blocks of code to be executed
         */
        if (20 > 18) {
            System.out.println("20 is greater than 18"); // runs the code as condition is met.
        }
        if (x < y) {
            System.out.println("x is less than y"); // runs the code as condition is met.
        }
        if (x > y) {
            System.out.println("x is greater than y"); // won't print this as its not true
        } else {
            System.out.println("x is less than y!"); // runs this code as this condition is met.
        }
        int time = 20;
        if (time < 18) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        }
        int time2 = 2;
        if (time2 < 10) {
            System.out.println("Good morning!");
        } else if (time2 < 20) {
            System.out.println("Good day!");
        } else {
            System.out.println("Good evening!"); // Outputs "Good evening." as this condition is met
        }
        String result = (time2 < 18) ? "Good day." : "Good evening.";
        System.out.println(result);
        /* Switches - Use the switch statement to select one of many code blocks to be executed.
        The SWITCH expression is evaluated once.
        The value of the expression is compared with the values of each CASE.
        If there is a match, the associated block of code is executed.
        BREAK stops execution of more code and case testing when keyword is found and case is matched.
        DEFAULT specifies some code to run if there is no case match.
         */
        int day = 8;
        int day2 = 9;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Not a day in the week!");
        }
        /* Java Loops - Loops can execute a block of code as long as a specified condition is reached.
           Loops are handy because they save time, reduce errors and make code more readable.
           The WHILE loop loops through a block of code as long as the specified condition is true:
           In the example below, the code in the loop will run, over and over again,
           as long as a variable (i) is less than 5:
         */
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }
        /* The DO/WHILE loop is a variant of the WHILE loop. This loop will execute the code block once,
           before checking if the condition is true, then repeats the loop as long as the condition is true.
         */
        do {
            System.out.println(i);
            System.out.println("Until condition is met, add 1 number.");
            i++;
        }
        while (i < 5);
    }
}