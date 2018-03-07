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
    public void oneTwoTwelve(String argB, String argC) {

        double b = Double.parseDouble(argB);
        double c = Double.parseDouble(argC);
        double discriminant = b * b - 4.0 * c;
        double d = Math.sqrt(discriminant);
        System.out.println((-b + d) / 2.0);
        System.out.println((-b - d) / 2.0);

    }
     /*

     Exercise 1.2.13
        What is the value of (Math.sqrt(2) * Math.sqrt(2) == 2)?

     It should be true, but because the square root of two is an irrational number, it is not exactly two.

      */

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
     //DATE 1/16/2018
     /*

     Exercise 1.2.23

        Write a program that takes two int values m and d from the command line and prints true if day d of the month m is between 3/20 and 6/20, false otherwise

    */
     public void oneTwoTwentythree(int m, int d) {

         if (m < 1 || m > 12) {

             System.out.println("Invalid month");
             return;

         }
         if (d < 1 || d > 31) {

             System.out.println("Invalid day");
             return;

         }
         if (m >= 3 && m <= 6) {

             switch (m) {

                 case 3:

                     if (d >= 20) {

                         System.out.println(true);

                     }
                     else {

                         System.out.println(false);

                     }
                     break;

                 case 4:
                 case 5:
                     System.out.println(true);
                     break;
                 case 6:

                     if (d <= 20) {

                         System.out.println(true);

                     }
                     else {

                         System.out.println(false);

                     }
             }
         }
         else {

             System.out.println(false);

         }
     }
    /*

    Exercise 1.2.25

        Wind chill. Gi ven the temperature t (in Fahrenheit) and the wind speed v (in miles per hour), the National Weather Service defines the effective temperature (the wind chill) to be:

            w = 35.74 + 0.6215t + (0.4275t - 35.75)v^0.16

        Write a program that takes two double command-line arguments t and v and prints out the wind chill. Use Math.pow(a, b) to compute a^b. Note: The formula is not valid id t is larger than 50 in absolute value or if v is larger that 120 or less than 3 (you may assume that the values you get are in that range)

     */
    public void oneTwoTwentyfive (double t, double v) {

        if ((Math.abs(t) > 50) || (v > 120 || v < 3)) {

            System.out.println("Values outside limits for formula validity");
            return;

        }
        double w = 35.74 + 0.6215 * t + (0.4275 * t - 35.75) * Math.pow(v, 0.16);
        System.out.println(w);

    }
    //DATE 1/17/28
    /*

    Exercise 1.2.28

        Order check. Write a program that takes three double values x, y, and z as command-line arguments and prints true if the values are strictly ascending or descending and false otherwise.

     */
    public void oneTwoTwentyEight(double x, double y, double z) {

        if (((x < y) && (y < z)) || ((x > y) && (y > z))) {

            System.out.println(true);

        }
        else {

            System.out.println(false);

        }

    }
    /*

    Exercise 1.2.29

        Day of the week. Write a program that takes a date as input and prints the day of the week that date falls on. Your program should take three command line parameters: m (month_, d (day_, and y (year). For m, use 1 for January, 2 for February, and so forth. For output, print 0 for Sunday, 1 for Monday, 2 for Tuesday, and so forth. Use the following formulas, for the Gregorian calender.

            y = y - (14 - m) / 12
            x = y + y / 4 - y / 100 + y/400
            m = m + 12 * ((14 - m) / 12) - 2
            d = (d + x + (31 * m) / 12) % 7

     */
    public void oneTwoTwentyNine(int m, int d,int y) {

        y = y - (14 - m) / 12;
        int x = y + y / 4 - y / 100 + y / 400;
        m = m + 12 * ((14 - m) / 12) - 2;
        d = (d + x + (31 * m) / 12) % 7;
        System.out.println(d);

    }
    /*

    Exercise 1.2.30

        Uniform random numbers. Write a program that prints five uniform random values between 0 and 1, their average value, and their minimum and maximum values.

     */
    public void oneTwoThirty() {

        double random1 = Math.random();
        double random2 = Math.random();
        double random3 = Math.random();
        double random4 = Math.random();
        double random5 = Math.random();
        System.out.println("1st: " + random1);
        System.out.println("2nd: " + random2);
        System.out.println("3rd: " + random3);
        System.out.println("4th: " + random4);
        System.out.println("5th: " + random5);
        System.out.println("Minimum: " + Math.min(Math.min(Math.min(Math.min(random1, random2) , random3), random4), random5));
        System.out.println("Maximum: " + Math.max(Math.max(Math.max(Math.max(random1, random2), random3), random4), random5));
        System.out.println("Average: " + (random1 + random2 + random3 + random4 + random5) / 5);

    }
    //DATE 1/18/2018
    /*

    Exercise 1.2.32

        Color conversion. Several different formats are used to represent color. For example, the primary format for LCD displays, digital cameras, and web pages, known as the RGB format, specifies the level of red (R), green (G), and blue (B) on an integer scale from 0 to 255. The primary format for publishing books and magazines, known as the CMYK format, specifies the level of cyan (C), magenta (M), yellow (Y), and black (K) on a reeal scale from 0.0 to 1.0. Write a program that converts RGB to cmyk. Take three integers--r, g, and b--from the command line and print the equivalent CMYK values. If the RGB values are all 0 then the CMY values are all 0 and the K value is 1; otherwise, use these formulas

     */
    public void oneTwoThirtyTwo(double r, double g, double b) {

        double w;
        double c;
        double m;
        double y;
        double k;
        if (r == 0 && g == 0 && b == 0) {

            c = 0;
            m = 0;
            y = 0;
            k = 1;

        }
        else {

            w = Math.max(Math.max(r / 255, g / 255), b / 255);
            c = (w - (r / 255)) / w;
            m = (w - (g / 255)) / w;
            y = (w - (b / 255)) / w;
            k = 1 - w;

        }
        System.out.println("C: " + c + " M: " + m + " Y: " + y + " K: " + k);

    }
    /*

    Exercise 1.2.33

        Great circle. Write a program that takes four command-line arguments--x1, y1, x2, and y2--(the latitude and longitude, in degrees, of two points on the earth) and prints out the great-circle distance between them. The great-circle distance (in nautical miles) is given by the equation:

            d = 60 * arccos(sin(x1) * sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2))

        Note that this equation uses degrees, whereas Java's trigonometric functions use radians. Use Math.toRadians() and Math.toDegrees() to convert between the two. Use your program to compute the great-circle distance between Paris (48.87 degrees N and -2.33 degrees W) and San Francisco (37.8 degrees N and 122.4 degrees W)

      */
    public void oneTwoThirtythree(double x1, double x2, double y1, double y2) {

        x1 = Math.toRadians(x1);
        x2 = Math.toRadians(x2);
        y1 = Math.toRadians(y1);
        y2 = Math.toRadians(y2);
        double angle1 = Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));
        angle1 = Math.toDegrees(angle1);
        double distance1 = 60 * angle1;
        System.out.println(distance1 + " nautical miles");

    }
    /*

    Exercise 1.2.34

        Three-sort. Write a program that takes three int values from the command line and prints them in ascending order. Use Math.min() and Math.max().

     */
    public void oneTwoThirtyfour(int numberOne, int numberTwo, int numberThree) {

        int smallest = Math.min(Math.min(numberOne, numberTwo), numberThree);
        int largest = Math.max(Math.max(numberOne, numberTwo), numberThree);
        int median = numberOne + numberTwo + numberThree - smallest - largest;
        System.out.println(smallest + " " + median + " " + largest);

    }
    //DATE 1/23/2018
    /*

    Exercise 1.3.1

        Write a program that takes three integer command-line arguments and prints "equal" if all three are equal, and "not equal" otherwise

     */
    public void oneThreeOne(int valueOne, int valueTwo, int valueThree) {

        if (valueOne == valueTwo && valueOne == valueThree) {

            System.out.println("equal");

        }
        else {

            System.out.println("not equal");

        }

    }
    //DATE 1/24/2018
    /*

    Exercise 1.3.3

        What (if anything) is wrong with each of the following statements?

            a. if (a > b) then c = 0;
            b. if a > b {c = 0;}
            c. if (a > b) c = 0;
            d. if (a > b) c = 0 else b = 0;

        a. There is no such thing as a then statement
        b. Parentheses are required for the boolean statement
        c. Nothing is wrong
        d. A semicolon is needed in-between c = 0 and else

     */
    /*

    Exercise 1.3.4

        Write a code fragment that prints true if the double variables x and y are both strictly between 0 and 1 and false otherwise.

     */
    public void oneThreeFour(double x, double y) {

        if (x > 0 && x < 1 && y > 0 && y < 1) {

            System.out.println(true);

        }
        else {

            System.out.println(false);

        }

    }
    /*

    Exercise 1.3.5

        Improve your solution to Exercise 1.2.25 by adding code to check the values of the command-line arguments fall between the ranges of validity of the formula, and also adding code to print out an error message if that is not the case.

        Already have done this, but will put in separate function anyways

     */
    public void oneThreeFive (double t, double v) {

        if ((Math.abs(t) > 50) || (v > 120 || v < 3)) {

            System.out.println("Values outside limits for formula validity");
            return;

        }
        double w = 35.74 + 0.6215 * t + (0.4275 * t - 35.75) * Math.pow(v, 0.16);
        System.out.println(w);

    }
    /*

    Exercise 1.3.6

        Suppose that i and j are both of type int. What is the value of j after each of the following statements is executed?

            a. for (i = 0, j = 0; i < 10; i++) j += i;
            b. for (i = 0, j = 1; i < 10; i++) j += j;
            c. for (j = 0; j < 10; j++) j += j
            d. for (i = 0, j = 0;

        a. 45
        b. 1024
        c. 15
        d. 1023

     */
    /*

    Exercise 1.3.7

        Rewrite TenHellos to make a program that takes the number of lines to print as a command-line argument. You may assume that the argument is less than 1000. Hint: Use i % 10 and i % 100 to determine when to use st, rd, or th for printing the ith Hello.

     */
    public void oneThreeSeven(int numberOfHellos) {

        for (int i = 1; i <= numberOfHellos; i++) {

            if (i % 10 == 1 && i != 11) {

                System.out.println(i + "st Hello");

            }
            else if (i % 10 == 2 && i != 12) {

                System.out.println(i + "nd Hello");

            }
            else if (i % 10 == 3 && i != 13) {

                System.out.println(i + "rd Hello");

            }
            else {

                System.out.println(i + "th Hello");

            }

        }

    }
    /*

    Exercise 1.3.8

        Write a program that, using one for loop and one if statement, prints the integers from 1000 to 2000 with five integers per line. Hint: use the % operation.

     */
    public void oneThreeEight() {

        for (int i = 1000; i <= 2000; i++) {

            if (i % 5 == 0) {

                System.out.println();

            }
            System.out.print(i + " ");

        }

    }
    /*

    Exercise 1.3.9

        Write a program that takes an integer N as a command-line argument, uses Math.random() to print N uniform random values between - and 1, and then prints their average value.

     */
    public void oneThreeNine(int N) {

        double sum = 0;
        for (int i = 1; i <= N; i++) {

            double random = Math.random();
            System.out.println(random);
            sum = sum + random;

        }
        System.out.println("Average: " + sum / N);

    }
    /*

    Exercise 1.3.10

        Describe what happens if you try to print a ruler function (see the table on page 57) [I will insert the code from the table into the function bellow] with a value too large, such as 100.

        The output becomes much too long, and ends up congealing onto one line

     */
    public void oneThreeTen(int N) {

        String ruler = "";
        for (int i = 1; i <= N; i++) {

            ruler = ruler + i + ruler;
            System.out.println(ruler);

        }

    }
    /*

    Exercise 1.3.13

        What does the following program print?

            int f = 0, g = 1;
            for (int i = 0; i <= 15; i++) {

                System.out.println(f)
                f = f + g
                g = f - g;

            }

        It prints the Fibonacci sequence.

     */
    //DATE 1/29/2018
    /*

    Exercise 1.3.21 Write a version of Gambler that uses two nested while loops or two nested for loops instead of a while loop inside of a for loop

     */
    public void oneThreeTwentyone(int startBankroll, int desiredBankroll, int trials) {

        int bets = 0;
        int wins = 0;
        int t = 0;
        while (t < trials ) {

            int cash = startBankroll;
            while (cash > 0 && cash < desiredBankroll) {

                bets++;
                if (Math.random() < 0.5) {

                    cash++;

                }
                else {

                    cash--;

                }

            }
            if (cash == desiredBankroll) {

                wins++;

            }
            t++;

        }
        System.out.println(wins + " wins of " + trials);
        System.out.println("Percent of games won = " + 100.0 * wins / trials);
        System.out.println("Avg # of bets = " + 1.0 * bets / trials);

    }
    /*

    Exercise 1.3.22

        Write a program that traces a gambler's ruin simulation by printing a line after each bet in wich an asterisk corresponds to each dollar held by the gambler.

     */
    public void oneThreeTwentytwo(int startBankroll, int desiredBankroll, int trials) {

        int bets = 0;
        int wins = 0;
        int t = 1;
        while (t <= trials ) {

            System.out.println("Trial " + t);
            int cash = startBankroll;
            while (cash > 0 && cash < desiredBankroll) {

                bets++;
                if (Math.random() < 0.5) {

                    cash++;

                }
                else {

                    cash--;

                }
                int asteriskCounter = 0;
                while (asteriskCounter < cash) {

                    System.out.print("*");
                    asteriskCounter++;
                }
                System.out.println();

            }
            if (cash == desiredBankroll) {

                System.out.println("Gambler wins!");
                wins++;

            }
            else {

                System.out.println("Gambler loses!");

            }
            t++;

        }
        System.out.println(wins + " wins of " + trials);
        System.out.println("Percent of games won = " + 100.0 * wins / trials);
        System.out.println("Avg # of bets = " + 1.0 * bets / trials);

    }
    /*

    Exercise 1.3.23

        Modify Gambler ot take an extra command-line argument that specifies the (fixed) probability that the gambler wins each bet. Use your program to learn how this probability affects the chance of winning and the expected number of bets. Try a value close to 0.5 (say, 0.48).

     */
    //DATE 1/30/2018
    public void oneThreeTwentythree(int startBankroll, int desiredBankroll, int trials, double betProbability) {

        int bets = 0;
        int wins = 0;
        int t = 1;
        while (t <= trials ) {

            System.out.println("Trial " + t);
            int cash = startBankroll;
            while (cash > 0 && cash < desiredBankroll) {

                bets++;
                if (Math.random() < betProbability) {

                    cash++;

                }
                else {

                    cash--;

                }
                int asteriskCounter = 0;
                while (asteriskCounter < cash) {

                    System.out.print("*");
                    asteriskCounter++;
                }
                System.out.println();

            }
            if (cash == desiredBankroll) {

                System.out.println("Gambler wins!");
                wins++;

            }
            else {

                System.out.println("Gambler loses!");

            }
            t++;

        }
        System.out.println(wins + " wins of " + trials);
        System.out.println("Percent of games won = " + 100.0 * wins / trials);
        System.out.println("Avg # of bets = " + 1.0 * bets / trials);

    }
    /*

    Exercise 1.3.24

        Modify Gambler to take an extra command-line argument that specifies the number of bets the gambler is willing to make, so that there are three possible ways for the game to end: the gambler wins, loses, or runs out of time. Add to the output to give the expected amount of money the gambler will have when the game ends.

     */
    //DATE 1/30/2018 & 1/31/2018
    public void oneThreeTwentyfour(int startBankroll, int desiredBankroll, int trials, double betProbability, int maxNumberOfBets) {

        int bets = 0;
        int wins = 0;
        int loses = 0;
        int ranOutOfTime = 0;
        int totalMoney = 0;
        int t = 1;
        while (t <= trials ) {

            System.out.println("Trial " + t);
            int cash = startBankroll;
            int currentBets = 0;
            while (cash > 0 && cash < desiredBankroll && currentBets < maxNumberOfBets) {

                currentBets++;
                if (Math.random() < betProbability) {

                    cash++;

                }
                else {

                    cash--;

                }
                int asteriskCounter = 0;
                while (asteriskCounter < cash) {

                    System.out.print("*");
                    asteriskCounter++;
                }
                System.out.println();

            }
            if (cash == desiredBankroll) {

                System.out.println("Gambler wins!");
                wins++;
                totalMoney = totalMoney + cash;

            }
            else if (cash == 0){

                System.out.println("Gambler loses!");
                loses++;

            }
            else if (cash != desiredBankroll) {

                System.out.println("Gambler ran out of time!");
                totalMoney = totalMoney + cash;
                ranOutOfTime++;

            }
            else {

                System.out.println("Something went wrong (Error Code 1)");

            }
            bets = bets + currentBets;
            t++;

        }
        System.out.println("Total Games: " + trials);
        System.out.println("Wins: " + wins);
        System.out.println("Loses: " + loses);
        System.out.println("Ran Out of Time: " + ranOutOfTime);
        System.out.println("Percent of games won = " + 100.0 * wins / trials);
        System.out.println("Avg # of bets = " + 1.0 * bets / trials);
        System.out.println("Average Remaining Money: " + totalMoney / trials);

    }
    /*

    Exercise 1.3.27

        Write a program that takes one command-line argument N and uses a loop within a loop to print out a two dimensional N-by-N checkerboard pattern with alternating hashes and at signs.

     */
    public void oneThreeTwentyseven(int N) {

        int height = 0;
        int width = 0;
        while (height < N) {
            if (height % 2 == 0) {

                while (width < N) {

                    if (width % 2 == 0) {

                        System.out.print(" #");

                    }
                    if (width % 2 == 1) {

                        System.out.print(" @");

                    }
                    width++;

                }
                System.out.println();
                height++;
                width = 0;

            }
            if (height % 2 == 1) {

                while (width < N) {

                    if (width % 2 == 0) {

                        System.out.print(" @");

                    }
                    if (width % 2 == 1) {

                        System.out.print(" #");

                    }
                    width++;

                }
                System.out.println();
                height++;
                width = 0;

            }

        }

    }
    /*

    Exercise 1.3.28

        Write a program that finds the greatest common divisor (gcd) of two integers using Euclid's algorithm, which is an iterative computation based on the following observation: if x is greater than y, then if y divides x, the gcd of x and y is y, otherwise, the gcd of x and y is the same as the gcd of x % y and y.

     */
    public void oneThreeTwentyeight(int x, int y) {

        int gcd = 0;
        boolean solved = false;
        while (!solved) {

            if (x % y == 0) {

                gcd = y;
                solved = true;

            }
            else if (y % x == 0) {

                gcd = x;
                solved = true;

            }
            else if (x > y){

                x = x % y;

            }
            else if (y > x) {

                y = y % x;

            }

        }
        System.out.println("Greatest common denominator: " + gcd);

    }
    /*

    Exercise 1.3.29

        Write a program that takes one command line argument N and prints out an N-by-N table such that three is an * in row i and column j if the gcd of i and j is 1 (i and j are relatively prime) and a space in that position otherwise

     */
    public void oneThreeTwentynine(int N) {

        int i = 1; //Row
        int j; //Column
        while (i <= N) {

            j = 1;
            while (j <= N) {

                boolean gcdSolved = false;
                int gcd = 0;
                int y = i;
                int x = j;
                while (!gcdSolved) {

                    if (y % x == 0) {

                        gcd = x;
                        gcdSolved = true;

                    } else if (x % y == 0) {

                        gcd = y;
                        gcdSolved = true;

                    } else if (y > x) {

                        y = y % x;

                    } else if (x > y) {

                        x = x % y;

                    }

                }
                if (gcd == 1) {

                    System.out.print("*");

                }
                else {

                    System.out.print(" ");

                }
                j++;

            }
            System.out.println();
            i++;

        }

    }
    /*

        Exercise 1.3.33

            The International Standard Book Number (ISBN) is a 10 digit code that uniquely specifies a book. The rightmost digit is a checksum that can be determined from the other 9 digits, from the condition that d1 + 2d2 + 2d3 + ... + 10d10 must be a multiple of 11 (here di denotes the ith digit from the right. The checksum digit di can be any value 0 to 10. The ISBN convention is to use the character 'X' to denote 10. Example: the checksum digit to 020131452 is 5 since 5 is the only value of x between 0 and 10 for which 10*0 + 9 * 2 + 8 * 0 + 7 * 1 + 6 * 3 + 5 * 1 + 4 * 4 + 3 * 5 + 2 * 2 + 1 * x is a multiple of 11. Write a program that takes a 9-digit integer as a command-line argument, computes the checksum, and prints out the ISBN number.
     */
    public void oneThreeThirtythree(String N) {

        if (N.length() > 9) {

            System.out.println("Please only enter a nine digit number");
            System.out.println("You may have tried to put 10 as a character. Instead, use X");
            return;

        }
        int tenthChar;
        int ninthChar;
        int eighthChar;
        int seventhChar;
        int sixthChar;
        int fifthChar;
        int fourthChar;
        int thirdChar;
        int secondChar;
        int checkSumFinder;
        String checkSum;
        if (N.charAt(0) == 'X' || N.charAt(0) == 'x') {

            tenthChar = 10;

        }
        else {

            tenthChar = N.charAt(0) - 48;

        }
        if (N.charAt(1) == 'X' || N.charAt(1) == 'x') {

            ninthChar = 10;

        }
        else {

            ninthChar = N.charAt(1) - 48;

        }
        if (N.charAt(2) == 'X' || N.charAt(2) == 'x') {

            eighthChar = 10;

        }
        else {

            eighthChar = N.charAt(2) - 48;

        }
        if (N.charAt(3) == 'X' || N.charAt(3) == 'x') {

            seventhChar = 10;

        }
        else {

            seventhChar = N.charAt(3) - 48;

        }
        if (N.charAt(4) == 'X' || N.charAt(4) == 'x') {

            sixthChar = 10;

        }
        else {

            sixthChar = N.charAt(4) - 48;

        }
        if (N.charAt(5) == 'X' || N.charAt(5) == 'x') {

            fifthChar = 10;

        }
        else {

            fifthChar = N.charAt(5) - 48;

        }
        if (N.charAt(6) == 'X' || N.charAt(6) == 'x') {

            fourthChar = 10;

        }
        else {

            fourthChar = N.charAt(6) - 48;

        }
        if (N.charAt(7) == 'X' || N.charAt(7) == 'x') {

            thirdChar = 10;

        }
        else {

            thirdChar = N.charAt(7) - 48;

        }
        if (N.charAt(8) == 'X' || N.charAt(8) == 'x') {

            secondChar = 10;

        }
        else {

            secondChar = N.charAt(8) - 48;

        }
        checkSumFinder = 11 - ((tenthChar * 10 + ninthChar * 9 + eighthChar * 8 + seventhChar * 7 + sixthChar * 6 + fifthChar * 5 + fourthChar * 4 + thirdChar * 3 + secondChar * 2) % 11);
        if (checkSumFinder == 10) {

            checkSum = "X";

        }
        else {

            checkSum = Integer.toString(checkSumFinder);

        }
        System.out.println("ISBN + Checksum: " + N + checkSum);

    }
    //DATE 2/7/2018
    /*

    Exercise 1.3.34

        Counting primes. Write an exercise that takes a command-line argument N and finds the number of primes less than or equal to N. Use it to print out the number of primes less than or equal to 10 million. Note: if you are not careful, your program may not finish in a reasonable amount of time.

     */
    public void oneThreeThirtyfour(int N) {

        while (N > 1) {

            int nDivisor = N - 1;
            while (true) {

                if (nDivisor == 1) {

                    System.out.println(N);
                    break;

                }
                if (N % nDivisor == 0) {

                    break;

                }
                nDivisor--;

            }
            N--;

        }
        System.out.println(1);

    }
    /*

    Exercise 1.3.35

        2D random walk. A two-dimensional random walk simulates the behavior of a particle moving in a grid of points. At each step, the random walker moves north, south, east, or west with probability equal to 1/4, independent of the previous moves. Write a program that takes a command-line variable N and estimates how long it will take a random walker to hit the boundary of a 2N-by-2N square centered at the starting point.

     */
    public void oneThreeThirtyfive(int N){

        int trials = 0;
        int totalMoves = 0;
        while(trials  < 100) {

            int moves = 0;
            int x = 0;
            int y = 0;
            while (x != N && x != -N && y != N && y != -N) {

                double randomDirection = Math.random();
                if (randomDirection >= 0 && randomDirection <= 0.25) {

                    x++;

                }
                else if (randomDirection >= 0.26 && randomDirection <= 0.5){

                    x--;

                }
                else if (randomDirection >= 0.51 && randomDirection <= 0.75) {

                    y++;

                }
                else if (randomDirection >= 0.76 && randomDirection <= 1) {

                    y--;

                }
                moves++;

            }
            totalMoves = totalMoves + moves;
            trials++;


        }
        System.out.println("Average Number of moves: " + totalMoves / trials);


    }
    /*

    Exercise 1.3.39

        Pepys problem. In 1693 Samuel Pepys asked Isaac Newton which was more likely: Getting 1 at least once when rolling a fair die six times or getting 1 at least twice when rolling it 12 times. Write a program that could have provided Newton with a quick answer.

     */
    public void oneThreeThirtynine() {

        int option1Wins = 0;
        int option2Wins = 0;
        for (int option1Trials = 0; option1Trials <= 100; option1Trials++) {

            for (int option1Rolls = 0; option1Rolls <= 6; option1Rolls++) {

                if (ThreadLocalRandom.current().nextInt(1, 6) == 1) {

                    option1Wins++;
                    break;

                }

            }

        }
        for (int option2Trials = 0; option2Trials <= 100; option2Trials++) {

            int onesRolled = 0;
            for (int option2Rolls = 0; option2Rolls <= 12; option2Rolls++) {

                if (onesRolled == 2) {

                    option2Wins++;
                    break;

                }
                if (ThreadLocalRandom.current().nextInt(1, 6) == 1) {

                    onesRolled++;

                }

            }

        }
        System.out.println("Chance of option 1: " + option1Wins + "%");
        System.out.println("Chance of option 2: " + option2Wins + "%");

    }
    //DATE 2/12/2018
    /*

    Exercise 1.3.41

        Median-of-5. Write a program that takes five rdistinct integers from the command line and prints the median value (the value such that two of the others are smaller and two are are larger). Extra credit: Solve the problem with a program that compares values fewer than seven times.

     */
    public void oneThreeFourtyone(int intOne, int intTwo, int intThree, int intFour, int intFive) {

        boolean intOneTaken = false;
        boolean intTwoTaken = false;
        boolean intThreeTaken = false;
        boolean intFourTaken = false;
        boolean intFiveTaken = false;
        int smallest = Math.min(Math.min(Math.min(Math.min(intOne, intTwo), intThree), intFour), intFive);
        int largest = Math.max(Math.max(Math.max(Math.max(intOne, intTwo), intThree) , intFour), intFive);
        int secondSmallest;
        int secondLargest;
        int median;
        if (intOne == smallest && intTwo == largest|| intOne == largest && intTwo == smallest) {

            intOneTaken = true;
            intTwoTaken = true;

        }
        else if (intOne == smallest && intThree == largest || intOne == largest && intThree == smallest) {

            intOneTaken = true;
            intThreeTaken = true;

        }
        else if (intOne == smallest && intFour == largest || intOne == largest && intFour == smallest) {

            intOneTaken = true;
            intFourTaken = true;

        }
        else if (intOne == smallest && intFive == largest || intOne == largest && intFive == smallest) {


            intOneTaken = true;
            intFiveTaken = true;

        }
        else if (intTwo == smallest && intThree == largest || intTwo == largest && intThree == smallest) {

            intTwoTaken = true;
            intThreeTaken = true;

        }
        else if (intTwo == smallest && intFour == largest || intTwo == largest && intFour == smallest) {

            intTwoTaken = true;
            intFourTaken = true;

        }
        else if (intTwo == smallest && intFive == largest || intTwo == largest && intFive == smallest) {

            intTwoTaken = true;
            intFiveTaken = true;

        }
        else if (intThree == smallest && intFour == largest || intThree == largest && intFour == smallest) {

            intThreeTaken = true;
            intFourTaken = true;

        }
        else if (intThree == smallest && intFive == largest || intThree == largest && intFive == smallest) {

            intThreeTaken = true;
            intFiveTaken = true;

        }
        else if (intFour == smallest && intFive == largest || intFour == largest && intFive == smallest) {

            intFourTaken = true;
            intFiveTaken = true;

        }
        else {

            System.out.println("Something went wrong (Error Code 2)");
            return;

        }
        if (intOneTaken && intTwoTaken) {

            secondSmallest = Math.min(Math.min(intThree, intFour), intFive);
            secondLargest =  Math.max(Math.max(intThree, intFour), intFive);
            median = intThree + intFour + intFive - secondSmallest - secondLargest;

        }
        else if (intOneTaken && intThreeTaken){

            secondSmallest = Math.min(Math.min(intTwo, intFour), intFive);
            secondLargest = Math.max(Math.max(intTwo, intFour), intFive);
            median = intTwo + intFour + intFive - secondSmallest - secondLargest;

        }
        else if (intOneTaken && intFourTaken) {

            secondSmallest = Math.min(Math.min(intTwo, intThree), intFive);
            secondLargest =  Math.max(Math.max(intTwo, intThree), intFive);
            median = intTwo + intThree + intFive - secondSmallest - secondLargest;

        }
        else if (intOneTaken && intFiveTaken) {

            secondSmallest = Math.min(Math.min(intTwo, intThree), intFour);
            secondLargest =  Math.max(Math.max(intTwo, intThree), intFour);
            median = intTwo + intThree+ intFour - secondSmallest - secondLargest;

        }
        else if (intTwoTaken && intThreeTaken) {

            secondSmallest = Math.min(Math.min(intOne, intFour), intFive);
            secondLargest =  Math.max(Math.max(intOne, intFour), intFive);
            median = intOne + intFour + intFive - secondSmallest - secondLargest;

        }
        else if (intTwoTaken && intFourTaken) {

            secondSmallest = Math.min(Math.min(intOne, intThree), intFive);
            secondLargest =  Math.max(Math.max(intOne, intThree), intFive);
            median = intOne + intThree + intFive - secondSmallest - secondLargest;

        }
        else if (intTwoTaken && intFiveTaken) {

            secondSmallest = Math.min(Math.min(intOne, intThree), intFour);
            secondLargest =  Math.max(Math.max(intOne, intThree), intFour);
            median = intOne + intThree + intFour - secondSmallest - secondLargest;

        }
        else if (intThreeTaken && intFourTaken) {

            secondSmallest = Math.min(Math.min(intOne, intTwo), intFive);
            secondLargest =  Math.max(Math.max(intOne, intTwo), intFive);
            median = intOne + intTwo + intFive - secondSmallest - secondLargest;

        }
        else if (intThreeTaken && intFiveTaken) {

            secondSmallest = Math.min(Math.min(intOne, intTwo), intFour);
            secondLargest =  Math.max(Math.max(intOne, intTwo), intFour);
            median = intOne + intTwo + intFour - secondSmallest - secondLargest;

        }
        else if (intFourTaken && intFiveTaken) {

            secondSmallest = Math.min(Math.min(intOne, intTwo), intThree);
            secondLargest =  Math.max(Math.max(intOne, intTwo), intThree);
            median = intOne + intTwo + intThree - secondSmallest - secondLargest;

        }
        else {

            System.out.println("Something went wrong (Error Code 3)");
            return;
        }
        System.out.println(smallest);
        System.out.println(secondSmallest);
        System.out.println(median);
        System.out.println(secondLargest);
        System.out.println(largest);

    }
    /*

    Exercise 1.3.42

        Sorting three numbers. Suppose that the variables a, b, c, and t are all of the same numeric primitive type. Prove that the following code puts a, b, and c in ascending order.

            if (a > b) { t = a; a = b; b = t; }
            if (a > c} { t = a; a = c; c = t; }
            if (b > c) { t = b; b = c; c = t; }

     */
    public void oneThreeFourtytwo(double a, double b, double c) {

        double t;
        if (a > b) {

            t = a;
            a = b;
            b = t;

        }
        if (a > c) {

            t = a;
            a = c;
            c = t;

        }
        if (b > c) {

            t = b;
            b = c;
            c = t;

        }
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }
    /*

    Exercise 1.3.43

        Chaos. Write a program to study the following simple model for population growth, which might be applied to study fish in a pond, bacteria in a test tube, or any of  a host of similar situations. We suppose that the population ranges from 0 (extinct) to 1 (Maximum population that can be sustained). If the population at time t is x, then we suppose the population at time t + 1 to be rx(1 - x), where the argument r, known as the fecundity parameter, controls the rate of growth. Start with a small population --say, x = 0.01 -- and study the result of iterating the model, for various values of r. For which values of r does the population stabilize at x = 1 - 1/r? Can you say anything about the population when r is 3.5? 3.8? 5?

     */
    public void oneThreeFourtythree(double r) {

        double x = 0.1;
        for (int asterisks = 0; asterisks < x * 100; asterisks++) {

            System.out.print("*");

        }
        System.out.println();
        for (int t = 1; t <= 1000000; t++) {

            x = r * x * (1 - x);
            for (int asterisks = 0; asterisks < x * 100; asterisks++) {

                System.out.print("*");

            }
            System.out.println();
            /*if (x < 0.01) {

                System.out.println("Population soon to be extinct");
                break;

            }
            if (x > 1) {

                System.out.println("Population limit reached");
                break;

            }*/

        }
        System.out.println("Final Population: " + x);

    }
    //DATE 2/21/2018
    /*

    Exercise 1.4.1

        Write a program that declares and initializes an array of a[] of size 1000 and accesses a[1000]. Does your program compile? What happens when you run it?

        It gives an out of bounds exception, because arrays start at 0, so the array is 0 to 999, and 1000 is more than 999

     */
    public void oneFourOne() {

        int[] a = new int[1000];
        System.out.println(a[1000]);

    }
    /*

    Exercise 1.4.2

        Describe and explain what happens when you try to compile a program with the following statement:

            int N = 1000;
            int[] a = new int[N * N * N * N];

        It gives a negative array size exception, as 1000 * 1000 * 1000 * 1000 exceeds the integer value limit, pushing it into negatives

     */
    public void oneFourTwo() {

        int N = 1000;
        int[] a = new int[N * N * N * N];

    }
    //DATE 2/22/18
    public void oneFourFour() {

        String placeHolder;
        String[] array = {"Item1", "Item2", "Item3", "Item4", "Item5", "Item6", "Item7", "Item8", "Item9", "Item10"};
        for (int i = 0; i < array.length / 2; i++) {

            placeHolder = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = placeHolder;

        }
        for (String arrayLoop : array) {

            System.out.println(arrayLoop);

        }

    }
    /*

    Exercise 1.4.5

        What is wrong with the following code fragment?

            int[] a;
            for (int i = 0; i < 10; i++)
                a[i] = i * i

        The fragment doesn't allocate memory for the array

     */
    /*

    Exercise 1.4.6

        Write a code that prints the contents of a two-dimensional boolean array, using * to represent true and a space to represent false. Include row and column numbers.

     */
    public void oneFourSix() {


        boolean[][] booleanArray = {

                {true, false, true, false, true},
                {false, true, false, true, false},
                {true, false, true, false, true},
                {false, true, false, true, false},
                {true, false, true, false, true}

        };
        int row;
        int column;
        System.out.print(" ");
        for (column = 0; column < booleanArray[0].length; column++) {

            System.out.print(column);

        }
        System.out.println();
        for (row = 0; row < booleanArray.length; row++) {

            System.out.print(row);
            for (column = 0; column < booleanArray[row].length; column++) {

                if (booleanArray[row][column]) {

                    System.out.print("*");

                }
                else {

                    System.out.print(" ");

                }

            }
            System.out.println();

        }

    }
    /*

    Exercise 1.4.7

        What does the following code fragment print

            int[] a = new int[10];
            for (int i = 0; i < 10; i++) {
                a[i] = 9 - i;
            }
            for (int i = 0; i < 10; i++) {
                a[i] = a[a[i]];
            }
            for (int i = 0; i < 10; i++) {
                System.out.println(a[i]);
            }

        It prints a list of numbers going up to 4 and then back down.

     */
    /*

    Exercise 1.4.8

        What values does the following code put in the array a[]?

            int N = 10;
            int[] a = new int [N];
            a[0] = 1;
            a[1] = 1;
            for (int i = 2; i < N; i++) {

                a[i] = a[i - 1] + a[i - 2]

            }

        It prints 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, the Fibonacci

     */
    /*

    Exercise 1.4.9

        What does the following code fragment print?

            int[] a = {1, 2, 3};
            int[] b = {1, 2, 3};
            System.out.println(a == b);

        It prints false, because a and b are not the same array

     */
    /*

    Exercise 1.4.10

        Write a program that takes an argument and deals that many poker hands (five cards each) from a shuffled deck, separated by blank lines.

     */
    public void oneFourTen(int numberOfHands) {

        String[] deck = {

                "Ace of Hearts", "Ace of Diamonds", "Ace of Spades", "Ace of Clubs",
                "Two of Hearts", "Two of Diamonds", "Two of Spades", "Two of Clubs",
                "Three of Hearts", "Three of Diamonds", "Three of Spades", "Three of Clubs",
                "Four of Hearts", "Four of Diamonds", "Four of Spades", "Four of Clubs",
                "Five of Hearts", "Five of Diamonds", "Five of Spades", "Five of Clubs",
                "Six of Hearts", "Six of Diamonds", "Six of Spades", "Six of Clubs",
                "Seven of Hearts", "Seven of Diamonds", "Seven of Spades", "Seven of Clubs",
                "Eight of Hearts", "Eight of Diamonds", "Eight of Spades", "Eight of Clubs",
                "Nine of Hearts", "Nine of Diamonds", "Nine of Spades", "Nine of Clubs",
                "Ten of Hearts", "Ten of Diamonds", "Ten of Spades", "Ten of Clubs",
                "Jack of Hearts", "Jack of Diamonds", "Jack of Spades", "Jack of Clubs",
                "Queen of Hearts", "Queen of Diamonds", "Queen of Spades", "Queen of Clubs",
                "King of Hearts", "King of Diamonds", "King of Spades", "King of Clubs"

        };
        for (int i = 0; i < 52; i++) {

            int randomNumOne = ThreadLocalRandom.current().nextInt(0, 52);
            int randomNumTwo = ThreadLocalRandom.current().nextInt(0, 52);
            String holderVar = deck[randomNumOne];
            deck[randomNumOne] = deck[randomNumTwo];
            deck[randomNumTwo] = holderVar;

        }
        int cardNumber = 0;
        for (int i = 0; i < numberOfHands; i++) {

            for (int numberOfCardsInHand = 0; numberOfCardsInHand < 5; numberOfCardsInHand++, cardNumber++) {

                System.out.println(deck[cardNumber]);

            }
            System.out.println();

        }

    }
    /*

    Exercise 1.4.11

        Write code to create a two-dimensional array b[][] that is a copy of an existing two-dimensional array, under each of the following assumptions:

            a. a[][] is square
            b. a[][] is rectangular
            c. a[][] may be ragged

        You solution to b should work for a, and your solution to c should for both b and a, but your code should get progressively more complicated.

     */
    public void oneFourEleven() {

        int[][] a = {

                {1},
                {2, 3},
                {4},
                {5, 6}

        };
        int row;
        int column;
        int maxLength = 0;
        for (row = 0; row < a.length; row++) {

            maxLength = Math.max(maxLength, a[row].length);

        }
        int[][] b = new int[a.length][maxLength];
        for (row = 0; row < a.length; row++) {

            for (column = 0; column < a[row].length; column++) {

                b[row][column] = a[row][column];

            }

        }
        for (row = 0; row < a.length; row++) {

            for (column = 0; column < a[row].length; column++) {

                System.out.print(a[row][column] + " ");

            }
            System.out.println();

        }
        System.out.println();
        for (row = 0; row < b.length; row++) {

            for (column = 0; column < a[row].length; column++) {

                System.out.print(b[row][column] + " ");

            }
            System.out.println();

        }
    }
    /*

    Exercise 1.4.12

        Write a program to print the transposition (rows and columns changed) of a square two.

     */
    public void oneFourTwelve() {

        int[][] array = {

                {0, 1, 2, 3},
                {4, 5, 6, 7},
                {8, 9, 10, 11},
                {12, 13, 14, 15}

        };
        int row;
        int column;
        for (row = 0; row < array.length; row++) {

            for (column = 0; column < array[row].length; column++) {

                if (column > row) {

                    int holder = array[row][column];
                    array[row][column] = array[column][row];
                    array[column][row] = holder;

                }

            }

        }
        for (row = 0; row < array.length; row++) {

            for (column = 0; column < array[row].length; column++) {

                System.out.print(array[row][column] + " ");

            }
            System.out.println();

        }

    }
    /*

    Exercise 1.4.13

        Same code as exercise 1.4.12

     */
    /*

    Exercise 1.4.14

        Write a program that takes an integer N from the command line and creates an N-by-N boolean array a[][] such that a[i][j] is true if i and j are relatively prime (they have no common factors), and false otherwise. Use your solution to exercise 1.4.6 to print the array. Hint: Use sieving.

     */
    public void oneFourFourteen(int N) {

        boolean[][] a = new boolean[N][N];
        int i = 0; //Row
        int j; //Column
        while (i < N) {

            j = 0;
            while (j < N) {

                boolean gcdSolved = false;
                int gcd = 0;
                int y = i + 1;
                int x = j + 1;
                while (!gcdSolved) {

                    if (y % x == 0) {

                        gcd = x;
                        gcdSolved = true;

                    } else if (x % y == 0) {

                        gcd = y;
                        gcdSolved = true;

                    } else if (y > x) {

                        y = y % x;

                    } else if (x > y) {

                        x = x % y;

                    }

                }
                if (gcd == 1) {

                    a[i][j] = true;

                }
                else {

                    a[i][j] = false;

                }
                j++;

            }
            i++;

        }
        int row;
        int column;
        for (row = 0; row < a.length; row++) {

            for (column = 0; column < a[row].length; column++) {

                if (a[row][column]) {

                    System.out.print(true + "   ");

                }
                else {

                    System.out.print(false + "   ");

                }

            }
            System.out.println();

        }

    }
    //DATE 3/6/2018
    /*

    Exercise 1.4.20

        Dice simulation. The following code computes the exact probability distribution for the sum of two dice.

            double[] dist = new double [13];
            for (int i = 1; i <= 6; i++) {

                for (int j = 1; j <= 6; j++) {

                    dist[i + j] += 1.0;

                }

            }
            for (int k = 1; k <= 12; k++) {

                dist[k] /= 36.0;

            }

        The value dist[k] is the probability that the dice sum to k. Run experiments to validate this calculation simulating N dice throws, keeping track of the frequencies of occurrence of each value when you have to compute the sum of two random integers between 1 and 6. How large does N have to be before your empirical results match the exact results to three decimal places?

        Around 10 million

     */
    public void oneFourTwenty(int N) {

        double[] dist = new double [13];
        for (int i = 1; i <= 6; i++) {

            for (int j = 1; j <= 6; j++) {

                dist[i + j] += 1.0;

            }

        }
        for (int k = 1; k <= 12; k++) {

            dist[k] /= 36.0;

        }
        System.out.println("Calculated probabilities (Going for 0 to 12)");
        for (int i = 0; i <= dist.length - 1; i++) {

            System.out.println(dist[i] * 100);

        }
        System.out.println();
        double[] occurrences = {

                0, 0, 0, 0,
                0, 0, 0, 0,
                0, 0, 0, 0,
                0

        };
        for (int i = 1; i <= N; i++) {

            int dice1 = ThreadLocalRandom.current().nextInt(1, 7);
            int dice2 = ThreadLocalRandom.current().nextInt(1, 7);
            occurrences[dice1 + dice2]++;

        }
        System.out.println("Tested percentages (Going from 0 to 12)");
        for (int i = 0; i <= 12; i++) {

            System.out.println(occurrences[i] / N * 100);

        }

    }
    /*

    Exercise 1.4.21

        Longest plateau Given an array of integers, find the length and location of the longest contiguous sequence of equal values where the values of the elements just before and after the sequence are smaller.

     */
    public void oneFourTwentyone() {

        int startLocation = 0;
        int endLocation = 0;
        int possibleStartLocation;
        int possibleEndLocation;
        int[] integers = {

                2, 1, 3, 4, 1,
                2, 2, 2, 1, 4,
                5, 5, 5, 5, 4,
                5, 5, 5, 5, 6,

        };
        for (int i = 1; i < integers.length - 1; i++) {

            possibleStartLocation = i;
            if (integers[i - 1] > integers[i]) {

                continue;

            }
            int k = i;
            while (integers[k + 1] == integers[k]) {

                k++;

            }
            possibleEndLocation = k;
            if (integers[possibleEndLocation  + 1] > integers[possibleEndLocation]) {

                continue;

            }
            if (possibleEndLocation - possibleStartLocation > endLocation - startLocation) {

                startLocation = possibleStartLocation;
                endLocation = possibleEndLocation;

            }


        }
        System.out.println("Start Location: " + startLocation);
        System.out.println("End Location: " + endLocation);
        System.out.println("Length: " + (endLocation - startLocation + 1));

    }
    /*

    Empirical shuffle check. Run computational experiments to check that our shuffling code works as advertised. Write a program that takes command-line arguments M and N, does N shuffles of an array size M that is initialized with a[i] = i before each shuffle, and prints an M-by-M table such that row i gives the number of times i wound up in the position for j for all j. All entries in the array should be close to N/M.

     */
    public static void main(String args[]) {

        new Exercises();

    }

}