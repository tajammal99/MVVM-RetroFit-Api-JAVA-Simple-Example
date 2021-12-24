package com.example.tailor.response;

import com.example.tailor.model.Order;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class OrderResponse {
    @SerializedName("orderDesc")
    @Expose
    private String orderNo;
    @SerializedName("orderNo")
    @Expose
    private Integer orderId;
    @SerializedName("orderId")
    @Expose
    private List<Order> orders = null;

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public List<Order> getOrder() {
        return orders;
    }

    public void setOrder(List<Order> orders) {
        this.orders = orders;
    }
}
