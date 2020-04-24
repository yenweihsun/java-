package day04_constructor;

public class BallMain {
    public static void main(String[] args) {
        Ball b1 = new Ball(); //訪客
        System.out.println(b1);
        
        Ball b2 = new Ball("87"); // 有名子的會員
        System.out.println(b2);
    }
}
