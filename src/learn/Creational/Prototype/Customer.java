/****
 *@Author: JinCh
 *@Date: Created in 2019/2/25  22:08
 *@Description:
 */
package learn.Creational.Prototype;

import java.io.*;

public class Customer implements Cloneable,Serializable{
    private int id;
    private Address address;
    public Customer clone(){
        Customer res = null;
        try {
            res = (Customer) super.clone();
        }catch (CloneNotSupportedException e) {
            System.out.println("没有克隆函数");
        }
        return res;
    }
    public Customer deepClone(){
        Customer res = null;
        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);
            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            res = (Customer) ois.readObject();
        }catch (ClassNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e){
            System.out.println("deepClone 流问题");
        }
        return res;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", address=" + address +
                '}';
    }
}
