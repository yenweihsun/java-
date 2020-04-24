
package day03;

public class Exam {
    String subject; // 科目
    int score;  //分數 
    // 覆寫 呼叫的時候改用以下的格式內容
    @Override
    public String toString() {
        return "Exam{" + "subject=" + subject + ", score=" + score + '}';
    }
    
}

