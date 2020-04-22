
package day02;


public class StringDemo {
    public static void main(String[] args) {
        String word = "It is no use crying over spilled milk";
        String keyword = "no";
        // 兩種找字方法
        // indexOf   -1 表沒找到
        if (word.indexOf(keyword)!= -1){
            System.out.println(word + "裡面有"+ keyword);
            System.out.println("-----------------------");
            word.concat("87"); //只是在記憶體中新增一個字串有87的
            System.out.println(word);
            
            word = word.concat("87");// 把word 指向一個字串有87的
            System.out.println(word);
            System.out.println("-----------------------");
        }else{
            System.out.println(word + "裡面沒有" + keyword);
        }
        
        // contains
         if(word.contains(keyword)) {
            System.out.println(word + " 裡面有 " + keyword);
        } else {
            System.out.println(word + " 裡面沒有 " + keyword);
        }
    }
}
