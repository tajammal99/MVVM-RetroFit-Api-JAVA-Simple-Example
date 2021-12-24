package com.example.tailor.model;

public class Order {

    private String orderId;
    private String orderNo;
    private String orderDesc;
    private String totalSuits;
    private String totalPrice;
    private String ramainingAmount;
    private String recievedAmount;
    private String discountAmount;
    private String orderStatus;
    private String orderDate;
    private String orderDeliveryDate;
    private String totalPerson;


    public String getOrderId() {
        return orderId;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public String getOrderDesc() {
        return orderDesc;
    }

    public String getTotalSuits() {
        return totalSuits;
    }

    public String getTotalPrice() {
        return totalPrice;
    }

    public String getRamainingAmount() {
        return ramainingAmount;
    }

    public String getRecievedAmount() {
        return recievedAmount;
    }

    public String getDiscountAmount() {
        return discountAmount;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public String getOrderDeliveryDate() {
        return orderDeliveryDate;
    }

    public String getTotalPerson() {
        return totalPerson;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public void setOrderDesc(String orderDesc) {
        this.orderDesc = orderDesc;
    }

    public void setTotalSuits(String totalSuits) {
        this.totalSuits = totalSuits;
    }

    public void setTotalPrice(String totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void setRamainingAmount(String ramainingAmount) {
        this.ramainingAmount = ramainingAmount;
    }

    public void setRecievedAmount(String recievedAmount) {
        this.recievedAmount = recievedAmount;
    }

    public void setDiscountAmount(String discountAmount) {
        this.discountAmount = discountAmount;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public void setOrderDeliveryDate(String orderDeliveryDate) {
        this.orderDeliveryDate = orderDeliveryDate;
    }

    public void setTotalPerson(String totalPerson) {
        this.totalPerson = totalPerson;
    }
}
