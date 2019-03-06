/*
 *@Author: JinCh
 *@Date: Created in 2019/3/6  20:13
 *@Description:
 */
package learn.Behavioral.Visitor;

public class Teacher extends Candidate {
    public Teacher(int paperNum, int score) {
        super(paperNum, score);
    }

    @Override
    public void accept(AwardCheck visitor) {
        visitor.visit(this);
        //do something
    }
}
