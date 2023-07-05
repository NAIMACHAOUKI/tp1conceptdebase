package com.example.tp1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "Create", Toast.LENGTH_SHORT).show();
    }
    public void buClick(View view){
        EditText txtusername=(EditText)findViewById(R.id.editTextText2);
        EditText txtpassword=(EditText)findViewById(R.id.editTextText);

        TextView tvusername=(TextView) findViewById(R.id.textView2);
        TextView tvpassword=(TextView) findViewById(R.id.textView3);

        Intent intent=new Intent(this, MainActivity2.class);
        Bundle b =new Bundle();

        b.putString("username",txtusername.getText().toString());
        b.putString("password",txtpassword.getText().toString());
        b.putString("tvusername",tvusername.getText().toString());
        b.putString("tvpassword",tvpassword.getText().toString());
        intent.putExtras(b);
        startActivity(intent);
    }
    @Override
    protected void onStart(){
        super.onStart();
        Toast.makeText(this, "Stard", Toast.LENGTH_SHORT).show();

    }
    @Override
    protected void onResume(){
        super.onResume();
        Toast.makeText(this, "resume", Toast.LENGTH_SHORT).show();
}
    @Override
    protected void onRestart(){
        super.onRestart();
        Toast.makeText(this, "restard ", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onPause(){
        super.onPause();
        Toast.makeText(this, "Pause", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onStop(){
        super.onStop();
        Toast.makeText(this, "Stop", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Toast.makeText(this, "Destroy", Toast.LENGTH_SHORT).show();
    }
}