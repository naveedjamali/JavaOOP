import javax.sound.midi.SysexMessage;

/**

 * This Object-Oriented version of the "Summer" class

 * is a simple introduction to constructors /

 * private data members / static vs. not static / and the

 * "toString" method.

 *

 * SKELETON FOR LAB TEST.

 *

 * @author Raymond Lister

 * @version September 2015;

 */

public class SummerOOComplete

{

    public static int numSummers = 0;



    // The above variable is used to count the number of

    // instances of the class SummerOO that have been created.

    // (i.e. the number of objects that have been created.)



    /*

     * The instance variables follow (i.e. not static). These

     * are also called "fields" or "private data members".

     * Each object has its own copy of these variables.

     */



    public int sum;   // sum of all integers received

    public int count;  // number of integers received

    public int minimum; // the minimum integer received

    public int maximum; // the maximum integer received



    /**

     * This constructor and the method "reset" are similar.

     * The differences are that:

     * (1) The constructor can only be used once, when the

     *   object is created.

     * (2) The method "reset" can't create an object, but can

     *   be used whenever we like, as many times as we like,

     *   after the object has been created.

     *

     * @param  firstNumber The first number of a series

     */

    public SummerOOComplete(int firstNumber)

    {
        sum += firstNumber;
        count++;
        maximum = firstNumber;
        minimum = firstNumber;
        numSummers++;

    }



    /**

     * Resets with the first number of a new series.

     *

     * @param  firstNumber of a new series

     */

    public void reset(int firstNumber)

    {

        sum = firstNumber;
        count = 1;
        maximum = firstNumber;
        minimum = firstNumber;


    }



    /**

     * Receives and processes a new number in the series.

     *

     * @param newNumber  a new number in the series

     */

    public int putNumber(int newNumber)

    {
        sum += newNumber;
        count++;

        if(newNumber>maximum){
            maximum = newNumber;
        }
        if(newNumber<minimum){
            minimum=newNumber;
        }
        return sum;

    }



    /**

     * @return   The sum of all the numbers received

     */

    public int getSum()

    {
return sum;
    }



    /**

     * @return   The number of integers received.

     */

    public int getCount()

    {
return count;

    }



    /**

     * @return   The minimum of all the numbers received

     */

    public int getMinimum()

    {
return minimum;

    }



    /**

     * @return   The maximum of all the numbers received

     */

    public int getMaximum()

    {
return maximum;

    }



    /**

     * @return   The average of the integers received.

     */

    public double getAverage()

    {

        return sum / count;

    }



    /**

     * @return The number of objects that have been created.

     */

    public int getNumSummers()

    {
        return numSummers;

    }



    /**

     * It is common practise to supply a "toString" method

     * in an object-oriented class. In fact, if you don't

     * explicitly supply such a method, Java produces an

     * implicit, simplistic "toString" method which produces

     * a String like "..O@1edd1f0". The word before

     * the "@" is the name of the class. The hexadecimal

     * number after the "@" is called the objects "hash code".

     *@return  The state of this "instance of Summer" / "object", the sum, count, minimum and maximum

     */

    public String toString()

    {

        return "sum = "+sum+

        ", count = "+count+

        ", minimum = "+minimum+

        ", maximum = "+maximum;

    }



    /**

     * The purpose of this main method is to reinforce the

     * lesson that anything that can be done through a BlueJ

     * menu can also been done in some Java code.

     */

    public static void main(String [] args)

    {

        //create a new instance of the class Summer with first number 3

        // hint: what's required is a bit like int i = 10;

        SummerOOComplete summerOOComplete = new SummerOOComplete(3);


        // give this object another number, 5
        summerOOComplete.putNumber(5);

        //give this object another number, 7
        summerOOComplete.putNumber(7);

        //System.out.println the state of this "instance of Summer" / "object"
        System.out.println(summerOOComplete.toString());


    } // method main

}