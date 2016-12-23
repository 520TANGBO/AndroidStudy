package com.example.tang.demo_recyclerview;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Tang on 2016/12/22.
 */

//
//简单RecyclerView
////
public class SimpleRecyclerActivity extends Activity {

    RecyclerView simpleRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.simple_main_recy);
        simpleRecyclerView=(RecyclerView) findViewById(R.id.simple_RecyclerView);
        simpleRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        simpleRecyclerView.setAdapter(new SimpleRecyclerAdaper());
    }
    class SimpleRecyclerAdaper extends RecyclerView.Adapter<SimpleRecyclerAdaper.SimpleRecyclerHolder>{

        List<String> datas;

        public SimpleRecyclerAdaper(){
            datas= new ArrayList<>();
            datas.add("name:tangbo");
            datas.add("phone:123456789");
            datas.add("addr:hunanshifan");
        }

        @Override
        public SimpleRecyclerHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            SimpleRecyclerHolder holder=new SimpleRecyclerHolder(LayoutInflater.from
                    (SimpleRecyclerActivity.this).inflate(R.layout.recy_textview,parent,false));
            return holder;
        }

        @Override
        public void onBindViewHolder(SimpleRecyclerHolder holder, int position) {
            holder.tv.setText(datas.get(position));
        }

        @Override
        public int getItemCount() {
            return datas.size();
        }

        class SimpleRecyclerHolder extends RecyclerView.ViewHolder{

            TextView tv;
            public SimpleRecyclerHolder(View itemView) {
                super(itemView);
                tv=(TextView)itemView.findViewById(R.id.id_num);
            }
        }
    }
}
