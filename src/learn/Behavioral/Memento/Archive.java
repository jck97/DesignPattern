/*
 *@Author: JinCh
 *@Date: Created in 2019/3/8  13:28
 *@Description:
 */
package learn.Behavioral.Memento;

public class Archive {
    protected int money;
    protected String sth;

    public Archive(int money, String sth) {
        this.money = money;
        this.sth = sth;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getSth() {
        return sth;
    }

    public void setSth(String sth) {
        this.sth = sth;
    }
}
