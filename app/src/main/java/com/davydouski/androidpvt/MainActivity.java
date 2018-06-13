package com.davydouski.androidpvt;

import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView tx1;
    private TextView tx2;
    private Button buttonClick;
    private TextView noTx;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    private View.OnClickListener clickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            /*if(view.getId()==R.id.button4){ //переход с одной активити на другую
                SecondActivity.show(MainActivity.this, SecondActivity.BUTTON_ONE_KEY);
            } else {
                SecondActivity.show(MainActivity.this, SecondActivity.BUTTON_TWO_KEY);
            }*/
        }
    };


    @Override
    public void onClick(View view) {
        TextView tx1 = (TextView) findViewById(R.id.textView1);
        TextView tx2 = (TextView) findViewById(R.id.textView2);
        TextView noTx = (TextView) findViewById(R.id.noTx);
        Button buttonClick = (Button) findViewById(R.id.button);

        tx1.setOnClickListener(clickListener);
        tx2.setOnClickListener(clickListener);
        buttonClick.setOnClickListener(clickListener);


        noTx.setText(tx1.getText().toString());
        tx1.setText(tx2.getText().toString());
        tx2.setText(noTx.getText().toString());
        noTx.setText("");

        /*noTx.setText(tx1.getText().toString());
        ColorDrawable colorDrawable0 = (ColorDrawable) tx1.getBackground();
        int color0 = colorDrawable0.getColor();
        noTx.setBackgroundColor(color0);

        tx1.setText(tx2.getText().toString());
        ColorDrawable colorDrawable1 = (ColorDrawable) tx2.getBackground();
        int color1 = colorDrawable1.getColor();
        tx1.setBackgroundColor(color1);

        tx2.setText(noTx.getText().toString());
        ColorDrawable colorDrawable2 = (ColorDrawable) noTx.getBackground();
        int color2 = colorDrawable2.getColor();
        tx2.setBackgroundColor(color2);*/
    }
}
