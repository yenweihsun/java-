
package day05_extends;


public class Constructor {
    public static void main(String[] args) {
        Son son = new Son();
        Son son2 = new Son(8);
        Son son3 = new Son();
        Son son4 = new Son();
        
    }
      
}

    class Father{
        public Father(){
            System.out.println("Father");
        }
        public Father(int x ){
            System.out.println("Father" + x);
        }   
    }

    class Son extends Father{
        //再次展演有參數 無參數的2個類別
        public Son(){
            super();// 自動會帶
            System.out.println("Son");
        }
        public Son(int x ){
            super(x);//呼叫father  //預設不會帶(有參數的int x)
            System.out.println("Son");
        }
    }


