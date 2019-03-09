/*
 *@Author: JinCh
 *@Date: Created in 2019/3/9  15:41
 *@Description:
 */
package learn.Behavioral.Command;

public class MenuItem {
    private AbsCommand command;

    public void click(){
        command.execute();
    }

    public MenuItem() {
    }

    public MenuItem(AbsCommand command) {
        this.command = command;
    }

    public void setCommand(AbsCommand command) {
        this.command = command;
    }
}
