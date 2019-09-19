package com.ssm.service;

import com.ssm.po.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    void addUser(User user);
    List<User> findUserAll();
    User findUserById(Integer id);
    void updateUser(User user);
    void deleteUserById(Integer id);
//    Page<User>findUserByPage(Pageable pageable);

//    @Autowired
//    private UserMapper userMapper;

//    public List<User> findAll() {
//        return userMapper.findAll();
//    }
}
