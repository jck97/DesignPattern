/*
 *@Author: JinCh
 *@Date: Created in 2019/3/8  15:34
 *@Description:
 */
package learn.Behavioral.Strategy;

public class SubSonic implements FlyType {
    @Override
    public void fly(String id) {
        System.out.println(id+"正在亚音速飞行");
    }
}
