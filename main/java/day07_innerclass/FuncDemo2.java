
package day07_innerclass;

import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.List;


public class FuncDemo2 {
    private static List<Integer> scores;
    
    static {
    scores = Arrays.asList(100,90,40,30,20);
    }
    
    
    public static void main(String[] args) {
        //遇到double 型態的都用peek(System.out::println)去印
        double sum = scores.stream()
                .mapToDouble(score -> score >=60 ? score*1.1 : score)
                .peek(System.out::println)  //把篩選過的數字排出來      
                .sum();
        System.out.println(sum);
        System.out.println("--");
        double avg = scores.stream()
                .mapToDouble(score -> score >=60 ? score*1.1 : score)
                .peek(System.out::println)  //把篩選過的數字排出來      
                .average()
                .getAsDouble();
       
        System.out.println(avg);
         System.out.println("---");
        //統計---------------------------------
        DoubleSummaryStatistics stat = scores.stream()
                .mapToDouble(score -> score>=60 ? score*1.1 : score).summaryStatistics();
        
        System.out.println(stat.getSum());
        System.out.println(stat.getAverage());
    }
}
