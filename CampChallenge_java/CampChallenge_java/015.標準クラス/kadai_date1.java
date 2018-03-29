/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.camp.servlet2;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;

/**
 *
 * @author User
 */
public class kadai_date1 {
             public static void main(String[]args){
                
                 Calendar c=Calendar.getInstance();
                 c.set(2016,0,1,0,0,0);
                 
                 SimpleDateFormat sdf=new SimpleDateFormat("yyyy年M月d日 H時m分s秒"); 
                
                 
                 
                 System.out.print(sdf.format(c.getTime()));
            
               
             }
    
}
