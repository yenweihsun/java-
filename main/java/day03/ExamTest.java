
package day03;

import java.util.ArrayList;

//矩陣塞值進去
public class ExamTest {
    public static void main(String[] args) {
        ArrayList<Integer> points = new ArrayList<Integer>();
        points.add(1);
        points.add(2);
        points.add(3);
        points.add(4);
        points.add(null);
        points.remove(3);  //是刪除矩陣位置[3]的值 所以4被刪除
        points.remove(null);//刪除null
        
        System.out.println(points);
        
    }
 
}
