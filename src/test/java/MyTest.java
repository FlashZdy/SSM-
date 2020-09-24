import com.flash.pojo.Books;
import com.flash.pojo.User;
import com.flash.service.BookServiceImpl;
import com.flash.service.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MyTest {

    @Test
    public void test(){

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserServiceImpl userServiceImpl = context.getBean("userServiceImpl", UserServiceImpl.class);
        int i = userServiceImpl.addUser(new User(4, "d", "l"));
        System.out.println(i);

    }
}
