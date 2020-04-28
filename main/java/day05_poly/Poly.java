
package day05_poly;

//領導繼承經理 經理繼承員工 領導可以取用經理資源 經理可以用員工資源
public class Poly {
    public static void main(String[] args) {
        //一定要new物件出來才能取用類別裡的資料
        Employee employee = new Employee();
        Manager manager = new Manager();
        Director director = new Director();
        //員工的資源        用領導去實作
        Employee e1 = new Director();
        
        printSalary(employee);
        printSalary(manager);
        printSalary(director);
        printSalary(e1);
        System.out.println(manager.budget());
        System.out.println(director.stockoptions());
    }
    
    public static void printSalary(Employee employee) {
        System.out.println("薪資:" + employee.getSalary());
     

        
        
    }
}
//員工
class Employee{
    public int getSalary(){
        return 30000;
    }
}
//經理
class  Manager extends Employee{
    public int  getSalary(){
        return 50000;
}
    public int budget(){
        return 100000;
    }
}
//director 領導
class Director extends Manager{
    public int getSalary(){
        return 20000;
    }
    
    public int budget(){
        return 100000;
    }
    
    public int stockoptions(){
        return 400000;
    }
}
