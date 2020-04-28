
package day07_innerclass;

//寫好方法 再去呼叫介面的void
public class PetStore {
    public static void main(String[] args) {
        IPuppy puppy = new IPuppy(){
            public void skill(){
                System.out.println("拿報紙");
            }
        };
        
        puppy.skill();
        
        //java 8
        IPuppy puppy2 = () ->System.out.println("咬拖鞋");
        puppy2.skill();
    }
}
