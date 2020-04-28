
package day05.B;

import day05.A.Father;


public class Son extends Father{
    public static void main(String[] args) {
        Son son = new Son();
        System.out.println(son.a);
        System.out.println(son.b);
        
        Father son2 = new Son();
        System.out.println(son2.a);
        //System.out.println(son2.b);  //會錯誤，是兒子繼承父親，可取用父親資源
        //但是現在是用Father類別
        
        
    }
}
