package learn.Adapter; 

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After; 

/** 
* UserDaoImpl Tester. 
* 
* User: ${USER}
* Date: ${YEAR}-${MONTH}-${DAY}
* Time: ${TIME}
* @version 1.0 
*/ 
public class UserDaoImplTest {
@Test
public void testSave() throws Exception { 
    User user =  new User("username","password");
    IUserDao iUserDao = new UserDaoImpl();
    iUserDao.save(user);
}
} 
