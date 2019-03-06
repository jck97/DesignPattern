package learn.Behavioral.Visitor;

public interface AwardCheck {
    public void visit(Student student);
    public void visit(Teacher teacher);
}
