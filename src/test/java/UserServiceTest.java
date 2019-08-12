import com.ssm.Application;
import com.ssm.po.User;
import com.ssm.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    public void testFindUserById(){
        System.out.println(this.userService.findUserById(6));
        System.out.println(this.userService.findUserById(6));
    }

    @Test
    public void testFindAll(){
        System.out.println(this.userService.findUserAll().size());

        User user = new User(16,"e344re","3324",25);
        user.setId(17);
        user.setName("bvc");
        user.setPassword("zxczx");
        user.setAge(24);
        this.userService.addUser(user);

        System.out.println(this.userService.findUserAll().size());
    }
}

