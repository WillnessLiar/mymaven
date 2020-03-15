package com.ssm.service;

import com.ssm.po.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public interface UserService {

    void addUser(User user);
    List<User> findUserAll();
    User findUserById(Integer id);
    void updateUser(User user);
    void deleteUserById(Integer id);
    Map<String,Object> selectByUsername(String username);
    void register(Map<String,Object> user);
//    Page<User>findUserByPage(Pageable pageable);

//    @Autowired
//    private UserMapper userMapper;

//    public List<User> findAll() {
//        return userMapper.findAll();
//    }
}
