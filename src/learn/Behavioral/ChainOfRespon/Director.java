/*
 *@Author: JinCh
 *@Date: Created in 2019/3/6  18:53
 *@Description:
 */
package learn.Behavioral.ChainOfRespon;

public class Director extends AbstructHandler {
    @Override
    public String handle(int days) {
        if (days<3){
            return "主任批准"+days+"天的假期。";
        }else {
            return nextHandle.handle(days);
        }
    }
}
