package com.example.tailor.retrofit;

import com.example.tailor.model.OrderMain;
import com.example.tailor.model.OrderStatus;
import com.example.tailor.response.OrderResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {

    @GET("OrderGet")
    Call<List<OrderMain>> getOrdersData(@Query("TailorShopId") String query);

    @GET("ChangeOrderStatus2")
    Call<OrderStatus> getOrderStatusData(@Query("OrderId") String orderId,
                                    @Query("OrderStatus") String orderStatus);

}
