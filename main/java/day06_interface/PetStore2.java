
package day06_interface;

import java.util.stream.Stream;


public class PetStore2 {
    public static void main(String[] args) {
        Decoration d1 = new Glass("狗",100,20);
        Decoration d2 = new Glass("貓", 150, 15);
        Decoration d3 = new Glass("鳥", 170, 10);
        //java8
        Stream.of(d1,d2,d3).forEach(PetStore2::showtime);
        int sum = Stream.of(d1,d2,d3).mapToInt(d -> d.getAmount()*d.getPrice())
                  .peek(System.out::println).sum();
        System.out.println(sum);
        
        //列出 min 數量 的品種
        Decoration min_Decoration = Stream.of(d1,d2,d3)
                .min((a,b) -> a.getAmount()-b.getAmount()).get();
        System.out.printf("min 數量 %d, 品名: %s \n",min_Decoration.getAmount(),min_Decoration.getName() );
        
        //列出max 成本 = 單價*數量
        Decoration max_Decoration = Stream.of(d1,d2,d3)
                .max((a,b) -> (a.getAmount()*a.getPrice())-(b.getAmount()*b.getPrice())).get();
        System.out.printf("max 成本 %d , 品名:%s\n",max_Decoration.getAmount()*max_Decoration.getPrice(),max_Decoration.getName());
    
        //成本用統計的語法 summaryStatistics   他有 { count sum min max avg } 相當方便又舒服
        System.out.println(Stream.of(d1,d2,d3).mapToInt(d -> d.getAmount()*d.getPrice()).summaryStatistics());
    }
    //總成本有加個逗號，表示ex: 總成本:2,000 
    public static void showtime(Decoration d) {
        System.out.printf("%s 的%s,數量: %d ,單價: %d ,總成本: %,d \n",
                d.getName(),d.getType(),d.getAmount(),d.getPrice(),d.getAmount()*d.getPrice()
                );
    }
}
