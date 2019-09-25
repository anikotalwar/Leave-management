package com.example.shivani.sample.Leave1;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.shivani.sample.ApplyLeave;
import com.example.shivani.sample.R;

import java.lang.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by shivani on 14-11-2018.
 */

class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.CustomViewHolder> {

    //private String[] leave_type;
   // private Integer[] no_of_leaves;
    private HashMap<String,Double> m;
    private ArrayList<String> leave_type = new ArrayList<>();
    private ArrayList<String> no_of_leaves = new ArrayList<>();
    private Context context;
    private  String emp_code;


    public CustomAdapter(HashMap<String,Double> m,Context context,String emp_code){
        this.context = context;
        this.emp_code = emp_code;
        this.m = m;
        for(Map.Entry<String,Double> k:m.entrySet()){
            System.out.println(k.getKey()+" "+k.getValue());
            leave_type.add(k.getKey());
            no_of_leaves.add(Double.toString(k.getValue()));
        }
        //this.no_of_leaves = no_of_leaves;
    }


    @Override
    public CustomViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.listitem,parent,false);
        return new CustomViewHolder(view);
    }
//
//    @Override
//    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
//
//    }

    @Override
    public void onBindViewHolder(CustomViewHolder holder, int position) {

            String leave_type2 = leave_type.get(position);
            holder.leave_type1.setText(leave_type2);
            String leave_nos = no_of_leaves.get(position);
            holder.leave_nos.setText(leave_nos);

            holder.setItemClickListener(new ItemClickListener() {
                @Override
                public void onClick(View view, int position, boolean isLongClick) {

                        Toast.makeText(context,leave_type.get(position),Toast.LENGTH_SHORT).show();

                    Intent myIntent;
                    myIntent = new Intent(context, ApplyLeave.class);
                     myIntent.putExtra("Code",emp_code);

                     myIntent.putExtra("leave_category", leave_type.get(position)); //Optional parameters
                    // System.out.println("$$$$$$$$$$ in applyfunc1");
                    context.startActivity(myIntent);



                }
            });
//        String leave_type2 =
//                holder.leave_type1.setText(leave_type2);
//        String leave_nos = Double.toString(k.getValue());
//        holder.leave_nos.setText(leave_nos);

    }

    @Override
    public int getItemCount() {
        //return leave_type.length;
        return m.size();
    }


    public class CustomViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener,View.OnLongClickListener{

        public TextView leave_type1,leave_nos;
        private ItemClickListener itemClickListener;

        public CustomViewHolder(View itemView) {
            super(itemView);
            leave_type1 = (TextView)itemView.findViewById(R.id.leave_type);
            leave_nos = (TextView)itemView.findViewById(R.id.leave_nos);
            itemView.setOnClickListener(this);
            itemView.setOnLongClickListener(this);
        }
        public void setItemClickListener(ItemClickListener itemClickListener)
        {
            this.itemClickListener = itemClickListener;
        }

        @Override
        public void onClick(View v) {
            itemClickListener.onClick(v,getAdapterPosition(),false);
        }

        @Override
        public boolean onLongClick(View v) {
            itemClickListener.onClick(v,getAdapterPosition(),true);
            return true;
        }
    }
}
