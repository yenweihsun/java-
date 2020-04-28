
package day07_innerclass;


public class SalaryDemo {
    public static void main(String[] args) {
        Salary manager_Salary = new Salary("manager",70000);
        System.out.println(manager_Salary.getMoney());
        
        Salary.Level level = new Salary.Level();
        System.out.println(level.getPriority("manager"));
        
        
    }
}
