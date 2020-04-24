
package day03_array;

import java.util.Arrays;
import java.util.Random;


public class ArrayDemo2 {
    public static void main(String[] args) {
        // 長度為3的矩陣
        int[] scores = new int[3] ;
        
        for (int i = 0; i < scores.length; i++) {
            //原本隨機數字0~9  ，+1 後變1~10
             int score = new Random().nextInt(10)+1;
             scores[i] = score;
             System.out.printf("%d",score);
        }
        System.out.println("\n-----------------------");
    
        // 算總分 平均
        int sum =0;
        double avg = 0;
        for (int score : scores) {
            //把值累加起來放進sum
            sum+=score;
        }
        
        avg = (double)sum/scores.length;
        System.out.println("總分:" + sum + "平均" + avg);
        
        int sum2 = Arrays.stream(scores).sum();
        //geAsDouble 轉成double
        double avg2 = Arrays.stream(scores).average().getAsDouble();
        System.out.println("總分:" + sum2 + "平均" + avg2 );
        //%.2f 小數點取到第二位
        System.out.printf("總分: %d 平均: %.2f\n", sum2 , avg2);
    }
    
}
