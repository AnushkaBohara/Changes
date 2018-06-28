package com.example.android.myproject;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by drishti on 27/6/18.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder>{


    private Context mContext;
    private List<Items> mdata;

    public RecyclerViewAdapter(Context mContext, List<Items> mdata) {
        this.mContext = mContext;
        this.mdata = mdata;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view;
        LayoutInflater mInflater= LayoutInflater.from(mContext);
        view = mInflater.inflate(R.layout.cardview_items,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.tv_store.setText(mdata.get(position).getStore());
        holder.tv_date.setText(mdata.get(position).getDate_purchase());
        holder.tv_amount.setText((int) mdata.get(position).getAmount());
        //set click listener
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });



    }

    @Override
    public int getItemCount() {
        return mdata.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        TextView tv_store,tv_date,tv_amount;
        CardView cardView;


        public MyViewHolder(View itemView) {
            super(itemView);

            tv_store= itemView.findViewById(R.id.store_text_id);
            tv_date= itemView.findViewById(R.id.date_text_id);
            tv_amount= itemView.findViewById(R.id.amount_text_id);
            cardView= itemView.findViewById(R.id.cardview_id);

        }
    }
}
