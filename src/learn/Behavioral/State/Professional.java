/*
 *@Author: JinCh
 *@Date: Created in 2019/3/5  15:43
 *@Description:
 */
package learn.Behavioral.State;

import java.util.Random;

public class Professional extends Grade {
    @Override
    public int play(int bet) {
        Random r = new Random();
        if(r.nextBoolean()){
            return bet;
        };
        return 0;
    }

    @Override
    public boolean doubleScore() {
        return new Random().nextBoolean();
    }

    @Override
    public void changeCards() {
        System.out.println("change card");
    }

    @Override
    public void peekCards() {
    }
}
