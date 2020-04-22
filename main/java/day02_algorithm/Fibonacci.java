
package day02_algorithm;


public class Fibonacci {
    public static void main(String[] args) {
        Fibonacci fb = new Fibonacci();
        System.out.println(fb.f(6));
        
    }
    public long f (long n){
        if (n == 0 || n ==1) {
            return n;
        }
            return f(n-1) + f(n-2);
    }
}
