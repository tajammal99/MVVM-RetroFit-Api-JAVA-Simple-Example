package com.example.tailor.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;

import com.example.tailor.R;
import com.example.tailor.adapter.TailorAdapter;
import com.example.tailor.model.Order;
import com.example.tailor.model.OrderMain;
import com.example.tailor.model.OrderStatus;
import com.example.tailor.view_model.OrderViewModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity
{
    EditText searchBar;
    RecyclerView my_recycler_view;

    private static final String TAG = MainActivity.class.getSimpleName();
    private ProgressBar progress_circular;
    private LinearLayoutManager layoutManager;
    private TailorAdapter adapter;
    private ArrayList<OrderMain> orderArrayList = new ArrayList<>();
    OrderViewModel orderViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       initialization();

      setObserver();
      setObserverStatus();
    }


    private void initialization() {
        progress_circular =  findViewById(R.id.progress_circular);
        my_recycler_view =  findViewById(R.id.recycle_view);

        layoutManager = new LinearLayoutManager(MainActivity.this);
        my_recycler_view.setLayoutManager(layoutManager);

        my_recycler_view.setHasFixedSize(true);
    }

    private void setObserverStatus()
    {
        orderViewModel = new ViewModelProvider(this).get(OrderViewModel.class);
        orderViewModel.getOrderStatus("227","Order").observe(this, new Observer<OrderStatus>() {
            @Override
            public void onChanged(OrderStatus orderStatus) {
                if (orderStatus!=null)
                {
                    progress_circular.setVisibility(View.GONE);
                    Log.e(TAG,"Tailor Order Data"+ orderStatus.toString());
                }
            }
        });
    }

    private void setObserver()
    {
        orderViewModel = new ViewModelProvider(this).get(OrderViewModel.class);
        orderViewModel.getTailorOrders("46").observe(this, new Observer<List<OrderMain>>() {
            @Override
            public void onChanged(List<OrderMain> orderMains) {
                if (orderMains!=null)
                {
                    progress_circular.setVisibility(View.GONE);
                    Log.e(TAG,"Tailor Order Data"+ orderMains.toString());

                    adapter = new TailorAdapter(MainActivity.this, orderMains);
                    my_recycler_view.setAdapter(adapter);

                }
            }
        });
    }
}