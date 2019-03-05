package learn.Creational.Builder;

import learn.XMLUtil;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After; 

/** 
* Client Tester.
* @version 1.0 
*/ 
public class BuilderTest {

/** 
* Method: main(String[] args) 
*/ 
@Test
public void testMain() throws Exception {
    ModeBuilder builder = (ModeBuilder)XMLUtil.getBean("ConciseMode");
    VideoPlayer vp = new ModeCtrl().constructor(builder);
    System.out.println(vp);
    VideoPlayer vp2 = vp.deepClone();
    System.out.println(vp2);
} 

} 
