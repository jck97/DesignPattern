/*
 *@Author: JinCh
 *@Date: Created in 2019/3/6  20:15
 *@Description:
 */
package learn.Behavioral.Visitor;

public class ResearchVisitor implements AwardCheck{

    @Override
    public void visit(Student student) {
        if (student.getPaperNum()>3){
            System.out.println("符合得奖要求");
        }else {
            System.out.println("不符合要求");
        }
    }

    @Override
    public void visit(Teacher teacher) {
        if (teacher.getPaperNum()>10){
            System.out.println("符合得奖要求");
        }else {
            System.out.println("不符合要求");
        }
    }
}
