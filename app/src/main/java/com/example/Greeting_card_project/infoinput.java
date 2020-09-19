package com.example.Greeting_card_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class infoinput extends AppCompatActivity {

    EditText text1,text2, text3,text4;
    String val1,val2,val3,val4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_infoinput);

        text1=findViewById(R.id.name);


         text2=findViewById(R.id.name_1);


         text3=findViewById(R.id.name_2);



         text4=findViewById(R.id.name_3);

//
        Button b1= findViewById(R.id.button);
        b1.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {

                val1=text1.getText().toString();
                val2=text2.getText().toString();
                val3=text3.getText().toString();
                val4=text4.getText().toString();


                Intent i1=new Intent(infoinput.this,output.class);
                i1.putExtra("mes",val1);
                i1.putExtra("message_key2",val2);
                i1.putExtra("message_key3",val3);


                i1.putExtra("message_key4",val4);
                startActivity(i1);
            }
        });

    }
}