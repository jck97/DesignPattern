/*
 *@Author: JinCh
 *@Date: Created in 2019/3/8  13:29
 *@Description:
 */
package learn.Behavioral.Memento;

import java.util.ArrayList;
import java.util.List;

public class RebirthPoint {
    private List<Archive> archives = new ArrayList<Archive>();
    public Archive getArchive(int i){
        return (Archive)archives.get(i);
    }
    public void addArchive(Archive archive){
        archives.add(archive);
    }
}
