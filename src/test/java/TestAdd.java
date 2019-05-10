import com.lt.tansaction.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName: TestAdd
 * @Description: TODO
 * @Auther: 鸡蛋赶奶牛
 * @Date: 2019-05-05 15:21
 * @Version: 1.0
 */
public class TestAdd {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("application.xml");
        UserService userService = (UserService) applicationContext.getBean("userServiceImpl");
//        userService.add(null);
        userService.add2(null);
    }

}
