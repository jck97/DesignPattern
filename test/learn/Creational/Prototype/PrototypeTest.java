package learn.Creational.Prototype;

import org.junit.Test;

/** 
* Client Tester.
* @version 1.0 
*/ 
public class PrototypeTest {
@Test
public void testMain() throws Exception {
    Address addr = new Address();
    addr.setNo("123号");
    addr.setBuilding("白玉兰宾馆");
    addr.setStreet("白玉兰大街");
    Customer cus = new Customer();
    cus.setAddress(addr);
    cus.setId(123);
    Customer shallowCus = cus.clone();
    Customer deepCus = cus.deepClone();
    cus.getAddress().setStreet("白玉兰大街拆迁了");
    cus.getAddress().setBuilding("白玉兰宾馆搬家了");
    addr.setNo("000号");
    System.out.println("shallow cus:"+shallowCus);
    System.out.println("deepCus:"+deepCus);
}
} 
