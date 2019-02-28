/****
 *@Author: JinCh
 *@Date: Created in 2019/2/24  20:24
 *@Description:
 */
package learn.AbstractFactory;

public class WinMobileFactory implements OSFactory {
    @Override
    public InterfaceController createIC() {
        return new WinMobileIC();
    }

    @Override
    public OperationController createOC() {
        return new WinMobileOC();
    }
}
