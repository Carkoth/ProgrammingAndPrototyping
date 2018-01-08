 public class Exercises {

    public Exercises() {



    }
    public void test(int N) {



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

     Exercise 1.2.10
        Suppose that a is declared as double a = 3.14159. What do each of the following do?
            a. System.out.println(a);
            b. System.out.println(a + 1);
            c. System.out.println(8 / (int) a);
            d. System.out.println(8 / a);
            e. System.out.println((int) (8 / a));

      */
    public static void main(String args[]) {

        new Exercises();
        double a = 3.14159;
        System.out.println();

    }

}