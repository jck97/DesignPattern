/*
 *@Author: JinCh
 *@Date: Created in 2019/3/8  13:27
 *@Description:
 */
package learn.Behavioral.Memento;

public class Player {
    protected int money;
    protected String sth;

    public Archive save(){
        return new Archive(money,sth);
    };

    public void reload(Archive archive){
        this.sth = archive.sth;
        this.money = archive.money;
    };

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

    public Player() {
    }

    public Player(int money, String sth) {
        this.money = money;
        this.sth = sth;
    }

    @Override
    public String toString() {
        return "Player{" +
                "money=" + money +
                ", sth='" + sth + '\'' +
                '}';
    }
}
