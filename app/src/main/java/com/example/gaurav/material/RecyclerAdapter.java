package com.example.gaurav.material;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Gaurav on 14-06-2016.
 */
public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder> {

    private static final String TAG = RecyclerAdapter.class.getSimpleName() ;
    private List<Landscape> mData;
    private LayoutInflater mInflater;

    public RecyclerAdapter(Context context,List<Landscape> data){
        this.mData = data;
        this.mInflater = LayoutInflater.from(context);
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Log.d(TAG,"onCreateViewHolder");
         View view = mInflater.inflate(R.layout.list_item,parent,false);
         MyViewHolder holder = new MyViewHolder(view);
        return holder;

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public void onBindViewHolder(MyViewHolder holder, int position) {
        Log.d(TAG,"onBindViewHolder" + position);

        Landscape currentObj = mData.get(position);
        holder.setData(currentObj,position);
    }


    class  MyViewHolder extends RecyclerView.ViewHolder{

        TextView title;
        ImageView imgThumb,imgDelete,imgAdd;
        int position;
        Landscape currentObj;

        public MyViewHolder(View itemView) {
            super(itemView);
            title = (TextView) itemView.findViewById(R.id.tvTitle);

            imgThumb = (ImageView) itemView.findViewById(R.id.imgRow);
            imgAdd = (ImageView) itemView.findViewById(R.id.add);
            imgDelete = (ImageView) itemView.findViewById(R.id.delete);
        }

        public void setData(Landscape currentObj, int position) {
            this.title.setText(currentObj.getTitle());
            this.imgThumb.setImageResource(currentObj.getImageId());
            this.position = position;
            this.currentObj = currentObj;
        }


    }
}
