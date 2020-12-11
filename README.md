###### CS-207-3: Programming II <br> Spring 2021 <br> Northeastern Illinois University <br> Homework #1 <br> Programming I Review

**Getting Started**

**Note:** Detailed instructions are located in the tutorial and in the initial assignment.<br>
**A.** Accept the assignment invitation on D2L.<br>
**B.** Clone the assignment to your computer.<br>
**C.** Go to File > Project Structure. Under Project Settings, click on Project and verify that 
the Project SDK is set to JDK 11 or higher.  If it is not, select the correct SDK from the drop-down.<br>
**D.** Then,  under  Project  Settings,  click  on  Modules. You  should  see  three  tabs  on  the right: 
Sources,  Paths,  and  Dependencies  where  Sources is ”underlined”. Click  on Dependencies and to 
the right of JUnit5.4, verify that the drop-down is set to Compile. Click Ok at the bottom right.<br>
**E.** Create the main/java directory in the src directory. This is where you will be creating your 
Java classes for your assignment.<br>

**Submitting your assignment**

**A.** Once you have completed all the problems, commit your final code to GitHub. <br>
- Please also commit code after each step of each problem and remember to run the unit tests 
(where applicable) and code analyzers before you commit.<br>

**B.** Then in IntelliJ, go to File, select Export to Zip File. This will a create a zip file of the 
entire project directory.<br>
**C.** Submit the .zip file to the Homework 1 Assignment folder on D2L.<br>

**Problem 1**

**A.** In the main/java directory, create an immutable class named `Time`. (Remember that objects created
 from an immutable class cannot have it's content changed.) It should include the following:
- Three private integer instance variables named `hour`, `min`, `sec`, and a char named `meridiem`. 
Run the code analyzers and commit your code now.
- A default constructor that sets the `hour` instance variable to `12`, the `min` and `sec` instance 
variables to `0`, and the `meridiem` instance variable to `'A'`. Run the code analyzers and commit 
your code now.
- A constructor that takes three integer parameters (in the specific order of hours, minutes, seconds) 
and then a char parameter and sets the instance variables. Run the code analyzers and commit your 
code now.
- A method named `getTotalMinutes` that does not take any parameters. It should return an integer 
value that represents the total number of minutes from midnight to the time stored in the `hour` and 
`min` instance variables (you can ignore the `sec` instance variable). You will find the `meridiem` 
instance variable helpful). Note that for the instance variable `meridiem`, `'A'`  represents AM 
and `'P'`  represents PM.
    - Uncomment the blah blah test cases in the test/java directory to test this method. Run the code 
    analyzers and commit your code now.
- A method named `getTotalSeconds` that does not take any parameters. It should return an integer 
value that represents the total number of seconds from midnight to the time stored in the `hour`, 
`min` and `sec` instance variables.
    - Uncomment the blah blah test cases in the test/java directory to test this method. Run the 
    code analyzers and commit your code now.
- A static method named `localTimeToTimeObject` that does not take any parameters. It should return a Time object
that represents the current time by using the Java class LocalTime. (Hint: https://docs.oracle.com/javase/8/docs/api/java/time/LocalTime.html)
    - Uncomment the blah blah test cases in the test/java directory to test this method. Run the 
        code analyzers and commit your code now.
- A static method named `getMultipleTimes` that takes an integer parameter. It should return a 1D array the 
size of the integer parameter containing Time objects. It should utilize the `localTimeToTimeObject` 
static method.
    - Uncomment the blah blah test cases in the test/java directory to test this method. Run the 
    code analyzers and commit your code now.
            
**B.** You have also been provided with a class named `TimeDemo` that contains commented code in the 
main method.  You can use it to help with debugging.  To run a file that has the main method, 
right-click on the file and choose Run followed by the file name.<br>
**C.** Remember to use the keyword `this` everywhere that you refer to an instance variable 
(with the exception of the declaration).

**Problem 2**

**A.** In the main/java directory, create a class named `ArrayTest`. It should include the following:
- A static method named `averageOfEvens` that takes a 2D integer array parameter and returns a double. 
It should return the average of all the even numbers in the 2D array. 
- An overloaded static method named `averageOfEvens` that takes a 2D integer array and 1D integer array parameter 
and returns a double. It should return the average of all the even numbers in the 2D array and 1D array. 
- A static method named `countWordsStartingWithChar` that takes a 1D String array and a char as parameters, and returns an int. It should
return the number of words that starts with the char parameter.
- A static method named `flattenArray` that takes a 2D ragged integer array parameter and returns a 1D integer array. It should
convert the 2D ragged array into a 1D array.