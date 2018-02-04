/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entitis;

import java.util.Objects;

/**
 *
 * @author Алёшечка
 */
public class BankAccount {
    private int id;
    private String owner;
    private double balance;

    public BankAccount(int id, String owner, double balance) {
        this.id = id;
        this.owner = owner;
        this.balance = balance;
    }
   
    public double getBalance() {
        return balance;
    }
    public void daposite (double sum){
        balance = balance + sum;
    }
    public void credit (double sum) throws ToLowBalanceException{
        if(sum > balance){
            throw new ToLowBalanceException();
        }
        balance = balance - sum;
        
    }

    public int getId() {
        return id;
    }
    
//    public boolean equals(Object a){
//        return (this.id == ((BankAccount)a).getId());
//    }

    public String getOwner() {
        return owner;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + this.id;
        hash = 31 * hash + Objects.hashCode(this.owner);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final BankAccount other = (BankAccount) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.owner, other.owner)) {
            return false;
        }
        return true;
    }
    
}
