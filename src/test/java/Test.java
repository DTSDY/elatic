import com.sy.SpringBootStartApp;
import com.sy.base.dao.UserDao1;
import com.sy.base.dao.UserDao2;
import com.sy.base.dao.UserDao3;
import com.sy.base.pojo.User;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.math.BigInteger;

/**
 * @author ssssyy
 * 2019/12/5 9:28
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = SpringBootStartApp.class)
public class Test {

    @Resource
    UserDao1 userDao1;
    @Resource
    UserDao2 userDao2;
    @Resource
    UserDao3 userDao3;

    //给三张表分别插入  1000条 完成订单数据
    @org.junit.Test
    public void stest() {
        for (int i = 0; i < 1000; i++) {
            User user = new User(new BigInteger(String.valueOf(i)),new BigInteger(String.valueOf(1000+i)),new BigInteger(String.valueOf(1000+i)),new BigInteger(String.valueOf(5)) );
            userDao1.add(user);
        }
        for (int i = 0; i < 1000; i++) {
            User user = new User(new BigInteger(String.valueOf(i)),new BigInteger(String.valueOf(1000+i)),new BigInteger(String.valueOf(1000+i)),new BigInteger(String.valueOf(5)) );
            userDao2.add(user);
        }
        for (int i = 0; i < 1000; i++) {
            User user = new User(new BigInteger(String.valueOf(i)),new BigInteger(String.valueOf(1000+i)),new BigInteger(String.valueOf(1000+i)),new BigInteger(String.valueOf(5)) );
            userDao3.add(user);
        }

    }
}
