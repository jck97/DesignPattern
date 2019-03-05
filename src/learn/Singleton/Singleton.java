/****
 *@Author: JinCh
 *@Date: Created in 2019/2/23  19:29
 *@Description:
 */
package learn.Singleton;

import java.io.*;

//关于单例模式的写法:https://www.cnblogs.com/zhaoyan001/p/6365064.html
//Java 1.5 后使用枚举
public enum Singleton implements Serializable {
    INSTANCE;
    private String desc;

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "Singleton{" +
                "desc='" + desc + '\'' +
                '}';
    }

    public void otherMethod(){
        System.out.println("其他特殊操作！！！");
    }

    public static void main(String[] arg)throws IOException,ClassNotFoundException{
        Singleton s1 = Singleton.INSTANCE;
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("obj.txt"));
        s1.setDesc("枚举类型序列化");
        oos.writeObject(s1);
        oos.flush();
        oos.close();

        s1.setDesc("枚举序列化方式特殊");
        Singleton s2;
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("obj.txt"));
        s2 = (Singleton) ois.readObject();
        System.out.println(s2);
        System.out.println("s1和s2是同一个对象:"+ (s1==s2));
    }
}

//传统写法 以下写法都可以通过反射调用构造不同对象。
//public class Singleton {


    //private Singleton(){};

    /*
    * 静态内部类
    private static class SingleTonInstance{
        private final static Singleton instance = new Singleton();
    }
    public static Singleton getInstance(){
        return SingleTonInstance.instance;
    }
    * */

    /*
    * 双重检测
    private static Singleton instance;
    public Singleton getInstance(){
        if (instance == null){
            synchronized (Singleton.class){
                if (instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
    * */
    /*
    * 懒汉式--锁函数 不推荐
    private static Singleton instance;
    public static synchronized Singleton getInstance(){
        if (instance == null){
            instance = new Singleton();
        }
        return instance;
    }
    * */

    /*
    * 饿汉式--使用静态常量
    private final static Singleton instance = new Singleton();
    public Singleton getInstance(){
        return instance;
    }
    * */
//}
