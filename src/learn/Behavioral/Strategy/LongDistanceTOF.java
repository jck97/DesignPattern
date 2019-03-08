/*
 *@Author: JinCh
 *@Date: Created in 2019/3/8  15:33
 *@Description:
 */
package learn.Behavioral.Strategy;

public class LongDistanceTOF implements TakeOff {
    @Override
    public void takeOff(String id) {
        System.out.println(id+"长距离起飞");
    }
}
