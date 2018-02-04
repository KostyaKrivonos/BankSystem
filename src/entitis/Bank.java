/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entitis;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/**
 *
 * @author Алёшечка
 */
public class Bank {
    private HashSet <BankAccount> accounts;

    public Bank() {
        this.accounts = new HashSet <BankAccount>();
        accounts.add(new BankAccount(256488, "Vasya", 3000));
        accounts.add(new BankAccount(256489, "Petya", 6000));
        accounts.add(new BankAccount(256490, "Vova", 9000));
        accounts.add(new BankAccount(256491, "Masha", 4000));
    }
    
    public BankAccount findAccountById(int id){
        Iterator <BankAccount> iterator = accounts.iterator();
        while(iterator.hasNext()){
            BankAccount account = iterator.next();
            if(account.getId() == id){
                return account;
            }
        }
        return null;
    }  
    
    public boolean saveAccount(BankAccount account){
        accounts.remove(account);
        return accounts.add(account);
    }
}
