
package day01;


import java.text.ParseException;


public class Petstore {
    public static void main(String[] args)throws ParseException{
        Puppy p1 = new Puppy();
        p1.name = "拉不拉多";
        p1.birth = "2018/04/21";
        
        Puppy p2 = new Puppy();
        p2.name = "柴犬";
        p2.birth = "2019/04/21";

        System.out.println(p1.name);
        System.out.println(p1.birth);
        System.out.println(p1.getage());
        
        System.out.println(p2.name);
        System.out.println(p2.birth);
        System.out.println(p2.getage());
        
    }
}
