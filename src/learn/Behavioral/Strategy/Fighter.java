/*
 *@Author: JinCh
 *@Date: Created in 2019/3/8  15:26
 *@Description:
 */
package learn.Behavioral.Strategy;

public class Fighter extends Aircraft {
    public Fighter() {
    }

    public Fighter(String id, FlyType flyType, TakeOff takeOff) {
        super(id, flyType, takeOff);
    }
    @Override
    public void train(){
        System.out.println("一架战斗机开始飙机");
        super.train();
    }
}
