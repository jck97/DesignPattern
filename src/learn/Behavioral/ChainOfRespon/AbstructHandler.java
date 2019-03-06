/*
 *@Author: JinCh
 *@Date: Created in 2019/3/6  18:50
 *@Description:
 */
package learn.Behavioral.ChainOfRespon;

public abstract class AbstructHandler {
    protected AbstructHandler nextHandle;

    public AbstructHandler getNextHandle() {
        return nextHandle;
    }

    public void setNextHandle(AbstructHandler nextHandle) {
        this.nextHandle = nextHandle;
    }

    public abstract String handle(int days);
}
