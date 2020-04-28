
package day06_enum;

//jdk5 新語法enum 列舉常數使用 無法繼承
public enum Grade {
    小學(6)        
    ,國中(3)
    ,高中(3)
    ,大學(4)
    ,五專(5);

    private int value;
    
    private Grade(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
    
    
}
