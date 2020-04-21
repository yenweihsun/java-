
package day01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;


public class DateAndString {
    //throws ParseException 拋出例外
    public static void main(String[] args)throws ParseException{
    // import java.util.Date  純粹java程式碼邏輯使用
    // 還有一個是 java.sql.Date 是用與資料庫互動的時候使用    
        Date today = new Date();
        System.out.println(today);
        System.out.println(today.toString()); //main 已經定義為string 
    //-------------字串變日期-----------        
        String birth = "2019/12/31";
    //import java.text.SimpleDateFormat 在java做日期轉換的重要語法!!  
    // 類別裡面給定一個指定樣子"yyyy/MM/dd" 大M 是月份  小m是分鐘
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
    //parse 轉換    
        Date myBirthday = sdf.parse(birth);
        System.out.println(myBirthday);
    //日期相減I--------------(先抓秒，再換算回年)
        System.out.println(today.getTime());    
        System.out.println(myBirthday.getTime());
    //getTime()抓時間(單位:毫秒) 1秒=1000毫秒 ; 毫秒數字很大故用long (64bits)
        long diff = today.getTime()- myBirthday.getTime();
        System.out.println(diff);
        System.out.println("日:" + (diff/(24*60*60*1000)));
        System.out.println("年:" + (diff/(24*60*60*1000))/365.0);
    //日期相減II-------------------------------------
    //import java.util.concurrent.TimeUnit;
        //TimeUnit 我要的(時間單位.天).convert.(相減的時間,時間單位.毫秒);
        System.out.println("日:" + TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS));
        //(TimeUnit :HOURS,DAYS,MINUTES,SECONDS,...)沒有年 所以/365.0 
        System.out.println("年:" + TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS)/365.0);
    //日期相減III-------------------------------------
    //import java.util.Calendar; 日曆的英文
    //只計算年，不考慮月日，故不精準，
        Calendar cal = Calendar.getInstance();
        cal.setTime(today);
        int y1 = cal.get(Calendar.YEAR);
        cal.setTime(myBirthday);
        int y2 = cal.get(Calendar.YEAR);
        System.out.println("年:" + (y1 - y2) );
    }
}
