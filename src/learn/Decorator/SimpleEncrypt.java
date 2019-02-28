/****
 *@Author: JinCh
 *@Date: Created in 2019/2/26  19:32
 *@Description:
 */
package learn.Decorator;

public class SimpleEncrypt implements Encrypt{
    private String pw;

    public SimpleEncrypt() {
    }

    public SimpleEncrypt(String pw) {
        this.pw = pw;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    @Override
    public String encrypt() {
        return pw;
    }
}
