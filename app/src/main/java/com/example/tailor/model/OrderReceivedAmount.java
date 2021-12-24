
package com.example.tailor.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class OrderReceivedAmount {

    @SerializedName("receivedAmountId")
    @Expose
    private Integer receivedAmountId;
    @SerializedName("orderId")
    @Expose
    private Integer orderId;
    @SerializedName("amount")
    @Expose
    private Integer amount;
    @SerializedName("date")
    @Expose
    private String date;

    public Integer getReceivedAmountId() {
        return receivedAmountId;
    }

    public void setReceivedAmountId(Integer receivedAmountId) {
        this.receivedAmountId = receivedAmountId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

}
