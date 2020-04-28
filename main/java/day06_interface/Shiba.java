
package day06_interface;

//柴犬 繼承介面ADog
public class Shiba extends ADog{
    private String kind;

    public Shiba(String kind) {
        this.kind = kind;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    @Override
    public void play() {
        System.out.println("玩飛盤");
    }

    @Override
    public String getkind() {
        return kind;
    }

    @Override
    public void setkind(String kind) {
        this.kind = kind;
    }
    
}
