
package day03;

import java.util.Arrays;


public class ExamDemo {
    public static void main(String[] args) {
        
        Exam e1 = new Exam();
        e1.subject = "國文";
        e1.score = 100;
        
        Exam e2 = new Exam();
        e2.subject = "數學";
        e2.score = 90;
        
        Exam e3 = new Exam();
        e3.subject = "國文";
        e3.score = 80;
        
        Exam[] exams = {e1,e2,e3};
        System.out.println(exams[0] + "" + exams[1] + "" + exams[2]);
        //import util Arrays //mapToInt 轉型成int
        //抓全部科目幾分
        int sum1 = Arrays.stream(exams).mapToInt(e -> e.score).sum();
        System.out.println(sum1);
        //抓出國文總共多少分
        int sum2 = Arrays.stream(exams)
                .filter(e -> e.subject.equals("國文"))
                .mapToInt(e -> e.score)
                .sum();
        System.out.println(sum2);
        // 計算國文有幾次 ,除掉他
        int count = (int)Arrays
                .stream(exams)
                .filter(e -> e.subject.equals("國文"))
                .count();
        System.out.println(sum2/count);
    }
}
