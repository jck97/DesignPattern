/****
 *@Author: JinCh
 *@Date: Created in 2019/2/24  19:58
 *@Description:
 */
package learn.AbstractFactory;

public class SymbianFactory implements OSFactory {
    @Override
    public InterfaceController createIC() {
        return new SymbianIC();
    }

    @Override
    public OperationController createOC() {
        return new SymbianOC();
    }
}
