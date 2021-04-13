package com.comsats.population_mechanics;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.net.wifi.p2p.WifiP2pManager;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;

import java.util.Timer;
import java.util.TimerTask;

import com.comsats.population_mechanics.databinding.ActivityChangeLoginInfoBinding;

public class ChangeLoginInfo extends AppCompatActivity {

    ActivityChangeLoginInfoBinding binding;
    public Handler handler;
    String password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityChangeLoginInfoBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        initialize();
        initializeTask();


        String username = MainActivity.preferences.getString("username", "admin");
        password = MainActivity.preferences.getString("password", "admin");
        binding.username.setText(username);


    }


    boolean oldPasswordStatus = false;
    boolean newPasswordStatus = false;
    boolean emptyness = false;

    public void initializeTask() {

        handler = new Handler();
        Runnable run = new Runnable() {

            int a = 0;

            @Override
            public void run() {
//                Toast.makeText(ChangeLoginInfo.this, "Hello"+a++, Toast.LENGTH_SHORT).show();

                if (!binding.oldPassword.getText().toString().equals("")) {
                    if (binding.oldPassword.getText().toString().equals(password)) {
                        binding.oldPassword.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.ok, 0);
                        oldPasswordStatus = true;
                        emptyness = false;
                    } else {
                        binding.oldPassword.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.wrong, 0);
                        oldPasswordStatus = false;
                        emptyness = false;
                    }
                } else {
                    binding.oldPassword.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
                    emptyness = true;
                }


                if (!binding.newPassword.getText().toString().equals("")) {
                    String hold = binding.newPassword.getText().toString();
                    if (!binding.confirmPassword.getText().toString().equals("")) {
                        if (binding.confirmPassword.getText().toString().equals(hold)) {
                            binding.confirmPassword.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.ok, 0);
                            newPasswordStatus = true;
                        } else {
                            binding.confirmPassword.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.wrong, 0);
                            newPasswordStatus = false;
                        }
                    } else {
                        binding.confirmPassword.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
                        emptyness = true;
                    }
                } else {
                    emptyness = true;
                }

                handler.postDelayed(this, 10);

            }
        };
        handler.post(run);

    }


    public void initialize() {
        binding.username.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.ok, 0);
    }

    public void save(View view) {


        if (!emptyness) {

            if (oldPasswordStatus) {

                if (newPasswordStatus) {

                    SharedPreferences.Editor editor = MainActivity.preferences.edit();
                    editor.putString("username", binding.username.getText().toString());
                    editor.putString("password", binding.confirmPassword.getText().toString());
                    editor.putBoolean("loginStatus",false);
                    editor.commit();

                    makeToast("Password Changed Successfully");

                    Intent intent=new Intent(ChangeLoginInfo.this,MainActivity.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                    startActivity(intent);
                    finish();
                } else {
                    makeToast("New password not matched");
                }

            } else {
                makeToast("Old Password Incorrect");
            }

        } else{
            makeToast("Fields are Empty");
        }


    }

    public void makeToast(String msg) {
        Toast toast = Toast.makeText(this, msg, Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.TOP | Gravity.CENTER, 0, 0);
        toast.show();
    }


}


