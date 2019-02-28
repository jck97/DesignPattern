/****
 *@Author: JinCh
 *@Date: Created in 2019/2/24  20:23
 *@Description:
 */
package learn.AbstractFactory;

public class AndroidFactory implements OSFactory {
    @Override
    public InterfaceController createIC() {
        return new AndroidIC();
    }

    @Override
    public OperationController createOC() {
        return new AndroidOC();
    }
}
