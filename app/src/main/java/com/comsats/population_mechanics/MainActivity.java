package com.comsats.population_mechanics;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import android.widget.Toast;

import com.comsats.population_mechanics.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    public static SharedPreferences preferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // hidding the action bar
        getSupportActionBar().hide();

        preferences = getSharedPreferences("loginCredentials", MODE_PRIVATE);
        boolean status = preferences.getBoolean("loginStatus", false);

        if(status){
            startNextActivity();
        }

    }


    public void login(View view) {


            String username = preferences.getString("username", "admin");
            String password = preferences.getString("password", "admin");

            if (username.equals(binding.username.getText().toString())) {

                if (password.equals(binding.password.getText().toString())) {

                    SharedPreferences.Editor editor=preferences.edit();
                    editor.putBoolean("loginStatus",true).commit();
                    startNextActivity();

                } else {
                    makeToast("Your password is Incorrect");
                }

            } else {
                makeToast("Your username is Incorrect");
            }

    }


    public void makeToast(String msg) {
        Toast toast = Toast.makeText(this, msg, Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.TOP | Gravity.CENTER, 0, 0);
        toast.show();
    }


    public void startNextActivity(){
        Intent intent = new Intent(MainActivity.this, HomeActivity.class);
        startActivity(intent);
        finish();
    }



}