###### CS-207-3: Programming II <br> Spring 2021 <br> Northeastern Illinois University <br> Homework #1 <br> Programming I Review

**Getting Started**

Note: Detailed instructions are located in the tutorial and in the initial assignment.
1. Accept the assignment invitation.
2. Clone the assignment to your computer.
3. Create the main/java directory in the src directory. This is where you will be creating your 
Java classes for your assignment.

**Submitting your assignment**
1. Commit your final code to GitHub. 
- Please also commit code after each step of each problem and remember to run the unit tests 
(where applicable) and code analyzers before you commit.
2. Also D2L?

**Problem 1**<br>
A. In the main/java directory, create a class named `Time`. It should include the following:
- Three private integer instance variables named `hour`, `min`, `sec`, and a char named `meridiem`.
- A default constructor that sets the `hour` instance variable to `12`, the `min` and `sec` instance 
variables to `0`, and the `meridiem` instance variable to `'A'`.
- A constructor that takes three integer parameters (in the specific order of hours, minutes, seconds) 
and then a char parameter and sets the instance variables.
- A method named `getTotalMinutes` that does not take any parameters. It should return an integer 
value that represents the total number of minutes from midnight to the time stored in the `hour` and 
`min` instance variables (you can ignore the `sec` instance variable). You will find the `meridiem` 
instance variable helpful). Note that for the instance variable `meridiem`, `'A'`  represents AM 
and `'P'`  represents PM.
    - Uncomment the blah blah test cases in the test/java directory to test this method.
- A method named `getTotalSeconds` that does not take any parameters. It should return an integer 
value that represents the total number of seconds from midnight to the time stored in the `hour`, 
`min` and `sec` instance variables.
    - Uncomment the blah blah test cases in the test/java directory to test this method.

B. You have also been provided with a class named `TimeDemo` that contains commented code in the 
main method.  You can use it to help with debugging.  To run a file that has the main method, 
right-click on the file and choose Run followed by the file name.<br>
C. Remember to use the keyword `this` everywhere that you refer to an instance variable 
(with the exception of the declaration).

**Problem 2**<br>
A. In the main/java directory, create a class named `ArrayTest`. It should include the following:
- A static method named `averageOfEvens` that takes a 2D array and returns a double. It should return the average of 
all the even numbers in the 2D array.
- A static method named `countWordsStartingWith` that takes a 1D array and a char and returns an int. It should
return the number of words that starts with the char parameter.
- A static method named `flattenArray` that takes a 2D ragged array and returns a 1D array. It should
convert the 2D ragged array into a 1D array.