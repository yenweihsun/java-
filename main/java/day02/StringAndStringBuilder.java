
package day02;

// + 和append 的差別??

public class StringAndStringBuilder {
    public static void update(String str) {
        str = str + "8";
    }
    //string 字串池很多時，會用到 StringBuilder跟StringBuffer
    //為了節省記憶體，都是用append("XX")附加字串
    //                  insert(第幾位,"XX")插入字串
    public static void update(StringBuilder sb) {
        sb.append("8");
        sb.insert(3, "87");
    }
    
    public static void main(String[] args) {
        String s = "Hello"; 
        update(s);  //記憶體產生一個 Hello8 的內容
        System.out.println(s); // 內容還是Hello，因為他沒有重新指向它
        System.out.println("--------------");
        StringBuilder s2 = new StringBuilder("Hello");
        update(s2); //hello8
        System.out.println(s2);   // 結果: Hel87lo8
    }
    
}