
package day05_poly;


public class Animal {
    private String kind;  //種類
    private int leg;  //腿

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public int getLeg() {
        return leg;
    }

    public void setLeg(int leg) {
        this.leg = leg;
    }
    public void move(){
        System.out.println("移動");
    }
}


