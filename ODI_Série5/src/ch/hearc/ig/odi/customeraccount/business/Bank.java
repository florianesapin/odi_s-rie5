package ch.hearc.ig.odi.customeraccount.business;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author stephane.grangier
 */
public class Bank {

    private int number;
    private String name;
    private Map<Integer, Customer> customers;
    private Map<String, Account> accounts;

    public Bank(int number, String name) {
        this.number = number;
        this.name = name;
        this.customers = new HashMap();
        this.accounts = new HashMap();

    }

    public Account getAccountByNumber(String number) {
        return this.accounts.get(number);
    }

    public Customer getCustomerByNumber(int number) {
        return this.customers.get(number);
    }

    public void addCustomer(int number, String fn, String ln) {
        Customer customer = new Customer(number, fn, ln);
        customers.put(number, customer);

    }

    public void addAccount(String number, String name, double rate, Customer customer) {
        Account account = new Account(number, name, rate, customer);
        customer.addAccount(account);
        
        accounts.put(number, account);
    }

}
