package com.comsats.population_mechanics;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.comsats.population_mechanics.databinding.ActivityRecyclerItemBinding;
import com.google.gson.Gson;

public class RecyclerItem extends AppCompatActivity {

    ActivityRecyclerItemBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityRecyclerItemBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        getSupportActionBar().setTitle("Detail Article");
        Articles article=new Gson().fromJson(getIntent().getStringExtra("data"),Articles.class);

        binding.recyclerItemViewerImage.setImageResource(article.getImage());
        binding.recyclerItemViewerAuthor.setText(article.getAuthor());
        binding.recyclerItemViewerDate.setText(article.getDate());
        binding.recyclerItemViewerHeading.setText(article.getTitle());
        binding.recyclerItemViewerLongDesc.setText(article.getDescription());
        binding.recyclerItemViewerShortDesc.setText(article.getShortDescription());

    }
}