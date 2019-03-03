package learn.Decorator; 

import org.junit.Test;

/** 
* Decorator Tester.
* @version 1.0 
*/ 
public class DecoratorTest { 
    @Test
    public void main(){
        Encrypt ds = new ShiftEnCode((Encrypt) new SimpleEncrypt("not encoding"));
        Decorator dsr = new ReverseEnCode(ds);
        Decorator dsrm = new Md5EnCode(dsr);
        System.out.println(dsrm.encrypt());
    }

} 
