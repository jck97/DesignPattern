/*
 *@Author: JinCh
 *@Date: Created in 2019/3/6  18:55
 *@Description:
 */
package learn.Behavioral.ChainOfRespon;

public class Manager extends AbstructHandler {
    @Override
    public String handle(int days) {
        if (days<10){
            return "经理批准"+days+"天的假期";
        }else {
            return nextHandle.handle(days);
        }
    }
}
