package learn.Creational.AbstractFactory;

import learn.XMLUtil;
import org.junit.Test;

/** 
* AndroidFactory Tester.
* @version 1.0 
*/ 
public class AbstractFactoryTest {
/** 
* Method: createOC() 
*/ 
@Test
public void testAbstractFactory() throws Exception {
    OSFactory osFactory = (OSFactory)XMLUtil.getBean("AndroidFactory");
    assert osFactory != null;
    InterfaceController  ic = osFactory.createIC();
    OperationController oc = osFactory.createOC();
    ic.show();
    oc.Operate();
} 


} 
