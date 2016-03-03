package ch.hearc.ig.odi.customeraccount.business;

import java.util.*;

public class Customer {

    private Collection<Account> accounts;
    private int number;
    private String firstName;
    private String lastName;

    /**
     *
     * @param number
     */
    public Account getAccountByNumber(String number) {
        Account accountFind;
        accountFind = null;
        for (Account account : accounts) {
            if (account.getNumber() == number) {
                accountFind = account;
            }
        }
        return accountFind;

    }

    public Collection<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(Collection<Account> accounts) {
        this.accounts = accounts;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     *
     * @param number
     * @param name
     * @param rate
     */
    /*ancien code
    public void addAccount(String number, String name, double rate) {
       // Account account = new Account(number, name, rate, this);
        //this.accounts.add(account);

    }*/
    
     public void addAccount(Account account) {
        this.accounts.add(account);
     }

    /**
     *
     * @param number
     * @param firstName
     * @param lastName
     */
    public Customer(int number, String firstName, String lastName) {
        this.number = number;
        this.firstName = firstName;
        this.lastName = lastName;
        accounts = new ArrayList();

    }

}
