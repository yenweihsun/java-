
package day07_innerclass;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;


public class FuncDemo {
    private static List<Integer> scores;
    static{
        scores = Arrays.asList(100,40,81,30,10,91);
    }
    public static void main(String[] args) {
        scores.stream().filter(score -> score >=60).forEach(score -> System.out.println(score));
        scores.stream().filter(score -> score >=60).forEach(System.out::println);
        
        pass(scores, 60); // pass(   ,  )
        
        pass2(scores, (score -> score >=60));
        System.out.println("----------------------");
        pass2(scores, (score -> score >=60 && score <=90 && score %2 ==1));
        
    }
    //把條件寫成參數 放在方法裡 
    public static void pass(List<Integer> scores, int passScore){
        scores.stream().filter(t-> t>=passScore).forEach(System.out::println);
    }
    //Predicate 可以放條件
    public static void pass2(List<Integer> scores, Predicate<Integer> passRule){
        scores.stream().filter(passRule).forEach(System.out::println);
    }
}
