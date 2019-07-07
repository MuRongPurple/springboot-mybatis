package com.example.mapper;

import com.example.entity.OrderUser;
import com.example.entity.User;
import com.example.entity.UserOrder;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author:0xOO
 * @Date: 2018/9/26 0026
 * @Time: 15:20
 */
@Repository
public interface UserMapper {

    User Sel(int id);

    User selectById(int id);

    void insertUser(User user);

    List<OrderUser> findOrdersAndUserRstMap();

    OrderUser findOrdersAndUserRstMapByOrderId(int orderId);

    UserOrder findUserAndOrderRstMapByUserId(int userId);
}
