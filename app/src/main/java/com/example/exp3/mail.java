package com.example.exp3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class mail extends AppCompatActivity {
    EditText e1,e2,e3,e4;
    Button b5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mail);
        e1=findViewById(R.id.mail);
        e2=findViewById(R.id.cc);
        e3=findViewById(R.id.bcc);
        e4=findViewById(R.id.body);
        b5=findViewById(R.id.button5);
        b5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.putExtra(Intent.EXTRA_EMAIL,new String[]{e1.getText().toString()});
                intent.putExtra(Intent.EXTRA_BCC,new String[]{e3.getText().toString()});
                intent.putExtra(Intent.EXTRA_CC,new String[]{e2.getText().toString()});
                intent.putExtra(Intent.EXTRA_TEXT, e4.getText().toString());
                intent.setType("message/rfc822");
                startActivity(
                        Intent
                                .createChooser(intent,
                                        "Choose an Email client :"));
            }
        });

    }
}