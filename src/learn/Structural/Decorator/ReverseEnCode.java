/****
 *@Author: JinCh
 *@Date: Created in 2019/2/26  16:51
 *@Description:
 */
package learn.Structural.Decorator;

public class ReverseEnCode extends Decorator {
    public ReverseEnCode(){};

    public ReverseEnCode(Encrypt encrypt) {
        this.encrypt = encrypt;
    }

    @Override
    public String encrypt() {
        System.out.println("反向加密");
        StringBuffer s = new StringBuffer(encrypt.encrypt());
        return String.valueOf(s.reverse());
    }
}
