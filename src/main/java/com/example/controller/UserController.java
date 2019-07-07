package com.example.controller;

import com.example.entity.OrderUser;
import com.example.entity.User;
import com.example.entity.UserOrder;
import com.example.service.UserService;
import com.sun.org.apache.xpath.internal.operations.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author:0xOO
 * @Date: 2018/9/26 0026
 * @Time: 14:42
 * GET（SELECT）：从服务器取出资源（一项或多项）。
 * POST（CREATE）：在服务器新建一个资源。
 * PUT（UPDATE）：在服务器更新资源（客户端提供改变后的完整资源）。
 * PATCH（UPDATE）：在服务器更新资源（客户端提供改变的属性）。
 * DELETE（DELETE）：从服务器删除资源。
 */

@RestController
@RequestMapping("/test-boot")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/users/{id}")
    public User GetUser(@PathVariable int id){
        User user =  userService.selectById(id);
        return user;
    }
    @PostMapping("/users")
    public void AddUser(@RequestBody User user){
        userService.insertUser(user);
    }

    @GetMapping("/order-users/all")
    public List<OrderUser> getOrderUser(){
        return userService.getOderUser();
    }

    @GetMapping("/order-users/{id}")
    public OrderUser getOrderUser(@PathVariable int id){
        return userService.getOderUserByOrderId(id);
    }

    @GetMapping("/user-orders/{id}")
    public UserOrder getUserOrder(@PathVariable int id){
        return userService.getUserAndOrderRstMapByUserId(id);
    }
}
