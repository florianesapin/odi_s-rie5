package ch.hearc.ig.odi.customeraccount.business;

public class Account {

    private Customer customer;
    private String number;
    private String name;
    private double balance = 0;
    private double rate = 0.001;

    public Customer getCustomer() {
        return customer;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     *
     * @param number
     * @param name
     * @param rate
     * @param customer
     */
    public Account(String number, String name, double rate, Customer customer) {
        this.number = number;
        this.name = name;
        this.rate = rate;
        this.customer = customer;

    }

    /**
     *
     * @param amount
     */
    public void credit(double amount) {
        if (checkAmount(amount)) {
            this.balance = this.balance + amount;
        } else {
            throw new IllegalArgumentException("Amount must be bigger than 0");
        }

    }

    /**
     *
     * @param amount
     */
    public void debit(double amount) {
        if (checkAmount(amount)) {
            if (this.balance >= amount) {
                this.balance = this.balance - amount;
            } else {
                throw new IllegalArgumentException("The balance is insufficient");
            }
        } else {
            throw new IllegalArgumentException("Amount must be bigger than 0");
        }

    }

    /**
     *
     * @param amount
     * @param source
     * @param target
     */
    public static void transfer(double amount, Account source, Account target) {
        if (source.checkAmount(amount)) {
            source.debit(amount);
            target.credit(amount);
        } else {
            throw new IllegalArgumentException("Amount must be bigger than 0");
        }

    }

    public boolean checkAmount(double amount) {
        Boolean valid;
        if (amount > 0) {
            valid = true;
        } else {
            valid = false;
        }
        return valid;
    }

}
