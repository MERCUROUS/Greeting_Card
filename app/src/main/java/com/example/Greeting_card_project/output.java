package com.example.Greeting_card_project;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Objects;

public class output extends AppCompatActivity {
    TextView t1,t2,t3,t4;
    String s1,s2,s3,s4;
    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_output);
         t1=findViewById(R.id.hi1);
         s1 = Objects.requireNonNull(getIntent().getExtras()).getString("mes");
         t1.setText(s1);

        t2=findViewById(R.id.hi2);
        s2 = getIntent().getExtras().getString("message_key2");
        t2.setText(s2);

        t3=findViewById(R.id.hi3);
        s3 = getIntent().getExtras().getString("message_key3");
        t3.setText(s3);

        t4=findViewById(R.id.hi4);
        s4 = getIntent().getExtras().getString("message_key4");
        t4.setText(s4);
    }
}