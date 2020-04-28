
package day05_overloading;

// 超載
public class OverLoading {
    public static void main(String[] args) {
        calc(10, 3);   //int
        calc(10.0f,3.0f); //float
        calc(10.0, 3.0);  // double
        
        
    }
    public static void calc(float x , float y ){
        System.out.println(x+y);
    }
    public static void calc(double x , double y ){
        System.out.println(x-y);
    }
    public static void calc(int x ,int y){
        System.out.println(x*y);
    }
    public static void calc(Integer x , Integer y){
        System.out.println(x/y);
    }
    
    
    
}
