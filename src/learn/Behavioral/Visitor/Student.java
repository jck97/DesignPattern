/*
 *@Author: JinCh
 *@Date: Created in 2019/3/6  20:13
 *@Description:
 */
package learn.Behavioral.Visitor;

public class Student extends Candidate {
    public Student(int paperNum, int score) {
        super(paperNum, score);
    }

    @Override
    public void accept(AwardCheck visitor) {
        //do something
        visitor.visit(this);

    }
}
