
package day06_interface;

//吉娃娃 繼承介面ADog
public class Chihuahua extends ADog{
    private String kind;

    public Chihuahua(String kind) {
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
        System.out.println("玩毛線");
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
