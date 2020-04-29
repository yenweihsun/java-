package day08_exception;

import java.util.Scanner;
//此時輸入0 或是小數  他都不會檢查就執行 會發生執行錯誤 邏輯錯
public class InputNumber5 {
//主程式和input() 都拋出例外 throws Exception
    public static void main(String[] args)throws Exception {
        input();
    }

    public static void input() throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("請輸入數字(字母)");
        int x = sc.nextInt();
        System.out.printf("10 / %d = %d\n ", x, 10 / x);
    }
}
