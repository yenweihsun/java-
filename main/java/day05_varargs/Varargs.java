package day05_varargs;

import java.util.stream.IntStream;

public class Varargs {

    public static void main(String[] args) {
        int[] nums = {100, 90, 80};
        System.out.println(calc(nums));
        System.out.println(calc(100, 90, 80)); // 270
        //呼叫的時候可不用傳參數 
        System.out.println(calc()); // 0
        System.out.println(calc7(nums));
        System.out.println(calc7(100, 90, 80));
        System.out.println(calc7()); //0
    }
    //在主程式裡的靜態
    public static int calc(int... nums) {
        return IntStream.of(nums).sum();
    }

    //vararg 省略號 當參數很多時，可用...來省略 
    public static int calc7(int... nums) {
        int sum = 0;
        for (int num  : nums) {
            sum += num;
        }
        return sum;
    }

}
