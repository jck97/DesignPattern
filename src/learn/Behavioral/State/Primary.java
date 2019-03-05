/*
 *@Author: JinCh
 *@Date: Created in 2019/3/5  15:15
 *@Description:
 */
package learn.Behavioral.State;

import java.util.Random;

public class Primary extends Grade {
    @Override
    public int play(int bet) {
        //*****************
        Random r = new Random();
        if(r.nextBoolean()){
            return bet;
        };
        //*****************
        return 0;
    }

    @Override
    public boolean doubleScore() {
        return false;
    }

    @Override
    public void changeCards() {
        System.out.println("change card");
    }

    @Override
    public void peekCards() {
        System.out.println("peek Card");
    }
}
