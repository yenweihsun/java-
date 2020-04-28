
package day06_interface;

// 抽象類別ADog 實作IDog 的方法
public abstract class ADog implements IDog{

    @Override
    public  void eat(){
        System.out.println("狗罐頭-保祿");
    }
    
}
