package com.example.room_db;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Add_User extends AppCompatActivity {
private EditText user_id,user_name,user_email;
    private Button btnsave;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add__user);
        Toast.makeText(getApplicationContext(),"suc",Toast.LENGTH_LONG).show();
        init();
        btnsave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int userid=Integer.parseInt(user_id.getText().toString());
                String username=user_name.getText().toString();
                String useremail=user_email.getText().toString();

                User user=new User();
                user.setId(userid);
                user.setName(username);
                user.setEmail(useremail);
                Toast.makeText(getApplicationContext(),"user_suc",Toast.LENGTH_LONG).show();

                MainActivity.myAppDatabase.mydao().adduser(user);

                user_id.setText("");
                user_name.setText("");
                user_email.setText("");
                finish();
            }
        });

    }

    private void init() {
        user_id=findViewById(R.id.txt_user_id);
        user_name=findViewById(R.id.txt_user_name);
        user_email=findViewById(R.id.txt_user_email);
        btnsave=findViewById(R.id.btn_save);


    }

}