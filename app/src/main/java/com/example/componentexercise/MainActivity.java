package com.example.componentexercise;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText acc;
    private EditText pass;

   // String[] Account = {"123", "Amy", "Bob"};
    //String[] Password = {"111", "222", "333"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void loginclick(View view) {
        acc = (EditText) this.findViewById(R.id.account);
        pass = (EditText) this.findViewById(R.id.password);

        Button btn = findViewById(R.id.login);
        btn.setText("logout");



        TextView conterview = findViewById(R.id.message);
        conterview.setText("登入成功！");


    }


}