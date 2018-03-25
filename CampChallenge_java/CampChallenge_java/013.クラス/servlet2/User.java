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
public class User extends Human {

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
        if (total < 17) {
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
