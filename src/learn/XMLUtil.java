/****
 *@Author: JinCh
 *@Date: Created in 2019/2/24  20:29
 *@Description:
 */
package learn;
import javax.xml.parsers.*;
import org.w3c.dom.*;
import java.io.*;
import java.lang.reflect.Constructor;

public class XMLUtil {
    //该方法用于从XML配置文件中提取具体类类名，并返回一个实例对象
    public static Object getBean(String beanName) {
        try {
            //创建文档对象
            DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dFactory.newDocumentBuilder();
            Document doc;
            doc = builder.parse(new File("src/Config.xml"));

            //获取包含类名的文本节点
            NodeList nl = doc.getElementsByTagName(beanName);
            Node classNode=nl.item(0).getFirstChild();
            String cName=classNode.getNodeValue();

            //通过类名生成实例对象并将其返回
            Constructor c=Class.forName(cName).getDeclaredConstructors()[0];
            c.setAccessible(true);
            return c.newInstance();
        }
        catch(Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
