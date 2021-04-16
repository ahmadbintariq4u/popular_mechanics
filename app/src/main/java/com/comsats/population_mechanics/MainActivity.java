package com.comsats.population_mechanics;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import android.widget.Toast;

import com.comsats.population_mechanics.databinding.ActivityMainBinding;

import java.util.Random;

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

        //new deme().thread.start();
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


//    class deme implements Runnable{
//
//        Thread thread=new Thread(this);
//        @Override
//        public void run() {
//            for(int a=1; a<123;) {
//                try {
//                    thread.sleep(500);
//                    change();
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//
//            }
//
//        }
//
//    }
//
//
//    Random random=new Random();
////    int[] colors = getResources().getIntArray(R.array.colors_hex_code);
//
//
//    public void change(){
//
//        runOnUiThread(new Runnable() {
//
//            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
//            @Override
//            public void run() {
//
//                Window window = getWindow();
//                window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
//                window.setStatusBarColor(Color.argb(255, random.nextInt(256), random.nextInt(256), random.nextInt(256)));
//
////                TextView text = (TextView) findViewById(R.id.textView);
////                text.setBackgroundColor();
////                ActionBar actionBar = null;
////                actionBar.setBackgroundDrawable(new ColorDrawable(Color.argb(255, random.nextInt(256), random.nextInt(256), random.nextInt(256))));
//            }
//        });
//
//    }


}