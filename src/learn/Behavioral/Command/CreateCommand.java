/*
 *@Author: JinCh
 *@Date: Created in 2019/3/9  16:07
 *@Description:
 */
package learn.Behavioral.Command;

public class CreateCommand implements AbsCommand {
    @Override
    public void execute() {
        BoardScreen.create();
    }
}
