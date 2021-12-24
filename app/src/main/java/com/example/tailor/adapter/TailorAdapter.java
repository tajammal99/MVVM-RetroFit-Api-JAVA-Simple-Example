package com.example.tailor.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tailor.R;

import com.example.tailor.model.OrderMain;
import com.example.tailor.view.OrderDetailsActivity;

import java.util.List;

public class TailorAdapter extends RecyclerView.Adapter<TailorAdapter.ViewHolder> {

    private Context context;
    List<OrderMain> orderArrayList;

    public TailorAdapter(Context context, List<OrderMain> orderArrayList) {
        this.context = context;
        this.orderArrayList = orderArrayList;
    }

    @NonNull
    @Override
    public TailorAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view=LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.main_list_item_layout,viewGroup,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TailorAdapter.ViewHolder viewHolder, int i) {
        OrderMain order = orderArrayList.get(i);
        viewHolder.txtOrderID.setText(String.valueOf(order.getOrderId()));
        viewHolder.txtOrderNo.setText(order.getOrderNo());
        viewHolder.txtOrderDesc.setText(order.getOrderDesc());
        viewHolder.txtOrderPrcie.setText(String.valueOf(order.getTotalPrice()));


        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(TailorAdapter.this.context, OrderDetailsActivity.class);
                intent.putExtra("orderId",String.valueOf(order.getOrderId()));
                intent.putExtra("orderNo",String.valueOf(order.getOrderNo()));
                intent.putExtra("orderDesc",String.valueOf(order.getOrderDesc()));
                intent.putExtra("totalSuits",String.valueOf(order.getTotalSuits()));
                intent.putExtra("totalPrice",String.valueOf(order.getTotalPrice()));
                intent.putExtra("ramainingAmount",String.valueOf(order.getRamainingAmount()));
                intent.putExtra("recievedAmount",String.valueOf(order.getRecievedAmount()));
                intent.putExtra("discountAmount",String.valueOf(order.getDiscountAmount()));
                intent.putExtra("orderStatus",String.valueOf(order.getOrderStatus()));
                intent.putExtra("orderDate",String.valueOf(order.getOrderDate()));
                intent.putExtra("orderDeliveryDate",String.valueOf(order.getOrderDeliveryDate()));
                intent.putExtra("totalPerson",String.valueOf(order.getTotalPerson()));
                TailorAdapter.this.context.startActivity(intent);

            }
        });

    }

    @Override
    public int getItemCount() {
        return orderArrayList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public final ImageView imgViewCover;
        private final TextView txtOrderID;
        private final TextView txtOrderNo;
        private final TextView txtOrderDesc;
        private final TextView txtOrderPrcie;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imgViewCover=itemView.findViewById(R.id.main_list_image);
            txtOrderID=itemView.findViewById(R.id.order_id_main_list);
            txtOrderNo=itemView.findViewById(R.id.order_no_main_list);
            txtOrderDesc=itemView.findViewById(R.id.order_desc_main_list);
            txtOrderPrcie=itemView.findViewById(R.id.order_total_price_main_list);
        }
    }
}
