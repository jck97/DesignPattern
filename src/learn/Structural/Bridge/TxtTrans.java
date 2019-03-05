/****
 *@Author: JinCh
 *@Date: Created in 2019/3/2  20:34
 *@Description:
 */
package learn.Structural.Bridge;

public class TxtTrans extends DataTrans {
    @Override
    public void translate(String key) {
        System.out.println(
                dataSrc.query(key)+"转换为TXT!"
        );
    };
}
