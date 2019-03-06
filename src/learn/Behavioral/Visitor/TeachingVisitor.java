/*
 *@Author: JinCh
 *@Date: Created in 2019/3/6  20:22
 *@Description:
 */
package learn.Behavioral.Visitor;

public class TeachingVisitor implements AwardCheck{
    @Override
    public void visit(Student student) {
        if (student.getScore()>=90){
            System.out.println("符合得奖要求");
        }else {
            System.out.println("不符合要求");
        }
    }

    @Override
    public void visit(Teacher teacher) {
        if (teacher.getScore()>=90){
            System.out.println("符合得奖要求");
        }else {
            System.out.println("不符合要求");
        }
    }
}
