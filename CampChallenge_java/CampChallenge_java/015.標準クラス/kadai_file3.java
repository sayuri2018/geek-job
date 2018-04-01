/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.camp.servlet2;
import java.io.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;


/**
 *
 * @author User
 */
public class kadai_file3 {
                public static void main(String[]args){
                    
                     
                 try{
                     File fp=new File("test.txt");
                     FileWriter fw=new FileWriter(fp);
                     String lineSepa=System.getProperty("line.separator");
                  
                     Date today1=new Date();
                     SimpleDateFormat sdf=new SimpleDateFormat("yyyy年M月d日 H時m分s秒"); 
                     //現在時刻を書き込む
                      fw. write("処理を始めます。"+sdf.format(today1));
                    
                      
                     //文字を指定して位置を取得 
                     String word="縄文時代";
                     //int型のplaceを文字型に変換
                     Integer  place=word.indexOf("文");
                     String moji=String.valueOf(place);
                     
                     //文の位置を書き込む
                     fw.write(moji);
                   
                     fw.write("処理を終わります。"+sdf.format(today1));
             
                
                     fw.close();
                     
                    
                     FileReader fr=new FileReader(fp);
                     
                     BufferedReader br=new BufferedReader(fr);
                     
                     System.out.print(br.readLine());
                   
                    
                     
                 }
                 
                   catch(IOException e){
                       e.printStackTrace();
                 
                 }

                  
              }
    
}
