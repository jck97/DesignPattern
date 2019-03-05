/****
 *@Author: JinCh
 *@Date: Created in 2019/3/5  10:21
 *@Description:
 */
package learn.Iterator;

public interface PageIterator{
    public void paging(int num);
    public boolean hasNext();
    public Object[] nextPage();
}
