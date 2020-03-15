import com.ssm.Application;

import com.ssm.mapper.PhotoMapper;
import com.ssm.mapper.UserMapper;
import com.ssm.po.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
public class UserRepositoryTest {
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
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private PhotoMapper photoMapper;
    @Test
    public void testFindByName(){
        //把要插入的表的有效字段都封装到一个map中
//        Map<String, Object> objMap = new HashMap<>();
//        objMap.put("pdata", "xiaoming");
//        objMap.put("msg", "123");

        List<Map<String, Object>> map = photoMapper.select_photo();
    }

}
