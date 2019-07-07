package com.example.service;

import com.example.entity.OrderUser;
import com.example.entity.User;
import com.example.entity.UserOrder;
import com.example.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author:0xOO
 * @Date: 2018/9/26 0026
 * @Time: 15:23
 */
@Service
public class UserService {
    @Autowired
    UserMapper userMapper;
    public User selectById(int id){
        return userMapper.selectById(id);
    }

    public void insertUser(User user){
        userMapper.insertUser(user);
    }

    public List<OrderUser> getOderUser(){
        return userMapper.findOrdersAndUserRstMap();
    }

    public OrderUser getOderUserByOrderId(int orderId){
        return userMapper.findOrdersAndUserRstMapByOrderId(orderId);
    }

    public UserOrder getUserAndOrderRstMapByUserId(int userId){
        return userMapper.findUserAndOrderRstMapByUserId(userId);
    }
}
