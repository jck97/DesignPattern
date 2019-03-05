/*
 *@Author: JinCh
 *@Date: Created in 2019/3/5  14:59
 *@Description:
 */
package learn.Behavioral.State;

public abstract class Grade {
    private int bet;
    public abstract int play(int bet);
    public abstract boolean doubleScore();
    public abstract void changeCards();
    public abstract void peekCards();
}
