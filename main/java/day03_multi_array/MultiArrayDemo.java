
package day03_multi_array;

//2個矩陣一起算 sum ,avg

import java.util.Arrays;
import java.util.stream.IntStream;

public class MultiArrayDemo {
    public static void main(String[] args) {
        // | 100[0][0] 90[0][1]  80[0][2] |
        // |  60[1][0] 50[1][1]  40[1][2] |
        int[][] group ={ {100,90,80},{60,50,40} };
        System.out.println(group); //  [[I@2d363fb3
        System.out.println(group[0]);// [I@7d6f77cc
        System.out.println(group[1][0]);//100
        
        // java7
        for (int[] scores : group) {
            int sum =0;
            double avg =0;
            for (int score : scores) {
                sum+=score;
            }
            avg = (double)sum/ scores.length;
            System.out.printf("總分: %d 平均 %.2f\n", sum, avg );            
        }
        System.out.println("-------------------");
        // java 8
        IntStream.range(0, group.length).forEach(i->{
            int sum = Arrays.stream(group[i]).sum();
            double avg = Arrays.stream(group[i]).average().getAsDouble();
            System.out.printf("總分: %d , 平均: %.2f\n",sum,avg );
        });
        
    }
}
