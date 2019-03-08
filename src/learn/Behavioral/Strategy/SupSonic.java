/*
 *@Author: JinCh
 *@Date: Created in 2019/3/8  15:35
 *@Description:
 */
package learn.Behavioral.Strategy;

public class SupSonic implements FlyType {
    @Override
    public void fly(String id) {
        System.out.println(id+"在超音速飞行");
    }
}
