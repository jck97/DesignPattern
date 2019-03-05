/****
 *@Author: JinCh
 *@Date: Created in 2019/3/5  10:18
 *@Description:
 */
package learn.entity;

public class User {
    private String name;
    private int age;
    public User(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "姓名："+name + " 年龄：" + age;
    }
}
