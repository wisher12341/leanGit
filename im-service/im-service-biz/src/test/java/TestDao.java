import com.starsea.im.biz.dao.UserDao;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by beigua on 2015/8/12.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
        "classpath*:/config/spring/local/appcontext-*.xml"})
@Transactional
@TransactionConfiguration(transactionManager = "txManager", defaultRollback = false)
public class TestDao {
    @Autowired
    ApplicationContext ctx;

    @Test
    public void testRead() {
        UserDao userDao = (UserDao)ctx.getBean("userDao");
        System.out.print(userDao.queryUsers());
    }

    @Test
    public void testWrite(){
        UserDao userDao = (UserDao)ctx.getBean("userDao");
        System.out.print(userDao.queryUser(1));
    }
}