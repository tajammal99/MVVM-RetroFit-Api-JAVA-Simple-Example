
package com.example.tailor.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class OrderSuit {

    @SerializedName("customerId")
    @Expose
    private Integer customerId;
    @SerializedName("customerName")
    @Expose
    private String customerName;
    @SerializedName("customerPhoneNo")
    @Expose
    private String customerPhoneNo;
    @SerializedName("customerFacePic")
    @Expose
    private String customerFacePic;
    @SerializedName("serviceId")
    @Expose
    private Integer serviceId;
    @SerializedName("servicePicture")
    @Expose
    private String servicePicture;
    @SerializedName("orderSuitId")
    @Expose
    private Integer orderSuitId;
    @SerializedName("orderSuitNo")
    @Expose
    private String orderSuitNo;
    @SerializedName("orderSuitName")
    @Expose
    private String orderSuitName;
    @SerializedName("orderSuitPic1")
    @Expose
    private Object orderSuitPic1;
    @SerializedName("orderSuitpic2")
    @Expose
    private Object orderSuitpic2;
    @SerializedName("orderPatternPic1")
    @Expose
    private Object orderPatternPic1;
    @SerializedName("orderPatternPic2")
    @Expose
    private Object orderPatternPic2;
    @SerializedName("orderSuitDesc")
    @Expose
    private String orderSuitDesc;
    @SerializedName("orderSuitPrice")
    @Expose
    private String orderSuitPrice;
    @SerializedName("numberOfPocket")
    @Expose
    private Integer numberOfPocket;
    @SerializedName("pocketType")
    @Expose
    private String pocketType;
    @SerializedName("indexOfPleats")
    @Expose
    private Integer indexOfPleats;
    @SerializedName("indexOfPocket")
    @Expose
    private Integer indexOfPocket;
    @SerializedName("collarType")
    @Expose
    private Object collarType;
    @SerializedName("indexOfCollar")
    @Expose
    private Integer indexOfCollar;
    @SerializedName("audio")
    @Expose
    private String audio;
    @SerializedName("pleats")
    @Expose
    private String pleats;
    @SerializedName("itemNumber")
    @Expose
    private String itemNumber;
    @SerializedName("orderSuitType")
    @Expose
    private String orderSuitType;
    @SerializedName("urgentStatus")
    @Expose
    private Boolean urgentStatus;
    @SerializedName("deliveryDate")
    @Expose
    private String deliveryDate;
    @SerializedName("orderSuitStatus")
    @Expose
    private String orderSuitStatus;
    @SerializedName("suitMeasurement")
    @Expose
    private List<SuitMeasurement> suitMeasurement = null;

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerPhoneNo() {
        return customerPhoneNo;
    }

    public void setCustomerPhoneNo(String customerPhoneNo) {
        this.customerPhoneNo = customerPhoneNo;
    }

    public String getCustomerFacePic() {
        return customerFacePic;
    }

    public void setCustomerFacePic(String customerFacePic) {
        this.customerFacePic = customerFacePic;
    }

    public Integer getServiceId() {
        return serviceId;
    }

    public void setServiceId(Integer serviceId) {
        this.serviceId = serviceId;
    }

    public String getServicePicture() {
        return servicePicture;
    }

    public void setServicePicture(String servicePicture) {
        this.servicePicture = servicePicture;
    }

    public Integer getOrderSuitId() {
        return orderSuitId;
    }

    public void setOrderSuitId(Integer orderSuitId) {
        this.orderSuitId = orderSuitId;
    }

    public String getOrderSuitNo() {
        return orderSuitNo;
    }

    public void setOrderSuitNo(String orderSuitNo) {
        this.orderSuitNo = orderSuitNo;
    }

    public String getOrderSuitName() {
        return orderSuitName;
    }

    public void setOrderSuitName(String orderSuitName) {
        this.orderSuitName = orderSuitName;
    }

    public Object getOrderSuitPic1() {
        return orderSuitPic1;
    }

    public void setOrderSuitPic1(Object orderSuitPic1) {
        this.orderSuitPic1 = orderSuitPic1;
    }

    public Object getOrderSuitpic2() {
        return orderSuitpic2;
    }

    public void setOrderSuitpic2(Object orderSuitpic2) {
        this.orderSuitpic2 = orderSuitpic2;
    }

    public Object getOrderPatternPic1() {
        return orderPatternPic1;
    }

    public void setOrderPatternPic1(Object orderPatternPic1) {
        this.orderPatternPic1 = orderPatternPic1;
    }

    public Object getOrderPatternPic2() {
        return orderPatternPic2;
    }

    public void setOrderPatternPic2(Object orderPatternPic2) {
        this.orderPatternPic2 = orderPatternPic2;
    }

    public String getOrderSuitDesc() {
        return orderSuitDesc;
    }

    public void setOrderSuitDesc(String orderSuitDesc) {
        this.orderSuitDesc = orderSuitDesc;
    }

    public String getOrderSuitPrice() {
        return orderSuitPrice;
    }

    public void setOrderSuitPrice(String orderSuitPrice) {
        this.orderSuitPrice = orderSuitPrice;
    }

    public Integer getNumberOfPocket() {
        return numberOfPocket;
    }

    public void setNumberOfPocket(Integer numberOfPocket) {
        this.numberOfPocket = numberOfPocket;
    }

    public String getPocketType() {
        return pocketType;
    }

    public void setPocketType(String pocketType) {
        this.pocketType = pocketType;
    }

    public Integer getIndexOfPleats() {
        return indexOfPleats;
    }

    public void setIndexOfPleats(Integer indexOfPleats) {
        this.indexOfPleats = indexOfPleats;
    }

    public Integer getIndexOfPocket() {
        return indexOfPocket;
    }

    public void setIndexOfPocket(Integer indexOfPocket) {
        this.indexOfPocket = indexOfPocket;
    }

    public Object getCollarType() {
        return collarType;
    }

    public void setCollarType(Object collarType) {
        this.collarType = collarType;
    }

    public Integer getIndexOfCollar() {
        return indexOfCollar;
    }

    public void setIndexOfCollar(Integer indexOfCollar) {
        this.indexOfCollar = indexOfCollar;
    }

    public String getAudio() {
        return audio;
    }

    public void setAudio(String audio) {
        this.audio = audio;
    }

    public String getPleats() {
        return pleats;
    }

    public void setPleats(String pleats) {
        this.pleats = pleats;
    }

    public String getItemNumber() {
        return itemNumber;
    }

    public void setItemNumber(String itemNumber) {
        this.itemNumber = itemNumber;
    }

    public String getOrderSuitType() {
        return orderSuitType;
    }

    public void setOrderSuitType(String orderSuitType) {
        this.orderSuitType = orderSuitType;
    }

    public Boolean getUrgentStatus() {
        return urgentStatus;
    }

    public void setUrgentStatus(Boolean urgentStatus) {
        this.urgentStatus = urgentStatus;
    }

    public String getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(String deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public String getOrderSuitStatus() {
        return orderSuitStatus;
    }

    public void setOrderSuitStatus(String orderSuitStatus) {
        this.orderSuitStatus = orderSuitStatus;
    }

    public List<SuitMeasurement> getSuitMeasurement() {
        return suitMeasurement;
    }

    public void setSuitMeasurement(List<SuitMeasurement> suitMeasurement) {
        this.suitMeasurement = suitMeasurement;
    }

}
