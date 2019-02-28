/****
 *@Author: JinCh
 *@Date: Created in 2019/2/26  16:13
 *@Description:
 */
package learn.Decorator;

public class ShiftEnCode extends Decorator{
    public ShiftEnCode(){};

    public ShiftEnCode(Encrypt encrypt) {
        this.encrypt = encrypt;
    }

    @Override
    public String encrypt() {
        System.out.println("移位加密");
        char[] s = encrypt.encrypt().toCharArray();
        for (int i = 0; i < s.length; i++) {
            s[i]+=2;
        }
        return new String(s);
    }
}
