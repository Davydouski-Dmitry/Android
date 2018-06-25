package com.davydouski.androidpvt;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class StartActivity extends Activity{

    public static final int BUTTON_ONE_KEY = 1;
    public static final int BUTTON_TWO_KEY = 2;
    public static final String BUTTON_KEY_NAME = "BUTTON_KEY_NAME";



    public static void show(Activity activity, int key) {
        Intent intent = new Intent(activity, StartActivity.class);
        intent.putExtra(BUTTON_KEY_NAME, key);
        activity.startActivity(intent);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        int buttonKey = getIntent().getIntExtra(BUTTON_KEY_NAME, 0);

        if (buttonKey == BUTTON_ONE_KEY) {
            Toast.makeText(this, "Button 1", Toast.LENGTH_SHORT)
                    .show();
        } else {
            Toast.makeText(this, "Button 2", Toast.LENGTH_SHORT)
                    .show();
        }





        Button butnClickHW1 = (Button) findViewById(R.id.buttonHW1);
        butnClickHW1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(StartActivity.this,Homework1.class);
                startActivity(intent);
            }
        });

        Button butnClickHW2 = (Button) findViewById(R.id.buttonHW2);
        butnClickHW2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(StartActivity.this,Homework2.class);
                startActivity(intent);
            }
        });

        Button butnClickHW3 = (Button) findViewById(R.id.buttonHW3);
        butnClickHW3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(StartActivity.this,Homework3.class);
                startActivity(intent);
            }
        });

        Button butnClickHW4 = (Button) findViewById(R.id.buttonHW4);
        butnClickHW4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(StartActivity.this,Homework4.class);
                startActivity(intent);
            }
        });

        Button butnClickHW5 = (Button) findViewById(R.id.buttonHW5);
        butnClickHW5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(StartActivity.this,Homework5.class);
                startActivity(intent);
            }
        });




    }


}
