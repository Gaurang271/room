package com.example.room_db;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.room.Room;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    public static FragmentManager fragmentManager;
Button adduser,viewuser;
public static MyAppDatabase myAppDatabase;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myAppDatabase= Room.databaseBuilder(getApplicationContext(),MyAppDatabase.class,"userdb").allowMainThreadQueries().build();
                        Toast.makeText(getApplicationContext(),"hello",Toast.LENGTH_LONG).show();
//fragmentManager=getSupportFragmentManager();
//if (findViewById(R.id.btn_add_user)!= null){
//     if (savedInstanceState!=null)
//     {
//         return;
//     }
//     fragmentManager.beginTransaction().add(R.id.fragment_container,new Home_Fragment()).commit();
//
//}
        init();

    }

    private void init() {
        adduser=findViewById(R.id.btn_add_user);
        viewuser=findViewById(R.id.btn_view_user);
        adduser.setOnClickListener(this);
        viewuser.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId())

        {
            case R.id.btn_add_user:
            {
                Intent intenta=new Intent(getApplicationContext(),Add_User.class);
                startActivity(intenta);
            }
            case R.id.btn_view_user:
            {
                Intent intent=new Intent(getApplicationContext(),ReadUser.class);
                startActivity(intent);
            }

        }
    }
}