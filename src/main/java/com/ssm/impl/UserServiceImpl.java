package com.ssm.impl;

import com.ssm.mapper.UserMapper;
import com.ssm.po.User;
import com.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

//    @Autowired
//    private UserRepository userRepository;

    @Override
//    @CacheEvict(value = "user",allEntries = true)     /*清除缓存*/
    public void addUser(User user) {
        this.userMapper.insertUser(user);
    }

    @Override
//    @Cacheable(value = "user")
    public List<User> findUserAll() {
        return this.userMapper.selectUserAll();
    }

    @Override
//    @Cacheable(value = "user",key = "#id")          /*对当前对象做缓存*/
    public User findUserById(Integer id) {
        return this.userMapper.selectUserById(id);
    }

    @Override
    public void updateUser(User user) {
        this.userMapper.updateUser(user);
    }

    @Override
    public void deleteUserById(Integer id) {
        this.userMapper.deleteUserById(id);

    }

    @Override
    public Map<String, Object> selectByUsername(String username) {
        return userMapper.selectByUsername(username);
    }

    @Override
    public void register(Map<String, Object> user) {
        userMapper.register(user);
    }


//    @Override
//    public Page<User> findUserByPage(Pageable pageable) {
//        return null;
//    }

}
