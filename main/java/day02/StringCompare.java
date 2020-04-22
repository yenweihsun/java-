
package day02;


public class StringCompare {
    public static void main(String[] args) {
        String s1 = new String("Java");
        String s2 = new String("Java");
        String s3 = "Java";
        String s4 = "Java";
        String s5 = "jAvA";
        System.out.println(s1 == s2);        //false
        System.out.println(s1.equals(s2));   //true
        System.out.println(s3 == s4);        //true
        System.out.println(s3.equals(s4));   //true
        System.out.println(s4.equals(s5));   //false
        // equalsIgnoreCase 忽略大小寫
        System.out.println(s4.equalsIgnoreCase(s5)); // true
        //toUpperCase() 變大寫
        System.out.println(s4.toUpperCase().equals(s5.toUpperCase())); // true
    }
}
