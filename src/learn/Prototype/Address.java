/****
 *@Author: JinCh
 *@Date: Created in 2019/2/25  22:09
 *@Description:
 */
package learn.Prototype;

import java.io.Serializable;

public class Address implements Cloneable,Serializable {
    private String street;
    private String Building;
    private String No;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getBuilding() {
        return Building;
    }

    public void setBuilding(String building) {
        Building = building;
    }

    public String getNo() {
        return No;
    }

    public void setNo(String no) {
        No = no;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", Building='" + Building + '\'' +
                ", No='" + No + '\'' +
                '}';
    }
}
