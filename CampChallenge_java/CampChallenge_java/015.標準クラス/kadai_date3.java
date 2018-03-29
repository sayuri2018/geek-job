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
public class kadai_date3 {
              public static void main(String[]args){
                  
                  Calendar c=Calendar.getInstance();
                  c.set(2016,10,4,10,0,0);
                  
                   SimpleDateFormat sdf=new SimpleDateFormat("yyyy年M月d日 H時m分s秒"); 
                   
                   System.out.println(sdf.format(c.getTime()));
                   
                   SimpleDateFormat sdf2=new SimpleDateFormat("yyyy-M-d HH:mm:ss");
                   
                   System.out.println(sdf2.format(c.getTime()));
                   
                  
              }
    
}
