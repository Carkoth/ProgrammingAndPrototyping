import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Exercises {

    public Exercises() {



    }
    public void test() {



    }
    //DATE 1/3/2018
    //Exercise 1.1.1
     //  Write a program that prints the "Hello, World" message 10 times.
    public void oneOneOne() {

        for(int i = 0; i < 10; i++) {

            System.out.println("Hello, World");

        }

    }
    /*

    Exercise 1.1.2
      Describe  what happens if you omit the following in your program
            a. public
            b. static
            c. void
            d. args

    a. It could not find the main method
    b. It says that the main method is not static, and to define it with static
    c. It says that there is an invalid method declaration, and that it requires a return type
    d. It says that an identifier is expected

     */
    /*

    Exercise 1.1.3
      Describe what happens if you misspell (by, say, omitting the second letter) the following in your program
            a. public
            b. static
            c. void
            d. args

      a. It says that it expected a class, an identifier, that there was an invalid method declaration, and that a return type was required
      b. It says an identifier was expected, there was an invalid method declaration, and a return type was required.
      c. It says that it couldn't find a symbol for the misspelled words
      d. Nothing happened

      */
    //DATE 1/4/2018
     /*

     Exercise 1.2.1
        Suppose that a and b are int values. What does the following sequence of statements do?
            int t = a; b = t; a = b;

     First, t becomes a then b becomes t(which has the value of a) then a becomes b(which has the value of a)

    */
     /*

     Exercise 1.2.3
        Suppose that a and b are int values. Show that the expression is equivalent to true.
            (!(a && b) && (a || b)) || ((a && b) || !(a || b))

     Impossible, as integers cannot use &&, ||, and ! operators00

      */
     /*

     Suppose that a and b are int values. Simplify the following expression.
        (!(a < b) && !(a > b))

    (a == b)
    This is because if one is greater than another, than both the < or > will trigger true, but the other will trigger false, and because the && requires both to be true,, it will always be false unless they are equal.

      */
     /*

     Exercise 1.2.5
        The exclusive or operator ^ for boolean operands is defined to be true if they are different, false if they are the same. Give a truth table for this function

     true                     false
     ------------------------------
     true ^ false           true ^ true
     false ^ true           false ^ false

      */
     /*



      */
     /*

     Exercise  1.2.6
        Why does 10/3 give 3 and not 3.3333333333

     Because 10/3 is in integers, not doubles. To get an answer with decimals, do 10.0 / 3.0

      */
     /*

     Exercise 1.2.7
        What does each of the following print?
            a. System.out.println(2 + "bc");
            b. System.out.println(2 + 3 + "bc");
            c. System.out.println((2 + 3) + "bc");
            d. System.out.println("bc" + 2 + 3);
        Explain each outcome.

     a. 2bc, there are only two things and it can't combine 2 and "bc"
     b. 5bc, it sees the 2 + 3 before seeing the "bc"
     c. 5bc, same as before, but this time it's seeing the () so it will always combine them
     d. bc23, it sees the string before the numbers, making it think the numbers are strings

      */
     //DATE 1/8/2018
     /*

     Exercise 1.2.9
        What do each of the following print?
            a. System.out.println('b');
            b. System.out.println('b' + 'c');
            c. System.out.println((char) ('a' + 4));
        Explain each outcome.

        a. It prints 'b', as it is simply printing a character.
        b. It prints 197 because it's taking the two ASCII values of the characters and adding them
        c. It prints out 'e' because the ASCII value for 'a' is 97, and 97 + 4 is 101, and 101 is the ASCII value for 'e'

      */
     /*

     Exercise 1.2.10
        Suppose that a is declared as int a = 2147483647 (or equivalently, Integer.MAX_VALUE). What do each of the following print?
            a. System.out.println(a);
            b. System.out.println(a + 1);
            c. System.out.println(2 - a);
            d. System.out.println(-2 - a);
            e. System.out.println(2 * a);
            f. System.out.println(4 * a);
        Explain each outcome.

        a. It prints 2147483647 because it's simply printing the value of the variable with no other processes.
        b. It prints -2147483648 because it's already at the maximum value, so it switches over to negatives, and -2147483648 is the minimum value for an integer.
        c. It prints -2147483645 because it's effectively two minus the max int value, or the negative max int number plus two
        d. It prints 2147483647 because it surpasses the minimum int number of -2147483648 and switches over to the maximum int value
        e. It prints -2 because it switches over twice and leaves a remainder of sorts
        f. It prints -4 because this time it switches over 4 times a leaves a remainder

      */
     /*

     Exercise 1.2.11
        Suppose that a is declared as double a = 3.14159. What do each of the following do?
            a. System.out.println(a);
            b. System.out.println(a + 1);
            c. System.out.println(8 / (int) a);
            d. System.out.println(8 / a);
            e. System.out.println((int) (8 / a));

            a. It prints 3.14159 because it's simply printing the value
            b. It prints 4.14159 because it's adding 1 to 3.14159
            c. It prints 2, because it's typecasting a to an int, meaning it becomes 3, and it divides 8 by 3, meaning that you would get two, because 3 only goes into 8 twice and we are using ints so there is no decimal
            d. It prints 2.5464812403910124, because it divides 8 by three and because it's a double it gives a decimal.
            e. It prints 2, because it originally gets 2.5464812403910124 (8/a), and then it chops the decimal, giving 2


      */
     /*

     Exercise 1.2.12
        Describe what happens if you write sqrt instead of Math.sqrt in program 1.2.12 (program given)

        It cannot resolve the symbol "sqrt", because we are not calling the class, therefore it's looking for the function in your class.

      */
     /*

     Exercise 1.2.13
        What is the value of (Math.sqrt(2) * Math.sqrt(2) == 2)?

     It should be true, but because the square root of two is an irrational number, it is not exactly two.

      */
     public void oneTwoTwelve(String argB, String argC) {

         double b = Double.parseDouble(argB);
         double c = Double.parseDouble(argC);
         double discriminant = b * b - 4.0 * c;
         double d = Math.sqrt(discriminant);
         System.out.println((-b + d) / 2.0);
         System.out.println((-b - d) / 2.0);

     }
     /*

     Exercise 1.2.14

        Write a program that takes two positive integers as arguments and prints true if either evenly divides over the other.
f
      */
     public void oneTwoFourteen(int intOne, int intTwo) {

         if ((intOne <= 0) || (intTwo <= 0)) {

             System.out.println("Please give POSITIVE integers.");
             return;

         }
         if (((intOne % intTwo) == 0) || ((intTwo % intOne) == 0)) {

             System.out.println(true);

         }

     }
     //DATE 1/10/2018
     /*

     Exercise 1.2.15

        Write a program that takes three positive integers as command line arguments and prints true if any one of them is greater than or equal to the sum of the other two and false otherwise. (Note: This computation tests whether the three numbers couldbe the lengths of the sides of some triangle.)

      */
     public void oneTwoFifteen(int sideOne, int sideTwo, int sideThree) {

        if ((sideOne <= 0) || (sideTwo <= 0) || (sideThree <= 0)) {

            System.out.println("Please give POSITIVE integer.");
            return;

        }
        if ((sideOne >= (sideTwo + sideThree)) || (sideTwo >= (sideOne + sideThree)) || (sideThree >= (sideOne + sideTwo))) {

            System.out.println(true);

        }
        else {

            System.out.println(false);

        }

     }
     /*

     Exercise 1.2.16

        A physics student gets unexpected results when using the following code to compute values according to the formula F = Gm1m2 / r^2
            F = G * mass1 * mass2 / r * r;

        He didn't use order of operations correctly, as it will divide mass2 by r before multiplying r by r, so he needs to put "r * r" into parentheses

      */
     public void oneTwoSixteen(double G, double mass1, double mass2, double r) {

         double F;
         F = G * mass1 * mass2 / (r * r);
         System.out.println(F);

     }
     /*

     Exercise 1.2.17

        Give the value of a after the execution of each of the following sequences.

        (1)            (2)                    (3)

        int a = 1;     boolean a = true;      int a = 2;
        a = a + a;     a = !a;                a = a * a;
        a = a + a;     a = !a;                a = a * a;
        a = a + a;     a = !a;                a = a * a;

     (1) 8
     (2) false
     (3) 256

      */
     /*

     Exercise 1.2.18

        Suppose that x and y are double values that represent the Cartesian coordinates of a point (x, y) in the plane. Give an expression whose value is the distance of the point from origin.

      */
     public void oneTwoEighteen(double x, double y) {

         double distance;
         distance = Math.sqrt((x * x) + (y * y));
         System.out.println(distance);

     }
     //DATE 1/11/2018
     /*

     Exercise 1.2.19

        Write a program that takes two int values a and b from the command line and prints a random integer between a and b

      */
     public void oneTwoNineteen(int min, int max) {

         System.out.println(ThreadLocalRandom.current().nextInt(min, max));
     }
     /*

     Exercise 1.2.20

        Write a program that prints the sum of two random integers between 1 and 6 (such as you might get when rolling dice)

      */
     public void oneTwoTwenty() {

         int diceOne = ThreadLocalRandom.current().nextInt(1, 6);
         int diceTwo = ThreadLocalRandom.current().nextInt(1, 6);
         System.out.println(diceOne + diceTwo);

     }
     /*

     Exercise 1.2.21

        Write a program that takes a double value t from the command line and prints the value of sin(2t) + sin(3t)

      */
     public void oneTwoTwentyone(double t) {

         System.out.println(Math.sin(2 * t) + Math.sin(3 * t));

     }
     /*

     Exercise 1.2.22

        Write a program that takes three double values x, v, and t from the command line and prints the value of x + vt + gt^2/2

      */
     public void oneTwoTwentytwo(double x, double v, double t) {

         double g = 9.78033;
         System.out.println(x + v * t + g * (t * t) / 2);

     }
     /*

     Exercise 1.2.23

        Write a program that takes two int values m and d from the command line and prints true if day d of the month m is between 3/20 and 6/20, false otherwise

    */
    public static void main(String args[]) {

        new Exercises();

    }

}