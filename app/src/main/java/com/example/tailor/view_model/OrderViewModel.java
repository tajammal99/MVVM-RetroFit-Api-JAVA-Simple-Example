package com.example.tailor.view_model;


import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.example.tailor.model.OrderMain;
import com.example.tailor.model.OrderStatus;
import com.example.tailor.repository.OrderRepository;
import com.example.tailor.response.OrderResponse;

import java.util.List;


public class OrderViewModel extends AndroidViewModel {


    LiveData<List<OrderMain>> liveData;
    LiveData<OrderStatus> liveDataStatus;
    OrderRepository orderRepository;

    public OrderViewModel(@NonNull Application application) {
        super(application);

        orderRepository = new OrderRepository();
    }

    public LiveData<List<OrderMain>> getTailorOrders(String tailorShopId)
    {
        liveData = orderRepository.getTailorOrders2(tailorShopId);
        return liveData;
    }

    public LiveData<OrderStatus> getOrderStatus(String orderId, String orderStatus)
    {
        liveDataStatus = orderRepository.getOrderStatus2(orderId,orderStatus);
        return liveDataStatus;
    }


}
