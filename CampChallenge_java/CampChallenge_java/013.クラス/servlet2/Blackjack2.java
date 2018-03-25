/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.camp.servlet2;

import java.util.ArrayList;

/**
 *
 * @author User
 */
abstract class Blackjack2{
            
             public static void main(String[]args){
                  Dealer set1 =new Dealer();
                  
                  ArrayList<Integer> d_deal = set1.deal();
                  set1.setCard(d_deal);
                  // set1.setCard(set1.deal());
                  
                  System.out.println("ディーラーのカードは"+set1.myCards+"です。");
                   
                   
//                   
//                   ArrayList<Integer> deal3 = new ArrayList<Integer>();
//                   set1.setCard(deal3);
//                   System.out.println();
//                   
                  
                   
                    while(set1.checkSum()){
                           set1.setCard(set1.hit());
                    
                   System.out.println(set1.myCards);
                   
                    }
                   
                  
                 
                   
                   System.out.println("ディーラーの合計は"+set1.open()+"です。");
                    
                   
                   User set2=new User();
                  
                   set2.setCard(set1.deal());
                    System.out.println("ユーザーのカードは"+set2.myCards+"です。");
                    
                    while(set2.checkSum()){
                        set2.setCard(set1.hit());
                        System.out.println(set2.myCards);
                    }
                    
                 
                    System.out.println("ユーザーの合計は"+set2.open()+"です。");
                    
                    if(set1.open()<21&&set2.open()<21){
                        if(set1.open()>set2.open()){
                       System.out.println("ディーラーの勝ちです。");
                   }else if(set1.open()<set2.open()){
                       System.out.print("ユーザーの勝ちです。");
                   }
                    }else if(set1.open()>21&&set2.open()>21){
                       System.out.println("両方負けです。");
                  
                   }else if(set1.open()==21&&set2.open()==21){
                       System.out.println("引き分けです。");
                   }else if(set1.open()==21){
                       System.out.println("ディーラーはブラックジャックです。");
                   }else if(set2.open()==21){
                        System.out.println("ユーザーはブラックジャックです。");
                   }else if(set1.open()<21&&set2.open()>21){
                        System.out.println("ディーラーの勝ちです。");
                   }else if(set1.open()>21&&set2.open()<21){
                       System.out.println("ユーザーの勝ちです。");
                   }
                       
             }
}
            
    
             
