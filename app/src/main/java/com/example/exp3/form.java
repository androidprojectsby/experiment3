package com.example.exp3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class form extends AppCompatActivity {
    EditText e1,e2;
    Button button1;
    RadioButton b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);
        e1=findViewById(R.id.editTextTextPersonName);
        e2=findViewById(R.id.editTextTextEmailAddress);
        button1=findViewById(R.id.button4);
        b1=findViewById(R.id.radioButton2);
        b2=findViewById(R.id.radioButton);
        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Bundle b=new Bundle();
                Intent i=new Intent(getApplicationContext(),display.class);
                b.putString("name", e1.getText().toString());
                b.putString("email", e2.getText().toString());
                String gender="";
                if(b1.isSelected())
                    gender=b1.getText().toString();
                else
                    gender=b1.getText().toString();
                b.putString("gender", gender);
                i.putExtras(b);
                startActivity(i);
            }
        });
    }
}