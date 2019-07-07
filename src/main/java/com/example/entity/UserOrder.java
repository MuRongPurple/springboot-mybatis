package com.example.entity;

import java.util.List;

public class UserOrder extends User {
    //一对多
    private List<Order> orderList;

    public List<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }
}
