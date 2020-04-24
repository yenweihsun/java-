
package day04_constructor;

//建一個球 屬性為:顏色 名稱 價格 private
public class Ball {
    private String color = "白色";
    private String membername;
    private int price ;

    //直接設定初始值 ，也可寫在private String color = "白色"
    //=預設建構子
    //若每個建構子都做一樣的事，可寫在預設建構子中
    {
        color = "白"; //會優先吃這裡的設定!!!
        price = 400;
    }
    
    //建構子統一實作  

    public Ball() { //無名
        System.out.println("姓名: 訪客");
    }
    
    public Ball(String name){ //有名的會員
        System.out.println("姓名:" + name);
        //這邊提醒: 會員名稱如果寫name = name; 程式很笨，無法判斷誰是誰? 最好取名分開不要一樣
        membername = name;
        price *=0.8;
    }
    
    @Override
    public String toString() {
        return "Ball{" + "color=" + color + ", membername=" + membername + ", price=" + price + '}';
    }
    
}
