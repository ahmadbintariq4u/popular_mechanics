package com.comsats.population_mechanics;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.comsats.population_mechanics.databinding.ActivityHomeBinding;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {

    ActivityHomeBinding binding;
    RecyclerViewAdapter adapter;
    ArrayList<Articles> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityHomeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        list=Articles.getSampleData();

        binding.recycler.setLayoutManager(new LinearLayoutManager(this));
        adapter=new RecyclerViewAdapter(this,list);
        binding.recycler.setAdapter(adapter);
    }

    Intent intent;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.option_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if(item.getItemId()==R.id.cli){

            intent=new Intent(HomeActivity.this,ChangeLoginInfo.class);
            startActivity(intent);
            //finish();

        }else{

            SharedPreferences.Editor editor=MainActivity.preferences.edit();
            editor.putBoolean("loginStatus",false);
            editor.commit();

            intent=new Intent(HomeActivity.this,MainActivity.class);
            startActivity(intent);
            finish();
        }

        return true;
    }
}