
package day01_3;

import com.sun.source.tree.BreakTree;
import java.util.Scanner;


public class ATM {
    Account account;
    public void menu(){
        System.out.println("------------------------");
        System.out.println("---------1.查詢----------");
        System.out.println("---------2.提款----------");
        System.out.println("---------3.存款----------");
        System.out.println("---------4.修改密碼-------");
        System.out.println("---------9.離開----------");
        System.out.println("------------------------");
        System.out.println("請選擇功能(1~9):");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        switch(number){
            case 1:
                System.out.println("你選擇查詢");
                System.out.println("帳戶餘額:" + account.getBalance(87));
                break;
            case 2:
                System.out.println("你選擇提款");
                withdraw();
                break;    
            case 3:
                System.out.println("你選擇存款");
                save();
                break;    
            case 4:
                System.out.println("你選擇修改密碼");
                changePassword();
                break;
            case 9:
                System.out.println("你選擇離開");
                // System.exit(0);  正常退出程序
                // System.exit(1);  非正常退出程序
                // System.exit(-1); 非正常退出程序
                System.exit(0);
                break; 
                
        }
        System.out.println("請按下任意鍵繼續......");
        menu();
    }
    // 存錢
    public void save(){
        System.out.println("請輸入存款金額:");
        Scanner sc = new Scanner(System.in);
        int money = sc.nextInt();
        account.setBalance(money,0);
    }
    //withdraw 提款英文
    public void withdraw(){
        System.out.println("請輸入提款金額");
        Scanner sc = new Scanner(System.in);
        int money = sc.nextInt();
        //提款輸入 +-號 不影響提款金額錯誤
        if (money<0) {
            money = money;
        } else {
            money = money*-1;
        }
        System.out.println("請輸入提款密碼:");
        int password = sc.nextInt();
        account.setBalance(money, password);
    }
    //changePassword 修改密碼
    public void changePassword(){
        System.out.println("請輸入原密碼:");
        Scanner sc = new Scanner(System.in);
        int old = sc.nextInt();
        if (old != account.getPassword()) {
            System.out.println("原密碼不正確");
            return;
        }
        System.out.println("請輸入新密碼");
        int new_pswd = sc.nextInt();
        System.out.println("請再次輸入新密碼");
        int new_pswd_2 = sc.nextInt();
        if (new_pswd != new_pswd_2) {
            System.out.println("兩次輸入不一致，bye~bye~");
            return;
        }
        if (new_pswd_2 == old) {
            System.out.println("新密碼不可與舊密碼相同");
            return;
        }
        account.setPassword(new_pswd_2);
        System.out.println("修改成功");
    }
    public static void main(String[] args) {
        ATM atm = new ATM();
        atm.account = new Account();
        atm.account.setName("hello");
        atm.menu();
    }
         
}
