/*
 *@Author: JinCh
 *@Date: Created in 2019/3/6  18:59
 *@Description:
 */
package learn.Behavioral.ChainOfRespon;

public class GeneralManager extends AbstructHandler {
    @Override
    public String handle(int days) {
        if (days<30){
            return "总经理批准"+days+"的假期";
        }else {
            return "拒接批准这么长时间的假期";
        }
    }
}
