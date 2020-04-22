package day02_dynarray;

//動態陣列分析
import java.util.Arrays;
import java.util.List;

public class DynArray {

    public static void main(String[] args) {
        //靜態陣列
        int[] scores = new int[]{70, 80, 90};
        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i]);
        }
        //動態陣列  java 8
        List scores2 = Arrays.asList(100, 80, 90);
        //兩種印法
        scores2.forEach(x -> System.out.println(x));
        scores2.forEach(System.out::println);

        //動態陣列 + java8 + stream 串流(cpu 運算)
        // <integer> 很重要
        List<Integer> scores3 = Arrays.asList(100, 90, 80);
        scores3.stream().filter(x -> x >= 90).forEach(System.out::println);

    }

}
