package com.comsats.population_mechanics;

import android.app.AlertDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.comsats.population_mechanics.databinding.ActivityMainBinding;
import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;
import com.github.florent37.viewanimator.ViewAnimator;


public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    public static SharedPreferences preferences;
    public Handler handler;

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

        handler=new Handler();
        handler.post(runnable);

        //new deme().thread.start();

        if(preferences.getBoolean("new",true)) {
            AlertDialog.Builder dialog = new AlertDialog.Builder(this).setTitle("Attention!").setMessage("Default username: admin\nDefault password: admin\n\nWelcome to Popular Mechanics");
            dialog.setPositiveButton("OK", null);
            dialog.show();
        }

        ViewAnimator
                .animate(binding.labelPopular)
                .translationY(-1000, 0)
                .alpha(0,1)
                .start();



        YoYo.with(Techniques.Wobble)
                .duration(3000)
                .repeat(YoYo.INFINITE)
                .playOn(binding.labelPopular);

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
                    YoYo.with(Techniques.Shake)
                            .duration(500)
                            .repeat(1)
                            .playOn(binding.password);
                }

            } else {
                makeToast("Your username is Incorrect");
                YoYo.with(Techniques.Shake)
                        .duration(500)
                        .repeat(1)
                        .playOn(binding.username);
            }

            if(binding.username.getText().toString().equals("")){
                YoYo.with(Techniques.Shake)
                        .duration(500)
                        .repeat(1)
                        .playOn(binding.username);
            }
             if(binding.password.getText().toString().equals("") && !binding.username.getText().toString().equals("")){
                YoYo.with(Techniques.Shake)
                        .duration(500)
                        .repeat(1)
                        .playOn(binding.password);
            }




    }


    public void makeToast(String msg) {
        Toast toast = Toast.makeText(this, msg, Toast.LENGTH_SHORT);
        //toast.setGravity(Gravity.TOP | Gravity.CENTER, 0, 0);
        toast.show();
    }


    public void startNextActivity(){
        Intent intent = new Intent(MainActivity.this, HomeActivity.class);
        startActivity(intent);
        finish();
    }


    // Task for background comparision

    Runnable runnable=new Runnable() {
        @Override
        public void run() {

            if(!binding.username.getText().toString().equals("")){
                if(binding.username.getText().toString().equals(preferences.getString("username","admin"))){
                    binding.username.setCompoundDrawablesWithIntrinsicBounds(0,0, R.drawable.line_green,0);
                }else{
                    binding.username.setCompoundDrawablesWithIntrinsicBounds(0,0, R.drawable.line_red,0);
                }
            } else{
                binding.username.setCompoundDrawablesWithIntrinsicBounds(0,0, R.drawable.line_yellow,0);
            }


            if(!binding.password.getText().toString().equals("")){
                if(binding.password.getText().toString().equals(preferences.getString("password","admin"))){
                    binding.password.setCompoundDrawablesWithIntrinsicBounds(0,0, R.drawable.line_green,0);
                }else{
                    binding.password.setCompoundDrawablesWithIntrinsicBounds(0,0, R.drawable.line_red,0);
                }
            } else{
                binding.password.setCompoundDrawablesWithIntrinsicBounds(0,0, R.drawable.line_yellow,0);
            }


            handler.postDelayed(this,10);
        }
    };





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



//    Drawable unwrappedDrawable = AppCompatResources.getDrawable(MainActivity.this, R.drawable.line);
//    Drawable wrappedDrawable = DrawableCompat.wrap(unwrappedDrawable);
//    DrawableCompat.setTint(wrappedDrawable, Color.RED);

}