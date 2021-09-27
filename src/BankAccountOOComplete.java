/**

 * This Object-Oriented" version of the "BankAccount" class

 * is a simple introduction to Constructors / 

 * private data members / static vs. not static / and the

 * "toString" method. 

 *

 * SKELETON FOR LAB TEST.

 *

 * @author Raymond Lister

 * @version September 2015;

 */



public class BankAccountOOComplete

{

    private static double interestRate = 0.0;



    // Note: the interest rate is "static". That is, all

    //    bank accounts have the same interest rate.



    /*

     * The instance variables follow (i.e. not static). These

     * are also called "fields" or "private data members".

     */



    private final int accountNumber;

    // The "final" reserved word indicates that the first

    // value that this variable receives will be its final

    // value; it cannot change. See http:// ...

    // en.wikipedia.org/wiki/Final_(Java)#Final_variables

    // NOTE: "final" is NOT the same thing as "static".

    //    "final" means "constant across time"

    //    "static" means "constant across objects"



    private String accountName;



    private double balance; // e.g. 1.27 means $1.27



    /**

     *  The constructors now follow

     */



    /**

     * @param  num number for the account

     * @param  name name of the account

     */

    public BankAccountOOComplete (int num, String name)

    {
        accountName = name;
        accountNumber = num;


    }



    /**

     * @param  num  number for the account

     * @param  name  name of the account

     * @param  bal  opening balance

     */

    public BankAccountOOComplete(int num, String name, double bal)

    {

        accountNumber = num;
        accountName = name;
        balance = bal;

    }



    /**

     * @return   The account number

     */

    public int getAccountNumber()

    {
        return accountNumber;

    }



    /**

     * @return  The name for the account

     */

    public String getAccountName()

    {
        return accountName;
    }



    /**

     * @param  newName The new name for the account

     */

    public void setAccountName(String newName)

    {
        accountName = newName;
    }



    /**

     * @return   The account balance

     */

    public double getBalance()

    {
        return balance;
    }



    /**

     * @param  amount To be added to the balance

     */

    public boolean deposit(double amount)

    {
            if(amount>0) {
                balance += amount;
                return true;
            }
            else{
                return false;
            }

    }



    /**

     * The withdrawal should be refused if the withdrawal

     * would result in a negative balance.

     *

     * @param  amount The amount to be withdrawn

     *

     * @return new balance or -1.0 if withdrawal refused

     */

    public double withdraw(double amount)

    {
        if(amount<balance)
        {
            balance -= amount;
            return balance;
        }

        return -1;

    }



    /**

     * @return  The interest rate

     */

    public double getInterestRate()

    {return interestRate;
    }



    /**

     * @param  newInterest  The new interest rate

     */

    public boolean setInterestRate(double newInterest)

    {
        if(!(newInterest <0) ){

            interestRate = newInterest;

            return true;
        }
        else
            return false;
    }



    /**

     * It is common practise to supply a "toString" method

     * in an object-oriented class. In fact, if you don't

     * explicitly supply such a method, Java produces an

     * implicit, simplistic "toString" method which produces

     * a String like "..O@1edd1f0". The word before

     * the "@" is the name of the class. The hexadecimal

     * number after the "@" is called the objects "hash code".

     *

     *@return  The state of this "instance of class BankAccount" or "object", the accountNumber, accountName and balance

     */

    public String toString()

    {
return
        "accountNumber = "+accountNumber+

        ", accountName = "+accountName+

        ", balance = "+balance;

    }

    public static void main(String[] args){

        BankAccountOOComplete bankAccountOOComplete = new BankAccountOOComplete(12345678, "Mr John Doe");
        bankAccountOOComplete.setInterestRate(7.25);
        bankAccountOOComplete.deposit(5000);

        System.out.println(bankAccountOOComplete.toString());

    }



} // class BankAccountOOComplete