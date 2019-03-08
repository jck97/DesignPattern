/*
 *@Author: JinCh
 *@Date: Created in 2019/3/8  16:55
 *@Description:
 */
package learn.Behavioral.Mediator;
//代码来源:https://blog.csdn.net/lovelion/article/category/738450/4?
public abstract class Component {
    private Mediator mediator;

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    //转发调用
    public void changed() {
        mediator.componentChanged(this);
    }

    public abstract void update();
}

class Button extends Component {
    public void update() {
        //按钮不产生交互
    }
}

//列表框类：具体同事类
class List extends Component {
    public void update() {
        System.out.println("列表框增加一项：张无忌。");
    }

    public void select() {
        System.out.println("列表框选中项：小龙女。");
    }
}

//组合框类：具体同事类
class ComboBox extends Component {
    public void update() {
        System.out.println("组合框增加一项：张无忌。");
    }

    public void select() {
        System.out.println("组合框选中项：小龙女。");
    }
}

//文本框类：具体同事类
class TextBox extends Component {
    public void update() {
        System.out.println("客户信息增加成功后文本框清空。");
    }

    public void setText() {
        System.out.println("文本框显示：小龙女。");
    }
}
class Label extends Component {
    public void update() {
        System.out.println("文本标签内容改变，客户信息总数加1。");
    }
}
