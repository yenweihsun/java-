
package day06_innerclass;

//內部類別範例

// 外部類別
public class Calc {
    public double getBMI(double h,double w){
        
        //內部類別
        class BMI{
            private double bmi;            
            public BMI(){
                //Math.pow 幾次方 ex: Math.pow(10, 2)
                //               => 10的2次方 = 100
                // this. 在內部類別裡取用內部物件資源 要加上this.
               this.bmi = w /Math.pow(h/100, 2);//直接取用方法的區域變數來用了            
            }
            public double getBmi(){
                return bmi;               
            }
        }
        //實作內部類別的getBmi()
        BMI bmi = new BMI();
        return bmi.getBmi();
        
    }
    
    
    
    public static void main(String[] args) {
        Calc calc = new Calc();
        System.out.printf("bmi: %.2f\n",calc.getBMI(170, 60));
    }
}
