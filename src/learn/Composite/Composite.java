/****
 *@Author: JinCh
 *@Date: Created in 2019/3/3  13:58
 *@Description:
 */
package learn.Composite;

import java.util.ArrayList;

interface IComponent{
    void show();
}
abstract class Single implements IComponent{
    public abstract void show() ;
}
abstract class SingleContent implements IComponent{
    private ArrayList<IComponent> singlelist = new ArrayList<>();
    public void show(){
        for (IComponent iComponent : singlelist) {
            iComponent.show();
        }
    }
    public IComponent add(IComponent ic){
        singlelist.add(ic);
        return ic;
    }
    public void remove(IComponent ic){
        singlelist.remove(ic);
    }
}
class Button extends Single{

    @Override
    public void show() {
        System.out.println("绘制按钮成功");
    }

}
class CheckBox extends Single{
    @Override
    public void show() {
        System.out.println("绘制选择栏成功");
    }

}
class Window extends SingleContent{}
class CenterPanel extends SingleContent{}
