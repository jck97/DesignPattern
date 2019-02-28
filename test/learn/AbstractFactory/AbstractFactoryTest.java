package learn.AbstractFactory; 

import learn.XMLUtil;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After; 

/** 
* AndroidFactory Tester. 
* 
* User: ${USER}
* Date: ${YEAR}-${MONTH}-${DAY}
* Time: ${TIME}
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
