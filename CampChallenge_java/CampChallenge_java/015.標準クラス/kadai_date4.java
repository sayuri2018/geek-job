/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.camp.servlet2;
import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;
/**
 *
 * @author User
 */
public class kadai_date4 {
    
              public static void main(String[]args){
                  
                 //2015年1月１日のカレンダー生成
                 Calendar c=Calendar.getInstance();
                 c.set(2015,0,1,0,0,0);
                 //2015年12月31日のカレンダー生成
                 Calendar c1=Calendar.getInstance();
                 c1.set(2015,11,31,23,59,59);
                 
                 long long1=System.currentTimeMillis();
                 //longに直す
            
                 long long2=c.getTimeInMillis();
                 long long3=c1.getTimeInMillis();
                 //引き算して差を求める
                 long long4=long3-long2;
                 
                 System.out.print(long4);
                 
              }
    
}
