package com.example.mycalculator;

import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.squareup.picasso.Picasso;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

class RvAdapter extends RecyclerView.Adapter<RvAdapter.vholder>{
    ArrayList<Uri> data=new ArrayList<>();
    public RvAdapter(ArrayList<Uri> data){
        this.data=data;
    }
    @NonNull
    @Override
    public vholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View v=inflater.inflate(R.layout.item_view,parent,false);
        return new vholder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull vholder holder, int position) {
        Picasso.get()
                .load(data.get(position))
                .resize(400,400)
                .centerCrop()
                .into(holder.iv);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    class vholder extends RecyclerView.ViewHolder{
        ImageView iv;
        public vholder(@NonNull View itemView){
            super(itemView);
            iv=itemView.findViewById(R.id.iv);
        }
    }
}