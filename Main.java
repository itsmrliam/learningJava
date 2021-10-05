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
        double footSize = 2.49; // This is a double, used for storing numbers with a decimal place
        System.out.println(footSize);
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
        System.out.print(" your foot size is " + footSize + " inches. That's not very big!");
         /* if (footSize < 4;
            System.out.print(" your foot size is " + footSize + " inches. That's not very big!"); */
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
        /* For Loops - When you know exactly how many times you want to loop through a block of code,
           use the FOR loop instead of a WHILE loop
           EXAMPLE:
           for (statement 1; statement 2; statement3) {
                // code to be executed
           }
           Statement 1 is executed (one time) before the execution of the code block
           Statement 2 defines the condition for executing the code block
           Statement 3 is executed (every time) after the code block has been executed.
         */
        for (int r = 0; r < 5; r++) {
            System.out.println(r);
        }
        /*
        Statement 1 sets a variable before the loop starts (r = 0)
        Statement 2 defines the condition for the loop to run on (r must be less than 5). If the condition is true,
        the loop will start over again, if it's false, the loop will end.
        Statement 3 increases a value (r++) each time the code block in the loop has been executed (the print statement)
         */
        for (int numbr = 100; numbr > 80; numbr--) { // The same as above but counting backwards!
            System.out.println(numbr);
        }
        for (int t = 0; t <= 10; t = t + 2) { // every time t is less than or equal to 10, adds 2 until hits 10.
            System.out.println(t);
            System.out.println("Adding 2");
        }
        // For-Each Loop - Used exclusively for to loop through elements in an Array
        String[] cars2 = {"Volvo", "BMW", "Ford", "Mercedes"};
        // The following example outputs all elements in the CARS array, using a for-each loop
        for (String car : cars2) {
            System.out.println(cars2);
        }
        /* Java Break
        The break statement was used earlier to "jump out" of a switch statement
        It can also be used to jump out of a loop.
        This example stops the loop when h is equal to 4:
         */
        for (int f = 0; f < 10; f++) {
            if (f == 4) {
                System.out.println("You broke out of the loop!");
                break; // Breaks out of the loop because f became equal to 4
            }
            System.out.println(f);
        }
        /* Java Continue
        The Continue Statement breaks one iteration (in the loop) if a specified condition occurs,
        and continues with the next iteration in the loop
        It's the same as break but it continues the loop instead of jumping out of it.
        The below example skips the value of 4 and continues.
         */
        for (int k = 0; k < 10; k++) {
            if (k == 4) {
                System.out.println("Skipping 4!");
                continue; // Skips 4 and continues the loop
            } else if (k == 0) {
                System.out.println("Beginning of loop");
                continue; // Misses out 0 in the loop (first iteration) and replacing it with a message
            }
            System.out.println(k);
        }
        // Break & Continue in While Loop - you can use break and continue in a While loop:
        int w = 0;
        while (w < 10) {
            System.out.println(w);
            w++;
            if (w == 4) {
                break;
            }
        }
        // Using a CONTINUE in a While loop.
        int n = 0;
        while (n < 10) {
            if (n == 4) {
                n++;
                continue;
            }
            System.out.println(n);
            n++;
        }
        /* Java Arrays are used to store multiple values in a single variable, instead of declaring
        seperate variables for each value.
        To declare an array, define the variable type with square brackets [].
        To insert values to it, we can use an array literal - place the values in a commna-seperated list,
        inside curly braces. For example String[] myArray = {"Sausage", "Pancakes", "Biscuits"};
         */
        String[] cars = {"Volvo", "BMW", "Ferrari", "Honda"};
        // To create an array of integers, you could write
        int[] myNumbers1 = {10, 20, 30, 40, 50, 60};
        /* Access the Elements of an Array
        You can access an array element by referring to the index number (starting at 0, not 1).
        The below statement accesses the value of the first element in the cars array
         */
        System.out.println(cars[0]);
        // Change an Array element - To change the value of a specific element, refer to the index number.
        cars[0] = "Lamborghini";
        System.out.println(cars[0]); // Now outputs Lamborghini instead of Volvo.
        // Array Length - Find out how many elements an Array has, using the length property.
        System.out.println(cars.length);
        System.out.println(myNumbers1.length);
        /* You can loop through the Array elements using the FOR loop, and use the LENGTH property to
        specify how many times the loop should run.
         */
        for (int carList = 0; carList < cars.length; carList++) {
            System.out.println(cars[carList]);
        }
        // You can also use a FOR-EACH loop, which is exclusivly used to loop through elements in an array
        for (String myLoop : cars) {
            System.out.println(myLoop + " is fast");
        }
            /* The above example can be read as: for each String element called myLoop in cars, print out the
            value of myLoop. If you compare the for loop and for-each loop, you will see that the for-each
            method is easier to write, it does not require a counter (using the length property), and it more readable.

            Multidimensional Array is an array inside an array.
            To create one, add each array within its own set of curly braces.
             */
            int [][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
            int [][] myNumbersx = { {1, 2, 3, 4}, {5, 6, 7} };
            /* myNumbers is now an array with two arrays as its elements.
            To access the elements of the myNumbers array, specify two indexes: one for the array,
            and one for the element inside that array. This example accesses the third element (2)
            in the second array (1) of myNumbers.
            */
            int xo = myNumbers[1][2];
            System.out.println(xo);
            /* We can also use a for loop inside another for loop to get the elements of a
            two-dimensional array (we still have to point to the two indexes):
             */
            for (int xi = 0; xi < myNumbersx.length; ++xi) {
                for(int ji = 0; ji < myNumbersx[xi].length; ++ji) {
                    System.out.println(myNumbersx[xi][ji]);
                }
            }
            System.out.println("You've reached the end of the my tutorial. See next Java file for Methods + more!");
            System.out.println("                          x~xLiamcttn 2021x~x");
        }
    }