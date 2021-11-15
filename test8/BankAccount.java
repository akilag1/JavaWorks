package course.test8;

public class BankAccount {
    String accountNum;
    double balance;
    String customerName;
    String email;
    String mobNum;

    public String getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(String accountNum) {
        this.accountNum = accountNum;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobNum() {
        return mobNum;
    }

    public void setMobNum(String mobNum) {
        this.mobNum = mobNum;
    }

    public void depositFunds(double amount){
        balance=balance+amount;
        System.out.println("New Balance: "+balance);
    }

    public void withdrawFunds(double amount){
        if(amount<=balance){
            balance=balance-amount;
            System.out.println("New Balance: "+balance);
        }
        else{
            System.out.println("Insufficient Funds");
        }
    }
}
