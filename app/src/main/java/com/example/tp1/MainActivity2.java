package com.example.tp1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView txtv1=(TextView) findViewById(R.id.textView5);
        TextView txtv2=(TextView) findViewById(R.id.textView6);
        TextView txtv3=(TextView) findViewById(R.id.textView7);

        Bundle b=getIntent().getExtras();
        String user= b.getString("username");
        String pass= b.getString("password");
        String usertv= b.getString("tvusername");
        String passtv= b.getString("tvpassword");

        txtv1.setText(txtv1.getText());
        txtv2.setText(usertv + user);
        txtv3.setText(passtv + pass);
    }
       public void backClick(View view)
       {
           Intent myintent2=new Intent(this,MainActivity.class);
           startActivity(myintent2);
       }

}