
package day03_array;

//去除偶數，平均

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class ArrayDemo3 {
    public static void main(String[] args) {
        int[] scores = new int[10];
        
        // 用java 8 亂數塞值
        IntStream.range(0, scores.length).forEach(i ->
            //可用中刮號包兩行
            {     
            scores[i] = new Random().nextInt(11);
            System.out.println(scores[i]);    
            }
        );
        //java 7 
        int sum = 0;
        double avg = 0;
        int count = 0;
        for (int score : scores) {
            if (score%2 ==1) {
                sum+=score;
                ++count;
            }            
        }
        
        avg = (double)sum/count;
        System.out.printf("平均: %.2f" ,  avg);
        // java8 
        int sum2 = Arrays.stream(scores).filter(score -> score%2 ==1).sum();
        double avg2 = Arrays.stream(scores).filter(score -> score%2 ==1).average().getAsDouble();
        System.out.printf("總分 %d  平均 %.2f :\n",sum2,avg2);
    }   
            
}
