package ch.hearc.ig.odi.customeraccount.application;


import ch.hearc.ig.odi.customeraccount.business.Account;
import ch.hearc.ig.odi.customeraccount.business.Bank;
import ch.hearc.ig.odi.customeraccount.business.Customer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author floriane.sapin
 */
public class Application {

    public static void main(String[] args) {
       Bank bank = new Bank(1, "BCF");
       
       //bank.addCustomer(number, null, null);
        
       Customer customer = new Customer(1, "Florane", "Sapin");
        
        Account account1 = new Account("23566", "BCF", 1.2, customer);
        Account account2 = new Account ("23567", "BCF2", 1.2, customer);
        
        customer.addAccount(account1);
        customer.addAccount(account2);
        
        System.out.println("Balance on " + customer.getAccountByNumber("23566").getName() + " " + customer.getAccountByNumber("23566").getBalance());

        customer.getAccountByNumber("23566").credit(300);

        System.out.println("Balance on " + customer.getAccountByNumber("23566").getName() + " " + customer.getAccountByNumber("23566").getBalance());

        customer.getAccountByNumber("23566").transfer(100, customer.getAccountByNumber("23566"), customer.getAccountByNumber("23567"));

        System.out.println("Balance on " + customer.getAccountByNumber("23566").getName() + " " + customer.getAccountByNumber("23566").getBalance());
        System.out.println("Balance on " + customer.getAccountByNumber("23567").getName() + " " + customer.getAccountByNumber("23567").getBalance());
    }

}
