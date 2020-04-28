
package day07_innerclass;

import java.util.stream.Stream;

//iterate 迭代器 從0 開始類加
public class FuncDemo4 {
    public static void main(String[] args) {
        Stream.iterate(0, n -> n+1)
               .limit(10)  //結果印10個出來
               .forEach(System.out::println);// 0~9
    }
}
