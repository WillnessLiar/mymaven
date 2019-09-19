//import com.ssm.Application;
//import com.ssm.po.User;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.data.redis.core.RedisTemplate;
//import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
//import org.springframework.data.redis.serializer.JdkSerializationRedisSerializer;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//
//@RunWith(SpringJUnit4ClassRunner.class)
//@SpringBootTest(classes = Application.class)
//public class RedisTest {
//
//    @Autowired
//    private RedisTemplate<String, Object> redisTemplate;
//
//    //    添加一个字符串
//    @Test
//    public void testSet() {
//        this.redisTemplate.opsForValue().set("key", "hello okkk呵呵!!! ");
//    }
//
//    //    取出字符串
//    @Test
//    public void testGet() {
//        String value = (String) this.redisTemplate.opsForValue().get("key");
//        System.out.println(value);
//    }
//
//    //    添加一个user对象
//    @Test
//    public void tsesetUser() {
//        User user = new User(20, "可乐", "12211", 20);
////        设置序列化器
//        this.redisTemplate.setValueSerializer(new JdkSerializationRedisSerializer());
//        this.redisTemplate.opsForValue().set("user", user);
//    }
//
//    //    取user对象
//    @Test
//    public void tsegetUser() {
//        this.redisTemplate.setValueSerializer(new JdkSerializationRedisSerializer());
//        User user = (User) this.redisTemplate.opsForValue().get("user");
//        System.out.println(user);
//    }
//
////    基于json格式存储user对象
//    @Test
//    public void tseSetUserJson() {
//        User user = new User(21, "雪碧", "33311", 25);
////        user.setId(25);
////        user.setName("拉菲");
////        user.setPassword("55545");
////        user.setAge(82);
//        this.redisTemplate.setValueSerializer(new Jackson2JsonRedisSerializer<>(User.class));   //序列化
//        this.redisTemplate.opsForValue().set("user_json", user);
//    }
//
//    //    基于json格式取user对象
//    @Test
//    public void tseGetUserJson() {
//        this.redisTemplate.setValueSerializer(new Jackson2JsonRedisSerializer<>(User.class));
//        System.out.println(this.redisTemplate.opsForValue().get("user_json"));
////        User user = (User)this.redisTemplate.opsForValue().get("user_json");
////        System.out.println(user);
//    }
//}
//
