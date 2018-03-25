/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.camp.servlet2;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author User
 */
 public class Dealer extends Human {
        ArrayList<Integer> cards=new ArrayList<Integer>();
     
     public Dealer() {
         // カード52枚用意
         for(int j=0;j<4;j++){
         for(int i = 1; i<=13; i++) {
             cards.add(i);
         }
         }
     }
     
 
             
    public ArrayList<Integer> deal() {
        ArrayList<Integer> ans = new ArrayList<Integer>();

        Random rand = new Random();
        for (int p = 0; p <= 2; p++) {
            
            int Index = rand.nextInt(cards.size());
            Integer num = cards.get(Index);
            ans.add(num);
        }
        return ans;

    }

    public ArrayList<Integer> hit() {
        ArrayList<Integer> ans = new ArrayList<Integer>();

        Random rand = new Random();
        int Index = rand.nextInt(cards.size());

        Integer num = cards.get(Index);
        ans.add(num);
        return ans;
    }
    
    
    public void setCard(ArrayList<Integer> cards) {

        for (int i = 0; i < cards.size(); i++) {
            int num = cards.remove(0);

            myCards.add(num);

        }
    }
    
     public boolean checkSum() {
        int total = 0;
        for (int i = 0; i < myCards.size(); i++) {
            total = total + myCards.get(i);
        }
        if (total <17) {
            return true;
        } else {
            return false;
        }

    }
     
      public int open() {
        int total = 0;
        for (int i = 0; i < myCards.size(); i++) {
            total = total + myCards.get(i);
        }

        return total;

    }
}
