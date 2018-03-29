/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.camp.servlet2;
import java.io.*;
/**
 *
 * @author User
 */
public class kadai_file1 {
             public static void main(String[]args){
                 
                 try{
                     File fp=new File("test.txt");
                     FileWriter fw=new FileWriter(fp);
                     
                     fw.write("奈雲さゆりです。埼玉県に住んでいます。");
                     fw.close();
                     
                 }catch(IOException e){
                       e.printStackTrace();
                 
                 }
             }
}
