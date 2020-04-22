
package day02_algorithm;

//題目: 三個不同的數字有幾種排列方法
public class ThreeNumbers {
    public static void main(String[] args) {
        int n =4;
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n; j++) {
                for (int k = 1; k < n; k++) {
                    if (i!=j && j!=k && k!= i) {
                        System.out.printf(  "%d %d %d\n",i,j,k);
                    }
                }
            }
        }
    }
}
