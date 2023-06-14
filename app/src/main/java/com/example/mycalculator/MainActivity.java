package com.example.mycalculator;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    boolean isfirst=true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar ab=getSupportActionBar();
        ab.setTitle("Calculator");
    }
    public void but1press(View view){
        TextView et=(TextView) findViewById(R.id.calci);
        et.setText(et.getText()+"1");
    }
    public void but2press(View view){
        TextView et=(TextView) findViewById(R.id.calci);
        et.setText(et.getText()+"2");
    }
    public void but3press(View view){
        TextView et=(TextView) findViewById(R.id.calci);
        et.setText(et.getText()+"3");
    }
    public void but4press(View view){
        TextView et=(TextView) findViewById(R.id.calci);
        et.setText(et.getText()+"4");
    }
    public void but5press(View view){
        TextView et=(TextView) findViewById(R.id.calci);
        et.setText(et.getText()+"5");
    }
    public void but6press(View view){
        TextView et=(TextView) findViewById(R.id.calci);
        et.setText(et.getText()+"6");
    }
    public void but7press(View view){
        TextView et=(TextView) findViewById(R.id.calci);
        et.setText(et.getText()+"7");
    }
    public void but8press(View view){
        TextView et=(TextView) findViewById(R.id.calci);
        et.setText(et.getText()+"8");
    }
    public void but9press(View view){
        TextView et=(TextView) findViewById(R.id.calci);
        et.setText(et.getText()+"9");
    }
    public void but0press(View view){
        TextView et=(TextView) findViewById(R.id.calci);
        et.setText(et.getText()+"0");
    }
    public void bucpress(View view){
        TextView et=(TextView) findViewById(R.id.calci);
        et.setText("");
        num1=0;
        op=0;
    }
    float num1,op;
    public void butmulpress(View v){
        TextView tv=(TextView)findViewById(R.id.calci);
        num1=Float.parseFloat((String) tv.getText());
        tv.setText("");
        op=3;
    }
    public void butdivpress(View v){
        TextView tv=(TextView)findViewById(R.id.calci);
        num1=Float.parseFloat((String) tv.getText());
        tv.setText("");
        op=4;
    }
    public void butminpress(View v){
        TextView tv=(TextView)findViewById(R.id.calci);
        num1=Float.parseFloat((String) tv.getText());
        tv.setText("");
        op=2;
    }
    public void butaddpress(View v){
        TextView tv=(TextView)findViewById(R.id.calci);
        num1=Integer.parseInt((String) tv.getText());
        tv.setText("");
        op=1;
    }
    public void buteqpress(View v){
        TextView tv=(TextView)findViewById(R.id.calci);
        float res;
        if(tv.getText().toString()=="") {
            tv.setText("can't evaluate");
            isfirst = false;
        }
        if(isfirst) {
            float num2=Float.parseFloat((String) tv.getText());
            if (op == 1) {
                res = num1 + num2;
                tv.setText("" + res);
            } else if (op == 2) {
                res = num1 - num2;
                tv.setText("" + res);
            } else if (op == 3) {
                res = num1 * num2;
                tv.setText("" + res);
            } else if (op == 4) {
                res = num1 / num2;
                tv.setText("" + res);
            } else {
                tv.setText("error message");
            }
        }
        else {
            isfirst=true;
            Intent inte = new Intent(MainActivity.this, MainActivity2.class);
            inte.putExtra("pwd", tv.getText().toString());
            startActivity(inte);
        }
    }
}
