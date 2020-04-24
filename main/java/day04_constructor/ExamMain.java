
package day04_constructor;


public class ExamMain {
    public static void main(String[] args) {
        Exam e1 = new Exam();
        e1.setSno(5);
        e1.setChineseScore(70);
        e1.setEnglishScore(60);
        e1.setMathScore(50);
        
        Exam e2 = new Exam(2,10,20,30);
        System.out.println(e1);
        System.out.println(e2);
    }
}
