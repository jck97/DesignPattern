/*
 *@Author: JinCh
 *@Date: Created in 2019/3/8  15:29
 *@Description:
 */
package learn.Behavioral.Strategy;

public class Harrier extends Aircraft {
    public Harrier() {
    }

    public Harrier(String id, FlyType flyType, TakeOff takeOff) {
        super(id, flyType, takeOff);
    }
    @Override
    public void train(){
        System.out.println("一架鹞式战斗机也来凑热闹");
        super.train();
    }
}