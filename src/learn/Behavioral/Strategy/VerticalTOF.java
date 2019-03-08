/*
 *@Author: JinCh
 *@Date: Created in 2019/3/8  15:32
 *@Description:
 */
package learn.Behavioral.Strategy;

public class VerticalTOF implements TakeOff {
    @Override
    public void takeOff(String id) {
        System.out.println(id+"垂直起飞");
    }
}
