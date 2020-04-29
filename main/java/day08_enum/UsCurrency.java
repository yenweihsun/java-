
package day08_enum;


public enum UsCurrency {
    //有括弧數字的 要記得定義一個int 補上建構子和getvalue
    PEENY(1),
    NICKLE(5),
    DIME(10),
    QUARTER(25),
    ZERO(0);
    
    private int value;

    private UsCurrency(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
    
    
}
