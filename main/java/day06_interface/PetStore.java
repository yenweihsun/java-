
package day06_interface;

//主程式在這裡!!

import java.util.stream.Stream;

public class PetStore {
    public static void main(String[] args) {
        Shiba shiba = new Shiba("柴犬");
        Chihuahua chihuahua = new Chihuahua("吉娃娃");
        EDog eDog = new EDog("電子狗");
        showtime(shiba);
        showtime(chihuahua);
        showtime(eDog);
        
        System.out.println("-----------------------");
        
        //java 8 語法
        Stream.of(shiba,chihuahua).forEach((t) -> {showtime(t);
        });
        //Stream.of(shiba,chihuahua,eDog).forEach(PetStore::showtime);
        int sum = Stream.of(shiba,chihuahua,eDog).mapToInt(dog ->IDog.leg).sum();
        System.out.println(sum);
        
        
        
        
    }
    
    public static void showtime(IDog dog){
        System.out.printf("%s 有 %d 條腿\n" , dog.getkind(),dog.leg);
        dog.eat();
        dog.play();
        dog.copyright();
    }
}
