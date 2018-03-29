/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.camp.servlet2;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author User
 */
public class kadai_date2 {
            public static void main(String[]args){
         
                     Date today=new Date();
                     
                     SimpleDateFormat sdf=new SimpleDateFormat("yyyy年M月d日 H時m分s秒"); 
    
                     System.out.print(sdf.format(today.getTime()));
            }
}
