/****
 *@Author: JinCh
 *@Date: Created in 2019/3/2  20:31
 *@Description:
 */
package learn.Structural.Bridge;

public class MySql implements SQL {
    @Override
    public String query(String key) {
        return "MySql查询到"+key+"的数据。";
    }
}
