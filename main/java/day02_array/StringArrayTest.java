
package day02_array;


public class StringArrayTest {
    public static void main(String[] args) {
        String word = "it no use cring over spilt milk";
        System.out.println(word.length());
        //spilt(" ") 分割 ((用空白分割放在矩陣內
        String[] words  = word.split(" ");
        System.out.println(words[0]);
        System.out.println(words.length);
        
    }
}
