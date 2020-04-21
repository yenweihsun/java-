
package day01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;


public class Puppy {
    //這邊要注意，不同package之間，class取名不要一樣，會有問題。
    String name;
    String birth;
    int getage()throws ParseException{
        //new 今天日期 和出生日期 要兩兩相減 =年齡
        Date today = new Date();
        //parse 轉換
        Date birthday = new SimpleDateFormat("yyyy/mm/dd").parse(birth);
        //時間相減，gettime()抓的是時間 
        long diff = today.getTime() - birthday.getTime();
        //時間轉天
        long days = TimeUnit.DAYS.convert(diff,TimeUnit.MILLISECONDS);
        //天轉年 
        int age = (int)(days/365);
        return age;
    }
    
    
}
