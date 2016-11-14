/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author coulh9904
 */
public class BankAccountTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BankAccount A1 = new BankAccount("Lamont", 1234, 100);
        A1.Deposit(100);
        System.out.println("Initial Balance = " + A1.CheckFunds());
    }
}
