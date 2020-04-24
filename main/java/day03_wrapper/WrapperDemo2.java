package day03_wrapper;

public class WrapperDemo2 {
    public static void main(String[] args) {
       int x = 100;
       Integer y = Integer.valueOf("200");
        System.out.println(x);
        System.out.println(y);
        System.out.println(x + y.intValue()); // java 5 以前的寫法
        System.out.println(x+y); // java5 以後 y -> y.intValue() auto-unboxing 自動拆箱
    
        Integer a = Integer.valueOf("300");
        Integer b = 300;
        System.out.println(x + y.intValue() + a.intValue() + b.intValue()); //900
        System.out.println(x+y+a+b);  //900
        
        Integer c = 400;
        c = 500; // 記憶體內容指向500
        System.out.println(c);
    }
}
