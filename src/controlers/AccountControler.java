/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlers;

import entitis.Bank;
import entitis.BankAccount;
import entitis.ToLowBalanceException;

/**
 *
 * @author Алёшечка
 */
public class AccountControler {
    private Bank bank;

    public AccountControler(Bank bank) {
        this.bank = bank;
    }
    
    
    public boolean transfer(int id1, int id2, double sum) throws ToLowBalanceException{
        BankAccount account1 = bank.findAccountById(id1);
        BankAccount account2 = bank.findAccountById(id2);
        boolean b3 = false;       
        {
            account1.credit(sum);
            account2.daposite(sum);
            boolean b1 = this.bank.saveAccount(account1);
            boolean b2 = this.bank.saveAccount(account2);
            if(b1 == true & b2 == true){
                b3 = true;
            }
        }
        return b3;
    }
    
    public BankAccount findAccountById(int id){
        return bank.findAccountById(id);
    }
}
