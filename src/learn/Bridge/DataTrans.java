/****
 *@Author: JinCh
 *@Date: Created in 2019/3/2  20:24
 *@Description:
 */
package learn.Bridge;


//Sunny软件公司欲开发一个数据转换工具，
// 可以将数据库中的数据转换成多种文件格式，例如txt、xml、pdf等格式，
// 同时该工具需要支持多种不同的数据库。
// 试使用桥接模式对其进行设计。
public abstract class DataTrans {
    protected SQL dataSrc;
    public abstract void translate(String key);

    public DataTrans() {
    }

    public DataTrans(SQL dataSrc) {
        this.dataSrc = dataSrc;
    }

    public SQL getDataSrc() {
        return dataSrc;
    }

    public void setDataSrc(SQL dataSrc) {
        this.dataSrc = dataSrc;
    }
}
