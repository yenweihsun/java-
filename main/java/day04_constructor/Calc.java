
package day04_constructor;


public class Calc {
//建構子練習
    public Calc() {
        this(3);
        System.out.println("A:");
    }
//整數
    public Calc(int x ) {
        this(3.14);
        System.out.println("B:" + x);
    }
// double
    public Calc(double y ){
        this("PI");
        System.out.println("C:" + y);
    }
// 字串
    public Calc(String s ){
        System.out.println("D:" + s);
    }
    
}
