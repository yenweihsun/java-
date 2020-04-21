package day01_3;

//在這裡設定帳戶姓名,密碼,餘額

import day01_2.*;
//在這裡設定帳戶姓名,密碼,餘額
// 類別:帳戶
public class Account {
//在這個區塊設定 帳戶姓名,密碼
// private 限定同一class才能用
    private String name = "哭哭饅頭";
    private int balance; //餘額英文
    private int password = 87;
// insert getter and setter 

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
       
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
       
    }

    public void setBalance(int money,int password) { 
        //提款檢查密碼password
        if (money <0 && this.password != password ) {
            System.out.println("密碼不正確");
            return;
        }
        //存提款功能
        int diff = balance + money; //balance 帳戶裡的金額; money 要存或提款的金額
        if (diff>=0) {
            balance = diff;
            String word = (money >=0)? "存":"提";
            System.out.print("\u001B[30m");  //顯示顏色  ex: 黑色：\u001b[30m
            //Math.abs() 取絕對值
            System.out.printf("%s款成功, 餘額: $%d, %s款: $%d\n", word, balance, word, Math.abs(money));            
        } else { 
            System.out.print("\u001B[31m");  //顯示顏色  ex: 红色：\u001b[31m
            System.out.printf("存款不足, 餘額: $%d, 提款: $%d\n", balance, Math.abs(money));
        }
        
        
    }

    public int getBalance(int password) {
        if (this.password == password) {
            return balance;
        } else {
            System.out.println("密碼錯誤");
            return 0;
        }
        
    }
    
}
