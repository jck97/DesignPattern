/*
 *@Author: JinCh
 *@Date: Created in 2019/3/9  16:04
 *@Description:
 */
package learn.Behavioral.Command;

public class EditCommand implements AbsCommand {
    @Override
    public void execute() {
        BoardScreen.Edit();
    }
}
