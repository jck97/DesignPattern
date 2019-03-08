/*
 *@Author: JinCh
 *@Date: Created in 2019/3/8  15:18
 *@Description:
 */
package learn.Behavioral.Strategy;

public class Helicopter extends Aircraft {
    public Helicopter() {
    }

    public Helicopter(String id, FlyType flyType, TakeOff takeOff) {
        super(id, flyType, takeOff);
    }
    @Override
    public void train(){
        System.out.println("直升机中队展示");
        super.train();
    }
}
