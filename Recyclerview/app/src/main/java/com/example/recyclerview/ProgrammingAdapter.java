package com.example.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ProgrammingAdapter extends RecyclerView.Adapter<ProgrammingAdapter.programmingviewHolder>{

    private String[] data;
    public ProgrammingAdapter (String[] data)
    {
       this.data = data;
    }

    @Override
    public programmingviewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.list_item_layout, parent, false);
        return new programmingviewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull programmingviewHolder holder, int position) {
        String title = data[position];
        holder.texttittle.setText(title);

    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    public class programmingviewHolder extends RecyclerView.ViewHolder{
        ImageView imgIcon;
        TextView texttittle;
        public programmingviewHolder(@NonNull View itemView) {
            super(itemView);
            imgIcon = itemView.findViewById(R.id.imgIcon);
            texttittle = itemView.findViewById(R.id.texttitle);
        }
    }

}
