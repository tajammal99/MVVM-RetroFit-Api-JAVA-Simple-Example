package com.example.tailor.repository;


import android.util.Log;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.tailor.model.OrderMain;
import com.example.tailor.model.OrderStatus;
import com.example.tailor.response.OrderResponse;
import com.example.tailor.retrofit.ApiInterface;
import com.example.tailor.retrofit.ApiClient;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class OrderRepository {
    private static final String TAG = OrderRepository.class.getSimpleName();

    MutableLiveData<List<OrderMain>> mutableLiveData;
    MutableLiveData<OrderStatus> mutableLiveDataStatus;

    ApiClient apiClient;

    public OrderRepository() {
        mutableLiveData = new MutableLiveData<>();
        mutableLiveDataStatus = new MutableLiveData<>();
    }


    public void getOrderStatus(String orderId, String orderStatus)
    {
        apiClient = ApiClient.getInstance();
        apiClient.getOrderStatus(orderId,orderStatus, new Callback<OrderStatus>() {
            @Override
            public void onResponse(Call<OrderStatus> call, Response<OrderStatus> orderStatusResponse) {
                if(orderStatusResponse.isSuccessful())
                {
                    mutableLiveDataStatus.postValue(orderStatusResponse.body());
                    Log.e(TAG,"Order Status"+ orderStatusResponse.toString());
                }
                else
                {
                    mutableLiveDataStatus.postValue(null);
                    Log.e(TAG,"Order Status"+ orderStatusResponse.toString());
                }
            }

            @Override
            public void onFailure(Call<OrderStatus> call, Throwable t) {

                mutableLiveData.postValue(null);

                Log.e(TAG,"Error"+ t.toString());
            }
        });
    }

    public void getTailorOrders(String tailorShopId)
    {
        apiClient = ApiClient.getInstance();
        apiClient.getTailorOrders(tailorShopId, new Callback<List<OrderMain>>() {
            @Override
            public void onResponse(Call<List<OrderMain>> call, Response<List<OrderMain>> response) {
                if (response.isSuccessful())
                {
                    mutableLiveData.postValue(response.body());
                    Log.e(TAG,"Tailor Order Data"+ response.toString());
                }
                else
                {
                    mutableLiveData.postValue(null);
                    Log.e(TAG,"Tailor Order Data"+ response.toString());
                }
            }

            @Override
            public void onFailure(Call<List<OrderMain>> call, Throwable t) {

                mutableLiveData.postValue(null);

                Log.e(TAG,"Error"+ t.toString());
            }
        });
    }

    public LiveData<List<OrderMain>> getTailorOrders2(String tailorShopId)
    {
        getTailorOrders(tailorShopId);
        return mutableLiveData;
    }


    public LiveData<OrderStatus> getOrderStatus2(String orderId, String orderStatus)
    {
        getOrderStatus(orderId,orderStatus);
        return mutableLiveDataStatus;
    }

}
