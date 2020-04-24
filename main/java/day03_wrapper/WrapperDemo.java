
package day03_wrapper;


public class WrapperDemo {
    public static void main(String[] args) {
        //2147483647  2的32次方
        int x = Integer.MAX_VALUE;
        System.out.println(x);
        //比較
        int max = Integer.max(10, 20);
        System.out.println(max); //20
        
        String a = "200";
        // parseInt : 字串轉int 考試###
        int int_a = Integer.parseInt(a);
        System.out.println(int_a *2);  //400
        
    }
}
