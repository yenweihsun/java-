package day06_innerclass;
//外部類別
public class Department {

    private String name;

    public Department(String name) {
        this.name = name;
    }
//內部類別  
    class Job {

        private String name = "工作";

        public String getName() {
            String name = "寫程式";               //取用外部類別的部門名稱  //內部類別的名子:工作 //方法內的資源 直接取用                  
            return String.format("%s 部門的 %s 是 %s", Department.this.name, this.name, name);
        }

        public String getLanguage() {
            return "java";
        }

    }

}
