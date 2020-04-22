
package day02;


public class Book {
    public String name; //書名
    private int price;  //價格
    public static String publisher = "GG" ;  //出版社
// 覆寫用以下格式印出
    @Override
    public String toString() {
        return "Book{" + "name=" + name + ", price=" + price + '}';
    }

   
//設定價格
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = Math.abs(price);//取絕對值
    }
    
}
