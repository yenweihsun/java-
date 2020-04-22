
package day01_4.A;

import day01.Puppy;
import day01_4.B.PuppyDog;


public class John extends PuppyDog{
    public int money = 300;
    
    public void showMoney(){
        
        Mary mary  =new Mary(); //一定要new mary出來才可以取得她的值
        System.out.println("Mary:$" + mary.money);
        System.out.println("John:$" + this.money);
        //super 取繼承的父系值
        System.out.println("PuppyDog:$" + super.money);
        
    }
    
    public static void main(String[] args) {
        John john  = new John();
        john.showMoney();
    }
}
