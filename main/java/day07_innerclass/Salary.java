
package day07_innerclass;

//外部類別
public class Salary {
    private int money;
    private String level;
    // 建構子順序注意遺下
    public Salary( String level ,int money) {
        this.money = money;
        this.level = level;
    }
    // 薪水 * 倍率
    public int getMoney(){
        return money * Level.getPriority(level);
    }
    
    //內部類別
    static class Level{
        static int getPriority(String level){
            switch(level){
                case "manager" :
                    return 2;
                case "supervisor":
                    return 5;
                default:
                    return 1;
            }
        }
    
    
    }
    
}
