
package day06_interface;

// interface 介面 裏頭可以塞很多類別
public interface IDog {
    // 兩種介面寫法 
    int leg = 4;  //public static final int leg = 4;
    void play();  //public abstract void paly();
    void eat();   //public abstract void eat();
    String getkind();
    void setkind(String kind);
    // java 8 預設實作
    default void copyright(){
        System.out.println("GGGG");
    }
    
}
