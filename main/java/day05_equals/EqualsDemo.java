
package day05_equals;


public class EqualsDemo {
    public static void main(String[] args) {
        String s1 = new String("JAVA");
        String s2 = new String("JAVA");
        System.out.println(s1.equals(s2));
        System.out.println(s1.hashCode());//hashcode值相同 所以相等
        System.out.println(s2.hashCode());
        Ball b1 = new Ball("白",100);
        Ball b2 = new Ball("白",100);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b1.equals(b2));
        System.out.println(b1.hashCode());//因為hashcode不同 不相等
        System.out.println(b2.hashCode());
    }
}
