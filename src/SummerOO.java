/**
 * This Object-Oriented version of the "Summer" class
 * <p>
 * is a simple introduction to constructors /
 * <p>
 * private data members / static vs. not static / and the
 * <p>
 * "toString" method.
 * <p>
 * <p>
 * <p>
 * SKELETON FOR LAB TEST.
 *
 * @author Raymond Lister
 * @version April 2015;
 */

public class SummerOO {

    static int numSummers = 0;

    // The above variable is used to count the number of

    // instances of the class SummerOO that have been created.

    // (i.e. the number of objects that have been created.)

    //

    // Note: "numSummers" is declared as "static". It is a

    //    variable that belongs to the class, not an

    //    individual object.



    /*

     * The instance variables follow (i.e. not static). These

     * are also called "fields" or "data members".

     * Each object has its own copy of these variables.

     */


    int sum;  // sum of all integers received

    int count; // number of integers received


    /**
     * The constructors now follow. There are two constructors.
     * Both constructors have the same name, since all
     * constructors always have the same name as the class.
     * The constructors are distinguishable because one of the
     * constructors requires zero parameters while the other
     * constructor requires a single integer parameter.

     */


    /**
     * This is a "dangerous" constructor, since the average is
     * <p>
     * undefined when the object is created.
     * <p>
     * <p>
     * <p>
     * This constructor and the method reset()
     * <p>
     * are similar. The differences are that:
     * <p>
     * (1) The constructor can only be used once, when the
     * <p>
     * object is created.
     * <p>
     * (2) The method reset() can't create an object, but it can
     * <p>
     * be used whenever we like, as many times as we like,
     * <p>
     * after the object has been created.
     */

    public SummerOO() {
        sum = 0;
        count = 0;
        numSummers++;

    }


    /**
     * This is a safer constructor, since the average is
     * <p>
     * well defined when the object is created.
     * <p>
     * <p>
     * <p>
     * This constructor and the method reset(int firstNumber)
     * <p>
     * are similar. The differences are that:
     * <p>
     * (1) The constructor can only be used once, when the
     * <p>
     * object is created.
     * <p>
     * (2) The method reset() can't create an object, but can
     * <p>
     * be used whenever we like, as many times as we like,
     * <p>
     * after the object has been created.
     *
     * @param firstNumber The first number of a series
     */

    public SummerOO(int firstNumber) {

        numSummers++;


        sum += firstNumber;

        count++;

    }


    /**
     * Receives and processes a new number in the series.
     * <p>
     * <p>
     * <p>
     * NOTE TO STUDENTS: When studying this code, experiment
     * <p>
     * by adding "static" into "public void putNumber".
     * <p>
     * When you compile, you'll get an error message ...
     * <p>
     * <p>
     * <p>
     * "non-static variable sum cannot be referenced from a
     * <p>
     * static context".
     * <p>
     * <p>
     * <p>
     * In other words a "static" method (which belongs to the
     * <p>
     * class, not an individuaual object), can't access the
     * <p>
     * variables in an object. This is for two reasons:
     * <p>
     * (1) If we haven't created ANY objects yet, then there is
     * <p>
     * no variable "sum" to access!
     * <p>
     * (2) If multiple objects ("instances") of this
     * <p>
     * class exist, then there are multiple versions of
     * <p>
     * the "sum" variable, one version of "sum" in each
     * <p>
     * object. The static method (which belongs to the
     * <p>
     * class) cannot choose from the many versions of "sum".
     * <p>
     * The same applies to the variable "count". The error
     * <p>
     * message singled out "sum" because it occured before
     * <p>
     * "count".
     *
     * @param newNumber a new number in the series
     */

    public /* not static! */ void putNumber(int newNumber) {

        // This method is complete. No changes are required to

        // "putNumber" in the lab test.


        sum = sum + newNumber; // could write "sum += newNumber"

        count = count + 1;   // could write "++count"

    }



    /*

     * A number of the methods from the "static" version

     * have been left out of this object-oriented version

     * because you've already done that.

     *

     * All those methods would appear in a complete

     * version of this object-oriented version of the

     * class, with the *ONLY* change being that the reserved

     * word "static" would be deleted from the method

     * header.

     *

     * The method putNumber() has been copied across to support

     * the experiment of adding "static" to its header,

     */


    /**
     * Note that this is a static method.
     *
     * @return The number of objects that have been created.
     */

    public static int getNumSummers() {

        return numSummers;
    }


    /**
     * It is common practise to supply a "toString" method
     * <p>
     * in an object-oriented class. In fact, if you don't
     * <p>
     * explicitly supply such a method, Java produces an
     * <p>
     * implicit, simplistic "toString" method which produces
     * <p>
     * a String like "..O@1edd1f0". The word before
     * <p>
     * the "@" is the name of the class. The hexadecimal
     * <p>
     * number after the "@" is called the objects "hash code".
     * <p>
     * <p>
     * <p>
     * Note: Method "toString" method is NOT "static". It
     * <p>
     * can't be static, since the values in the data members
     * <p>
     * may vary between objects of this class.
     *
     * @return The state of this "class instance" / "object"
     */

    public String toString() {

        return "sum = " + sum + " count = " + count;

    }


    /**
     * The main method is already complete, and you
     * <p>
     * don't need to change anything, but it won't
     * <p>
     * hurt anything if you do, as long as it still
     * <p>
     * compiles.
     */

    public static void main(String[] args) {

        SummerOO summer1 = new SummerOO();

        // the above line used the zero parameter constructor.


        summer1.putNumber(17);

        summer1.putNumber(1);


        System.out.println(summer1.toString());

        // in the above line, the ".toString()" can be omitted,

        // to give just ...

        //         System.out.println(summer1);

        //

        // When the name of an object is given where a String

        // is required (and println requires a String), Java

        // automatically calls the "toString()" method of the

        // object.


        // Repeat for a second set of numbers

        System.out.println();


        SummerOO summer2 = new SummerOO(3);

        // above line used the constructor that takes a parameter


        summer2.putNumber(5);

        summer2.putNumber(7);

        System.out.println(summer2);

        // in the above line, Java automatically calls the

        // "toString()" method of the "summer2" object.


    } // method main


} // class SummerOO