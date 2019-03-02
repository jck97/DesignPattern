/****
 *@Author: JinCh
 *@Date: Created in 2019/3/2  20:33
 *@Description:
 */
package learn.Bridge;

public class NoSql implements SQL {
    @Override
    public String query(String key) {
        return "NoSql查询到"+key+"的数据。";
    }
}
