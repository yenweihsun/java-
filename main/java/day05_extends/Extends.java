
package day05_extends;


public class Extends {
    public static void main(String[] args) {
        Employee employee = new Employee();
        Manager manager = new Manager();
        Director director = new Director();
        
        Employee employee1 = new Employee();
        Manager manager2 = new Manager();
        Director director3 = new Director();
        
    }
            
}

class Employee{
    public int salary;
}

class Manager extends Employee{
    public int budget;
}

class Director extends Manager{
    public int stockOptions;
}