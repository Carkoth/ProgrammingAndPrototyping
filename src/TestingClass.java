public class TestingClass{

    public static void main(String args[]) {

        //Website: http://www.cs.princeton.edu/IntroProgramming
        //12/8;17
        //--------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        // Pg. 15
        //Integers, declared as int, are numbers such as 00, -12, 2147483647, and so on. There are no decimals in integers
        int integerVariable = 5;
        System.out.println("My integer variable: " + integerVariable);
        /*

        Common operators:

        +: Simple addition
        -: Simple subtraction
        *: Simple multiplication
        /: Simple division
        %: Taking whatevers is left after you multiply something Ex: 3 % 2 = 1

         */
        System.out.print("Integer addition (integer + 1): ");
        System.out.println(integerVariable + 1);
        System.out.print("Integer subtraction (integer - 1): ");
        System.out.println(integerVariable - 1);
        System.out.print("Integer multiplication (integer * 2): ");
        System.out.println(integerVariable * 2);
        //NOTE: Division with integers will leave you with a number that doesn't include the remainder, so your answer with not be correct.
        System.out.print("Integer division (integer / 2): ");
        System.out.println(integerVariable / 2);
        System.out.print("Integer remainder function (integer % 2): ");
        System.out.println(integerVariable % 2);
        System.out.println();
        //Floating-point numbers, declared as double, are any numbers, such as 3.14, -2.5 and 6.022e23
        double floatingPointVariable = 4.5;
        System.out.println("My double variable: " + floatingPointVariable);
        /*

        Common operators:

        +: Simple addition
        -: Simlpe subtraction
        *: Simple multiplication
        /: Simple division


         */
        System.out.print("Double addition (double + 1): ");
        System.out.println(floatingPointVariable + 1);
        System.out.print("Double subtraction (double - 1): ");
        System.out.println(floatingPointVariable - 1);
        System.out.print("Double multiplication (double * 2): ");
        System.out.println(floatingPointVariable * 2 );
        System.out.print("Double division (double / 2): ");
        System.out.println(floatingPointVariable / 2);
        System.out.println();
        //Boolean values, declared as boolean, are values of true and false
        boolean booleanOne = true;
        boolean booleanTwo = false;
        /*

        Common operators:

        &&: Both booleans have to be true in order for it to evaluate as true
        ||: Only one of the booleans has to be true in order for it to be evaluated as true
        !: This will evaluate the boolean as the opposite of whatever it should be

         */
        System.out.print("Using the && operator: ");
        System.out.println(booleanOne && booleanTwo);
        System.out.print("Using the || operator: ");
        System.out.println(booleanOne || booleanTwo);
        System.out.print("Using the ! operator: ");
        System.out.println(!booleanOne);
        System.out.println();
        // 12/11/17
        //-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        //Characters, declared as char are any one symbol on the keyboard. ex: A, 1, %, and \n. You use '' around the characters to identify them as charaters
        char characterVariable = 'A';
        System.out.println("My Character: " + characterVariable);
        System.out.println();
        //Pg. 28
        /*

       op          meaning         true        false
       ---------------------------------------------
       ==          equal           2 == 2      2 = 3
       !-          not equal       3 != 2     2 != 2
       <           less than       2 < 13      2 < 2
       <-      less than or equal  2 <= 2     3 <= 2
       >           greater than    13 > 2      2 > 13
       >=   greater than or equal  3 >= 2      2 >= 3

       */
        //void print(String x) || prints out text, but doesn't move cursor to the next line
        System.out.print("System.out.print test");
        System.out.print(" This is a different method on the same line");
        //void println(String x) || You can use System.out.println With a blank variables space so that it just moves the cursor to the next line
        System.out.println();
        System.out.println("System.out.println test");
        System.out.println();
        //NOTE: Any type of data can be used, and will be automatically converted to string
        //Functions in Java's Math library
        //--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        //12/12/17
        double a;
        double b;
        double theta;
        double ratio;
        double result;
        //double abs(double a) || returns the absolute value of a
        a = -1;
        System.out.println("a: " + a);
        result = Math.abs(a);
        System.out.println("The absolute value of a: " + result);
        System.out.println();
        //double max(double a, double b) || returns the maximum of a and b
        a = 2;
        b = 5;
        System.out.println("a: " + a +", b: " + b);
        result = Math.max(a, b);
        System.out.println("The maximum of a and b: " + result);
        System.out.println();
        //double min(double a, double b) || returns the minimum of a and b
        a = 4;
        b = 6;
        System.out.println("a: " + a + ", b: " + b);
        result = Math.min(a, b);
        System.out.println("The minimum of a and b: " + result);
        System.out.println();
        //NOTE: These functions are also defined  for int, long, and float
        //NOTE: To use trig functions, you must convert angles to radians. Use toDegrees() and toRadians() to convert
        //double sin(double theta) || Takes the sine of theta
        theta = 22; //Degrees
        System.out.println("theta: " + theta + " degrees");
        theta = Math.toRadians(theta); //Radians
        System.out.println("theta: " + theta + " radians");
        result = Math.sin(theta);
        System.out.println("Sine of theta: " + result);
        System.out.println();
        //double asin(double ratio) || returns the inverse sine of the ratio
        ratio = 0.4;
        System.out.println("ratio: " + ratio);
        result = Math.asin(ratio);
        System.out.println("Inverse sine of the ratio (radians): " + result + " radians");
        result = Math.toDegrees(ratio);
        System.out.println("Inverse sine of the ratio (degrees): " + result + " degrees");
        System.out.println();
        //double cos(double theta) || Take the cosine of theta
        theta = 44; //Degrees
        System.out.println("theta: " + theta + " degrees");
        theta = Math.toRadians(theta); //Radians
        System.out.println("theta: " + theta + " radians");
        result = Math.cos(theta);
        System.out.println("Cosine of theta: " + result);
        System.out.println();
        //double acos(double ratio) || returns the inverse cosine of the ratio
        ratio = 0.35;
        System.out.println("ratio: " + ratio);
        result = Math.asin(ratio);
        System.out.println("Inverse cosine of the ratio (radians): " + result + " radians");
        result = Math.toDegrees(result);
        System.out.println("Inverse cosine of the ratio (degrees): " + result + " degrees");
        System.out.println();
        //double tan(double theta)
        theta = 45;
        System.out.println("theta: " + theta + " degrees");
        theta = Math.toRadians(theta);
        System.out.println("theta: " + theta + " radians");
        result = Math.tan(theta);
        System.out.println("Tangeant of theta: " + result);
        System.out.println();

    }

}