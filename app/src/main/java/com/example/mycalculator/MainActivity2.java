package com.example.mycalculator;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ActionBar ab=getSupportActionBar();
        ab.setTitle("Password");
        Button btn=findViewById(R.id.submit_btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText pa=findViewById(R.id.pwdfield);
                String pwd=pa.getText().toString();
                if(!pwd.equals("Satwik@2003")){
                    Toast.makeText(MainActivity2.this, "Enter a valid password", Toast.LENGTH_LONG).show();
                }
                else {
                    Intent i = new Intent(MainActivity2.this, MainActivity3.class);
                    startActivity(i);
                }
            }
        });
    }
}