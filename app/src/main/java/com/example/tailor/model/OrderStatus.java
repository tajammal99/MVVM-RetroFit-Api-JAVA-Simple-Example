
package com.example.tailor.model;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;


public class OrderStatus{

    @SerializedName("isResponse")
    @Expose
    private Boolean isResponse;
    @SerializedName("isOrderExist")
    @Expose
    private Boolean isOrderExist;
    @SerializedName("orderstatus")
    @Expose
    private Boolean orderstatus;

    public Boolean getIsResponse() {
        return isResponse;
    }

    public void setIsResponse(Boolean isResponse) {
        this.isResponse = isResponse;
    }

    public Boolean getIsOrderExist() {
        return isOrderExist;
    }

    public void setIsOrderExist(Boolean isOrderExist) {
        this.isOrderExist = isOrderExist;
    }

    public Boolean getOrderstatus() {
        return orderstatus;
    }

    public void setOrderstatus(Boolean orderstatus) {
        this.orderstatus = orderstatus;
    }

}
