/****
 *@Author: JinCh
 *@Date: Created in 2019/3/3  11:28
 *@Description:
 */
package learn.Structural.Flyweight;

public class Gif extends IMedia {
    @Override
    public void display(Coordinates position) {
        System.out.println("display Gif in"+position);
    }
}
