package com.example.zgr.recycleviewdemo;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zgr on 16/4/21.
 */
public class MySimpleAdapter extends RecyclerView.Adapter<MyViewHolder> {


    private List<String> myArrays;
    private Context context;
    private LayoutInflater inflater;

    public MySimpleAdapter(Context context,List<String> datas){
        this.myArrays = datas;
        this.context = context;
        inflater = LayoutInflater.from(context);
    }
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        MyViewHolder holder = new MyViewHolder(LayoutInflater.from(context).inflate(R.layout.layout_item,parent,false));

        return holder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.tv.setText(myArrays.get(position));
    }

    @Override
    public int getItemCount() {
        return myArrays.size();
    }
}


class MyViewHolder extends RecyclerView.ViewHolder{

    TextView tv;
    public MyViewHolder(View itemView) {
        super(itemView);
        tv = (TextView) itemView.findViewById(R.id.textView);
    }
}