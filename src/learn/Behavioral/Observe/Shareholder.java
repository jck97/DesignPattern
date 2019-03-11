/*
 *@Author: JinCh
 *@Date: Created in 2019/3/11  18:42
 *@Description:
 */
package learn.Behavioral.Observe;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class Shareholder implements PropertyChangeListener {
    private String name;

    public Shareholder(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        System.out.println(name+"收到信息!");
    }
}
