package com.davydouski.androidpvt;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import com.squareup.picasso.Picasso;


public class Homework3 extends AppCompatActivity{

    Button button;
    EditText editText;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homework3);

        button = (Button)findViewById(R.id.buttonNet);
        editText = (EditText)findViewById(R.id.textViewNet);
        imageView = (ImageView) findViewById(R.id.imageViewNet);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Picasso.get().load(editText.getText().toString()).into(imageView);
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Homework3.this,StartActivity.class);
                startActivity(intent);
            }
        });
    }
}

