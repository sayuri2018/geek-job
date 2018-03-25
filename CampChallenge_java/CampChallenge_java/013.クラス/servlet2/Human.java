/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.camp.servlet2;


/**
 *
 * @author User
*/
import java.util.ArrayList;
public abstract class Human {
   ArrayList<Integer>myCards=new ArrayList<Integer>();
   abstract public int open();
   abstract public void setCard(ArrayList <Integer> cards );
   abstract public boolean checkSum();
}

