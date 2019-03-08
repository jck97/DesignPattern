/*
 *@Author: JinCh
 *@Date: Created in 2019/3/8  15:16
 *@Description:
 */
package learn.Behavioral.Strategy;

public abstract class Aircraft {
    private String id;
    private FlyType flyType;
    private TakeOff takeOff;

    public Aircraft() {
    }

    public void train(){
        System.out.println("Aircraft"+id+"ready");
        takeOff.takeOff(id);
        flyType.fly(id);
        System.out.println("Aircraft"+id+"landing");
    }
    
    public Aircraft(String id,FlyType flyType, TakeOff takeOff) {
        this.id = id;
        this.flyType = flyType;
        this.takeOff = takeOff;
    }

    public FlyType getFlyType() {
        return flyType;
    }

    public void setFlyType(FlyType flyType) {
        this.flyType = flyType;
    }

    public TakeOff getTakeOff() {
        return takeOff;
    }

    public void setTakeOff(TakeOff takeOff) {
        this.takeOff = takeOff;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
