package day03_wrapper;

import java.util.Arrays;

public class WrapperDemo3 {
    public static void main(String[] args) {
        //字串矩陣?
        String[] scores = {"100","90","80"};
        //矩陣串流後印出
        Arrays.stream(scores).forEach(System.out::println);
        //字串轉數字 在相加
        int sum = Arrays.stream(scores).mapToInt(s -> Integer.parseInt(s)).sum();
        System.out.println(sum);
    }
}
