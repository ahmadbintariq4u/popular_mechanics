package com.comsats.population_mechanics;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.gson.Gson;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolderForRecyler> {

    Context context;
    ArrayList<Articles> articlesList;


    public RecyclerViewAdapter(Context context, ArrayList<Articles> articlesList) {
        this.context = context;
        this.articlesList = articlesList;
    }


    @NonNull
    @Override
    public ViewHolderForRecyler onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_recyler_template,parent,false);
        return new ViewHolderForRecyler(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderForRecyler holder, int position) {

        Articles article=articlesList.get(position);
        holder.image.setImageResource(article.image);
        holder.author.setText(article.author);
        holder.shortDescription.setText(article.shortDescription);
        holder.heading.setText(article.title);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(context,RecyclerItem.class);
                String data=new Gson().toJson(article);
                intent.putExtra("data",data);
                holder.itemView.getContext().startActivity(intent);
            }
        });



    }

    @Override
    public int getItemCount() {

        return articlesList.size();
    }

    public class ViewHolderForRecyler extends RecyclerView.ViewHolder {

        TextView heading;
        TextView shortDescription;
        TextView author;
        ImageView image;

        public ViewHolderForRecyler(@NonNull View itemView) {
            super(itemView);

            heading=itemView.findViewById(R.id.recycler_item_viewer_heading);
            shortDescription=itemView.findViewById(R.id.recycler_item_viewer_shortDesc);
            author=itemView.findViewById(R.id.recycler_item_viewer_author);
            image=itemView.findViewById(R.id.image);



        }

    }



}
