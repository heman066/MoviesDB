package com.example.moviesdb;

import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    private List<ListItems>listItems;
    private Context context;
    private String BASE_URL = "https://image.tmdb.org/t/p/w600_and_h900_bestv2/";

    public RecyclerViewAdapter(List<ListItems> listItems, Context context) {
        this.listItems = listItems;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_items,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        ListItems listItem = listItems.get(position);
        holder.title.setText(listItem.getTitle());
        holder.rating.setText(listItem.getRating());
        holder.language.setText(listItem.getLanguage());
        holder.releasedate.setText(listItem.getReleasedate());
        if(listItem.getAdult()) {
            holder.desc.setTextColor(Color.MAGENTA);
        }
        holder.desc.setText(listItem.getDescription());
        Picasso.with(context).load(BASE_URL+listItem.getImage()).into(holder.imageView);
    }

    @Override
    public int getItemCount() {
        return listItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        public TextView title,language,releasedate,rating,desc;
        public ImageView imageView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.title);
            language = itemView.findViewById(R.id.language);
            releasedate = itemView.findViewById(R.id.releasedate);
            rating = itemView.findViewById(R.id.rating);
            imageView = itemView.findViewById(R.id.image);
            desc = itemView.findViewById(R.id.desc);
        }
    }
}
