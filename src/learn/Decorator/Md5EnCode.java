/****
 *@Author: JinCh
 *@Date: Created in 2019/2/26  16:57
 *@Description:
 */
package learn.Decorator;
import org.apache.commons.codec.digest.DigestUtils;

public class Md5EnCode extends Decorator {
    public Md5EnCode(){};

    public Md5EnCode(Encrypt encrypt) {
        this.encrypt = encrypt;
    }

    @Override
    public String encrypt() {
        System.out.println("md5 加密");
        return DigestUtils.md5Hex(encrypt.encrypt());
    }
}
