/****
 *@Author: JinCh
 *@Date: Created in 2019/2/26  16:24
 *@Description:
 */
package learn.Structural.Decorator;

public abstract class Decorator implements Encrypt {
    protected Encrypt encrypt;
    public Decorator(){ };

    public Decorator( Encrypt encrypt){
        this.encrypt = encrypt;
    }

    public Encrypt getEncrypt() {
        return encrypt;
    }

    public void setEncrypt(Encrypt encrypt) {
            this.encrypt = encrypt;
    }
}
