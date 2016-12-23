package com.example.tang.demo_recyclerview;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {


    @BindView(R.id.simple_View_btn)
    Button simpleViewBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.simple_View_btn)
    public void onClick() {
        Intent intent=new Intent(MainActivity.this,SimpleRecyclerActivity.class);
        startActivity(intent);
    }
}
