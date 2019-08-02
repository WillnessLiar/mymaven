package com.ssm.service;

import com.ssm.po.User;

import java.util.List;


public interface UserService {

    void addUser(User user);
    List<User> findUserAll();
    User findUserById(Integer id);
    void updateUser(User user);
    void deleteUserById(Integer id);

//    @Autowired
//    private UserMapper userMapper;

//    public List<User> findAll() {
//        return userMapper.findAll();
//    }
}
