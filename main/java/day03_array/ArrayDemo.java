
package day03_array;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class ArrayDemo {
    public static void main(String[] args) {
        int[] scores = new int[10];
        //隨機塞1~10的數字給矩陣，直到score[9]為止
        for (int i = 0; i < scores.length; i++) {
            int score = new Random().nextInt(11);
            scores[i] = score;            
        }
        //for 迴圈把矩陣值印出來
        //println 會自動換行
        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i]);            
        }
        //空白一行，沒意思
        System.out.println("");
        // for 迴圈 第二種寫法 printf 不換行
        for (int score : scores) {
            System.out.printf("%d",score);
        }
        System.out.println("");
        // import IntStream  java 8 Arrays.stream
        IntStream intStream = Arrays.stream(scores);
        intStream.forEach(score -> System.out.printf("%d", score));
        System.out.println("");
        // java 8 Stream of 寫法
        Stream<int[]> stream = Stream.of(scores);
        stream.flatMapToInt(x ->Arrays.stream(x)).forEach(score -> System.out.printf("%d",score));
        System.out.println("");
    }
}
