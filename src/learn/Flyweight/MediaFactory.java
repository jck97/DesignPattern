/****
 *@Author: JinCh
 *@Date: Created in 2019/3/3  11:40
 *@Description:
 */
package learn.Flyweight;

import javax.print.attribute.standard.Media;
import java.util.HashMap;

public enum  MediaFactory {
    INSTANCE;
    private HashMap hm = new HashMap();
    public IMedia  getMedia(String key){
        return (IMedia) hm.get(key);
    }
    public boolean addMedia(String key, IMedia media){
        boolean res = true;
        if (hm.containsKey(key)){
            res = false;
        }else {
            hm.put(key,media);
        }
        return res;
    }
}
