
package day01_2;


public class Bank {
    public static void main(String[] args) {
        Account ac1 = new Account();
        ac1.setBalance(100);
        ac1.setBalance(100);
        ac1.setBalance(100);
        ac1.setBalance(-300);
        ac1.setBalance(-600);
        ac1.setBalance(200);
        System.out.println(ac1.getName());
        System.out.println(ac1.getBalance(87));
        System.out.println(ac1.getBalance(66));
    }
}
