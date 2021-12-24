package com.example.tailor.retrofit;

import static com.example.tailor.constants.ApiUri.BASE_URL;

import com.example.tailor.model.OrderMain;
import com.example.tailor.model.OrderStatus;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.List;
import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.Retrofit;

public class ApiClient {

    private static Retrofit retrofit;
    private ApiInterface apiInterface;
    private static ApiClient apiClient;
    private Gson gson;

    public ApiClient() {
        this.gson = new GsonBuilder().create();
      //  retrofit = getRetrofitInstance();

        retrofit = new retrofit2.Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .client(getClient())
                .build();

        this.apiInterface = retrofit.create(ApiInterface.class);
    }


    public static ApiClient getInstance() {
        if (apiClient == null) {
            setInstance(new ApiClient());
        }
        return apiClient;
    }

    private static void setInstance(ApiClient apiClient) {
        ApiClient.apiClient = apiClient;
    }

    private OkHttpClient getClient() {
        return new OkHttpClient.Builder()
                .addInterceptor(chain -> {
                    Request.Builder builder = chain.request().newBuilder();

                    return chain
                            .withConnectTimeout(9, TimeUnit.MINUTES)
                            .withWriteTimeout(9, TimeUnit.MINUTES)
                            .withReadTimeout(9, TimeUnit.MINUTES)
                            .proceed(builder.build());
                })
                .addInterceptor(new HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY))
                .build();
    }

    public static Retrofit getRetrofitInstance() {
        if (retrofit == null) {
            retrofit = new retrofit2.Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }



    public void getTailorOrders(String tailorShopId,Callback<List<OrderMain>> callback)
    {
        Call<List<OrderMain>> call = this.apiInterface.getOrdersData(tailorShopId);
        call.enqueue(callback);
    }

    public void getOrderStatus(String orderId,String orderStatus,Callback<OrderStatus> callback)
    {
        Call<OrderStatus> call = this.apiInterface.getOrderStatusData(orderId,orderStatus);
        call.enqueue(callback);
    }
}
