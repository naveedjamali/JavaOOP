/**
 * This Object-Oriented" version of the "BankAccount" class
 * <p>
 * is a simple introduction to Constructors /
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
 * @author Luke Mathieson
 * @version April 2021
 */


public class BankAccountOO {


    public static double interestRate = 0.0;

    // Note: the interest rate is "static". That is, all

    //    bank accounts have the same interest rate.



    /*

     * The instance variables follow (i.e. not static). These

     * are also called "fields" or "private data members".

     */


    public int accountNumber;

    public String accountName;

    public double balance; // e.g. 1.27 means $1.27


    public static void main(String[] args) {

        BankAccountOO.setInterestRate(7.50);


        System.out.println("(Interest rate should be 7.50) Interest rate is " + BankAccountOO.getInterestRate() + ".");


        BankAccountOO bankaccountoo = new BankAccountOO(99998888, "Jack");

        System.out.println("So we created an account for Jack with zero dollars in his bank account under the account number 99998888.");

        System.out.println("");

        System.out.println("");

        System.out.println("For the object created, the account number is: " + bankaccountoo.accountNumber);

        System.out.println("For the object created, the account name is: " + bankaccountoo.accountName);

        System.out.println("For the object created, the balance is: " + bankaccountoo.balance);

        System.out.println("");

        System.out.println("");

        System.out.println("");

        System.out.println("Now we use the constructor which takes three argumants including name, number and initial balance:");


        BankAccountOO bankaccountoo2 = new BankAccountOO(12345678, "Jane", 1000.99);

        System.out.println("So we created an account for Jane with 1000.99 dollars in her bank account under the account number 12345678");

        System.out.println("");

        System.out.println("");

        System.out.println("For the second object created, the account number is: " + bankaccountoo2.accountNumber);

        System.out.println("For the second object created, the account name is: " + bankaccountoo2.accountName);

        System.out.println("For the second object created, the balance is: " + bankaccountoo2.balance);

        System.out.println("");

        System.out.println("");

        System.out.println("");

        System.out.println("Now we use the method toString to print it all in the same line");

        System.out.println("First object: " + bankaccountoo.toString());

        System.out.println("Second object: " + bankaccountoo2.toString());

        System.out.println("");

        System.out.println("");

        System.out.println("Testing withdraw method on Jane's account: Jane's new balance after we withdraw 100.00 is " + bankaccountoo2.withdraw(100.00));

    }

    /**
     *  The constructors now follow

     */


    /**
     * @param num  number for the account
     * @param name name of the account
     */

    public BankAccountOO(int num, String name) {
        if (num > 0) {
            accountNumber = num;
        }
        accountName = name;

    }


    /**
     * @param num  number for the account
     * @param name name of the account
     * @param bal  opening balance
     */

    public BankAccountOO(int num, String name, double bal) {
        accountName = name;
        accountNumber = num;
        balance = bal;

    }



    /*

     * A number of the methods from the "static" version

     * have been left out of this object-oriented version

     * because you've already done that once.

     *

     * Most of those methods would appear in a complete

     * version of this object-oriented version of the

     * class, with the *ONLY* change being that the reserved

     * word "static" would be deleted from the method

     * header.

     *

     * The method setAccountNumber() would definitely NOT

     * be copied across from the static version to this

     * object-oriented version. That's because each object

     * (i.e. instance of BankAccount) represents a unique

     * bank account. The account number set up by the

     * constructor should never change again.

     *

     * The method setAccountName() MIGHT be copied across.

     * That's a business decision. Some banks might allow

     * a customer to change their name. Other banks might

     * only allow a name change by creating a new account.

     * If the account name cannot be changed, then the

     * declaration of private data member "accountName"

     * should have the reserved word "final" added.

     *

     * The method withdraw() has been copied across

     * because:

     * (1) it was provided in its entirety in the

     *   "static" version of the class,

     * (2) to provide an example that "static" is dropped

     *   from the header,

     * (3) to provide a hint as to what changes might be

     *   needed for the other, incomplete methods.

     */


    /**
     * The withdrawal should be refused if the withdrawal
     * <p>
     * would result in a negative balance.
     *
     * @param amount The amount to be withdrawn
     * @return new balance or -1.0 if withdrawal refused
     */

    public double withdraw(double amount) {

        if (balance >= amount) {

            balance = balance - amount;

            return balance;

        } else

            return -1.0;

    }


    /**
     * Note that this is a static method. So a change to the
     * <p>
     * interest rate changes the interest rate for all objects
     * <p>
     * of this class.
     *
     * @param newInterest The new interest rate
     */

    public static void setInterestRate(double newInterest) {

        interestRate = newInterest;

    }


    /**
     * Note that this is a static method.
     *
     * @return The interest rate
     */

    public static double getInterestRate() {

        return interestRate;
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
     * @return The state of this "class instance" or "object"
     */

    public String toString() {

        return "accountNumber = " + accountNumber +

                " accountName = " + accountName +

                " balance = " + balance;

    }


} // class BankAccountOO