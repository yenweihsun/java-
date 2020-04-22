
package day02_array;


public class ArrayTest {
    public static void main(String[] args) {
         int[] scores = new int[]{50,60,70};
         System.out.println(scores.length);
         System.out.println(scores[0]);
         scores[1] = 95;//重設矩陣內容
         System.out.println(scores[1]);
         System.out.println(scores[2]);
         
         int sum  =scores[0] + scores[1]+ scores[2];
         System.out.println(sum);
    }
   
    
           
}
