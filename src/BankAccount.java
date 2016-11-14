/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author coulh9904
 */
public class BankAccount {
    //Instance Variables
    private  double Amount = 0;
    private int Pin = 0000;
    private int AccountNumber;
    private String Name;
    
    //Constructor
    //Initial setup that needs to happen before using    
    public BankAccount(String Name, int Pin, double InitBalance){
        Amount = InitBalance;
        this.Name = Name;
        this.Pin = Pin;
    }
    
    
    //Class Methods
    
    public void Withdraw(double Amount){
        if(Amount > 0 && this.Amount >= Amount){
            this.Amount -= Amount;
        }
    }
    
    public void Deposit(double Amount){
        if(Amount > 0){
            this.Amount += Amount;
        }
    }
    
    public double CheckFunds(){
        return this.Amount;
    }
}
