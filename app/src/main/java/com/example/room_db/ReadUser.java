package com.example.room_db;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.List;

public class ReadUser extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_read_user);
        init();
        List<User> users = MainActivity.myAppDatabase.mydao().getuser();
        String info = "";
        for (User user : users) {
            int id = user.getId();
            String name = user.getName();
            String email = user.getEmail();
            info = info + "\n" + "id :" + id + " \n Name:" + name + "\n Email :" + email;
        }
textView.setText(info);
    }

    private void init() {
        textView = findViewById(R.id.txt_users);
    }
}