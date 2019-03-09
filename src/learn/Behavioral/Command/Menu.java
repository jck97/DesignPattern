/*
 *@Author: JinCh
 *@Date: Created in 2019/3/9  15:40
 *@Description:
 */
package learn.Behavioral.Command;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    List<MenuItem> items;

    public void click(int i){
        items.get(i).click();
    }

    public void addItems(MenuItem item){
        items.add(item);
    }

    public Menu() {
        items = new ArrayList();
    }

    public Menu(List items) {
        this.items = items;
    }
}
