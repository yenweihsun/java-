
package day03_array;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;


public class ArrayDemo4 {
    public static void main(String[] args) {
        int [] scores = new int[10];
        // 塞資料java 8
        IntStream.range(0, scores.length).forEach(i ->{
            scores[i] = new Random().nextInt(11);
            System.out.printf("%d" , scores[i]);
        }
        );
        
        IntStream intStream = Arrays.stream(scores).sorted();
        //排序
        int [] scoresSorted = intStream.toArray();
        //印出排序資料
        IntStream.range(0, scoresSorted.length).forEach(i->{
            System.out.printf("%d",scoresSorted[i]);         
        }                           
        );
        System.out.println("");
        
        //印排序後的資料(去頭尾) range 包含起始值，不包含結束值
        //ex: score[5]{0,1,2,3,4} range從位置[1]~[4]不包含[4]=> [1][2][3]
        //去掉了頭[0]尾[4]
        //rangeClosed()則是包含結束值
        IntStream.range(1, scoresSorted.length-1).forEach(i -> {
            System.out.printf("%d", scoresSorted[i]);
        });
        System.out.println("");
        
        // reduce(初始值,累加器) 用於累加 ex: sum
        // 考試重要@@
        int sum = IntStream.range(1,scoresSorted.length-1)
                    .reduce(0,(subtotal,i)-> subtotal + scoresSorted[i]);
        long count = IntStream.range(1, scoresSorted.length-1).count();
        double avg = (double)sum/count;
        System.out.printf("平均: %.2f \n ", avg);
        
    }
        
}
