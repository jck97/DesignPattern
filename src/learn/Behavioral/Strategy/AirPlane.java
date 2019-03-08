/*
 *@Author: JinCh
 *@Date: Created in 2019/3/8  15:28
 *@Description:
 */
package learn.Behavioral.Strategy;

public class AirPlane extends Aircraft{
    public AirPlane() {
    }

    public AirPlane(String id, FlyType flyType, TakeOff takeOff) {
        super(id, flyType, takeOff);
    }
    @Override
    public void train(){
        System.out.println("一架民航客机赶紧通过");
        super.train();
    }
}
