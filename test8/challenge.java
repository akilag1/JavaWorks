package course.test8;

public class challenge {
    public static void main(String[] args){
        BankAccount ba1=new BankAccount();
        ba1.balance=10000;
        System.out.println(ba1.getBalance());
        ba1.withdrawFunds(8000);
        ba1.depositFunds(5000);
        ba1.withdrawFunds(8000);
    }
}
