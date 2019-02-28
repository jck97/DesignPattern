/****
 *@Author: JinCh
 *@Date: Created in 2019/2/27  10:10
 *@Description:
 */
package learn.Adapter;

import learn.Decorator.*;

public class UserDaoImpl implements IUserDao{
    private Encrypt encrypt;
    private SimpleEncrypt se;

    public UserDaoImpl() {
        se =  new SimpleEncrypt("not encoding");
        Encrypt ds = new ShiftEnCode(se);
        Encrypt dsr = new ReverseEnCode(ds);
        encrypt = new Md5EnCode(dsr);
    }

    @Override
    public void save(User user) {
        se.setPw(user.getPw());
        user.setPw(encrypt.encrypt());
        se.setPw(user.getUsername());
        user.setUsername(encrypt.encrypt());
        System.out.println("save the user!");
        System.out.println(user);
    }
}
