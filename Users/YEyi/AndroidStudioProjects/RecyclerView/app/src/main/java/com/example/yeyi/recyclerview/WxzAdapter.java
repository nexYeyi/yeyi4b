package com.example.yeyi.recyclerview;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class  WxzAdapter extends RecyclerView.Adapter<WxzAdapter.ViewHolder> {

    private List<Wxz> mWxzList;

    static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView wxzImage;
        TextView wxzName;

        public ViewHolder(@NonNull View view) {
            super(view);
             wxzImage = (ImageView) view.findViewById(R.id.wxz_image);
             wxzName = (TextView) view.findViewById(R.id.wxz_name);
        }
    }

    public WxzAdapter (List<Wxz> wxzlist) {
        mWxzList = wxzlist;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.wxz_item, parent,false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Wxz wxz = mWxzList.get(position);
        holder.wxzImage.setImageResource(wxz.getImageId());
        holder.wxzName.setText(wxz.getName());

    }

    @Override
    public int getItemCount() {
        return mWxzList.size();
    }


}
