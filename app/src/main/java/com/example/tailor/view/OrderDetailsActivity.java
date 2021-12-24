package com.example.tailor.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.tailor.R;

import java.util.Objects;

public class OrderDetailsActivity extends AppCompatActivity
{

    private TextView orderId,orderNo,orderDesc,totalSuits,totalPrice,ramainingAmount,
            recievedAmount,discountAmount,orderStatus,orderDate,orderDeliveryDate,totalPerson;

    private String strorderId,strorderNo,strorderDesc,strtotalSuits,strtotalPrice,strramainingAmount,
            strrecievedAmount,strdiscountAmount,strorderStatus,strorderDate,strorderDeliveryDate,
            strtotalPerson;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_details);

        Initialized();
        getDataFromAdapter();
        setDataToTextView();
    }

    private void Initialized()
    {
        orderId = findViewById(R.id.order_number);
        orderNo = findViewById(R.id.order_no);
        orderDesc = findViewById(R.id.order_desc);
        totalSuits = findViewById(R.id.total_suits);
        totalPrice = findViewById(R.id.total_price);
        ramainingAmount = findViewById(R.id.remaining_amount);
        recievedAmount = findViewById(R.id.received_amount);
        discountAmount = findViewById(R.id.discount_amount);
        orderStatus = findViewById(R.id.order_status);
        orderDate = findViewById(R.id.order_date);
        orderDeliveryDate = findViewById(R.id.order_delivery_date);
        totalPerson = findViewById(R.id.total_person);
    }



    private void getDataFromAdapter()
    {
        strorderId = Objects.requireNonNull(Objects.requireNonNull(getIntent().getExtras()).get("orderId")).toString();
        strorderNo = Objects.requireNonNull(Objects.requireNonNull(getIntent().getExtras()).get("orderNo")).toString();
        strorderDesc = Objects.requireNonNull(Objects.requireNonNull(getIntent().getExtras()).get("orderDesc")).toString();
        strtotalSuits = Objects.requireNonNull(Objects.requireNonNull(getIntent().getExtras()).get("totalSuits")).toString();
        strtotalPrice = Objects.requireNonNull(Objects.requireNonNull(getIntent().getExtras()).get("totalPrice")).toString();
        strramainingAmount = Objects.requireNonNull(Objects.requireNonNull(getIntent().getExtras()).get("ramainingAmount")).toString();
        strrecievedAmount = Objects.requireNonNull(Objects.requireNonNull(getIntent().getExtras()).get("recievedAmount")).toString();
        strdiscountAmount = Objects.requireNonNull(Objects.requireNonNull(getIntent().getExtras()).get("discountAmount")).toString();
        strorderStatus = Objects.requireNonNull(Objects.requireNonNull(getIntent().getExtras()).get("orderStatus")).toString();
        strorderDate = Objects.requireNonNull(Objects.requireNonNull(getIntent().getExtras()).get("orderDate")).toString();
        strorderDeliveryDate = Objects.requireNonNull(Objects.requireNonNull(getIntent().getExtras()).get("orderDeliveryDate")).toString();
        strtotalPerson = Objects.requireNonNull(Objects.requireNonNull(getIntent().getExtras()).get("totalPerson")).toString();
    }

    private void setDataToTextView()
    {
        orderId.setText("Order ID# "+strorderId);
        orderNo.setText("Order No:"+strorderNo);
        orderDesc.setText("order Desc:"+strorderDesc);
        totalSuits.setText("total Suits:"+strtotalSuits);
        totalPrice.setText("total Price:"+strtotalPrice);
        ramainingAmount.setText("remaining Amount:"+strramainingAmount);
        recievedAmount.setText("receivedAmount:"+strrecievedAmount);
        discountAmount.setText("discount Amount:"+strdiscountAmount);
        orderStatus.setText("order Status:"+strorderStatus);
        orderDate.setText("order Date:"+strorderDate);
        orderDeliveryDate.setText("order Delivery Date:"+strorderDeliveryDate);
        totalPerson.setText("total Person:"+strtotalPerson);
    }

}