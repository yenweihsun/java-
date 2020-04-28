
package day05_poly;

import java.util.Random;


public class Zoo {
    public static void main(String[] args) {
        Bird bird  = new Bird();
        Lion lion = new Lion();
        Ostrich ostrich = new Ostrich();
        
        printAnimal(lion);
        printAnimal(bird);
        printAnimal(ostrich);
        System.out.println("-----------------------");
        
        Animal animal = getAnimal();
        printAnimal(animal);
        // instanceof 一個boolean判斷 要是animal是鴕鳥就叫精神出來
        if (animal instanceof Ostrich) {
            //轉鴕鳥  =>叫 .精神方法
            ((Ostrich)animal).spirit();
        }
        
    }
    
    public static void printAnimal(Animal animal) {
        System.out.printf("%s 有 %s  條腿 \n",animal.getKind(),animal.getLeg() );
    }
    public static Animal getAnimal(){
        int x = new Random().nextInt(3); // 0~2
        Animal animal = null;
        switch(x){
            case 0:
                animal = new Bird();
                break;
            case 1:
                animal = new Lion();
                break;
            case 2:
                animal = new Ostrich();
                break;
        }   
        return animal;
       
        
        
    }
}

