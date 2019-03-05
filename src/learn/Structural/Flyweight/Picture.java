/****
 *@Author: JinCh
 *@Date: Created in 2019/3/3  11:25
 *@Description:
 */
package learn.Structural.Flyweight;

public class Picture extends IMedia {

    @Override
    public void display(Coordinates position) {
        System.out.println("在"+position+"展示图片");
    }
}
