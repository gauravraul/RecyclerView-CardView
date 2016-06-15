package com.example.gaurav.material;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setUpRecyclerView();


    }

    private void setUpRecyclerView() {
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        RecyclerAdapter recyclerAdapter = new RecyclerAdapter(this,Landscape.getData());
        recyclerView.setAdapter(recyclerAdapter);

        LinearLayoutManager mLinearLayoutManagerVertical =  new LinearLayoutManager(this);
        mLinearLayoutManagerVertical.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(mLinearLayoutManagerVertical);

//        GridLayoutManager  mGridlayoutManager = new GridLayoutManager(this,2);
//        recyclerView.setLayoutManager(mGridlayoutManager);

        recyclerView.setItemAnimator(new DefaultItemAnimator());
    }
}
