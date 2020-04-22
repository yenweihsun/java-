
package day02_algorithm;
//題目:矩陣內數字由小排到大
//展示sortNumber & bubbleSort
public class SortNumber {
    public static void main(String[] args) {
        int[] nums = {5,3,2,1,4};
        printNum(nums);
        System.out.println("-----------------");
        //從小到大排列
        selectSort(nums);
        printNum(nums);
        bubbleSort(nums);
        printNum(nums);
    }
    //方法為 拿矩陣第一個的值去跟後面比，只要比較小就抓出來放進min_idx值，
    //繼續比，直到for迴圈結束，可求出最小值的位置。
    //將最小值的位置和第一個位置互換
    //推導 先把每個情況寫出來
    public static void selectSort(int[] nums){
      /* nums[0]開始 跑到nums[3]  
        //從第一個矩陣數字去跟後面的比
        int min_idx  =0;  //nums[o]
        for (int i = 1; i < nums.length; i++) { //nums[1]~nums[4]
            //抓最小值矩陣的位置 放進 i 
            if (nums[i]<nums[min_idx]) {
                min_idx = i;  // i=3
            }
            
        }
        //定義最小值數值 = nums[3]
        int min = nums[min_idx];
        //把nums[3]的值放到nums[0]
        nums[min_idx] = nums[0];
        //把原本nums[0]的值放到 nums[3] 裡
        nums[0] = min;
        
        int min_idx = 1;
        for (int i = 2; i < nums.length; i++) {
            if (nums[i]<nums[min_idx]) {
                min_idx = i;
            }            
        }
        int min = nums[min_idx];
        nums[min_idx] = nums[1];
        nums[1] = min;
        
        int min_idx = 2;
        for (int i = 3; i < nums.length; i++) {
            if (nums[i]<nums[min_idx]) {
                min_idx = i;
            }            
        }
        int min = nums[min_idx];
        nums[min_idx] = nums[2];
        nums[2] = min;
        
        int min_idx = 3;
        for (int i = 4; i < nums.length; i++) {
            if (nums[i]<nums[min_idx]) {
                min_idx = i;
            }            
        }
        int min = nums[min_idx];
        nums[min_idx] = nums[3];
        nums[3] = min;
       */
       /*-----------我是分隔線-------------------*/ 
        for (int count = 0; count < nums.length; count++) {
            int min_idx = count;           
            for (int i = count+1; i < nums.length; i++) {
                if (nums[i]<nums[min_idx]) {
                    min_idx = i;
                }               
            }
            int min = nums[min_idx];
            nums[min_idx] = nums[count];
            nums[count] = min;
        }
    }
    //方法為 從第一個矩陣開始，倆倆交換，比較小的放前面，大的放後面
    public static void bubbleSort(int[] nums){
      /*從nums[0]~nums[4]  
        if (nums[0]>nums[1]) {
            //先把nums[0]的值放在tmp裡，
            int tmp = nums[0];
            //把nums[1]的值放進nums[0]裡，
            nums[0] = nums[1];
            //再把tmp的值 放進 nums[1]
            nums[1] = tmp;
            
        }
        if (nums[1]>nums[2]) {
            
            int tmp = nums[1];
            
            nums[1] = nums[2];
            
            nums[2] = tmp;
            
        }
        if (nums[2]>nums[3]) {
            
            int tmp = nums[2];
            
            nums[2] = nums[3];
            
            nums[3] = tmp;
            
        }
        if (nums[3]>nums[4]) {
            
            int tmp = nums[3];
             
            nums[3] = nums[4];
            
            nums[4] = tmp;
            
        }
      */
        for (int count = 1; count < nums.length; count++) {//做的次數
            for (int i = 0; i < nums.length-count; i++) {  //完整一次bubble
                if (nums[i]>nums[i+1]) {
                    int tmp = nums[i];
                    nums[i] = nums[i+1];
                    nums[i+1] = tmp;
                }
                
            }
            
        }
    }
    
    
    
    
    
    //把矩陣內容印出來
    private static void printNum(int []nums){
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i] + "");
            
        }
            System.out.println("");
    }
        
                
    

}
