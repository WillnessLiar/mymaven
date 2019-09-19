//import com.ssm.Application;
//import com.ssm.dao.UserRepository;
//import com.ssm.dao.UserRepositoryByName;
//import com.ssm.po.User;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//
//import java.util.List;
//
//@RunWith(SpringJUnit4ClassRunner.class)
//@SpringBootTest(classes = Application.class)
//public class UserRepositoryTest {
//
//    @Autowired
//    private UserRepositoryByName userRepositoryByName;
//
//    @Autowired
//    private UserRepository userRepository;
//
//    @Test
//    public void testSave(){
//        User user = new User();
//        user.setId(25);
//        user.setName("run");
//        user.setPassword("no123");
//        user.setAge(8);
////        this.userRepository.save(user);
//    }
//
//    @Test
//    public void testFindByName(){
//        List<User> list = this.userRepositoryByName.findByName("cat");
//        for (User user : list){
//            System.out.println(user);
//        }
//    }
//
//}
