/*
 *@Author: JinCh
 *@Date: Created in 2019/3/5  15:17
 *@Description:
 */
package learn.Behavioral.State;

import java.io.FileReader;

public class Player {
    private int integral;
    private Grade grade;

    public static Player newPlayer(){
        return new Player();
    }
    private Player(){
        integral = 90;
        grade = new Primary();
    }

    public void play(int bet){
        if (grade.doubleScore()&&integral>bet*2){
            System.out.print("double "+bet+"   ");
            bet*=2;
        }
        if (integral>bet){
            integral -= bet;
            int score = grade.play(bet);
            integral += score*2;
            System.out.println(score+" "+integral+" "+grade.getClass().getSimpleName());
            stateCheck();
        }
    };
    private void stateCheck(){
        if (integral<100){
            if (!Primary.class.isInstance(grade))
                grade = new Primary();
        }else if (integral<200){
            if (!Secondary.class.isInstance(grade))
                grade = new Secondary();
        }else if(integral<300){
            if (!Professional.class.isInstance(grade))
                grade = new Professional();
        }else {
            if (Final.class.isInstance(grade))
                grade = new Final();
        }
    }

}
